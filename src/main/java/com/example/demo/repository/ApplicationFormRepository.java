package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.ApplicationForm;
import com.example.demo.model.entity.Flow;

public interface ApplicationFormRepository extends JpaRepository<ApplicationForm, Long>{
	
	Optional<ApplicationForm> findById(Long id);
	
	List<ApplicationForm> findByFlowState_Role_Id_AndState(Long roleId, Flow state);
}
