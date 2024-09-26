/**
 * @EntityListeners(AuditingEntityListener.class)
 * @CreatedDate
 * @LastModifiedDate
 * 위 두 어노테이션을 자동으로 관리해 준다.
 *
 * @MappedSuperclass
 * 해당 클래스가 직접적으로 데이터베이스 테이블과 매핑되지 않게 해준다.
 * 이 클래스를 상속받는 서브클래스에서 매핑될 수 있는 필드를 정의할 수 잇다.
 */

package com.kems.common.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public class TimeBaseEntity {

    @CreatedDate
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "update_at", nullable = false)
    private LocalDateTime updateAt;

}
