package com.sohu.bp.roast.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BpRoastExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BpRoastExample() {
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

        public Criteria andRoastIdIsNull() {
            addCriterion("roast_id is null");
            return (Criteria) this;
        }

        public Criteria andRoastIdIsNotNull() {
            addCriterion("roast_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoastIdEqualTo(Long value) {
            addCriterion("roast_id =", value, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdNotEqualTo(Long value) {
            addCriterion("roast_id <>", value, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdGreaterThan(Long value) {
            addCriterion("roast_id >", value, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdGreaterThanOrEqualTo(Long value) {
            addCriterion("roast_id >=", value, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdLessThan(Long value) {
            addCriterion("roast_id <", value, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdLessThanOrEqualTo(Long value) {
            addCriterion("roast_id <=", value, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdIn(List<Long> values) {
            addCriterion("roast_id in", values, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdNotIn(List<Long> values) {
            addCriterion("roast_id not in", values, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdBetween(Long value1, Long value2) {
            addCriterion("roast_id between", value1, value2, "roastId");
            return (Criteria) this;
        }

        public Criteria andRoastIdNotBetween(Long value1, Long value2) {
            addCriterion("roast_id not between", value1, value2, "roastId");
            return (Criteria) this;
        }

        public Criteria andFocusIdIsNull() {
            addCriterion("focus_id is null");
            return (Criteria) this;
        }

        public Criteria andFocusIdIsNotNull() {
            addCriterion("focus_id is not null");
            return (Criteria) this;
        }

        public Criteria andFocusIdEqualTo(Integer value) {
            addCriterion("focus_id =", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdNotEqualTo(Integer value) {
            addCriterion("focus_id <>", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdGreaterThan(Integer value) {
            addCriterion("focus_id >", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("focus_id >=", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdLessThan(Integer value) {
            addCriterion("focus_id <", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdLessThanOrEqualTo(Integer value) {
            addCriterion("focus_id <=", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdIn(List<Integer> values) {
            addCriterion("focus_id in", values, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdNotIn(List<Integer> values) {
            addCriterion("focus_id not in", values, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdBetween(Integer value1, Integer value2) {
            addCriterion("focus_id between", value1, value2, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("focus_id not between", value1, value2, "focusId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andImageUrlsIsNull() {
            addCriterion("image_urls is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlsIsNotNull() {
            addCriterion("image_urls is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlsEqualTo(String value) {
            addCriterion("image_urls =", value, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsNotEqualTo(String value) {
            addCriterion("image_urls <>", value, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsGreaterThan(String value) {
            addCriterion("image_urls >", value, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("image_urls >=", value, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsLessThan(String value) {
            addCriterion("image_urls <", value, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsLessThanOrEqualTo(String value) {
            addCriterion("image_urls <=", value, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsLike(String value) {
            addCriterion("image_urls like", value, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsNotLike(String value) {
            addCriterion("image_urls not like", value, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsIn(List<String> values) {
            addCriterion("image_urls in", values, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsNotIn(List<String> values) {
            addCriterion("image_urls not in", values, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsBetween(String value1, String value2) {
            addCriterion("image_urls between", value1, value2, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andImageUrlsNotBetween(String value1, String value2) {
            addCriterion("image_urls not between", value1, value2, "imageUrls");
            return (Criteria) this;
        }

        public Criteria andThumbUpIsNull() {
            addCriterion("thumb_up is null");
            return (Criteria) this;
        }

        public Criteria andThumbUpIsNotNull() {
            addCriterion("thumb_up is not null");
            return (Criteria) this;
        }

        public Criteria andThumbUpEqualTo(Integer value) {
            addCriterion("thumb_up =", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpNotEqualTo(Integer value) {
            addCriterion("thumb_up <>", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpGreaterThan(Integer value) {
            addCriterion("thumb_up >", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("thumb_up >=", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpLessThan(Integer value) {
            addCriterion("thumb_up <", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpLessThanOrEqualTo(Integer value) {
            addCriterion("thumb_up <=", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpIn(List<Integer> values) {
            addCriterion("thumb_up in", values, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpNotIn(List<Integer> values) {
            addCriterion("thumb_up not in", values, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpBetween(Integer value1, Integer value2) {
            addCriterion("thumb_up between", value1, value2, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpNotBetween(Integer value1, Integer value2) {
            addCriterion("thumb_up not between", value1, value2, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
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