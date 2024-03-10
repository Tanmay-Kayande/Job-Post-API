package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import com.example.demo.model.JobPost;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class SearchRepositoryImpl implements SearchRepository {

	@Autowired
	MongoClient client;
	
	@Autowired
	MongoConverter converter;

	@Override
	public List<JobPost> findByText(String text) {

		final List<JobPost> posts = new ArrayList<>();

		MongoDatabase database = client.getDatabase("firstcrud");
		MongoCollection<Document> collection = database.getCollection("JobPost");
		AggregateIterable<Document> result = collection.aggregate(Arrays.asList(
				new Document("$search",
				new Document("text",
				new Document("query", "text")
				.append("path",Arrays.asList("desc", "techs", "profile")))),
				new Document("$sort", new Document("exp", 1L))));

		result.forEach(doc -> posts.add(converter.read(JobPost.class, doc)));
		
		return posts;
	}

}
