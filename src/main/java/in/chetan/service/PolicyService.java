package in.chetan.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.chetan.bo.DepositReceipt;
import in.chetan.bo.PolicyUpdate;
import in.chetan.entity.Policy;
import in.chetan.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	PolicyRepository policyRepo;

	public DepositReceipt openNewAccount(Policy policy) {
		Policy policySaved = policyRepo.save(policy);

		DepositReceipt depositReceipt = new DepositReceipt();
		depositReceipt.setPolicyId(policySaved.getPolicyId());
		depositReceipt.setPolicyHolder(policySaved.getPolicyHolder());
		depositReceipt.setPolicyType(policySaved.getPolicyType());
		depositReceipt.setDivision(policySaved.getDivision());
		depositReceipt.setAccountOpenDate(policySaved.getAccountOpenDate());
		depositReceipt.setStatus("Account will be activate in 2 working days");

		return depositReceipt;

	}

	public PolicyUpdate updatePolicy(Policy policy) throws Exception {
		Integer policyId = policy.getPolicyId();
		System.out.println(policyId);
		boolean existsById = policyRepo.existsById(policyId);

		if (existsById) {
			Policy updatedPolicy = policyRepo.save(policy);
			PolicyUpdate policyUpdate = new PolicyUpdate();
			policyUpdate.setPolicyId(updatedPolicy.getPolicyId());
			policyUpdate.setPolicyHolder(updatedPolicy.getPolicyHolder());
			policyUpdate.setPolicyType(updatedPolicy.getPolicyType());
			policyUpdate.setDivision(updatedPolicy.getDivision());
			policyUpdate.setUpdateDate(updatedPolicy.getUpdateDate());
			policyUpdate.setTransactionId(UUID.randomUUID().toString());

			return policyUpdate;
		} else {
			throw new Exception("Policy with policy Id " + policyId + " Not Found...!");

		}

	}

	public Boolean deleteGivenPolicy(Integer policyId) {
		boolean existsById = policyRepo.existsById(policyId);
		if (existsById) {
			policyRepo.deleteById(policyId);
			return true;
		} else {
			return false;
		}
	}

	public DepositReceipt getDtls(Integer policyId) {
		boolean existsById = policyRepo.existsById(policyId);
		if (existsById) {
			Policy policy = policyRepo.getById(policyId);
			DepositReceipt depositReceipt = new DepositReceipt();
			depositReceipt.setPolicyId(policy.getPolicyId());
			depositReceipt.setPolicyHolder(policy.getPolicyHolder());
			depositReceipt.setPolicyType(policy.getPolicyType());
			depositReceipt.setDivision(policy.getDivision());
			depositReceipt.setAccountOpenDate(policy.getAccountOpenDate());
			depositReceipt.setStatus("Account is running with normal operation");
			return depositReceipt;
		} else {
			return null;
		}

	}
}
