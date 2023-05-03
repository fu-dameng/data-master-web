package com.dameng.datamaster.domain.impl;

import com.dameng.datamaster.domain.ProtoValue;
import com.dameng.datamaster.domain.ValueType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageValue extends ProtoValue {

    protected final int valueType = ValueType.IMAGE.getKey();

    private String data;

}
