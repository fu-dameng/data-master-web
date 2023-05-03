package com.dameng.datamaster.domain.impl;

import com.dameng.datamaster.domain.ProtoValue;
import com.dameng.datamaster.domain.ValueType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FloatValue extends ProtoValue {

    protected final int valueType = ValueType.FLOAT.getKey();

    private Float data;

    public FloatValue(Float data) {
        this.data = data;
    }
}
