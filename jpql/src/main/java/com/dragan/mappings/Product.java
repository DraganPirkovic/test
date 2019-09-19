package com.dragan.mappings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
@Table(name = "product")
//@Filter(name = "product_class_sqlFilter", condition = "{t1}.product_family = :family and {t1}.product_category = :category and {t1}.product_subcategory = :subcategory",deduceAliasInjectionPoints = false,aliases={@SqlFragmentAlias(alias="t1", table="product_class")})
//@SecondaryTable(name = "product_class", pkJoinColumns=@PrimaryKeyJoinColumn(name="product_class_id", referencedColumnName = "product_id"))

public class Product {
	
	@Id
	@Column(name = "product_id")
	private int PRODUCT_ID;


	
	@Column(name = "brand_name")
	
	private String brand_name;
	
	@ManyToOne
	@JoinColumn(name="product_class_id")
	//@Basic(fetch = FetchType.LAZY)
	private Product_class product_class;

	public Product_class getProduct_class() {
		return product_class;
	}

	public void setProduct_class(Product_class product_class) {
		this.product_class = product_class;
	}

	public int getProductid() {
		return PRODUCT_ID;
	}

	public void setProductid(int productid) {
		this.PRODUCT_ID = productid;
	}

	public String getBrandName() {
		return brand_name;
	}

	public void setBrandName(String brandName) {
		this.brand_name = brandName;
	}

}
