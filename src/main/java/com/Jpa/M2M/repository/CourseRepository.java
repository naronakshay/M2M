package com.Jpa.M2M.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jpa.M2M.entity.Courses;
import com.Jpa.M2M.entity.Student;

public interface CourseRepository extends JpaRepository<Courses , Long> {

}
