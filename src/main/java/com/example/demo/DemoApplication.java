package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import org.springframework.jdbc.datasource.init.ScriptUtils;

import org.springframework.core.io.support.EncodedResource;
import javax.sql.DataSource;
import java.nio.charset.StandardCharsets;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        
        CourseService courseService = context.getBean(CourseService.class);
        
        // Invoke the createCourses() method
        courseService.createCourses();
        courseService.deleteCourseById(90);  
	}


}
