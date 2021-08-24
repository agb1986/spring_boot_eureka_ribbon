package courses;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import courses.enums.CourseType;
import courses.models.Course;
import courses.services.api.CoursesService;

@ExtendWith(MockitoExtension.class)
public class TestCourseApplication {
    CoursesService coursesServiceMock;

    @BeforeEach
    void initCourse() {
        coursesServiceMock = new CoursesService();
        Course course = new Course(UUID.randomUUID(), "Test Driven Development", CourseType.QE, "Junit Mockito");
        coursesServiceMock.createCourse(course);
    }

    @Test
    void testGetCourses() {
        assertNotNull(coursesServiceMock);
        System.out.println(coursesServiceMock.getCourses().get(0));
    }
}
