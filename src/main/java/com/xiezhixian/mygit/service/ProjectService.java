package com.xiezhixian.mygit.service;

import com.xiezhixian.mygit.pojo.Project;

import java.util.List;

/**
 * <Description> ProjectService
 *
 * @author 26802
 * @version 1.0
 * @ClassName ProjectService
 * @taskId
 * @see com.xiezhixian.mygit.service
 */
public interface ProjectService {
    //新增项目
    void addProject(Project project);
    //根据用户id查询项目
    List<Project> listProjectByUserId(Integer id);
    //根据id查找项目
    Project getProjectById(Integer id);
}
