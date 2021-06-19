package in.chetan.bo;

import java.time.LocalDate;

public class PolicyUpdate {

	private Integer policyId;
	private String policyHolder;
	private String policyType;
	private String division;
	private LocalDate updateDate;
	private String transactionId;

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getPolicyHolder() {
		return policyHolder;
	}

	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "PolicyUpdate [policyId=" + policyId + ", policyHolder=" + policyHolder + ", policyType=" + policyType
				+ ", division=" + division + ", updateDate=" + updateDate + ", transactionId=" + transactionId + "]";
	}

}
