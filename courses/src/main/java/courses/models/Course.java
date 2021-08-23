package courses.models;

import java.util.UUID;

import courses.enums.CourseType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Course {
    private UUID courseID;
    private String courseName;
    private CourseType courseType;
    private String courseTutor;
}
