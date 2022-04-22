package com.xiezhixian.mygit.controller;

import com.xiezhixian.mygit.pojo.File;
import com.xiezhixian.mygit.pojo.FileWithBLOBs;
import com.xiezhixian.mygit.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * <Description> FileController
 *
 * @author 26802
 * @version 1.0
 * @ClassName FileController
 * @taskId
 * @see com.xiezhixian.mygit.controller
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("/toAddFile/{id}")
    public String toAddFile(@PathVariable("id")Integer id, HttpSession session){
        session.setAttribute("upLoadPid",id);
        return "file";
    }

    @GetMapping("/toloadFile/{pid}/{fid}")
    public String toloadFile(@PathVariable("pid")Integer pid,@PathVariable("fid")Integer fid, HttpSession session,Model model){
        session.setAttribute("upLoadPid",pid);
        FileWithBLOBs file = (FileWithBLOBs) fileService.getFileById(fid);
        model.addAttribute("fileDescribe",file.getFdescribe());
        model.addAttribute("filelog",file.getLatestlog());
        model.addAttribute("fid",fid);
        return "upfile";
    }

    @PostMapping("/addFile")
    public String addFile(){
        return "file";
    }

}
