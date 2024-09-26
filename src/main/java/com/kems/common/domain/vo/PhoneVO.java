package com.kems.common.domain.vo;

public class PhoneVO {

    private final String phone;

    public PhoneVO(String phone) {
        if (phone == null || !isValidPhoneNumber(phone)) {
            throw new IllegalArgumentException("유효한 전화번호 형식이 아닙니다.");
        }
        this.phone = phone;
    }

    private boolean isValidPhoneNumber(String phone) {
        return phone.matches("^\\d{3}-\\d{3,4}-\\d{4}$");
    }

    public String getPhone() {
        return phone;
    }
}