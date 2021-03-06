package com.myspace.onelife;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class claims implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("claimNo")
	private java.lang.String claimNo;
	@org.kie.api.definition.type.Label("capturedate")
	private java.time.LocalDateTime capturedate;
	@org.kie.api.definition.type.Label("capturedBy")
	private java.lang.String capturedBy;
	@org.kie.api.definition.type.Label("claimStatus")
	private java.lang.String claimStatus;
	@org.kie.api.definition.type.Label("finalDecision")
	private java.lang.String finalDecision;

	@org.kie.api.definition.type.Label("callerDetails")
	private java.util.List<com.myspace.onelife.callerDetails> callerDetails;

	@org.kie.api.definition.type.Label("eventDetails")
	private com.myspace.onelife.eventDetails eventDetails;

	@org.kie.api.definition.type.Label("documents")
	private java.util.List<com.myspace.onelife.documents> documents;

	@org.kie.api.definition.type.Label("policyInfo")
	private com.myspace.onelife.policyInfo policyInfo;

	@org.kie.api.definition.type.Label("assignedTo")
	private java.lang.String assignedTo;

	@org.kie.api.definition.type.Label("assignedRole")
	private java.lang.String assignedRole;

	@org.kie.api.definition.type.Label(value = "claimReason")
	private java.lang.String claimReason;

	@org.kie.api.definition.type.Label(value = "claimAmount")
	private java.lang.String claimAmount;

	public claims() {
	}

	public java.lang.String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(java.lang.String claimNo) {
		this.claimNo = claimNo;
	}

	public java.time.LocalDateTime getCapturedate() {
		return this.capturedate;
	}

	public void setCapturedate(java.time.LocalDateTime capturedate) {
		this.capturedate = capturedate;
	}

	public java.lang.String getCapturedBy() {
		return this.capturedBy;
	}

	public void setCapturedBy(java.lang.String capturedBy) {
		this.capturedBy = capturedBy;
	}

	public java.lang.String getClaimStatus() {
		return this.claimStatus;
	}

	public void setClaimStatus(java.lang.String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public java.lang.String getFinalDecision() {
		return this.finalDecision;
	}

	public void setFinalDecision(java.lang.String finalDecision) {
		this.finalDecision = finalDecision;
	}

	public java.util.List<com.myspace.onelife.callerDetails> getCallerDetails() {
		return this.callerDetails;
	}

	public void setCallerDetails(
			java.util.List<com.myspace.onelife.callerDetails> callerDetails) {
		this.callerDetails = callerDetails;
	}

	public com.myspace.onelife.eventDetails getEventDetails() {
		return this.eventDetails;
	}

	public void setEventDetails(com.myspace.onelife.eventDetails eventDetails) {
		this.eventDetails = eventDetails;
	}

	public java.util.List<com.myspace.onelife.documents> getDocuments() {
		return this.documents;
	}

	public void setDocuments(
			java.util.List<com.myspace.onelife.documents> documents) {
		this.documents = documents;
	}

	public com.myspace.onelife.policyInfo getPolicyInfo() {
		return this.policyInfo;
	}

	public void setPolicyInfo(com.myspace.onelife.policyInfo policyInfo) {
		this.policyInfo = policyInfo;
	}

	public java.lang.String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(java.lang.String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public java.lang.String getAssignedRole() {
		return this.assignedRole;
	}

	public void setAssignedRole(java.lang.String assignedRole) {
		this.assignedRole = assignedRole;
	}

	public java.lang.String getClaimReason() {
		return this.claimReason;
	}

	public void setClaimReason(java.lang.String claimReason) {
		this.claimReason = claimReason;
	}

	public java.lang.String getClaimAmount() {
		return this.claimAmount;
	}

	public void setClaimAmount(java.lang.String claimAmount) {
		this.claimAmount = claimAmount;
	}

	public claims(java.lang.String claimNo,
			java.time.LocalDateTime capturedate, java.lang.String capturedBy,
			java.lang.String claimStatus, java.lang.String finalDecision,
			java.util.List<com.myspace.onelife.callerDetails> callerDetails,
			com.myspace.onelife.eventDetails eventDetails,
			java.util.List<com.myspace.onelife.documents> documents,
			com.myspace.onelife.policyInfo policyInfo,
			java.lang.String assignedTo, java.lang.String assignedRole,
			java.lang.String claimReason, java.lang.String claimAmount) {
		this.claimNo = claimNo;
		this.capturedate = capturedate;
		this.capturedBy = capturedBy;
		this.claimStatus = claimStatus;
		this.finalDecision = finalDecision;
		this.callerDetails = callerDetails;
		this.eventDetails = eventDetails;
		this.documents = documents;
		this.policyInfo = policyInfo;
		this.assignedTo = assignedTo;
		this.assignedRole = assignedRole;
		this.claimReason = claimReason;
		this.claimAmount = claimAmount;
	}

}