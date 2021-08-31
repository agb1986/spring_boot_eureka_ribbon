package courses.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import courses.models.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    Course findById(long id);
    List<Course> findAll();
    <S extends Course> S save(S course);
    void deleteById(Long id);
}
