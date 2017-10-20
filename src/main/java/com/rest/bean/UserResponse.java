package com.rest.bean;

import java.util.List;

public class UserResponse {
	private String userId;
	private String firstName;
	private String lastName;
	private String cupId;
	private List<String> parterIds;
	private boolean status;
	/**
	 * @return the status
	 */
	public boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the cupId
	 */
	public String getCupId() {
		return cupId;
	}
	/**
	 * @param cupId the cupId to set
	 */
	public void setCupId(String cupId) {
		this.cupId = cupId;
	}
	/**
	 * @return the parterIds
	 */
	public List<String> getParterIds() {
		return parterIds;
	}
	/**
	 * @param parterIds the parterIds to set
	 */
	public void setParterIds(List<String> parterIds) {
		this.parterIds = parterIds;
	}
	
}
