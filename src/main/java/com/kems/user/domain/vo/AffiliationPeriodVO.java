package com.kems.user.domain.vo;

import java.time.LocalDateTime;

public class AffiliationPeriodVO {

    private final LocalDateTime redDate;
    private final LocalDateTime deredDate;

    public AffiliationPeriodVO(LocalDateTime redDate, LocalDateTime endDate) {
        if (redDate == null) {
            throw new IllegalArgumentException("입학(입사) 날짜를 선택하세요.");
        }
        if (endDate == null) {
            throw new IllegalArgumentException("졸업(퇴사) 날짜를 선택하세요.");
        }
        if (redDate.isAfter(endDate)) {
            throw new IllegalArgumentException("입학(입사) 날짜는 졸업(퇴사) 날짜보다 앞에 위치해야 합니다.");
        }
        this.redDate = redDate;
        this.deredDate = endDate;
    }

    public LocalDateTime getRedDate() {
        return redDate;
    }

    public LocalDateTime getDeredDate() {
        return deredDate;
    }

}