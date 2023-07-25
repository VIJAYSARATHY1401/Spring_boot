package com.example.demo;

import java.util.Arrays; 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API_start {
	
	@Autowired
	private repository repo;
	
 @GetMapping("/courses")
 public List<Courses> getallCourse(){
	 return repo.findAll();
//	 return List.of(new Courses(2,"learn api","vijay"),new Courses(2, "learn api", "ajith"));
 }
 
 @GetMapping("/courses/{id}")
 public Optional<Courses> getallCourse2(@PathVariable int id){
	 return repo.findById(id);
//	 return List.of(new Courses(1,"learn api only","vijay"));
 }

@PostMapping("/courses")
public void createCourse(@RequestBody Courses course) {
	repo.save(course);
}

@PutMapping("/courses/{id}")
public void updateCourse(@PathVariable int id,@RequestBody Courses course) {
	repo.save(course);
}

@DeleteMapping("/courses/{id}")
public void deleteCourse(@PathVariable int id) {
	repo.deleteById(id);
}
}