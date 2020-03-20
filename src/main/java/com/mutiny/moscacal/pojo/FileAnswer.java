package com.mutiny.moscacal.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table File_Answer
 *
 * @mbg.generated do_not_delete_during_merge 2020-03-19 17:48:19
 */
public class FileAnswer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Answer.File_ID
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Answer.Module_ID
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    private Integer moduleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Answer.File_URL
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    private String fileUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Answer.Encode_Algorithm
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    private String encodeAlgorithm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Answer.KeyFileId
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    private Integer keyfileid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Answer.MultNum
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    private Integer multnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column File_Answer.GenerateTime
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    private Date generatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table File_Answer
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Answer.File_ID
     *
     * @return the value of File_Answer.File_ID
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Answer.File_ID
     *
     * @param fileId the value for File_Answer.File_ID
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Answer.Module_ID
     *
     * @return the value of File_Answer.Module_ID
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Answer.Module_ID
     *
     * @param moduleId the value for File_Answer.Module_ID
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Answer.File_URL
     *
     * @return the value of File_Answer.File_URL
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Answer.File_URL
     *
     * @param fileUrl the value for File_Answer.File_URL
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Answer.Encode_Algorithm
     *
     * @return the value of File_Answer.Encode_Algorithm
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public String getEncodeAlgorithm() {
        return encodeAlgorithm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Answer.Encode_Algorithm
     *
     * @param encodeAlgorithm the value for File_Answer.Encode_Algorithm
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public void setEncodeAlgorithm(String encodeAlgorithm) {
        this.encodeAlgorithm = encodeAlgorithm == null ? null : encodeAlgorithm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Answer.KeyFileId
     *
     * @return the value of File_Answer.KeyFileId
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public Integer getKeyfileid() {
        return keyfileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Answer.KeyFileId
     *
     * @param keyfileid the value for File_Answer.KeyFileId
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public void setKeyfileid(Integer keyfileid) {
        this.keyfileid = keyfileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Answer.MultNum
     *
     * @return the value of File_Answer.MultNum
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public Integer getMultnum() {
        return multnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Answer.MultNum
     *
     * @param multnum the value for File_Answer.MultNum
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public void setMultnum(Integer multnum) {
        this.multnum = multnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column File_Answer.GenerateTime
     *
     * @return the value of File_Answer.GenerateTime
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public Date getGeneratetime() {
        return generatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column File_Answer.GenerateTime
     *
     * @param generatetime the value for File_Answer.GenerateTime
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    public void setGeneratetime(Date generatetime) {
        this.generatetime = generatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table File_Answer
     *
     * @mbg.generated 2020-03-19 17:48:19
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileId=").append(fileId);
        sb.append(", moduleId=").append(moduleId);
        sb.append(", fileUrl=").append(fileUrl);
        sb.append(", encodeAlgorithm=").append(encodeAlgorithm);
        sb.append(", keyfileid=").append(keyfileid);
        sb.append(", multnum=").append(multnum);
        sb.append(", generatetime=").append(generatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}