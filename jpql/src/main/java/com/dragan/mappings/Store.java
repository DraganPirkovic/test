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
@Table(name="\"STORE\""
        , schema="\"FOODMART\""
        )
public class Store implements Serializable {

private static final long serialVersionUID = 1L;

public Store() {
}

@Id
@Column(name="\"STORE_ID\"")
private BigDecimal STORE_ID=null;
@Column(name="\"STORE_TYPE\"")
private String STORE_TYPE=null;
@Column(name="\"REGION_ID\"")
private BigDecimal REGION_ID=null;
@Column(name="\"STORE_NAME\"")
private String STORE_NAME=null;
@Column(name="\"STORE_NUMBER\"")
private BigDecimal STORE_NUMBER=null;
@Column(name="\"STORE_STREET_ADDRESS\"")
private String STORE_STREET_ADDRESS=null;
@Column(name="\"STORE_CITY\"")
private String STORE_CITY=null;
@Column(name="\"STORE_STATE\"")
private String STORE_STATE=null;
@Column(name="\"STORE_POSTAL_CODE\"")
private String STORE_POSTAL_CODE=null;
@Column(name="\"STORE_COUNTRY\"")
private String STORE_COUNTRY=null;
@Column(name="\"STORE_MANAGER\"")
private String STORE_MANAGER=null;
@Column(name="\"STORE_PHONE\"")
private String STORE_PHONE=null;
@Column(name="\"STORE_FAX\"")
private String STORE_FAX=null;
@Column(name="\"FIRST_OPENED_DATE\"")
private Timestamp FIRST_OPENED_DATE=null;
@Column(name="\"LAST_REMODEL_DATE\"")
private Timestamp LAST_REMODEL_DATE=null;
@Column(name="\"STORE_SQFT\"")
private BigDecimal STORE_SQFT=null;
@Column(name="\"GROCERY_SQFT\"")
private BigDecimal GROCERY_SQFT=null;
@Column(name="\"FROZEN_SQFT\"")
private BigDecimal FROZEN_SQFT=null;
@Column(name="\"MEAT_SQFT\"")
private BigDecimal MEAT_SQFT=null;
@Column(name="\"COFFEE_BAR\"")
private BigDecimal COFFEE_BAR=null;
@Column(name="\"VIDEO_STORE\"")
private BigDecimal VIDEO_STORE=null;
@Column(name="\"SALAD_BAR\"")
private BigDecimal SALAD_BAR=null;
@Column(name="\"PREPARED_FOOD\"")
private BigDecimal PREPARED_FOOD=null;
@Column(name="\"FLORIST\"")
private BigDecimal FLORIST=null;

public BigDecimal getSTORE_ID () {
return this.STORE_ID;
}
public void setSTORE_ID (BigDecimal STORE_ID) {
this.STORE_ID = STORE_ID;
}
public String getSTORE_TYPE () {
return this.STORE_TYPE;
}
public void setSTORE_TYPE (String STORE_TYPE) {
this.STORE_TYPE = STORE_TYPE;
}
public BigDecimal getREGION_ID () {
return this.REGION_ID;
}
public void setREGION_ID (BigDecimal REGION_ID) {
this.REGION_ID = REGION_ID;
}
public String getSTORE_NAME () {
return this.STORE_NAME;
}
public void setSTORE_NAME (String STORE_NAME) {
this.STORE_NAME = STORE_NAME;
}
public BigDecimal getSTORE_NUMBER () {
return this.STORE_NUMBER;
}
public void setSTORE_NUMBER (BigDecimal STORE_NUMBER) {
this.STORE_NUMBER = STORE_NUMBER;
}
public String getSTORE_STREET_ADDRESS () {
return this.STORE_STREET_ADDRESS;
}
public void setSTORE_STREET_ADDRESS (String STORE_STREET_ADDRESS) {
this.STORE_STREET_ADDRESS = STORE_STREET_ADDRESS;
}
public String getSTORE_CITY () {
return this.STORE_CITY;
}
public void setSTORE_CITY (String STORE_CITY) {
this.STORE_CITY = STORE_CITY;
}
public String getSTORE_STATE () {
return this.STORE_STATE;
}
public void setSTORE_STATE (String STORE_STATE) {
this.STORE_STATE = STORE_STATE;
}
public String getSTORE_POSTAL_CODE () {
return this.STORE_POSTAL_CODE;
}
public void setSTORE_POSTAL_CODE (String STORE_POSTAL_CODE) {
this.STORE_POSTAL_CODE = STORE_POSTAL_CODE;
}
public String getSTORE_COUNTRY () {
return this.STORE_COUNTRY;
}
public void setSTORE_COUNTRY (String STORE_COUNTRY) {
this.STORE_COUNTRY = STORE_COUNTRY;
}
public String getSTORE_MANAGER () {
return this.STORE_MANAGER;
}
public void setSTORE_MANAGER (String STORE_MANAGER) {
this.STORE_MANAGER = STORE_MANAGER;
}
public String getSTORE_PHONE () {
return this.STORE_PHONE;
}
public void setSTORE_PHONE (String STORE_PHONE) {
this.STORE_PHONE = STORE_PHONE;
}
public String getSTORE_FAX () {
return this.STORE_FAX;
}
public void setSTORE_FAX (String STORE_FAX) {
this.STORE_FAX = STORE_FAX;
}
public Timestamp getFIRST_OPENED_DATE () {
return this.FIRST_OPENED_DATE;
}
public void setFIRST_OPENED_DATE (Timestamp FIRST_OPENED_DATE) {
this.FIRST_OPENED_DATE = FIRST_OPENED_DATE;
}
public Timestamp getLAST_REMODEL_DATE () {
return this.LAST_REMODEL_DATE;
}
public void setLAST_REMODEL_DATE (Timestamp LAST_REMODEL_DATE) {
this.LAST_REMODEL_DATE = LAST_REMODEL_DATE;
}
public BigDecimal getSTORE_SQFT () {
return this.STORE_SQFT;
}
public void setSTORE_SQFT (BigDecimal STORE_SQFT) {
this.STORE_SQFT = STORE_SQFT;
}
public BigDecimal getGROCERY_SQFT () {
return this.GROCERY_SQFT;
}
public void setGROCERY_SQFT (BigDecimal GROCERY_SQFT) {
this.GROCERY_SQFT = GROCERY_SQFT;
}
public BigDecimal getFROZEN_SQFT () {
return this.FROZEN_SQFT;
}
public void setFROZEN_SQFT (BigDecimal FROZEN_SQFT) {
this.FROZEN_SQFT = FROZEN_SQFT;
}
public BigDecimal getMEAT_SQFT () {
return this.MEAT_SQFT;
}
public void setMEAT_SQFT (BigDecimal MEAT_SQFT) {
this.MEAT_SQFT = MEAT_SQFT;
}
public BigDecimal getCOFFEE_BAR () {
return this.COFFEE_BAR;
}
public void setCOFFEE_BAR (BigDecimal COFFEE_BAR) {
this.COFFEE_BAR = COFFEE_BAR;
}
public BigDecimal getVIDEO_STORE () {
return this.VIDEO_STORE;
}
public void setVIDEO_STORE (BigDecimal VIDEO_STORE) {
this.VIDEO_STORE = VIDEO_STORE;
}
public BigDecimal getSALAD_BAR () {
return this.SALAD_BAR;
}
public void setSALAD_BAR (BigDecimal SALAD_BAR) {
this.SALAD_BAR = SALAD_BAR;
}
public BigDecimal getPREPARED_FOOD () {
return this.PREPARED_FOOD;
}
public void setPREPARED_FOOD (BigDecimal PREPARED_FOOD) {
this.PREPARED_FOOD = PREPARED_FOOD;
}
public BigDecimal getFLORIST () {
return this.FLORIST;
}
public void setFLORIST (BigDecimal FLORIST) {
this.FLORIST = FLORIST;
}



		@OneToMany(mappedBy="rel_STORE_ID_in_store", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
private java.util.Set<Sales> store_Sales;









public java.util.Set<Sales> getStore_Sales () {
return this.store_Sales;
}

public void setStore_Sales (java.util.Set<Sales> store_Sales) {
this.store_Sales = store_Sales;
}






}
