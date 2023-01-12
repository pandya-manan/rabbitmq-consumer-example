package com.manan.pandya.springrabbitmqconsumer;


import java.util.Date;



public class ProductDTO {
	
	
	private String productId;
	
	
	private String productName;
	
	
	private Double productPrice;
	
	private Date productExpiryDate;
	
	
	private Integer sellerId;
	
	private String profileURL;
	
	private boolean availability;
	
	private byte[] productPicture;
	
	public byte[] getProductPicture() {
		return productPicture;
	}
	public void setProductPicture(byte[] productPicture) {
		this.productPicture = productPicture;
	}
	public String getProfileURL() {
		return profileURL;
	}
	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	}
	
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Date getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(Date productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productExpiryDate=" + productExpiryDate + ", sellerId=" + sellerId + ", availability="
				+ availability +"]";
	}
	public ProductDTO(String productId, String productName, Double productPrice, Date productExpiryDate,
			Integer sellerId, boolean availability) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productExpiryDate = productExpiryDate;
		this.sellerId = sellerId;
		this.availability = availability;
		
	}
	public ProductDTO() {
		super();
		
	}
	
	
	
	
}
