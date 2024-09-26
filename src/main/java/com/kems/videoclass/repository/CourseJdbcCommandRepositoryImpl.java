/**
 * 레포지토리(Repository): 데이터베이스와의 상호작용을 담당하며, 엔티티를 저장하거나 조회하는 메서드를 정의
 * 도메인 엔티티에 대한 Create, Read, Update, Delete 작업을 처리
 * 데이터베이스와의 상호작용을 추상화하여, 비즈니스 로직이 데이터 접근에 대한 구체적인 구현 세부 사항에 의존하지 않음
 * 도메인 엔티티의 영속성을 관리(엔티티가 생성되거나 수정되었을 때 이를 영속성 컨텍스트에 반영하고, 데이터베이스에 해당 변화를 저장)
 * 데이터 저장소가 변경되더라도 도메인 모델이나 서비스 로직을 수정할 필요 없이 레포지토리만 변경
 * CQRS: Command Query Responsibility Segregation(명령-조회 책임 분리)
 * Query(조회): 데이터를 qusrudgkwl dksgsms 조회하는 작업
 */

package com.kems.videoclass.repository;

import com.kems.videoclass.application.Course.interfaces.CourseQueryRepository;

public class CourseJdbcCommandRepositoryImpl implements CourseQueryRepository {

}
