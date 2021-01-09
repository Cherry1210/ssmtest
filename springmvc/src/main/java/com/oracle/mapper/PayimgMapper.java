package com.oracle.mapper;

import com.oracle.pojo.Payimg;
import com.oracle.pojo.PayimgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayimgMapper {
    int countByExample(PayimgExample example);

    int deleteByExample(PayimgExample example);

    int deleteByPrimaryKey(Integer payimgId);

    int insert(Payimg record);

    int insertSelective(Payimg record);

    List<Payimg> selectByExample(PayimgExample example);

    Payimg selectByPrimaryKey(Integer payimgId);

    int updateByExampleSelective(@Param("record") Payimg record, @Param("example") PayimgExample example);

    int updateByExample(@Param("record") Payimg record, @Param("example") PayimgExample example);

    int updateByPrimaryKeySelective(Payimg record);

    int updateByPrimaryKey(Payimg record);
}