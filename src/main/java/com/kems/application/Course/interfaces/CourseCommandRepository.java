/**
 * CQRS란 Command and Query Responsibility Segregation
 * 데이터 저장소로부터의 읽기와 업데이트 작업을 분리하는 패턴
 * 명령(Command)은 데이터 중심적이 아니라 수행할 작업 중심
 * 명령(Command)은 보통 동기적으로 처리되기보단, 비동기적으로 큐에 쌓인 후 수행
 * CRUD에서 CUD가 해당
 */
package com.kems.application.Course.interfaces;

public interface CourseCommandRepository {

}
