package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.JobPost;

public interface SearchRepository {

	List<JobPost> findByText(String text);
}
