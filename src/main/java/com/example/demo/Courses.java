package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Course1")
public class Courses {
	@Id
	private Integer id;
	@Column(name="col_1")
	private String name;
	@Column
	private String author;
	
	public Courses() {
		
	}
	public Courses(Integer id,String name,String author) {
		super();
		this.id=id;
		this.author=author;
		this.name=name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
	
@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
