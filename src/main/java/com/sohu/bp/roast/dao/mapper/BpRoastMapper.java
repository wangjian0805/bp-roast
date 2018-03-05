package com.sohu.bp.roast.dao.mapper;

import com.sohu.bp.roast.model.BpRoast;
import com.sohu.bp.roast.model.BpRoastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BpRoastMapper {
    int countByExample(BpRoastExample example);

    int deleteByExample(BpRoastExample example);

    int deleteByPrimaryKey(Long roastId);

    int insert(BpRoast record);

    int insertSelective(BpRoast record);

    List<BpRoast> selectByExample(BpRoastExample example);

    BpRoast selectByPrimaryKey(Long roastId);

    int updateByExampleSelective(@Param("record") BpRoast record, @Param("example") BpRoastExample example);

    int updateByExample(@Param("record") BpRoast record, @Param("example") BpRoastExample example);

    int updateByPrimaryKeySelective(BpRoast record);

    int updateByPrimaryKey(BpRoast record);

}