package com.kems.common.domain.vo;

import java.time.LocalDateTime;

public class DateRangeVO {

    private final LocalDateTime startDate;
    private final LocalDateTime endDate;

    public DateRangeVO(LocalDateTime startDate, LocalDateTime endDate) {
        if (startDate == null) {
            throw new IllegalArgumentException("시작 날짜를 선택하세요.");
        }
        if (endDate == null) {
            throw new IllegalArgumentException("종료 날짜를 선택하세요.");
        }
        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("시작 날짜는 종료 날짜보다 앞에 위치해야 합니다.");
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

}