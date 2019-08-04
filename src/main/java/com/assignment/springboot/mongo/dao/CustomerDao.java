package com.assignment.springboot.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignment.springboot.mongo.model.Customer;

@Repository
public interface CustomerDao extends MongoRepository<Customer, Integer>{

}
