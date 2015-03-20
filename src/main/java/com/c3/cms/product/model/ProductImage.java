package com.c3.cms.product.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PRODUCT_IMAGE")
public class ProductImage implements Serializable {

	private static final long serialVersionUID = 3534368434423368L;

	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_IMAGE_ID")
	private Long productImageId;

	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;

	@Column(name = "IMAGE_PATH")
	private String imagePath;

	/**
	 * @return the productImageId
	 */
	public Long getProductImageId() {
		return productImageId;
	}

	/**
	 * @param productImageId the productImageId to set
	 */
	public void setProductImageId(Long productImageId) {
		this.productImageId = productImageId;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "ProductImage [productImageId=" + productImageId + ", product="
				+ product + ", imagePath=" + imagePath + "]";
	}
		
	
	
	

}
