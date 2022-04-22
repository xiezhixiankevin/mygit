package com.xiezhixian.mygit.mapper;

import com.xiezhixian.mygit.pojo.File;
import com.xiezhixian.mygit.pojo.FileExample;
import com.xiezhixian.mygit.pojo.FileWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FileMapper {
    int countByExample(FileExample example);

    int deleteByExample(FileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileWithBLOBs record);

    int insertSelective(FileWithBLOBs record);

    List<FileWithBLOBs> selectByExampleWithBLOBs(FileExample example);

    List<File> selectByExample(FileExample example);

    FileWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileWithBLOBs record, @Param("example") FileExample example);

    int updateByExampleWithBLOBs(@Param("record") FileWithBLOBs record, @Param("example") FileExample example);

    int updateByExample(@Param("record") File record, @Param("example") FileExample example);

    int updateByPrimaryKeySelective(FileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FileWithBLOBs record);

    int updateByPrimaryKey(File record);

    //自己写的
    void updateLatestDownById(@Param("id")Integer id,@Param("uid")Integer uid);
}