/**
 * 레포지토리(Repository): 데이터베이스와의 상호작용을 담당하며, 엔티티를 저장하거나 조회하는 메서드를 정의
 * CQRS: Command Query Responsibility Segregation(명령-조회 책임 분리)
 * Command(명령): 데이터를 변경하는 작업(작성, 수정, 삭제)
 */

package com.kems.videoclass.repository;

import com.kems.videoclass.application.Course.interfaces.CourseCommandRepository;

public class CourseCommandRepositoryImpl implements CourseCommandRepository {

}
