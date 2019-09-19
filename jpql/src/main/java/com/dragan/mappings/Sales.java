package com.dragan.mappings;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="\"SALES_FACT_1998\""
        , schema="\"FOODMART\""
        )
public class Sales implements Serializable {

private static final long serialVersionUID = 1L;

public Sales() {
}

@EmbeddedId
private SalesCompositePK compId=null;
@Column(name="\"STORE_SALES\"")
private BigDecimal STORE_SALES=null;
@Column(name="\"STORE_COST\"")
private BigDecimal STORE_COST=null;
@Column(name="\"UNIT_SALES\"")
private String UNIT_SALES=null;

public SalesCompositePK getCompId () {
return this.compId;
}

public void setCompId (SalesCompositePK compId) {
this.compId = compId;
}

public BigDecimal getSTORE_SALES () {
return this.STORE_SALES;
}
public void setSTORE_SALES (BigDecimal STORE_SALES) {
this.STORE_SALES = STORE_SALES;
}
public BigDecimal getSTORE_COST () {
return this.STORE_COST;
}
public void setSTORE_COST (BigDecimal STORE_COST) {
this.STORE_COST = STORE_COST;
}
public String getUNIT_SALES () {
return this.UNIT_SALES;
}
public void setUNIT_SALES (String UNIT_SALES) {
this.UNIT_SALES = UNIT_SALES;
}



@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`CUSTOMER_ID`", insertable = false, updatable = false)
private Customer rel_CUSTOMER_ID_in_customer;




@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`PRODUCT_ID`", insertable = false, updatable = false)
private Product rel_PRODUCT_ID_in_product;




@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`STORE_ID`", insertable = false, updatable = false)
private Store rel_STORE_ID_in_store;




@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`TIME_ID`", insertable = false, updatable = false)
private Time rel_TIME_ID_in_time;




@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`PROMOTION_ID`", insertable = false, updatable = false)
private Promotion rel_PROMOTION_ID_in_promotion;









public Customer getRel_CUSTOMER_ID_in_customer () {
return this.rel_CUSTOMER_ID_in_customer;
}

public void setRel_CUSTOMER_ID_in_customer (Customer rel_CUSTOMER_ID_in_customer) {
this.rel_CUSTOMER_ID_in_customer = rel_CUSTOMER_ID_in_customer;
}





public Product getRel_PRODUCT_ID_in_product () {
return this.rel_PRODUCT_ID_in_product;
}

public void setRel_PRODUCT_ID_in_product (Product rel_PRODUCT_ID_in_product) {
this.rel_PRODUCT_ID_in_product = rel_PRODUCT_ID_in_product;
}





public Store getRel_STORE_ID_in_store () {
return this.rel_STORE_ID_in_store;
}

public void setRel_STORE_ID_in_store (Store rel_STORE_ID_in_store) {
this.rel_STORE_ID_in_store = rel_STORE_ID_in_store;
}





public Time getRel_TIME_ID_in_time () {
return this.rel_TIME_ID_in_time;
}

public void setRel_TIME_ID_in_time (Time rel_TIME_ID_in_time) {
this.rel_TIME_ID_in_time = rel_TIME_ID_in_time;
}





public Promotion getRel_PROMOTION_ID_in_promotion () {
return this.rel_PROMOTION_ID_in_promotion;
}

public void setRel_PROMOTION_ID_in_promotion (Promotion rel_PROMOTION_ID_in_promotion) {
this.rel_PROMOTION_ID_in_promotion = rel_PROMOTION_ID_in_promotion;
}

}
