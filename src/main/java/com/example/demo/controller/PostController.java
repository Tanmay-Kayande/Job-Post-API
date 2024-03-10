package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JobPost;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.SearchRepository;

import javax.servlet.http.HttpServletResponse;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class PostController {

	@Autowired
	PostRepository repo;

	@Autowired
	SearchRepository srepo;

	@ApiIgnore
	@RequestMapping(value = "/")
	public void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}

	@GetMapping("/allposts")
	public List<JobPost> getAllPost() {

		return repo.findAll();
	}

	@GetMapping("/posts/{text}")
	public List<JobPost> search(@PathVariable String text) {

		return srepo.findByText(text);
	}

	@PostMapping("/post")
	public JobPost addPost(@RequestBody JobPost post) {

		return repo.save(post);
	}
}
