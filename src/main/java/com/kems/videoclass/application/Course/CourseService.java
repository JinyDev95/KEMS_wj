/**
 * 고수준 컴포넌트인 Service Repository를 의존.(Service는 고수준 컴포넌트)
 * 같은 수준의 컴포넌트 끼리는 의존 가능
 */
package com.kems.videoclass.application.Course;

import com.kems.videoclass.application.Course.interfaces.CourseCommandRepository;
import com.kems.videoclass.application.Course.interfaces.CourseQueryRepository;

public class CourseService {
    private final CourseCommandRepository courseCommandRepository;
    private final CourseQueryRepository courseQueryRepository;

    public CourseService(CourseCommandRepository courseCommandRepository,
            CourseQueryRepository courseQueryRepository) {
        this.courseCommandRepository = courseCommandRepository;
        this.courseQueryRepository = courseQueryRepository;
    }
}
