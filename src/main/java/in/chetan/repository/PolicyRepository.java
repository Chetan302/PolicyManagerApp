package in.chetan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chetan.entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Serializable> {

}
