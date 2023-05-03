package com.dameng.datamaster.domain;

public enum ValueType {
    UNKNOWN(0, "未知"),
    INTEGER(1, "整数"),
    FLOAT(2, "浮点数"),
    STRING(3, "input"),
    RADIOBOX(4, "radio"),
    CHECKBOX(5, "多选"),
    IMAGE(6, "图片"),
    FILE(7, "文件"),
    NUMBER(8, "number");

    private int key;
    private String name;

    ValueType(Integer key, String name) {
        this.key = key;
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

}
