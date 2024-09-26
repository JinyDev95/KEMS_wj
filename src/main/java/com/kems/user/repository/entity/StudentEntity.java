package com.kems.user.repository.entity;

import com.kems.user.domain.Department;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Students", schema = "kems")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_no")
    private Long studentNo;

    @OneToOne
    @JoinColumn(name = "student_id", unique = true, nullable = false, referencedColumnName = "user_id")
    private UserEntity user;

    @Column(name = "department", nullable = false)
    @Enumerated(EnumType.STRING)
    private Department department;

    @Embedded
    private AffiliationPeriodEntity affiliationPeriod;

}