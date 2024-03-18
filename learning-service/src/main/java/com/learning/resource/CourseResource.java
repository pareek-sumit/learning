package com.learning.resource;

import com.learning.model.course.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.learning.config.PlatformDetailsConfig;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseResource {

    private final PlatformDetailsConfig platformDetailsConfig;

    public CourseResource(final PlatformDetailsConfig platformDetailsConfig){
        this.platformDetailsConfig = platformDetailsConfig;
    }
    @GetMapping(path = "/courses")
    public ResponseEntity<List<Course>> getAllCourse(){
        return ResponseEntity.ok(Arrays.asList(new Course("java for beginners", 123, "Stefan",
                        platformDetailsConfig.name(), platformDetailsConfig.address(), platformDetailsConfig.code()),
                new Course("python for beginners", 123, "Amit",
                        platformDetailsConfig.name(), platformDetailsConfig.address(), platformDetailsConfig.code()),
                new Course("scala for beginners", 123, "Ravi",
                        platformDetailsConfig.name(), platformDetailsConfig.address(), platformDetailsConfig.code())));
    }
}
