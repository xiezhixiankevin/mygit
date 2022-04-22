package com.xiezhixian.mygit.service;

import com.xiezhixian.mygit.pojo.File;
import com.xiezhixian.mygit.pojo.FileWithBLOBs;

import java.util.List;

/**
 * <Description> FileService
 *
 * @author 26802
 * @version 1.0
 * @ClassName FileService
 * @taskId
 * @see com.xiezhixian.mygit.service
 */
public interface FileService {
    //根据项目id获取所有文件列表
    List<FileWithBLOBs> getFileListByProjectId(Integer id);
    //新增文件
    void addFile(Integer Pid, FileWithBLOBs file);
    //修改文件
    void updateFile(FileWithBLOBs newFile);
    //修改最近下载人
    void updateLatestDownById(Integer id,Integer uid);
    //获取文件
    File getFileById(Integer id);
}
