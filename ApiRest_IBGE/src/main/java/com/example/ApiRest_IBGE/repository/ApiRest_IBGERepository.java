package com.example.ApiRest_IBGE.repository;

import com.example.ApiRest_IBGE.model.ApiRest_IBGEEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRest_IBGERepository extends MongoRepository<ApiRest_IBGEEntity, String> {

}
