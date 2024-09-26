/**
 * 엔티티(Entity): 비즈니스 도메인에서 중요한 데이터와 그 상태를 표현(상태, 행동)
 * 데이터베이스와 밀접하게 연결되어 있으며, 레포지토리 계층에서 데이터를 저장하고 조회하는 데 사용
 * 본래 도메인 모델의 핵심 구조로 도메인 폴더에 위치
 * 레포지토리 패키지에 엔티티를 위치시킨 이유는 래포지토리와 함께 관리하기 위해(응집성, 의존성)
 * 엔티티는 데이터베이스와 매핑되는 객체이기 때문에, 도메인 서비스나 비즈니스 로직과는 다소 다른 역할을 수행
 * 데이터베이스와 관련된 작업을 담당하는 요소들을 한 곳에 모아두기 위해(실용적인 측면)
 * 데이터 계층과 비즈니스 계층의 명확한 분리를 위해 레포지토리 레이어에 위치 시킴
 * 엔티티와 레포지토리는 변경이 많을 수 있다는 점
 */

package com.kems.videoclass.repository.entity;

import com.kems.common.repository.entity.DateRangeEntity;
import com.kems.common.repository.entity.TimeBaseEntity;
import com.kems.videoclass.domain.CourseType;
import com.kems.common.domain.vo.ContentVO;
import com.kems.videoclass.domain.vo.CourseTypeVO;
import com.kems.common.domain.vo.LevelVO;
import com.kems.common.domain.vo.TitleVO;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Courses", schema = "kems")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CourseEntity extends TimeBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_no")
    private Long courseNo;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "time", nullable = false)
    private Long time;

    @Column(name = "level", columnDefinition = "INT CHECK (level IN (1, 2, 3))", nullable = false)
    private int level;

    @Embedded
    private DateRangeEntity dateRange;

    @Column(name = "category_no", nullable = false)
    private Integer categoryNo;

    @Column(name = "course_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private CourseType courseType;

    public CourseEntity(Long courseNo, TitleVO titleVO, ContentVO contentVO,
            LevelVO levelVO, CourseTypeVO courseTypeVO, Long time, Integer categoryNo, DateRangeEntity dateRange) {
        this.courseNo = courseNo;
        this.title = titleVO.getTitle();
        this.content = contentVO.getContentVOn();
        this.level = levelVO.getLevel();
        this.courseType = courseTypeVO.getCourseType();
        this.time = time;
        this.categoryNo = categoryNo;
        this.dateRange = dateRange;
    }
}

