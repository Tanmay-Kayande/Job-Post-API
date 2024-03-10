package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.JobPost;

public interface PostRepository extends MongoRepository<JobPost, String>{

}
