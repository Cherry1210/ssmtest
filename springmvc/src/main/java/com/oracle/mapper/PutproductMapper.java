package com.oracle.mapper;

import com.oracle.pojo.Putproduct;
import com.oracle.pojo.PutproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PutproductMapper {
    int countByExample(PutproductExample example);

    int deleteByExample(PutproductExample example);

    int deleteByPrimaryKey(Integer putId);

    int insert(Putproduct record);

    int insertSelective(Putproduct record);

    List<Putproduct> selectByExample(PutproductExample example);

    Putproduct selectByPrimaryKey(Integer putId);

    int updateByExampleSelective(@Param("record") Putproduct record, @Param("example") PutproductExample example);

    int updateByExample(@Param("record") Putproduct record, @Param("example") PutproductExample example);

    int updateByPrimaryKeySelective(Putproduct record);

    int updateByPrimaryKey(Putproduct record);
}