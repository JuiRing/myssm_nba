package com.zhou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GamerecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GamerecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("recordId is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("recordId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("recordId =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("recordId <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("recordId >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("recordId >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("recordId <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("recordId <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("recordId like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("recordId not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("recordId in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("recordId not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("recordId between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("recordId not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIsNull() {
            addCriterion("homeTeamId is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIsNotNull() {
            addCriterion("homeTeamId is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdEqualTo(Integer value) {
            addCriterion("homeTeamId =", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotEqualTo(Integer value) {
            addCriterion("homeTeamId <>", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdGreaterThan(Integer value) {
            addCriterion("homeTeamId >", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("homeTeamId >=", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdLessThan(Integer value) {
            addCriterion("homeTeamId <", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("homeTeamId <=", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIn(List<Integer> values) {
            addCriterion("homeTeamId in", values, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotIn(List<Integer> values) {
            addCriterion("homeTeamId not in", values, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("homeTeamId between", value1, value2, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("homeTeamId not between", value1, value2, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andGameDateIsNull() {
            addCriterion("gameDate is null");
            return (Criteria) this;
        }

        public Criteria andGameDateIsNotNull() {
            addCriterion("gameDate is not null");
            return (Criteria) this;
        }

        public Criteria andGameDateEqualTo(Date value) {
            addCriterion("gameDate =", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotEqualTo(Date value) {
            addCriterion("gameDate <>", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateGreaterThan(Date value) {
            addCriterion("gameDate >", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateGreaterThanOrEqualTo(Date value) {
            addCriterion("gameDate >=", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateLessThan(Date value) {
            addCriterion("gameDate <", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateLessThanOrEqualTo(Date value) {
            addCriterion("gameDate <=", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateIn(List<Date> values) {
            addCriterion("gameDate in", values, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotIn(List<Date> values) {
            addCriterion("gameDate not in", values, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateBetween(Date value1, Date value2) {
            addCriterion("gameDate between", value1, value2, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotBetween(Date value1, Date value2) {
            addCriterion("gameDate not between", value1, value2, "gameDate");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdIsNull() {
            addCriterion("visitingTeamId is null");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdIsNotNull() {
            addCriterion("visitingTeamId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdEqualTo(Integer value) {
            addCriterion("visitingTeamId =", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdNotEqualTo(Integer value) {
            addCriterion("visitingTeamId <>", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdGreaterThan(Integer value) {
            addCriterion("visitingTeamId >", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitingTeamId >=", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdLessThan(Integer value) {
            addCriterion("visitingTeamId <", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("visitingTeamId <=", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdIn(List<Integer> values) {
            addCriterion("visitingTeamId in", values, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdNotIn(List<Integer> values) {
            addCriterion("visitingTeamId not in", values, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("visitingTeamId between", value1, value2, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("visitingTeamId not between", value1, value2, "visitingTeamId");
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