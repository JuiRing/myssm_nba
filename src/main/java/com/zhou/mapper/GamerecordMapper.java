package com.zhou.mapper;

import com.zhou.pojo.Gamerecord;
import com.zhou.pojo.GamerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GamerecordMapper {
    long countByExample(GamerecordExample example);

    int deleteByExample(GamerecordExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(Gamerecord record);

    int insertSelective(Gamerecord record);

    List<Gamerecord> selectByExample(GamerecordExample example);

    Gamerecord selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") Gamerecord record, @Param("example") GamerecordExample example);

    int updateByExample(@Param("record") Gamerecord record, @Param("example") GamerecordExample example);

    int updateByPrimaryKeySelective(Gamerecord record);

    int updateByPrimaryKey(Gamerecord record);
}