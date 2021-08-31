package courses.services.interfaces;

import java.util.List;

import courses.models.Course;

public interface ICoursesService {
    Iterable<Course> getCourses();
    Course getCourse(String courseId);
    List<Course> createCourse(Course course);
    List<Course> updateCourse(String courseId, Course course);
    List<Course> deleteCourse(String courseId);
}
