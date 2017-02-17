package com.ssg.struts;

public class Product {

	private int productId;
	private String productName;
	private String productDesc;
	private Double productPrice;

	public String save() {
		System.out.println("save----->" + this);
		return "details";
	}

	public String test() {
		System.out.println("test----->" + this);
		return "success";
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", productPrice=" + productPrice + ", getProductId()=" + getProductId() + ", getProductName()="
				+ getProductName() + ", getProductDesc()=" + getProductDesc() + ", getProductPrice()="
				+ getProductPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
}
