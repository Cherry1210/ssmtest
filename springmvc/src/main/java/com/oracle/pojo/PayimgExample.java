package com.oracle.pojo;

import java.util.ArrayList;
import java.util.List;

public class PayimgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayimgExample() {
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

        public Criteria andPayimgIdIsNull() {
            addCriterion("payimg_id is null");
            return (Criteria) this;
        }

        public Criteria andPayimgIdIsNotNull() {
            addCriterion("payimg_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayimgIdEqualTo(Integer value) {
            addCriterion("payimg_id =", value, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdNotEqualTo(Integer value) {
            addCriterion("payimg_id <>", value, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdGreaterThan(Integer value) {
            addCriterion("payimg_id >", value, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payimg_id >=", value, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdLessThan(Integer value) {
            addCriterion("payimg_id <", value, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdLessThanOrEqualTo(Integer value) {
            addCriterion("payimg_id <=", value, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdIn(List<Integer> values) {
            addCriterion("payimg_id in", values, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdNotIn(List<Integer> values) {
            addCriterion("payimg_id not in", values, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdBetween(Integer value1, Integer value2) {
            addCriterion("payimg_id between", value1, value2, "payimgId");
            return (Criteria) this;
        }

        public Criteria andPayimgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payimg_id not between", value1, value2, "payimgId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria andPaynumIsNull() {
            addCriterion("paynum is null");
            return (Criteria) this;
        }

        public Criteria andPaynumIsNotNull() {
            addCriterion("paynum is not null");
            return (Criteria) this;
        }

        public Criteria andPaynumEqualTo(String value) {
            addCriterion("paynum =", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumNotEqualTo(String value) {
            addCriterion("paynum <>", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumGreaterThan(String value) {
            addCriterion("paynum >", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumGreaterThanOrEqualTo(String value) {
            addCriterion("paynum >=", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumLessThan(String value) {
            addCriterion("paynum <", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumLessThanOrEqualTo(String value) {
            addCriterion("paynum <=", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumLike(String value) {
            addCriterion("paynum like", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumNotLike(String value) {
            addCriterion("paynum not like", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumIn(List<String> values) {
            addCriterion("paynum in", values, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumNotIn(List<String> values) {
            addCriterion("paynum not in", values, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumBetween(String value1, String value2) {
            addCriterion("paynum between", value1, value2, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumNotBetween(String value1, String value2) {
            addCriterion("paynum not between", value1, value2, "paynum");
            return (Criteria) this;
        }

        public Criteria andPayimgIsNull() {
            addCriterion("payimg is null");
            return (Criteria) this;
        }

        public Criteria andPayimgIsNotNull() {
            addCriterion("payimg is not null");
            return (Criteria) this;
        }

        public Criteria andPayimgEqualTo(String value) {
            addCriterion("payimg =", value, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgNotEqualTo(String value) {
            addCriterion("payimg <>", value, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgGreaterThan(String value) {
            addCriterion("payimg >", value, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgGreaterThanOrEqualTo(String value) {
            addCriterion("payimg >=", value, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgLessThan(String value) {
            addCriterion("payimg <", value, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgLessThanOrEqualTo(String value) {
            addCriterion("payimg <=", value, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgLike(String value) {
            addCriterion("payimg like", value, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgNotLike(String value) {
            addCriterion("payimg not like", value, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgIn(List<String> values) {
            addCriterion("payimg in", values, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgNotIn(List<String> values) {
            addCriterion("payimg not in", values, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgBetween(String value1, String value2) {
            addCriterion("payimg between", value1, value2, "payimg");
            return (Criteria) this;
        }

        public Criteria andPayimgNotBetween(String value1, String value2) {
            addCriterion("payimg not between", value1, value2, "payimg");
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