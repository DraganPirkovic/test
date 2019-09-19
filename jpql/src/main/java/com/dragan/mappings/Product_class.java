package com.dragan.mappings;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product_class")
public class Product_class {
	
	@Id
	@Column(name = "product_class_id")
	private int productclassid;

	@Column(name = "product_subcategory")
	private String product_subcategory;
	
	@OneToMany(mappedBy="product_class")
	private Set<Product> products;

	@Column(name = "product_family")
	private String product_family;
	
	public String getProduct_family() {
		return product_family;
	}

	public void setProduct_family(String product_family) {
		this.product_family = product_family;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public int getProductclassid() {
		return productclassid;
	}

	public void setProductclassid(int productclassid) {
		this.productclassid = productclassid;
	}

	public String getProduct_subcategory() {
		return product_subcategory;
	}

	public void setProduct_subcategory(String product_subcategory) {
		this.product_subcategory = product_subcategory;
	}

}
