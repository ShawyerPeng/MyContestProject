package po;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNull() {
            addCriterion("carno is null");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNotNull() {
            addCriterion("carno is not null");
            return (Criteria) this;
        }

        public Criteria andCarnoEqualTo(String value) {
            addCriterion("carno =", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotEqualTo(String value) {
            addCriterion("carno <>", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThan(String value) {
            addCriterion("carno >", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThanOrEqualTo(String value) {
            addCriterion("carno >=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThan(String value) {
            addCriterion("carno <", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThanOrEqualTo(String value) {
            addCriterion("carno <=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLike(String value) {
            addCriterion("carno like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotLike(String value) {
            addCriterion("carno not like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoIn(List<String> values) {
            addCriterion("carno in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotIn(List<String> values) {
            addCriterion("carno not in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoBetween(String value1, String value2) {
            addCriterion("carno between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotBetween(String value1, String value2) {
            addCriterion("carno not between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andGpsidIsNull() {
            addCriterion("gpsid is null");
            return (Criteria) this;
        }

        public Criteria andGpsidIsNotNull() {
            addCriterion("gpsid is not null");
            return (Criteria) this;
        }

        public Criteria andGpsidEqualTo(String value) {
            addCriterion("gpsid =", value, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidNotEqualTo(String value) {
            addCriterion("gpsid <>", value, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidGreaterThan(String value) {
            addCriterion("gpsid >", value, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidGreaterThanOrEqualTo(String value) {
            addCriterion("gpsid >=", value, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidLessThan(String value) {
            addCriterion("gpsid <", value, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidLessThanOrEqualTo(String value) {
            addCriterion("gpsid <=", value, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidLike(String value) {
            addCriterion("gpsid like", value, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidNotLike(String value) {
            addCriterion("gpsid not like", value, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidIn(List<String> values) {
            addCriterion("gpsid in", values, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidNotIn(List<String> values) {
            addCriterion("gpsid not in", values, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidBetween(String value1, String value2) {
            addCriterion("gpsid between", value1, value2, "gpsid");
            return (Criteria) this;
        }

        public Criteria andGpsidNotBetween(String value1, String value2) {
            addCriterion("gpsid not between", value1, value2, "gpsid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Integer value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Integer value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Integer value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Integer value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Integer> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Integer> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Integer value1, Integer value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andLastidIsNull() {
            addCriterion("lastid is null");
            return (Criteria) this;
        }

        public Criteria andLastidIsNotNull() {
            addCriterion("lastid is not null");
            return (Criteria) this;
        }

        public Criteria andLastidEqualTo(Long value) {
            addCriterion("lastid =", value, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidNotEqualTo(Long value) {
            addCriterion("lastid <>", value, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidGreaterThan(Long value) {
            addCriterion("lastid >", value, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidGreaterThanOrEqualTo(Long value) {
            addCriterion("lastid >=", value, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidLessThan(Long value) {
            addCriterion("lastid <", value, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidLessThanOrEqualTo(Long value) {
            addCriterion("lastid <=", value, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidIn(List<Long> values) {
            addCriterion("lastid in", values, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidNotIn(List<Long> values) {
            addCriterion("lastid not in", values, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidBetween(Long value1, Long value2) {
            addCriterion("lastid between", value1, value2, "lastid");
            return (Criteria) this;
        }

        public Criteria andLastidNotBetween(Long value1, Long value2) {
            addCriterion("lastid not between", value1, value2, "lastid");
            return (Criteria) this;
        }

        public Criteria andCarstatusIsNull() {
            addCriterion("carstatus is null");
            return (Criteria) this;
        }

        public Criteria andCarstatusIsNotNull() {
            addCriterion("carstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCarstatusEqualTo(Byte value) {
            addCriterion("carstatus =", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusNotEqualTo(Byte value) {
            addCriterion("carstatus <>", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusGreaterThan(Byte value) {
            addCriterion("carstatus >", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("carstatus >=", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusLessThan(Byte value) {
            addCriterion("carstatus <", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusLessThanOrEqualTo(Byte value) {
            addCriterion("carstatus <=", value, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusIn(List<Byte> values) {
            addCriterion("carstatus in", values, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusNotIn(List<Byte> values) {
            addCriterion("carstatus not in", values, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusBetween(Byte value1, Byte value2) {
            addCriterion("carstatus between", value1, value2, "carstatus");
            return (Criteria) this;
        }

        public Criteria andCarstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("carstatus not between", value1, value2, "carstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusIsNull() {
            addCriterion("driverstatus is null");
            return (Criteria) this;
        }

        public Criteria andDriverstatusIsNotNull() {
            addCriterion("driverstatus is not null");
            return (Criteria) this;
        }

        public Criteria andDriverstatusEqualTo(Byte value) {
            addCriterion("driverstatus =", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusNotEqualTo(Byte value) {
            addCriterion("driverstatus <>", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusGreaterThan(Byte value) {
            addCriterion("driverstatus >", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("driverstatus >=", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusLessThan(Byte value) {
            addCriterion("driverstatus <", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusLessThanOrEqualTo(Byte value) {
            addCriterion("driverstatus <=", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusIn(List<Byte> values) {
            addCriterion("driverstatus in", values, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusNotIn(List<Byte> values) {
            addCriterion("driverstatus not in", values, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusBetween(Byte value1, Byte value2) {
            addCriterion("driverstatus between", value1, value2, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("driverstatus not between", value1, value2, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusIsNull() {
            addCriterion("lockstatus is null");
            return (Criteria) this;
        }

        public Criteria andLockstatusIsNotNull() {
            addCriterion("lockstatus is not null");
            return (Criteria) this;
        }

        public Criteria andLockstatusEqualTo(Byte value) {
            addCriterion("lockstatus =", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotEqualTo(Byte value) {
            addCriterion("lockstatus <>", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusGreaterThan(Byte value) {
            addCriterion("lockstatus >", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("lockstatus >=", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLessThan(Byte value) {
            addCriterion("lockstatus <", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLessThanOrEqualTo(Byte value) {
            addCriterion("lockstatus <=", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusIn(List<Byte> values) {
            addCriterion("lockstatus in", values, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotIn(List<Byte> values) {
            addCriterion("lockstatus not in", values, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusBetween(Byte value1, Byte value2) {
            addCriterion("lockstatus between", value1, value2, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("lockstatus not between", value1, value2, "lockstatus");
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