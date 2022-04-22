package com.xiezhixian.mygit.controller;

import com.xiezhixian.mygit.pojo.Project;
import com.xiezhixian.mygit.pojo.User;
import com.xiezhixian.mygit.service.ProjectService;
import com.xiezhixian.mygit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <Description> UserController
 *
 * @author 26802
 * @version 1.0
 * @ClassName UserController
 * @taskId
 * @see com.xiezhixian.mygit.controller
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ProjectService projectService;

    @PostMapping("/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password, HttpSession session){
        User user = userService.login(username,password);
        if (user != null){
            List<Project> projectList = projectService.listProjectByUserId(user.getId());

            session.setAttribute("user",user);
            session.setAttribute("projectList",projectList);
            return "index";
        }else {
            return "redirect:/";
        }
    }

    @PostMapping("/register")
    public String register(@RequestParam("username")String username,@RequestParam("password")String password){
        if (userService.registerUser(username,password)){
            return "redirect:/";
        }else {
            return "redirect:/toRegister";
        }
    }
}
