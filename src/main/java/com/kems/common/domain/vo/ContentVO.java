package com.kems.common.domain.vo;

public class ContentVO {

    private final String contentVO;

    public ContentVO(String contentVO) {
        if (contentVO.length() > 1000) {
            throw new IllegalArgumentException("과정 설명은 1,000자 이내여야 합니다.");
        }
        this.contentVO = contentVO;
    }

    public String getContentVOn() {
        return contentVO;
    }
}

