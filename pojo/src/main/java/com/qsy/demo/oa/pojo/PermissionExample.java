package com.qsy.demo.oa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public PermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
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
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("PERMISSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("PERMISSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Integer value) {
            addCriterion("PERMISSION_ID =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Integer value) {
            addCriterion("PERMISSION_ID <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Integer value) {
            addCriterion("PERMISSION_ID >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERMISSION_ID >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Integer value) {
            addCriterion("PERMISSION_ID <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("PERMISSION_ID <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Integer> values) {
            addCriterion("PERMISSION_ID in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Integer> values) {
            addCriterion("PERMISSION_ID not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSION_ID between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSION_ID not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("PERMISSION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("PERMISSION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("PERMISSION_NAME =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("PERMISSION_NAME <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("PERMISSION_NAME >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_NAME >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("PERMISSION_NAME <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_NAME <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("PERMISSION_NAME like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("PERMISSION_NAME not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("PERMISSION_NAME in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("PERMISSION_NAME not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("PERMISSION_NAME between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_NAME not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNull() {
            addCriterion("PERMISSION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNotNull() {
            addCriterion("PERMISSION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeEqualTo(String value) {
            addCriterion("PERMISSION_TYPE =", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotEqualTo(String value) {
            addCriterion("PERMISSION_TYPE <>", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThan(String value) {
            addCriterion("PERMISSION_TYPE >", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_TYPE >=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThan(String value) {
            addCriterion("PERMISSION_TYPE <", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_TYPE <=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLike(String value) {
            addCriterion("PERMISSION_TYPE like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotLike(String value) {
            addCriterion("PERMISSION_TYPE not like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIn(List<String> values) {
            addCriterion("PERMISSION_TYPE in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotIn(List<String> values) {
            addCriterion("PERMISSION_TYPE not in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeBetween(String value1, String value2) {
            addCriterion("PERMISSION_TYPE between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_TYPE not between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlIsNull() {
            addCriterion("PERMISSION_URL is null");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlIsNotNull() {
            addCriterion("PERMISSION_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlEqualTo(String value) {
            addCriterion("PERMISSION_URL =", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlNotEqualTo(String value) {
            addCriterion("PERMISSION_URL <>", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlGreaterThan(String value) {
            addCriterion("PERMISSION_URL >", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_URL >=", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlLessThan(String value) {
            addCriterion("PERMISSION_URL <", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_URL <=", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlLike(String value) {
            addCriterion("PERMISSION_URL like", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlNotLike(String value) {
            addCriterion("PERMISSION_URL not like", value, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlIn(List<String> values) {
            addCriterion("PERMISSION_URL in", values, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlNotIn(List<String> values) {
            addCriterion("PERMISSION_URL not in", values, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlBetween(String value1, String value2) {
            addCriterion("PERMISSION_URL between", value1, value2, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionUrlNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_URL not between", value1, value2, "permissionUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeIsNull() {
            addCriterion("PERMISSION_PERCODE is null");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeIsNotNull() {
            addCriterion("PERMISSION_PERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeEqualTo(String value) {
            addCriterion("PERMISSION_PERCODE =", value, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeNotEqualTo(String value) {
            addCriterion("PERMISSION_PERCODE <>", value, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeGreaterThan(String value) {
            addCriterion("PERMISSION_PERCODE >", value, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_PERCODE >=", value, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeLessThan(String value) {
            addCriterion("PERMISSION_PERCODE <", value, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_PERCODE <=", value, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeLike(String value) {
            addCriterion("PERMISSION_PERCODE like", value, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeNotLike(String value) {
            addCriterion("PERMISSION_PERCODE not like", value, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeIn(List<String> values) {
            addCriterion("PERMISSION_PERCODE in", values, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeNotIn(List<String> values) {
            addCriterion("PERMISSION_PERCODE not in", values, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeBetween(String value1, String value2) {
            addCriterion("PERMISSION_PERCODE between", value1, value2, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionPercodeNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_PERCODE not between", value1, value2, "permissionPercode");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidIsNull() {
            addCriterion("PERMISSION_PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidIsNotNull() {
            addCriterion("PERMISSION_PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidEqualTo(Long value) {
            addCriterion("PERMISSION_PARENTID =", value, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidNotEqualTo(Long value) {
            addCriterion("PERMISSION_PARENTID <>", value, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidGreaterThan(Long value) {
            addCriterion("PERMISSION_PARENTID >", value, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("PERMISSION_PARENTID >=", value, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidLessThan(Long value) {
            addCriterion("PERMISSION_PARENTID <", value, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidLessThanOrEqualTo(Long value) {
            addCriterion("PERMISSION_PARENTID <=", value, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidIn(List<Long> values) {
            addCriterion("PERMISSION_PARENTID in", values, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidNotIn(List<Long> values) {
            addCriterion("PERMISSION_PARENTID not in", values, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidBetween(Long value1, Long value2) {
            addCriterion("PERMISSION_PARENTID between", value1, value2, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidNotBetween(Long value1, Long value2) {
            addCriterion("PERMISSION_PARENTID not between", value1, value2, "permissionParentid");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsIsNull() {
            addCriterion("PERMISSION_PARENTIDS is null");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsIsNotNull() {
            addCriterion("PERMISSION_PARENTIDS is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsEqualTo(String value) {
            addCriterion("PERMISSION_PARENTIDS =", value, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsNotEqualTo(String value) {
            addCriterion("PERMISSION_PARENTIDS <>", value, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsGreaterThan(String value) {
            addCriterion("PERMISSION_PARENTIDS >", value, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_PARENTIDS >=", value, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsLessThan(String value) {
            addCriterion("PERMISSION_PARENTIDS <", value, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_PARENTIDS <=", value, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsLike(String value) {
            addCriterion("PERMISSION_PARENTIDS like", value, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsNotLike(String value) {
            addCriterion("PERMISSION_PARENTIDS not like", value, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsIn(List<String> values) {
            addCriterion("PERMISSION_PARENTIDS in", values, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsNotIn(List<String> values) {
            addCriterion("PERMISSION_PARENTIDS not in", values, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsBetween(String value1, String value2) {
            addCriterion("PERMISSION_PARENTIDS between", value1, value2, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionParentidsNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_PARENTIDS not between", value1, value2, "permissionParentids");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringIsNull() {
            addCriterion("PERMISSION_SORTSTRING is null");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringIsNotNull() {
            addCriterion("PERMISSION_SORTSTRING is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringEqualTo(String value) {
            addCriterion("PERMISSION_SORTSTRING =", value, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringNotEqualTo(String value) {
            addCriterion("PERMISSION_SORTSTRING <>", value, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringGreaterThan(String value) {
            addCriterion("PERMISSION_SORTSTRING >", value, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_SORTSTRING >=", value, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringLessThan(String value) {
            addCriterion("PERMISSION_SORTSTRING <", value, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_SORTSTRING <=", value, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringLike(String value) {
            addCriterion("PERMISSION_SORTSTRING like", value, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringNotLike(String value) {
            addCriterion("PERMISSION_SORTSTRING not like", value, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringIn(List<String> values) {
            addCriterion("PERMISSION_SORTSTRING in", values, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringNotIn(List<String> values) {
            addCriterion("PERMISSION_SORTSTRING not in", values, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringBetween(String value1, String value2) {
            addCriterion("PERMISSION_SORTSTRING between", value1, value2, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionSortstringNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_SORTSTRING not between", value1, value2, "permissionSortstring");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableIsNull() {
            addCriterion("PERMISSION_AVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableIsNotNull() {
            addCriterion("PERMISSION_AVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableEqualTo(String value) {
            addCriterion("PERMISSION_AVAILABLE =", value, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableNotEqualTo(String value) {
            addCriterion("PERMISSION_AVAILABLE <>", value, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableGreaterThan(String value) {
            addCriterion("PERMISSION_AVAILABLE >", value, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_AVAILABLE >=", value, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableLessThan(String value) {
            addCriterion("PERMISSION_AVAILABLE <", value, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_AVAILABLE <=", value, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableLike(String value) {
            addCriterion("PERMISSION_AVAILABLE like", value, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableNotLike(String value) {
            addCriterion("PERMISSION_AVAILABLE not like", value, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableIn(List<String> values) {
            addCriterion("PERMISSION_AVAILABLE in", values, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableNotIn(List<String> values) {
            addCriterion("PERMISSION_AVAILABLE not in", values, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableBetween(String value1, String value2) {
            addCriterion("PERMISSION_AVAILABLE between", value1, value2, "permissionAvailable");
            return (Criteria) this;
        }

        public Criteria andPermissionAvailableNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_AVAILABLE not between", value1, value2, "permissionAvailable");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table permission
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 17 17:17:22 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table permission
     *
     * @mbg.generated Tue Apr 17 17:17:22 CST 2018
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