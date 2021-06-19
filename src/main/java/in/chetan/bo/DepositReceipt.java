package in.chetan.bo;


import java.time.LocalDate;


public class DepositReceipt {

	private Integer policyId;
	private String policyHolder;
	private String policyType;
	private String division;
	private LocalDate accountOpenDate;
	private String status;

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

	
	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(LocalDate date) {
		this.accountOpenDate = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DepositReceipt [policyId=" + policyId + ", policyHolder=" + policyHolder + ", policyType=" + policyType
				+ ", division=" + division + ", accountOpenDate=" + accountOpenDate + ", status=" + status + "]";
	}


	

}
