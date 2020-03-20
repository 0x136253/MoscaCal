package com.mutiny.moscacal.dao;

import com.mutiny.moscacal.pojo.MessageUser;
import com.mutiny.moscacal.pojo.MessageUserExample;
import java.util.List;

public interface MessageUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int deleteByPrimaryKey(Integer messageUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int insert(MessageUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int insertSelective(MessageUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    List<MessageUser> selectByExample(MessageUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    MessageUser selectByPrimaryKey(Integer messageUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int updateByPrimaryKeySelective(MessageUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_User
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    int updateByPrimaryKey(MessageUser record);
}