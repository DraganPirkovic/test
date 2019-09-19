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
@Table(name="\"CUSTOMER\""
        , schema="\"FOODMART\""
        )
public class Customer implements Serializable {

private static final long serialVersionUID = 1L;

public Customer() {
}

@Id
@Column(name="\"CUSTOMER_ID\"")
private BigDecimal CUSTOMER_ID=null;
@Column(name="\"ACCOUNT_NUM\"")
private BigDecimal ACCOUNT_NUM=null;
@Column(name="\"LNAME\"")
private String LNAME=null;
@Column(name="\"FNAME\"")
private String FNAME=null;
@Column(name="\"MI\"")
private String MI=null;
@Column(name="\"ADDRESS1\"")
private String ADDRESS1=null;
@Column(name="\"ADDRESS2\"")
private String ADDRESS2=null;
@Column(name="\"ADDRESS3\"")
private String ADDRESS3=null;
@Column(name="\"ADDRESS4\"")
private String ADDRESS4=null;
@Column(name="\"CITY\"")
private String CITY=null;
@Column(name="\"STATE_PROVINCE\"")
private String STATE_PROVINCE=null;
@Column(name="\"POSTAL_CODE\"")
private String POSTAL_CODE=null;
@Column(name="\"COUNTRY\"")
private String COUNTRY=null;
@Column(name="\"CUSTOMER_REGION_ID\"")
private BigDecimal CUSTOMER_REGION_ID=null;
@Column(name="\"PHONE1\"")
private String PHONE1=null;
@Column(name="\"PHONE2\"")
private String PHONE2=null;
@Column(name="\"BIRTHDATE\"")
private Timestamp BIRTHDATE=null;
@Column(name="\"MARITAL_STATUS\"")
private String MARITAL_STATUS=null;
@Column(name="\"YEARLY_INCOME\"")
private String YEARLY_INCOME=null;
@Column(name="\"GENDER\"")
private String GENDER=null;
@Column(name="\"TOTAL_CHILDREN\"")
private BigDecimal TOTAL_CHILDREN=null;
@Column(name="\"NUM_CHILDREN_AT_HOME\"")
private BigDecimal NUM_CHILDREN_AT_HOME=null;
@Column(name="\"EDUCATION\"")
private String EDUCATION=null;
@Column(name="\"DATE_ACCNT_OPENED\"")
private Timestamp DATE_ACCNT_OPENED=null;
@Column(name="\"MEMBER_CARD\"")
private String MEMBER_CARD=null;
@Column(name="\"OCCUPATION\"")
private String OCCUPATION=null;
@Column(name="\"HOUSEOWNER\"")
private String HOUSEOWNER=null;
@Column(name="\"NUM_CARS_OWNED\"")
private BigDecimal NUM_CARS_OWNED=null;
@Column(name="\"FULLNAME\"")
private String FULLNAME=null;

public BigDecimal getCUSTOMER_ID () {
return this.CUSTOMER_ID;
}
public void setCUSTOMER_ID (BigDecimal CUSTOMER_ID) {
this.CUSTOMER_ID = CUSTOMER_ID;
}
public BigDecimal getACCOUNT_NUM () {
return this.ACCOUNT_NUM;
}
public void setACCOUNT_NUM (BigDecimal ACCOUNT_NUM) {
this.ACCOUNT_NUM = ACCOUNT_NUM;
}
public String getLNAME () {
return this.LNAME;
}
public void setLNAME (String LNAME) {
this.LNAME = LNAME;
}
public String getFNAME () {
return this.FNAME;
}
public void setFNAME (String FNAME) {
this.FNAME = FNAME;
}
public String getMI () {
return this.MI;
}
public void setMI (String MI) {
this.MI = MI;
}
public String getADDRESS1 () {
return this.ADDRESS1;
}
public void setADDRESS1 (String ADDRESS1) {
this.ADDRESS1 = ADDRESS1;
}
public String getADDRESS2 () {
return this.ADDRESS2;
}
public void setADDRESS2 (String ADDRESS2) {
this.ADDRESS2 = ADDRESS2;
}
public String getADDRESS3 () {
return this.ADDRESS3;
}
public void setADDRESS3 (String ADDRESS3) {
this.ADDRESS3 = ADDRESS3;
}
public String getADDRESS4 () {
return this.ADDRESS4;
}
public void setADDRESS4 (String ADDRESS4) {
this.ADDRESS4 = ADDRESS4;
}
public String getCITY () {
return this.CITY;
}
public void setCITY (String CITY) {
this.CITY = CITY;
}
public String getSTATE_PROVINCE () {
return this.STATE_PROVINCE;
}
public void setSTATE_PROVINCE (String STATE_PROVINCE) {
this.STATE_PROVINCE = STATE_PROVINCE;
}
public String getPOSTAL_CODE () {
return this.POSTAL_CODE;
}
public void setPOSTAL_CODE (String POSTAL_CODE) {
this.POSTAL_CODE = POSTAL_CODE;
}
public String getCOUNTRY () {
return this.COUNTRY;
}
public void setCOUNTRY (String COUNTRY) {
this.COUNTRY = COUNTRY;
}
public BigDecimal getCUSTOMER_REGION_ID () {
return this.CUSTOMER_REGION_ID;
}
public void setCUSTOMER_REGION_ID (BigDecimal CUSTOMER_REGION_ID) {
this.CUSTOMER_REGION_ID = CUSTOMER_REGION_ID;
}
public String getPHONE1 () {
return this.PHONE1;
}
public void setPHONE1 (String PHONE1) {
this.PHONE1 = PHONE1;
}
public String getPHONE2 () {
return this.PHONE2;
}
public void setPHONE2 (String PHONE2) {
this.PHONE2 = PHONE2;
}
public Timestamp getBIRTHDATE () {
return this.BIRTHDATE;
}
public void setBIRTHDATE (Timestamp BIRTHDATE) {
this.BIRTHDATE = BIRTHDATE;
}
public String getMARITAL_STATUS () {
return this.MARITAL_STATUS;
}
public void setMARITAL_STATUS (String MARITAL_STATUS) {
this.MARITAL_STATUS = MARITAL_STATUS;
}
public String getYEARLY_INCOME () {
return this.YEARLY_INCOME;
}
public void setYEARLY_INCOME (String YEARLY_INCOME) {
this.YEARLY_INCOME = YEARLY_INCOME;
}
public String getGENDER () {
return this.GENDER;
}
public void setGENDER (String GENDER) {
this.GENDER = GENDER;
}
public BigDecimal getTOTAL_CHILDREN () {
return this.TOTAL_CHILDREN;
}
public void setTOTAL_CHILDREN (BigDecimal TOTAL_CHILDREN) {
this.TOTAL_CHILDREN = TOTAL_CHILDREN;
}
public BigDecimal getNUM_CHILDREN_AT_HOME () {
return this.NUM_CHILDREN_AT_HOME;
}
public void setNUM_CHILDREN_AT_HOME (BigDecimal NUM_CHILDREN_AT_HOME) {
this.NUM_CHILDREN_AT_HOME = NUM_CHILDREN_AT_HOME;
}
public String getEDUCATION () {
return this.EDUCATION;
}
public void setEDUCATION (String EDUCATION) {
this.EDUCATION = EDUCATION;
}
public Timestamp getDATE_ACCNT_OPENED () {
return this.DATE_ACCNT_OPENED;
}
public void setDATE_ACCNT_OPENED (Timestamp DATE_ACCNT_OPENED) {
this.DATE_ACCNT_OPENED = DATE_ACCNT_OPENED;
}
public String getMEMBER_CARD () {
return this.MEMBER_CARD;
}
public void setMEMBER_CARD (String MEMBER_CARD) {
this.MEMBER_CARD = MEMBER_CARD;
}
public String getOCCUPATION () {
return this.OCCUPATION;
}
public void setOCCUPATION (String OCCUPATION) {
this.OCCUPATION = OCCUPATION;
}
public String getHOUSEOWNER () {
return this.HOUSEOWNER;
}
public void setHOUSEOWNER (String HOUSEOWNER) {
this.HOUSEOWNER = HOUSEOWNER;
}
public BigDecimal getNUM_CARS_OWNED () {
return this.NUM_CARS_OWNED;
}
public void setNUM_CARS_OWNED (BigDecimal NUM_CARS_OWNED) {
this.NUM_CARS_OWNED = NUM_CARS_OWNED;
}
public String getFULLNAME () {
return this.FULLNAME;
}
public void setFULLNAME (String FULLNAME) {
this.FULLNAME = FULLNAME;
}



		@OneToMany(mappedBy="rel_CUSTOMER_ID_in_customer", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
private java.util.Set<Sales> customer_Sales;









public java.util.Set<Sales> getCustomer_Sales () {
return this.customer_Sales;
}

public void setCustomer_Sales (java.util.Set<Sales> customer_Sales) {
this.customer_Sales = customer_Sales;
}






}
