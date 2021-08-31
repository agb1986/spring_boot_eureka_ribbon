package courses;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
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
    @Mock
    CoursesService coursesServiceMock;
    List<Course> courses;

    // @BeforeEach
    // void beforeEach() {
    //     courses = new ArrayList<>();
    //     courses.add(new Course(UUID.randomUUID(), "Test Driven Development", CourseType.QE, "JUnit 5/Mockito"));
    // }

    @Test
    void testGetCourses() {
        // UUID testId = UUID.randomUUID();

        // when(coursesServiceMock.getCourses()).thenReturn(Collections.singletonList(
        //         new Course(testId, "Test Driven Development", CourseType.QE, "JUnit 5/Mockito")));

        // Course createdCourse = coursesServiceMock.getCourse(testId.toString());

        // String expectedTitle = "Test Driven Development";
        // CourseType expectedCourseType = CourseType.QE;
        // String expectedTutor = "JUnit 5/Mockito";

        // assertAll(
        //     () -> assertEquals(expectedTitle, createdCourse.getCourseName()),
        //     () -> assertEquals(expectedCourseType, createdCourse.getCourseType()),
        //     () -> assertEquals(expectedTutor, createdCourse.getCourseTutor())
        // );
    }
}
