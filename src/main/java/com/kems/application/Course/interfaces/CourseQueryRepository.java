/**
 * CQRS란 Command and Query Responsibility Segregation
 * 데이터 저장소로부터의 읽기와 업데이트 작업을 분리하는 패턴
 * 쿼리(Query)는 데이터 베이스를 결코 수정하지 않는다.
 * 쿼리(Query)는 어떠한 도메인 로직도 캡슐화하지 않은 DTO만을 반환한다.
 * CRUD에서 R이 해당
 */
package com.kems.application.Course.interfaces;

public interface CourseQueryRepository {

}
