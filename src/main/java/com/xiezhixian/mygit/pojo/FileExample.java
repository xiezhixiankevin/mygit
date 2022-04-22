package com.xiezhixian.mygit.pojo;

import java.util.ArrayList;
import java.util.List;

public class FileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserIsNull() {
            addCriterion("latestChangeUser is null");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserIsNotNull() {
            addCriterion("latestChangeUser is not null");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserEqualTo(Integer value) {
            addCriterion("latestChangeUser =", value, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserNotEqualTo(Integer value) {
            addCriterion("latestChangeUser <>", value, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserGreaterThan(Integer value) {
            addCriterion("latestChangeUser >", value, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("latestChangeUser >=", value, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserLessThan(Integer value) {
            addCriterion("latestChangeUser <", value, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserLessThanOrEqualTo(Integer value) {
            addCriterion("latestChangeUser <=", value, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserIn(List<Integer> values) {
            addCriterion("latestChangeUser in", values, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserNotIn(List<Integer> values) {
            addCriterion("latestChangeUser not in", values, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserBetween(Integer value1, Integer value2) {
            addCriterion("latestChangeUser between", value1, value2, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestchangeuserNotBetween(Integer value1, Integer value2) {
            addCriterion("latestChangeUser not between", value1, value2, "latestchangeuser");
            return (Criteria) this;
        }

        public Criteria andLatestloadIsNull() {
            addCriterion("latestLoad is null");
            return (Criteria) this;
        }

        public Criteria andLatestloadIsNotNull() {
            addCriterion("latestLoad is not null");
            return (Criteria) this;
        }

        public Criteria andLatestloadEqualTo(Integer value) {
            addCriterion("latestLoad =", value, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadNotEqualTo(Integer value) {
            addCriterion("latestLoad <>", value, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadGreaterThan(Integer value) {
            addCriterion("latestLoad >", value, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("latestLoad >=", value, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadLessThan(Integer value) {
            addCriterion("latestLoad <", value, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadLessThanOrEqualTo(Integer value) {
            addCriterion("latestLoad <=", value, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadIn(List<Integer> values) {
            addCriterion("latestLoad in", values, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadNotIn(List<Integer> values) {
            addCriterion("latestLoad not in", values, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadBetween(Integer value1, Integer value2) {
            addCriterion("latestLoad between", value1, value2, "latestload");
            return (Criteria) this;
        }

        public Criteria andLatestloadNotBetween(Integer value1, Integer value2) {
            addCriterion("latestLoad not between", value1, value2, "latestload");
            return (Criteria) this;
        }

        public Criteria andFpathIsNull() {
            addCriterion("fpath is null");
            return (Criteria) this;
        }

        public Criteria andFpathIsNotNull() {
            addCriterion("fpath is not null");
            return (Criteria) this;
        }

        public Criteria andFpathEqualTo(String value) {
            addCriterion("fpath =", value, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathNotEqualTo(String value) {
            addCriterion("fpath <>", value, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathGreaterThan(String value) {
            addCriterion("fpath >", value, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathGreaterThanOrEqualTo(String value) {
            addCriterion("fpath >=", value, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathLessThan(String value) {
            addCriterion("fpath <", value, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathLessThanOrEqualTo(String value) {
            addCriterion("fpath <=", value, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathLike(String value) {
            addCriterion("fpath like", value, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathNotLike(String value) {
            addCriterion("fpath not like", value, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathIn(List<String> values) {
            addCriterion("fpath in", values, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathNotIn(List<String> values) {
            addCriterion("fpath not in", values, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathBetween(String value1, String value2) {
            addCriterion("fpath between", value1, value2, "fpath");
            return (Criteria) this;
        }

        public Criteria andFpathNotBetween(String value1, String value2) {
            addCriterion("fpath not between", value1, value2, "fpath");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectId is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectId is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectId =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectId <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectId >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectId >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectId <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectId <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectId in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectId not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectId between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectId not between", value1, value2, "projectid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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