package com.mutiny.moscacal.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table Module
 *
 * @mbg.generated do_not_delete_during_merge 2020-05-02 14:54:42
 */
public class Module implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Module_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Integer moduleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Project_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Module_Name
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private String moduleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Function
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private String function;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Description
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private String description;

    /**
     * Database Column Remarks:
     *   参数的个数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Param_Number
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Integer paramNumber;

    /**
     * Database Column Remarks:
     *   是否计算完毕
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Is_Calculate
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Boolean isCalculate;

    /**
     * Database Column Remarks:
     *   是否固定模型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Is_Default
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Boolean isDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.Is_Userful
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Boolean isUserful;

    /**
     * Database Column Remarks:
     *   [固定模型对应的数据源,仅当模型是固定模型的时候有]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.DefaultModule_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Integer defaultmoduleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.TFunction
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private String tfunction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.ChangeFun
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private String changefun;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.KeyFileId
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Integer keyfileid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.multNum
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Integer multnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.createTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.upTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Date uptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.status
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.calTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Date caltime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Module.completeTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private Date completetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Module
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Module_ID
     *
     * @return the value of Module.Module_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Module_ID
     *
     * @param moduleId the value for Module.Module_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Project_ID
     *
     * @return the value of Module.Project_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Project_ID
     *
     * @param projectId the value for Module.Project_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Module_Name
     *
     * @return the value of Module.Module_Name
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Module_Name
     *
     * @param moduleName the value for Module.Module_Name
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Function
     *
     * @return the value of Module.Function
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public String getFunction() {
        return function;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Function
     *
     * @param function the value for Module.Function
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Description
     *
     * @return the value of Module.Description
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Description
     *
     * @param description the value for Module.Description
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Param_Number
     *
     * @return the value of Module.Param_Number
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Integer getParamNumber() {
        return paramNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Param_Number
     *
     * @param paramNumber the value for Module.Param_Number
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setParamNumber(Integer paramNumber) {
        this.paramNumber = paramNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Is_Calculate
     *
     * @return the value of Module.Is_Calculate
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Boolean getIsCalculate() {
        return isCalculate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Is_Calculate
     *
     * @param isCalculate the value for Module.Is_Calculate
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setIsCalculate(Boolean isCalculate) {
        this.isCalculate = isCalculate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Is_Default
     *
     * @return the value of Module.Is_Default
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Is_Default
     *
     * @param isDefault the value for Module.Is_Default
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.Is_Userful
     *
     * @return the value of Module.Is_Userful
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Boolean getIsUserful() {
        return isUserful;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.Is_Userful
     *
     * @param isUserful the value for Module.Is_Userful
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setIsUserful(Boolean isUserful) {
        this.isUserful = isUserful;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.DefaultModule_ID
     *
     * @return the value of Module.DefaultModule_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Integer getDefaultmoduleId() {
        return defaultmoduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.DefaultModule_ID
     *
     * @param defaultmoduleId the value for Module.DefaultModule_ID
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setDefaultmoduleId(Integer defaultmoduleId) {
        this.defaultmoduleId = defaultmoduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.TFunction
     *
     * @return the value of Module.TFunction
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public String getTfunction() {
        return tfunction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.TFunction
     *
     * @param tfunction the value for Module.TFunction
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setTfunction(String tfunction) {
        this.tfunction = tfunction == null ? null : tfunction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.ChangeFun
     *
     * @return the value of Module.ChangeFun
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public String getChangefun() {
        return changefun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.ChangeFun
     *
     * @param changefun the value for Module.ChangeFun
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setChangefun(String changefun) {
        this.changefun = changefun == null ? null : changefun.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.KeyFileId
     *
     * @return the value of Module.KeyFileId
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Integer getKeyfileid() {
        return keyfileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.KeyFileId
     *
     * @param keyfileid the value for Module.KeyFileId
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setKeyfileid(Integer keyfileid) {
        this.keyfileid = keyfileid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.multNum
     *
     * @return the value of Module.multNum
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Integer getMultnum() {
        return multnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.multNum
     *
     * @param multnum the value for Module.multNum
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setMultnum(Integer multnum) {
        this.multnum = multnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.createTime
     *
     * @return the value of Module.createTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.createTime
     *
     * @param createtime the value for Module.createTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.upTime
     *
     * @return the value of Module.upTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Date getUptime() {
        return uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.upTime
     *
     * @param uptime the value for Module.upTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.status
     *
     * @return the value of Module.status
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.status
     *
     * @param status the value for Module.status
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.calTime
     *
     * @return the value of Module.calTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Date getCaltime() {
        return caltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.calTime
     *
     * @param caltime the value for Module.calTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setCaltime(Date caltime) {
        this.caltime = caltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Module.completeTime
     *
     * @return the value of Module.completeTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Date getCompletetime() {
        return completetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Module.completeTime
     *
     * @param completetime the value for Module.completeTime
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Module
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", moduleId=").append(moduleId);
        sb.append(", projectId=").append(projectId);
        sb.append(", moduleName=").append(moduleName);
        sb.append(", function=").append(function);
        sb.append(", description=").append(description);
        sb.append(", paramNumber=").append(paramNumber);
        sb.append(", isCalculate=").append(isCalculate);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", isUserful=").append(isUserful);
        sb.append(", defaultmoduleId=").append(defaultmoduleId);
        sb.append(", tfunction=").append(tfunction);
        sb.append(", changefun=").append(changefun);
        sb.append(", keyfileid=").append(keyfileid);
        sb.append(", multnum=").append(multnum);
        sb.append(", createtime=").append(createtime);
        sb.append(", uptime=").append(uptime);
        sb.append(", status=").append(status);
        sb.append(", caltime=").append(caltime);
        sb.append(", completetime=").append(completetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}