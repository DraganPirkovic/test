package com.dragan.mappings;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="\"TIME_BY_DAY\""
        , schema="\"FOODMART\""
        )
public class Time implements Serializable {

private static final long serialVersionUID = 1L;

public Time() {
}

@Id
@Column(name="\"TIME_ID\"")
private BigDecimal TIME_ID=null;
@Column(name="\"THE_DATE\"")
private Timestamp THE_DATE=null;
@Column(name="\"THE_DAY\"")
private String THE_DAY=null;
@Column(name="\"THE_MONTH\"")
private String THE_MONTH=null;
@Column(name="\"THE_YEAR\"")
private BigDecimal THE_YEAR=null;
@Column(name="\"DAY_OF_MONTH\"")
private BigDecimal DAY_OF_MONTH=null;
@Column(name="\"WEEK_OF_YEAR\"")
private BigDecimal WEEK_OF_YEAR=null;
@Column(name="\"MONTH_OF_YEAR\"")
private BigDecimal MONTH_OF_YEAR=null;
@Column(name="\"QUARTER\"")
private String QUARTER=null;
@Column(name="\"FISCAL_PERIOD\"")
@Basic(fetch = FetchType.LAZY)
private String FISCAL_PERIOD=null;

public BigDecimal getTIME_ID () {
return this.TIME_ID;
}
public void setTIME_ID (BigDecimal TIME_ID) {
this.TIME_ID = TIME_ID;
}
public Timestamp getTHE_DATE () {
return this.THE_DATE;
}
public void setTHE_DATE (Timestamp THE_DATE) {
this.THE_DATE = THE_DATE;
}
public String getTHE_DAY () {
return this.THE_DAY;
}
public void setTHE_DAY (String THE_DAY) {
this.THE_DAY = THE_DAY;
}
public String getTHE_MONTH () {
return this.THE_MONTH;
}
public void setTHE_MONTH (String THE_MONTH) {
this.THE_MONTH = THE_MONTH;
}
public BigDecimal getTHE_YEAR () {
return this.THE_YEAR;
}
public void setTHE_YEAR (BigDecimal THE_YEAR) {
this.THE_YEAR = THE_YEAR;
}
public BigDecimal getDAY_OF_MONTH () {
return this.DAY_OF_MONTH;
}
public void setDAY_OF_MONTH (BigDecimal DAY_OF_MONTH) {
this.DAY_OF_MONTH = DAY_OF_MONTH;
}
public BigDecimal getWEEK_OF_YEAR () {
return this.WEEK_OF_YEAR;
}
public void setWEEK_OF_YEAR (BigDecimal WEEK_OF_YEAR) {
this.WEEK_OF_YEAR = WEEK_OF_YEAR;
}
public BigDecimal getMONTH_OF_YEAR () {
return this.MONTH_OF_YEAR;
}
public void setMONTH_OF_YEAR (BigDecimal MONTH_OF_YEAR) {
this.MONTH_OF_YEAR = MONTH_OF_YEAR;
}
public String getQUARTER () {
return this.QUARTER;
}
public void setQUARTER (String QUARTER) {
this.QUARTER = QUARTER;
}
public String getFISCAL_PERIOD () {
return this.FISCAL_PERIOD;
}
public void setFISCAL_PERIOD (String FISCAL_PERIOD) {
this.FISCAL_PERIOD = FISCAL_PERIOD;
}



		@OneToMany(mappedBy="rel_TIME_ID_in_time", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
private java.util.Set<Sales> time_Sales;









public java.util.Set<Sales> getTime_Sales () {
return this.time_Sales;
}

public void setTime_Sales (java.util.Set<Sales> time_Sales) {
this.time_Sales = time_Sales;
}






}
