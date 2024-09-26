package com.kems.user.repository.entity;

import com.kems.common.domain.vo.DateRangeVO;
import com.kems.user.domain.vo.AffiliationPeriodVO;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class AffiliationPeriodEntity {

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime regDate;

    @Column(name = "deregistration_date")
    private LocalDateTime deregDate;

    protected AffiliationPeriodEntity() {
    }

    public AffiliationPeriodEntity(AffiliationPeriodVO affiliationPeriodVO) {
        this.regDate = affiliationPeriodVO.getRedDate();
        this.deregDate = affiliationPeriodVO.getDeredDate();
    }

}
