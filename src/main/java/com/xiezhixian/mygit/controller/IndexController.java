package com.xiezhixian.mygit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <Description> IndexController
 *
 * @author 26802
 * @version 1.0
 * @ClassName IndexController
 * @taskId
 * @see com.xiezhixian.mygit.controller
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "login";
    }

    @GetMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @GetMapping("/toCreateProject")
    public String toCreateProject(){
        return "createProject";
    }

}
