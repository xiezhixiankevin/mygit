package com.xiezhixian.mygit.service.Impl;

import com.xiezhixian.mygit.mapper.PUserMapper;
import com.xiezhixian.mygit.mapper.ProjectMapper;
import com.xiezhixian.mygit.mapper.UserMapper;
import com.xiezhixian.mygit.pojo.*;
import com.xiezhixian.mygit.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> ProjectServiceImpl
 *
 * @author 26802
 * @version 1.0
 * @ClassName ProjectServiceImpl
 * @taskId
 * @see com.xiezhixian.mygit.service.Impl
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private PUserMapper pUserMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addProject(Project project) {
        projectMapper.insert(project);
    }

    @Override
    public List<Project> listProjectByUserId(Integer id) {
        PUserExample pUserExample = new PUserExample();
        pUserExample.createCriteria().andUserIdEqualTo(id);
        List<PUser> pUserList = pUserMapper.selectByExample(pUserExample);
        if (pUserList!=null &&!pUserList.isEmpty()){
            List<Integer> idList = new ArrayList<>();
            for (PUser pUser : pUserList){
                idList.add(pUser.getProjectId());
            }
            ProjectExample projectExample = new ProjectExample();
            projectExample.createCriteria().andIdIn(idList);
            List<Project> projectList = projectMapper.selectByExample(projectExample);
            for (Project project : projectList){
                User user = userMapper.selectByPrimaryKey(project.getHostId());
                project.setHostName(user.getUsername());
            }
            return projectList;
        }


        return new ArrayList<>();
    }

    @Override
    public Project getProjectById(Integer id) {
        return projectMapper.selectByPrimaryKey(id);
    }
}
