package com.mutiny.moscacal.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DefaultDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public DefaultDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDefaultmoduleIdIsNull() {
            addCriterion("DefaultModule_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdIsNotNull() {
            addCriterion("DefaultModule_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdEqualTo(Integer value) {
            addCriterion("DefaultModule_ID =", value, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdNotEqualTo(Integer value) {
            addCriterion("DefaultModule_ID <>", value, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdGreaterThan(Integer value) {
            addCriterion("DefaultModule_ID >", value, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DefaultModule_ID >=", value, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdLessThan(Integer value) {
            addCriterion("DefaultModule_ID <", value, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("DefaultModule_ID <=", value, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdIn(List<Integer> values) {
            addCriterion("DefaultModule_ID in", values, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdNotIn(List<Integer> values) {
            addCriterion("DefaultModule_ID not in", values, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdBetween(Integer value1, Integer value2) {
            addCriterion("DefaultModule_ID between", value1, value2, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultmoduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DefaultModule_ID not between", value1, value2, "defaultmoduleId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdIsNull() {
            addCriterion("Default_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultIdIsNotNull() {
            addCriterion("Default_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultIdEqualTo(Integer value) {
            addCriterion("Default_ID =", value, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdNotEqualTo(Integer value) {
            addCriterion("Default_ID <>", value, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdGreaterThan(Integer value) {
            addCriterion("Default_ID >", value, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Default_ID >=", value, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdLessThan(Integer value) {
            addCriterion("Default_ID <", value, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdLessThanOrEqualTo(Integer value) {
            addCriterion("Default_ID <=", value, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdIn(List<Integer> values) {
            addCriterion("Default_ID in", values, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdNotIn(List<Integer> values) {
            addCriterion("Default_ID not in", values, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdBetween(Integer value1, Integer value2) {
            addCriterion("Default_ID between", value1, value2, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDefaultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Default_ID not between", value1, value2, "defaultId");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNull() {
            addCriterion("Data_Name is null");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNotNull() {
            addCriterion("Data_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDataNameEqualTo(String value) {
            addCriterion("Data_Name =", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotEqualTo(String value) {
            addCriterion("Data_Name <>", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThan(String value) {
            addCriterion("Data_Name >", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThanOrEqualTo(String value) {
            addCriterion("Data_Name >=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThan(String value) {
            addCriterion("Data_Name <", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThanOrEqualTo(String value) {
            addCriterion("Data_Name <=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLike(String value) {
            addCriterion("Data_Name like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotLike(String value) {
            addCriterion("Data_Name not like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameIn(List<String> values) {
            addCriterion("Data_Name in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotIn(List<String> values) {
            addCriterion("Data_Name not in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameBetween(String value1, String value2) {
            addCriterion("Data_Name between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotBetween(String value1, String value2) {
            addCriterion("Data_Name not between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andIsCalculateIsNull() {
            addCriterion("Is_Calculate is null");
            return (Criteria) this;
        }

        public Criteria andIsCalculateIsNotNull() {
            addCriterion("Is_Calculate is not null");
            return (Criteria) this;
        }

        public Criteria andIsCalculateEqualTo(Boolean value) {
            addCriterion("Is_Calculate =", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateNotEqualTo(Boolean value) {
            addCriterion("Is_Calculate <>", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateGreaterThan(Boolean value) {
            addCriterion("Is_Calculate >", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is_Calculate >=", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateLessThan(Boolean value) {
            addCriterion("Is_Calculate <", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateLessThanOrEqualTo(Boolean value) {
            addCriterion("Is_Calculate <=", value, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateIn(List<Boolean> values) {
            addCriterion("Is_Calculate in", values, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateNotIn(List<Boolean> values) {
            addCriterion("Is_Calculate not in", values, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Calculate between", value1, value2, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsCalculateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Calculate not between", value1, value2, "isCalculate");
            return (Criteria) this;
        }

        public Criteria andIsUserfulIsNull() {
            addCriterion("Is_Userful is null");
            return (Criteria) this;
        }

        public Criteria andIsUserfulIsNotNull() {
            addCriterion("Is_Userful is not null");
            return (Criteria) this;
        }

        public Criteria andIsUserfulEqualTo(Boolean value) {
            addCriterion("Is_Userful =", value, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulNotEqualTo(Boolean value) {
            addCriterion("Is_Userful <>", value, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulGreaterThan(Boolean value) {
            addCriterion("Is_Userful >", value, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is_Userful >=", value, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulLessThan(Boolean value) {
            addCriterion("Is_Userful <", value, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulLessThanOrEqualTo(Boolean value) {
            addCriterion("Is_Userful <=", value, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulIn(List<Boolean> values) {
            addCriterion("Is_Userful in", values, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulNotIn(List<Boolean> values) {
            addCriterion("Is_Userful not in", values, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Userful between", value1, value2, "isUserful");
            return (Criteria) this;
        }

        public Criteria andIsUserfulNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Userful not between", value1, value2, "isUserful");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("File_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("File_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("File_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("File_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("File_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("File_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("File_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("File_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("File_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("File_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("File_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("File_ID not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andKeyfileidIsNull() {
            addCriterion("KeyFileId is null");
            return (Criteria) this;
        }

        public Criteria andKeyfileidIsNotNull() {
            addCriterion("KeyFileId is not null");
            return (Criteria) this;
        }

        public Criteria andKeyfileidEqualTo(Integer value) {
            addCriterion("KeyFileId =", value, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidNotEqualTo(Integer value) {
            addCriterion("KeyFileId <>", value, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidGreaterThan(Integer value) {
            addCriterion("KeyFileId >", value, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KeyFileId >=", value, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidLessThan(Integer value) {
            addCriterion("KeyFileId <", value, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidLessThanOrEqualTo(Integer value) {
            addCriterion("KeyFileId <=", value, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidIn(List<Integer> values) {
            addCriterion("KeyFileId in", values, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidNotIn(List<Integer> values) {
            addCriterion("KeyFileId not in", values, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidBetween(Integer value1, Integer value2) {
            addCriterion("KeyFileId between", value1, value2, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andKeyfileidNotBetween(Integer value1, Integer value2) {
            addCriterion("KeyFileId not between", value1, value2, "keyfileid");
            return (Criteria) this;
        }

        public Criteria andFileaswidIsNull() {
            addCriterion("FileAswId is null");
            return (Criteria) this;
        }

        public Criteria andFileaswidIsNotNull() {
            addCriterion("FileAswId is not null");
            return (Criteria) this;
        }

        public Criteria andFileaswidEqualTo(Integer value) {
            addCriterion("FileAswId =", value, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidNotEqualTo(Integer value) {
            addCriterion("FileAswId <>", value, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidGreaterThan(Integer value) {
            addCriterion("FileAswId >", value, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileAswId >=", value, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidLessThan(Integer value) {
            addCriterion("FileAswId <", value, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidLessThanOrEqualTo(Integer value) {
            addCriterion("FileAswId <=", value, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidIn(List<Integer> values) {
            addCriterion("FileAswId in", values, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidNotIn(List<Integer> values) {
            addCriterion("FileAswId not in", values, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidBetween(Integer value1, Integer value2) {
            addCriterion("FileAswId between", value1, value2, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andFileaswidNotBetween(Integer value1, Integer value2) {
            addCriterion("FileAswId not between", value1, value2, "fileaswid");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Date value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Date value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Date value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Date value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Date value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Date> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Date> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Date value1, Date value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Date value1, Date value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andCaltimeIsNull() {
            addCriterion("caltime is null");
            return (Criteria) this;
        }

        public Criteria andCaltimeIsNotNull() {
            addCriterion("caltime is not null");
            return (Criteria) this;
        }

        public Criteria andCaltimeEqualTo(Date value) {
            addCriterion("caltime =", value, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeNotEqualTo(Date value) {
            addCriterion("caltime <>", value, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeGreaterThan(Date value) {
            addCriterion("caltime >", value, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("caltime >=", value, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeLessThan(Date value) {
            addCriterion("caltime <", value, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeLessThanOrEqualTo(Date value) {
            addCriterion("caltime <=", value, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeIn(List<Date> values) {
            addCriterion("caltime in", values, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeNotIn(List<Date> values) {
            addCriterion("caltime not in", values, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeBetween(Date value1, Date value2) {
            addCriterion("caltime between", value1, value2, "caltime");
            return (Criteria) this;
        }

        public Criteria andCaltimeNotBetween(Date value1, Date value2) {
            addCriterion("caltime not between", value1, value2, "caltime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIsNull() {
            addCriterion("completeTime is null");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIsNotNull() {
            addCriterion("completeTime is not null");
            return (Criteria) this;
        }

        public Criteria andCompletetimeEqualTo(Date value) {
            addCriterion("completeTime =", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotEqualTo(Date value) {
            addCriterion("completeTime <>", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeGreaterThan(Date value) {
            addCriterion("completeTime >", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("completeTime >=", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLessThan(Date value) {
            addCriterion("completeTime <", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLessThanOrEqualTo(Date value) {
            addCriterion("completeTime <=", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIn(List<Date> values) {
            addCriterion("completeTime in", values, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotIn(List<Date> values) {
            addCriterion("completeTime not in", values, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeBetween(Date value1, Date value2) {
            addCriterion("completeTime between", value1, value2, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotBetween(Date value1, Date value2) {
            addCriterion("completeTime not between", value1, value2, "completetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DefaultData
     *
     * @mbg.generated do_not_delete_during_merge 2020-05-02 14:54:42
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DefaultData
     *
     * @mbg.generated 2020-05-02 14:54:42
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}