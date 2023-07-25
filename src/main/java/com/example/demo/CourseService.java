package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private final repository repo;

    @Autowired
    public CourseService(repository repo) {
        this.repo = repo;
    }

    public void createCourses() {
        Courses course1 = new Courses();
        course1.setId(90);
        course1.setAuthor("Dinesh kumar");
        course1.setName("spring boot");
        repo.save(course1);

        Courses course2 = new Courses();
        course2.setId(91);
        course2.setAuthor("Sarala munusamy");
        course2.setName("Redux");
        repo.save(course2);

        Courses course3 = new Courses();
        course3.setId(92);
        course3.setAuthor("ARUN VIJAY");
        course3.setName("learn AIML");
        repo.save(course3);

    }
    public void deleteCourseById(int courseId) {
        repo.deleteById(courseId);
    }
}
