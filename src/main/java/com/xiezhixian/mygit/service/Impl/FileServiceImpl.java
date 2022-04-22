package com.xiezhixian.mygit.service.Impl;

import com.xiezhixian.mygit.mapper.FileMapper;
import com.xiezhixian.mygit.mapper.ProjectMapper;
import com.xiezhixian.mygit.mapper.UserMapper;
import com.xiezhixian.mygit.pojo.*;
import com.xiezhixian.mygit.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <Description> FileServiceImpl
 *
 * @author 26802
 * @version 1.0
 * @ClassName FileServiceImpl
 * @taskId
 * @see com.xiezhixian.mygit.service.Impl
 */
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProjectMapper projectMapper;

    private void setFile(File file){
        User user = userMapper.selectByPrimaryKey(file.getLatestchangeuser());
        if (user!=null){
            file.setLatestChangeUserName(user.getUsername());
        }else {
            file.setLatestChangeUserName("无");
        }

        User user1 = userMapper.selectByPrimaryKey(file.getLatestload());
        if (user1!=null){
            file.setLatestLoadName(user1.getUsername());
        }else {
            file.setLatestLoadName("无");
        }

        Project project = projectMapper.selectByPrimaryKey(file.getProjectid());
        file.setProjectName(project.getPname());
    }

    @Override
    public List<FileWithBLOBs> getFileListByProjectId(Integer id) {
        FileExample fileExample = new FileExample();
        fileExample.createCriteria().andProjectidEqualTo(id);
        List<FileWithBLOBs> fileList = fileMapper.selectByExampleWithBLOBs(fileExample);
        for (FileWithBLOBs file : fileList){
            setFile(file);
        }
        return fileList;
    }

    @Override
    public void addFile(Integer Pid, FileWithBLOBs file) {
        file.setProjectid(Pid);
        fileMapper.insertSelective(file);
    }

    @Override
    public void updateFile(FileWithBLOBs newFile) {
        fileMapper.updateByPrimaryKeySelective(newFile);
    }

    @Override
    public void updateLatestDownById(Integer id, Integer uid) {
        fileMapper.updateLatestDownById(id,uid);
    }

    @Override
    public FileWithBLOBs getFileById(Integer id) {
        return fileMapper.selectByPrimaryKey(id);
    }
}
