package com.xiezhixian.mygit.controller;

import com.xiezhixian.mygit.mapper.PUserMapper;
import com.xiezhixian.mygit.pojo.*;
import com.xiezhixian.mygit.service.FileService;
import com.xiezhixian.mygit.service.ProjectService;
import com.xiezhixian.mygit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

/**
 * <Description> ProjectController
 *
 * @author 26802
 * @version 1.0
 * @ClassName ProjectController
 * @taskId
 * @see com.xiezhixian.mygit.controller
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    @Autowired
    private FileService fileService;
    @Autowired
    private UserService userService;
    @Autowired
    private PUserMapper pUserMapper;

    @PostMapping("/add")
    public String addProject(@RequestParam("pname")String pname,@RequestParam("hostId")Integer hostId){
        Project project = new Project();
        project.setHostId(hostId);
        project.setPname(pname);
        project.setFileNum(0);
        projectService.addProject(project);


        return "index";
    }

    @GetMapping("/intoProject/{id}")
    public String intoProject(@PathVariable("id")Integer id, Model model){
        List<FileWithBLOBs> fileList = fileService.getFileListByProjectId(id);
        Project project = projectService.getProjectById(id);
        model.addAttribute("fileList",fileList);
        model.addAttribute("Pid",id);
        model.addAttribute("projecthostId",project.getHostId());
        List<User> userList = userService.listUserWithOutProject(id);
        model.addAttribute("userList",userList);
        return "project";
    }

    @ResponseBody
    @PostMapping("/addUser")
    public String addUser(@RequestParam("addUser")Integer userid,@RequestParam("pid")Integer id ){
        PUser pUser = new PUser();
        pUser.setUserId(userid);
        pUser.setProjectId(id);
        pUserMapper.insert(pUser);
        return "添加成功";
    }
}
