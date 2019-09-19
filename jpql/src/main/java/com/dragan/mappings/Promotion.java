package com.dragan.mappings;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="\"PROMOTION\""
        , schema="\"FOODMART\""
        )
public class Promotion implements Serializable {

private static final long serialVersionUID = 1L;

public Promotion() {
}

@Id
@Column(name="\"PROMOTION_ID\"")
private BigDecimal PROMOTION_ID=null;
@Column(name="\"PROMOTION_DISTRICT_ID\"")
private BigDecimal PROMOTION_DISTRICT_ID=null;
@Column(name="\"PROMOTION_NAME\"")
private String PROMOTION_NAME=null;
@Column(name="\"MEDIA_TYPE\"")
private String MEDIA_TYPE=null;
@Column(name="\"COST\"")
private BigDecimal COST=null;
@Column(name="\"START_DATE\"")
private Timestamp START_DATE=null;
@Column(name="\"END_DATE\"")
private Timestamp END_DATE=null;

public BigDecimal getPROMOTION_ID () {
return this.PROMOTION_ID;
}
public void setPROMOTION_ID (BigDecimal PROMOTION_ID) {
this.PROMOTION_ID = PROMOTION_ID;
}
public BigDecimal getPROMOTION_DISTRICT_ID () {
return this.PROMOTION_DISTRICT_ID;
}
public void setPROMOTION_DISTRICT_ID (BigDecimal PROMOTION_DISTRICT_ID) {
this.PROMOTION_DISTRICT_ID = PROMOTION_DISTRICT_ID;
}
public String getPROMOTION_NAME () {
return this.PROMOTION_NAME;
}
public void setPROMOTION_NAME (String PROMOTION_NAME) {
this.PROMOTION_NAME = PROMOTION_NAME;
}
public String getMEDIA_TYPE () {
return this.MEDIA_TYPE;
}
public void setMEDIA_TYPE (String MEDIA_TYPE) {
this.MEDIA_TYPE = MEDIA_TYPE;
}
public BigDecimal getCOST () {
return this.COST;
}
public void setCOST (BigDecimal COST) {
this.COST = COST;
}
public Timestamp getSTART_DATE () {
return this.START_DATE;
}
public void setSTART_DATE (Timestamp START_DATE) {
this.START_DATE = START_DATE;
}
public Timestamp getEND_DATE () {
return this.END_DATE;
}
public void setEND_DATE (Timestamp END_DATE) {
this.END_DATE = END_DATE;
}



		@OneToMany(mappedBy="rel_PROMOTION_ID_in_promotion", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
private java.util.Set<Sales> promo_Sales;









public java.util.Set<Sales> getPromo_Sales () {
return this.promo_Sales;
}

public void setPromo_Sales (java.util.Set<Sales> promo_Sales) {
this.promo_Sales = promo_Sales;
}






}
