package tn.esprit.ds.championnatt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.championnatt.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {
}
