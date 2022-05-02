package com.azure.spring.data.cosmostutorial;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

@Repository
public interface CustomerDescriptionRepository extends CosmosRepository<CustomerDescription, String>  {

	List<CustomerDescription> findAll();
	
	CustomerDescription findByIdAndCustGroup(String id, String custGroup);
	
}
