package com.mutiny.moscacal.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table Message_Info
 *
 * @mbg.generated do_not_delete_during_merge 2020-03-20 17:46:49
 */
public class MessageInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.Message_Info_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Integer messageInfoId;

    /**
     * Database Column Remarks:
     *   消息标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.title
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String title;

    /**
     * Database Column Remarks:
     *   消息内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.text
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String text;

    /**
     * Database Column Remarks:
     *   消息跳转url
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.message_url
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String messageUrl;

    /**
     * Database Column Remarks:
     *   消息推送时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.push_time
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Date pushTime;

    /**
     * Database Column Remarks:
     *   消息创建人id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.operator
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String operator;

    /**
     * Database Column Remarks:
     *   消息类型,private私信，group 100人以内组消息，public 100人以上公共消息，global 全员消息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.type
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private String type;

    /**
     * Database Column Remarks:
     *   发送消息总人数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.s_num
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Integer sNum;

    /**
     * Database Column Remarks:
     *   目前发送人数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Message_Info.n_num
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private Integer nNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.Message_Info_ID
     *
     * @return the value of Message_Info.Message_Info_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Integer getMessageInfoId() {
        return messageInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.Message_Info_ID
     *
     * @param messageInfoId the value for Message_Info.Message_Info_ID
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setMessageInfoId(Integer messageInfoId) {
        this.messageInfoId = messageInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.title
     *
     * @return the value of Message_Info.title
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.title
     *
     * @param title the value for Message_Info.title
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.text
     *
     * @return the value of Message_Info.text
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.text
     *
     * @param text the value for Message_Info.text
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.message_url
     *
     * @return the value of Message_Info.message_url
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getMessageUrl() {
        return messageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.message_url
     *
     * @param messageUrl the value for Message_Info.message_url
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setMessageUrl(String messageUrl) {
        this.messageUrl = messageUrl == null ? null : messageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.push_time
     *
     * @return the value of Message_Info.push_time
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Date getPushTime() {
        return pushTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.push_time
     *
     * @param pushTime the value for Message_Info.push_time
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.operator
     *
     * @return the value of Message_Info.operator
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.operator
     *
     * @param operator the value for Message_Info.operator
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.type
     *
     * @return the value of Message_Info.type
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.type
     *
     * @param type the value for Message_Info.type
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.s_num
     *
     * @return the value of Message_Info.s_num
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Integer getsNum() {
        return sNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.s_num
     *
     * @param sNum the value for Message_Info.s_num
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setsNum(Integer sNum) {
        this.sNum = sNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Message_Info.n_num
     *
     * @return the value of Message_Info.n_num
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public Integer getnNum() {
        return nNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Message_Info.n_num
     *
     * @param nNum the value for Message_Info.n_num
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    public void setnNum(Integer nNum) {
        this.nNum = nNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Message_Info
     *
     * @mbg.generated 2020-03-20 17:46:49
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageInfoId=").append(messageInfoId);
        sb.append(", title=").append(title);
        sb.append(", text=").append(text);
        sb.append(", messageUrl=").append(messageUrl);
        sb.append(", pushTime=").append(pushTime);
        sb.append(", operator=").append(operator);
        sb.append(", type=").append(type);
        sb.append(", sNum=").append(sNum);
        sb.append(", nNum=").append(nNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}