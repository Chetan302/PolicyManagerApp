package in.chetan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.chetan.bo.DepositReceipt;
import in.chetan.bo.PolicyUpdate;
import in.chetan.entity.Policy;
import in.chetan.service.PolicyService;

@Controller
public class PolicyManager {

	@Autowired
	private PolicyService policyService;

	@PostMapping("/policy/new/account")
	@ResponseBody
	public DepositReceipt openPolicy(@RequestBody Policy policy) {

		DepositReceipt openNewAccount = policyService.openNewAccount(policy);
		return openNewAccount;

	}

	@PutMapping("/policy/update/account")
	@ResponseBody
	public PolicyUpdate updatePolicyInfo(@RequestBody Policy policy) throws Exception {

		PolicyUpdate updatePolicy = policyService.updatePolicy(policy);
		return updatePolicy;
	}

	@DeleteMapping("/policy/delete/account")
	@ResponseBody
	public String deletePolicy(@RequestParam("policyId") Integer policyId) {
		Boolean isDeleted = policyService.deleteGivenPolicy(policyId);
		if (isDeleted) {
			return "Policy with Id:" + policyId + " is successfully deleted..thanks for being with LIC";
		} else {
			return "Policy with Id:" + policyId + " does not exist";
		}

	}
	
	@GetMapping("policy/get/account")
	@ResponseBody
	public DepositReceipt getPolicyDtls(Integer policyId) throws Exception {
		DepositReceipt depositReceipt = policyService.getDtls(policyId);
		if(depositReceipt!=null) {
			return depositReceipt;
		}else {
			throw new Exception("Currently cannot access resource");
		}
	}
}
