package com.c3.cms.business.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUSINESS")
public class Business {

	/**
	 * Unique id of the business entry. Auto incremented
	 */
	private Long businessId;

	/**
	 * @return the businessId
	 */
	@Id
	@GeneratedValue
	@Column(name = "BUSINESS_ID")
	@Access(AccessType.PROPERTY)
	public Long getBusinessId() {
		return businessId;
	}

	/**
	 * @param businessId
	 *            the businessId to set
	 */
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	private String businessUuid = UUID.randomUUID().toString();

	/**
	 * @return the businessUuid
	 */
	@Column(name = "BUSINESS_UUID", nullable = false, length = 500)
	public String getBusinessUuid() {
		return businessUuid;
	}

	/**
	 * @param businessUuid
	 *            the businessUuid to set
	 */
	public void setBusinessUuid(String businessUuid) {
		this.businessUuid = businessUuid;
	}

	/**
	 * Name of the business
	 */
	private String businessName;

	/**
	 * @return the businessName
	 */
	@Column(name = "BUSINESS_NAME", nullable = false)
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName
	 *            the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	/**
	 * Title of the business
	 */
	private String businessTitle;

	/**
	 * @return the businessTitle
	 */
	@Column(name = "BUSINESS_TITLE", nullable = false)
	public String getBusinessTitle() {
		return businessTitle;
	}

	/**
	 * @param businessTitle
	 *            the businessTitle to set
	 */
	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}

	/**
	 * Contact Number of the business
	 */
	private String contactNumber;

	/**
	 * @return the contactNumber
	 */
	@Column(name = "CONTACT_NUMBER")
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber
	 *            the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * Email id of the business
	 */
	private String contactEmailId;

	/**
	 * @return the contactEmailId
	 */
	@Column(name = "CONTACT_EMAILID")
	public String getContactEmailId() {
		return contactEmailId;
	}

	/**
	 * @param contactEmailId
	 *            the contactEmailId to set
	 */
	public void setContactEmailId(String contactEmailId) {
		this.contactEmailId = contactEmailId;
	}

	/**
	 * creation date of the business entry
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
	 * expiry date of the business entry
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
	 * Status of the business entry
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
	 * defines whether the business is visible or not
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
	 * Account linked with the business
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
	 * First line of the Business Address 
	 */
	private String addressLine1;
	
	/**
	 * @return the addressLine1
	 */
	@Column(name="ADDRESS_LINE_1")
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	/**
	 * Second line of the Business Address 
	 */
	private String addressLine2;
	
	/**
	 * @return the addressLine2
	 */
	@Column(name="ADDRESS_LINE_2")
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	

	@Override
	public String toString() {
		return "Business [businessId=" + businessId + ", businessUuid="
				+ businessUuid + ", businessName=" + businessName
				+ ", businessTitle=" + businessTitle + ", contactNumber="
				+ contactNumber + ", contactEmailId=" + contactEmailId
				+ ", creationDate=" + creationDate + ", expiryDate="
				+ expiryDate + ", status=" + status + ", isVisible="
				+ isVisible + ", accountId=" + accountId + "]";
	}

}
