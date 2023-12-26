package com.advicegen.mapper;

import com.advicegen.entity.Register;
import com.advicegen.entity.RegistrationVO;
import com.advicegen.entity.VerifyVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SaveRegistration {

   @Insert("insert into ADVICE values(#{adviceType},#{orginalAdvDat},#{bizGrp},#{advKey},#{autoNumber},"+
         "#{regenStatus},#{accntNumber},#{timestamp})")
   int saveRegister(RegistrationVO registrationVO);


   @Select("Select Advice_type,ORIGIAL_ADV_DATE,BIZ_GROUP," +
           "ADV_KEY,AUTO_NUMBER,REGEN_STATUS,ACCT_NUMBER,UPDATE_TIMESTAMP from ADVICE where ACCT_NUMBER = #{accntNumber}")
   String findbyAccnt(String accntNumber);


   @Insert("insert INTO Verify1 VALUES(#{accntNbr},#{otp},#{status})")
   int saveOtp(VerifyVo verifyVo);


}
