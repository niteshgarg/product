package com.c3.cms.product.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * Class defining product bean.
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

	private static final long serialVersionUID = 3534368434423368L;

	/**
	 * productId: Unique key of the product table, Auto incremented
	 */
	private Long productId;

	/**
	 * @return the productId
	 */
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	@Access(AccessType.PROPERTY)
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	private String productUuid = UUID.randomUUID().toString();

	/**
	 * @return the productUuid
	 */
	@Column(name = "PRODUCT_UUID", nullable = false, length = 500)
	public String getProductUuid() {
		return productUuid;
	}

	/**
	 * @param productUuid
	 *            the productUuid to set
	 */
	public void setProductUuid(String productUuid) {
		this.productUuid = productUuid;
	}

	/**
	 * productName: name of the product can be 100 characters in length,
	 */
	private String productName;

	/**
	 * @return the productName
	 */
	@Column(name = "PRODUCT_NAME", nullable = false, length = 100)
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * productDescription: name of the product can be 1000 characters in length,
	 */
	private String productDescription;

	/**
	 * @return the productDescription
	 */
	@Column(name = "PRODUCT_DESCRIPTION", nullable = false, length = 1000)
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription
	 *            the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * creation date of the product entry
	 */
	private Date creationDate;

	/**
	 * @return the creationDate
	 */
	@Column(name = "CREATION_DATE", nullable = false)
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * expiry date of the product entry
	 */
	private Date expiryDate;

	/**
	 * @return the expiryDate
	 */
	@Column(name = "EXPIRY_DATE", nullable = false)
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * Status of the product entry
	 */
	private Integer status;

	/**
	 * @return the status
	 */
	@Column(name = "STATUS", nullable = false)
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * defines whether the product is visible or not
	 */
	private boolean isVisible;

	/**
	 * @return the isVisible
	 */
	@Column(name = "IS_VISIBLE", nullable = false)
	public boolean isVisible() {
		return isVisible;
	}

	/**
	 * @param isVisible
	 *            the isVisible to set
	 */
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	/**
	 * Account linked with the product
	 */
	private Long accountId;

	/**
	 * @return the accountId
	 */
	@Column(name = "ACCOUNT_ID")
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	
	/**
	 * Collection of the images linked with this product
	 */
	private Collection<ProductImage> associatedImages;
	

	/**
	 * @return the associatedImages
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="product")
	public Collection<ProductImage> getAssociatedImages() {
		return associatedImages;
	}

	/**
	 * @param associatedImages the associatedImages to set
	 */
	public void setAssociatedImages(Collection<ProductImage> associatedImages) {
		this.associatedImages = associatedImages;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productUuid="
				+ productUuid + ", productName=" + productName
				+ ", productDescription=" + productDescription
				+ ", creationDate=" + creationDate + ", expiryDate="
				+ expiryDate + ", status=" + status + ", isVisible="
				+ isVisible + ", accountId=" + accountId
				+ ", associatedImages=" + associatedImages + "]";
	}

	

}
