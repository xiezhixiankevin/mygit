package com.xiezhixian.mygit.controller;

import com.xiezhixian.mygit.pojo.FileWithBLOBs;
import com.xiezhixian.mygit.pojo.Project;
import com.xiezhixian.mygit.pojo.User;
import com.xiezhixian.mygit.service.FileService;
import com.xiezhixian.mygit.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;

/**
 * <Description> FileUpAndDownController
 *
 * @author 26802
 * @version 1.0
 * @ClassName FileUpAndDownController
 * @taskId
 * @see com.xiezhixian.mygit.controller
 */
@Controller
public class FileUpAndDownController {

    @Autowired
    private FileService fileService;
    @Autowired
    private ProjectService projectService;

    @RequestMapping("/fileDown/{projectName}/{fname}/{id}/{userId}")
    public ResponseEntity<byte[]> testResponseEntity(@PathVariable("projectName")String projectName,
                                                     @PathVariable("fname")String fname,
                                                     @PathVariable("id")Integer id,
                                                     @PathVariable("userId")Integer userId,
                                                     HttpSession session) throws IOException {
        //修改最近下载人
        fileService.updateLatestDownById(id,userId);

        String path = "/www/mygit/"+projectName+"/"+fname;
        //获取服务器中文件的真实路径
//        File file = ResourceUtils.getFile(path);
        File file = new File(path);
        //创建输入流
        InputStream is = new FileInputStream(file);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename="+fname);
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }

    @PostMapping("/addfile")
    public @ResponseBody String addfile(MultipartFile upload,
                                        @RequestParam("fileDescribe")String fileDescribe ,
                                        @RequestParam("filelog")String filelog ,
                                        HttpSession session) throws FileNotFoundException {

        Integer pid = (Integer) session.getAttribute("upLoadPid");
        User user = (User) session.getAttribute("user");
        Project project = projectService.getProjectById(pid);

        // 1. 获取要上传文件的文件名
        String fileName = upload.getOriginalFilename();
        System.out.println(fileName);
        // 2. 自定义上传路径
//        String path = "classpath:static/files/" + project.getPname();
        String path = "/www/mygit/" + project.getPname();
        // 3. 判断路径是否存在，不存在则新建
//        File file = ResourceUtils.getFile(path);
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();
        }

        //
        File newFile = new File(file.getPath()+"/"+user.getId()+fileName);
        try {
            upload.transferTo(newFile);
            FileWithBLOBs file1 = new FileWithBLOBs();
            file1.setFname(user.getId()+fileName);
            file1.setLatestchangeuser(user.getId());
            file1.setFpath(file.getPath()+"/"+user.getId()+fileName);
            file1.setFdescribe(fileDescribe);
            file1.setLatestlog(filelog);
            fileService.addFile(pid,file1);
            return "上传成功";
        } catch (IOException e) {
            return "上传失败";
        }
    }

    @PostMapping("/upload")
    public @ResponseBody String upload(MultipartFile upload,
                                        @RequestParam("fileDescribe")String fileDescribe ,
                                        @RequestParam("filelog")String filelog ,
                                        @RequestParam("fid")Integer fid,
                                        HttpSession session) throws FileNotFoundException {

        Integer pid = (Integer) session.getAttribute("upLoadPid");
        User user = (User) session.getAttribute("user");
        Project project = projectService.getProjectById(pid);

        // 1. 获取要上传文件的文件名
        String fileName = upload.getOriginalFilename();
        System.out.println(fileName);
        // 2. 自定义上传路径
//        String path = "classpath:static/files/" + project.getPname();
        String path = "/www/mygit/" + project.getPname();
        // 3. 判断路径是否存在，不存在则新建
//        File file = ResourceUtils.getFile(path);
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();
        }

        //
        File newFile = new File(file.getPath()+"/"+user.getId()+fileName);
        try {
            upload.transferTo(newFile);
            FileWithBLOBs file1 = new FileWithBLOBs();
            file1.setFname(user.getId()+fileName);
            file1.setId(fid);
            file1.setLatestchangeuser(user.getId());
            file1.setFpath(file.getPath()+"/"+user.getId()+fileName);
            file1.setFdescribe(fileDescribe);
            file1.setLatestlog(filelog);
            fileService.updateFile(file1);
            return "上传成功";
        } catch (IOException e) {
            return "上传失败";
        }
    }



}
