package courses.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import courses.models.Course;
import courses.services.api.CoursesService;


@RestController
@RequestMapping
public class CoursesController {
    @Autowired
    CoursesService coursesService;

    @GetMapping(path = "/courses")
    public ResponseEntity<List<Course>> getCourses() {
        return new ResponseEntity<>(coursesService.getCourses(), HttpStatus.OK);
    }

    @GetMapping(path = "/courses/{courseId}")
    public ResponseEntity<Course> getCourse(@PathVariable String courseId) {
        return new ResponseEntity<>(coursesService.getCourse(courseId), HttpStatus.OK);
    }

    @PostMapping(path = "/courses")
    public ResponseEntity<List<Course>> createCourse(@RequestBody Course course) {
        return new ResponseEntity<>(coursesService.createCourse(course), HttpStatus.OK);
    }

    @PutMapping(path = "/courses/{courseId}")
    public ResponseEntity<List<Course>> updateCourse(@PathVariable String courseId, @RequestBody Course course) {
        return new ResponseEntity<>(coursesService.updateCourse(courseId, course), HttpStatus.OK);
    }

    @DeleteMapping(path = "/courses/{courseId}")
    public ResponseEntity<List<Course>> deleteCourse(@PathVariable String courseId) {
        return new ResponseEntity<>(coursesService.deleteCourse(courseId), HttpStatus.OK);
    }
}
