package com.dragan.mappings;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SalesCompositePK implements Serializable {

	private static final long serialVersionUID = 1L;
		@Column(name="\"PRODUCT_ID\"")
		private BigDecimal PRODUCT_ID;
		@Column(name="\"TIME_ID\"")
		private BigDecimal TIME_ID;
		@Column(name="\"CUSTOMER_ID\"")
		private BigDecimal CUSTOMER_ID;
		@Column(name="\"PROMOTION_ID\"")
		private BigDecimal PROMOTION_ID;
		@Column(name="\"STORE_ID\"")
		private BigDecimal STORE_ID;

    public SalesCompositePK() {
    }

public BigDecimal getPRODUCT_ID () {
	return this.PRODUCT_ID;
}
public void setPRODUCT_ID (BigDecimal PRODUCT_ID) {
	this.PRODUCT_ID = PRODUCT_ID;
}


public BigDecimal getTIME_ID () {
	return this.TIME_ID;
}
public void setTIME_ID (BigDecimal TIME_ID) {
	this.TIME_ID = TIME_ID;
}


public BigDecimal getCUSTOMER_ID () {
	return this.CUSTOMER_ID;
}
public void setCUSTOMER_ID (BigDecimal CUSTOMER_ID) {
	this.CUSTOMER_ID = CUSTOMER_ID;
}


public BigDecimal getPROMOTION_ID () {
	return this.PROMOTION_ID;
}
public void setPROMOTION_ID (BigDecimal PROMOTION_ID) {
	this.PROMOTION_ID = PROMOTION_ID;
}


public BigDecimal getSTORE_ID () {
	return this.STORE_ID;
}
public void setSTORE_ID (BigDecimal STORE_ID) {
	this.STORE_ID = STORE_ID;
}


	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SalesCompositePK)) {
			return false;
		}
		SalesCompositePK castOther = (SalesCompositePK)other;
		return 
			( this.PRODUCT_ID.equals(castOther.PRODUCT_ID) ) 
 && ( this.TIME_ID.equals(castOther.TIME_ID) ) 
 && ( this.CUSTOMER_ID.equals(castOther.CUSTOMER_ID) ) 
 && ( this.PROMOTION_ID.equals(castOther.PROMOTION_ID) ) 
 && ( this.STORE_ID.equals(castOther.STORE_ID) );

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		 hash = hash * prime + this.PRODUCT_ID.hashCode() ;
 hash = hash * prime + this.TIME_ID.hashCode() ;
 hash = hash * prime + this.CUSTOMER_ID.hashCode() ;
 hash = hash * prime + this.PROMOTION_ID.hashCode() ;
 hash = hash * prime + this.STORE_ID.hashCode() ;

		return hash;
    }
}
