package com.advicegen.mapper;

import com.advicegen.entity.AdviceDet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdviceExtract {


//    @Select("Select Advice_type,ORIGIAL_ADV_DATE,BIZ_GROUP," +
//            "ADV_KEY,AUTO_NUMBER,REGEN_STATUS,ACCT_NUMBER,UPDATE_TIMESTAMP from ADVICE where" +
//            " ACCT_NUMBER = #{accntNumber}")
////    @Results({@Result(column="Advice_type",property="adviceType"),
////            @Result(property="orginalAdvDat",column="ORIGIAL_ADV_DATE"),
////            @Result(property="bizGrp",column="BIZ_GROUP"),
////            @Result(property="advKey",column="ADV_KEY"),
////            @Result(property="autoNumber",column="AUTO_NUMBER"),
////            @Result(property="regenStatus",column="REGEN_STATUS"),
////            @Result(property="accntNumber",column="ACCT_NUMBER"),
////            @Result(property="timestamp",column="UPDATE_TIMESTAMP")}

    
    @Select("select ACCT_NUMBER from ADVICE WHERE ACCT_NUMBER = #{accntNumber}")
    String findbyAccnt(String accntNumber);


}
