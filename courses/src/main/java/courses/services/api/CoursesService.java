package courses.services.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import courses.models.Course;
import courses.repository.CourseRepository;
import courses.services.interfaces.ICoursesService;

@Service
public class CoursesService implements ICoursesService {
    @Autowired
    CourseRepository repository;

    @Override
    public List<Course> getCourses() {
        return repository.findAll();
    }

    @Override
    public Course getCourse(String courseId) {
        return repository.findById(Long.parseLong(courseId));
    }

    @Override
    public List<Course> createCourse(Course course) {
        repository.save(course);
        return getCourses();
    }

    @Override
    public List<Course> updateCourse(String courseId, Course course) {
        Course updatedCourse = getCourse(courseId);
        deleteCourse(courseId);
        updatedCourse.setCourseName(course.getCourseName());
        updatedCourse.setCourseType(course.getCourseType());
        updatedCourse.setCourseTutor(course.getCourseTutor());
        return createCourse(course);
    }

    @Override
    public List<Course> deleteCourse(String courseId) {
        repository.deleteById(Long.parseLong(courseId));
        return getCourses();
    }
}
