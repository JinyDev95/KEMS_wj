package com.kems.videoclass.domain.vo;

import com.kems.videoclass.domain.CourseType;

public class CourseTypeVO {

    private final CourseType courseType;

    public CourseTypeVO(CourseType courseType) {
        if (courseType == null) {
            throw new IllegalArgumentException("과정 종류는 필수입니다.");
        }
        this.courseType = courseType;
    }

    public CourseType getCourseType() {
        return courseType;
    }
}
