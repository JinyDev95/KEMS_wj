package com.kems.common.domain.vo;

public class LevelVO {

    private final int level;

    public LevelVO(int level) {
        if (level < 1 || level > 3) {
            throw new IllegalArgumentException("난이도는 1부터 3까지 입니다.");
        }
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
