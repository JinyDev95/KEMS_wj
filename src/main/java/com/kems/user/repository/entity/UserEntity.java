package com.kems.user.repository.entity;

import com.kems.user.domain.UserRole;
import com.kems.user.domain.UserType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "Users", schema = "kems")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_email", nullable = false, length = 100)
    private String userEmail;

    @Column(name = "user_phone", nullable = false, length = 15)
    private String userPhone;

    @Column(name = "user_role", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @Column(name = "user_type", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(name = "user_createAt", nullable = false)
    @CreatedDate
    private LocalDateTime userCreateAt;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private StudentEntity student;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private EmployeeEntity employee;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private TutorEntity tutor;

}
