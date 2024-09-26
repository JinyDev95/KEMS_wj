package com.kems.videoclass.repository.jpa;

import com.kems.videoclass.repository.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCourseRepository extends JpaRepository<CourseEntity, Long> {

}
