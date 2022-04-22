package com.xiezhixian.mygit.mapper;

import com.xiezhixian.mygit.pojo.PUser;
import com.xiezhixian.mygit.pojo.PUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PUserMapper {
    int countByExample(PUserExample example);

    int deleteByExample(PUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PUser record);

    int insertSelective(PUser record);

    List<PUser> selectByExample(PUserExample example);

    PUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PUser record, @Param("example") PUserExample example);

    int updateByExample(@Param("record") PUser record, @Param("example") PUserExample example);

    int updateByPrimaryKeySelective(PUser record);

    int updateByPrimaryKey(PUser record);
}