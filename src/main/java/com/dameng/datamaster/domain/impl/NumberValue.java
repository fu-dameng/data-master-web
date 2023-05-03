package com.dameng.datamaster.domain.impl;

import com.dameng.datamaster.domain.ProtoValue;
import lombok.Data;

@Data
public class NumberValue extends ProtoValue {

    private int value;

    private int decimal;

    private int min;

    private int max;

    private String prepend;

    private String append;

}
