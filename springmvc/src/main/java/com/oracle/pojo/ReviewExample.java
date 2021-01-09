package com.oracle.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andReviewIdIsNull() {
            addCriterion("review_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNotNull() {
            addCriterion("review_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIdEqualTo(Integer value) {
            addCriterion("review_id =", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotEqualTo(Integer value) {
            addCriterion("review_id <>", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThan(Integer value) {
            addCriterion("review_id >", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_id >=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThan(Integer value) {
            addCriterion("review_id <", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("review_id <=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdIn(List<Integer> values) {
            addCriterion("review_id in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotIn(List<Integer> values) {
            addCriterion("review_id not in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdBetween(Integer value1, Integer value2) {
            addCriterion("review_id between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("review_id not between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andUserGetidIsNull() {
            addCriterion("user_getid is null");
            return (Criteria) this;
        }

        public Criteria andUserGetidIsNotNull() {
            addCriterion("user_getid is not null");
            return (Criteria) this;
        }

        public Criteria andUserGetidEqualTo(Integer value) {
            addCriterion("user_getid =", value, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidNotEqualTo(Integer value) {
            addCriterion("user_getid <>", value, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidGreaterThan(Integer value) {
            addCriterion("user_getid >", value, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_getid >=", value, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidLessThan(Integer value) {
            addCriterion("user_getid <", value, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidLessThanOrEqualTo(Integer value) {
            addCriterion("user_getid <=", value, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidIn(List<Integer> values) {
            addCriterion("user_getid in", values, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidNotIn(List<Integer> values) {
            addCriterion("user_getid not in", values, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidBetween(Integer value1, Integer value2) {
            addCriterion("user_getid between", value1, value2, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserGetidNotBetween(Integer value1, Integer value2) {
            addCriterion("user_getid not between", value1, value2, "userGetid");
            return (Criteria) this;
        }

        public Criteria andUserOutidIsNull() {
            addCriterion("user_outid is null");
            return (Criteria) this;
        }

        public Criteria andUserOutidIsNotNull() {
            addCriterion("user_outid is not null");
            return (Criteria) this;
        }

        public Criteria andUserOutidEqualTo(Integer value) {
            addCriterion("user_outid =", value, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidNotEqualTo(Integer value) {
            addCriterion("user_outid <>", value, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidGreaterThan(Integer value) {
            addCriterion("user_outid >", value, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_outid >=", value, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidLessThan(Integer value) {
            addCriterion("user_outid <", value, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidLessThanOrEqualTo(Integer value) {
            addCriterion("user_outid <=", value, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidIn(List<Integer> values) {
            addCriterion("user_outid in", values, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidNotIn(List<Integer> values) {
            addCriterion("user_outid not in", values, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidBetween(Integer value1, Integer value2) {
            addCriterion("user_outid between", value1, value2, "userOutid");
            return (Criteria) this;
        }

        public Criteria andUserOutidNotBetween(Integer value1, Integer value2) {
            addCriterion("user_outid not between", value1, value2, "userOutid");
            return (Criteria) this;
        }

        public Criteria andReviewInfoIsNull() {
            addCriterion("review_info is null");
            return (Criteria) this;
        }

        public Criteria andReviewInfoIsNotNull() {
            addCriterion("review_info is not null");
            return (Criteria) this;
        }

        public Criteria andReviewInfoEqualTo(String value) {
            addCriterion("review_info =", value, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoNotEqualTo(String value) {
            addCriterion("review_info <>", value, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoGreaterThan(String value) {
            addCriterion("review_info >", value, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoGreaterThanOrEqualTo(String value) {
            addCriterion("review_info >=", value, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoLessThan(String value) {
            addCriterion("review_info <", value, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoLessThanOrEqualTo(String value) {
            addCriterion("review_info <=", value, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoLike(String value) {
            addCriterion("review_info like", value, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoNotLike(String value) {
            addCriterion("review_info not like", value, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoIn(List<String> values) {
            addCriterion("review_info in", values, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoNotIn(List<String> values) {
            addCriterion("review_info not in", values, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoBetween(String value1, String value2) {
            addCriterion("review_info between", value1, value2, "reviewInfo");
            return (Criteria) this;
        }

        public Criteria andReviewInfoNotBetween(String value1, String value2) {
            addCriterion("review_info not between", value1, value2, "reviewInfo");
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