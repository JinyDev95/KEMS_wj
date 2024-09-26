package com.kems.common.domain.vo;

public class TitleVO {

    private final String title;

    public TitleVO(String title) {
        if (title == null || title.length() > 50) {
            throw new IllegalArgumentException("제목은 50자 이내여야 합니다.");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

