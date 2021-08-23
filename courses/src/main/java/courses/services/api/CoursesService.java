package courses.services.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import courses.models.Course;
import courses.services.interfaces.ICoursesService;

@Service
public class CoursesService implements ICoursesService {
    List<Course> courses;

    @Override
    public List<Course> getCourses() {
        if (courses == null) {
            courses = new ArrayList<>();
        }
        return courses;
    }

    @Override
    public Course getCourse(String courseId) {
        for (Course course : courses) {
            if (course.getCourseID().toString().contains(courseId)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public List<Course> createCourse(Course course) {
        if (courses == null) {
            courses = new ArrayList<>();
        }
        courses.add(course);
        return courses;
    }

    @Override
    public List<Course> updateCourse(String courseId, Course course) {
        Course updatedCourse = getCourse(courseId);
        deleteCourse(courseId);
        updatedCourse.setCourseName(course.getCourseName());
        updatedCourse.setCourseType(course.getCourseType());
        updatedCourse.setCourseTutor(course.getCourseTutor());
        courses.add(updatedCourse);
        return courses;
    }

    @Override
    public List<Course> deleteCourse(String courseId) {
        Course courseToDelete = getCourse(courseId);
        courses.remove(courseToDelete);
        return courses;
    }
}
