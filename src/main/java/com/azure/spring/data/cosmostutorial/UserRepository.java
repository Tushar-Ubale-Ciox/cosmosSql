//// Copyright (c) Microsoft Corporation. All rights reserved.
//// Licensed under the MIT License.
//package com.azure.spring.data.cosmostutorial;
//
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.azure.spring.data.cosmos.repository.CosmosRepository;
//import com.azure.spring.data.cosmos.repository.Query;
//import com.fasterxml.jackson.databind.JsonNode;
//
//@Repository
//public interface UserRepository extends CosmosRepository<User, String> {
//
//    List<User> findByFirstName(String firstName);
//
//    User findByIdAndFirstName(String id, String firstName);
//
//    @Query("select c.firstName from c where c.id = @id")
//    Page<JsonNode> findFirstNameById(@Param("id") String id, Pageable pageable);
//}
