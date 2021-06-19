package in.chetan.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "POLICY_TBL")
public class Policy implements Serializable {

	private static final long serialVersionUID = -3082292198026878595L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "POLICY_ID")
	private Integer policyId;

	@Column(name = "POLICY_HOLDER")
	private String policyHolder;

	@Column(name = "POLICY_TYPE")
	private String policyType;

	@Column(name = "DIVISION")
	private String division;
	
	@Column(name="OPEN_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate accountOpenDate;

	@Column(name="UPDATE_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
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

	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyHolder=" + policyHolder + ", policyType=" + policyType
				+ ", division=" + division + ", accountOpenDate=" + accountOpenDate + ", updateDate=" + updateDate
				+ "]";
	}

	



}
