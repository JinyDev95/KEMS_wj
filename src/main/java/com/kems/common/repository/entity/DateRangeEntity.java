package com.kems.common.repository.entity;

import com.kems.common.domain.vo.DateRangeVO;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class DateRangeEntity {

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    protected DateRangeEntity() {
    }

    public DateRangeEntity(DateRangeVO dateRangeVO) {
        this.startDate = dateRangeVO.getStartDate();
        this.endDate = dateRangeVO.getEndDate();
    }

}
