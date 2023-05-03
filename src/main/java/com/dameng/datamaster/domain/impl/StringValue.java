package com.dameng.datamaster.domain.impl;

import com.dameng.datamaster.domain.ProtoValue;
import com.dameng.datamaster.domain.ValueType;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class StringValue extends ProtoValue {

    private boolean disabled;

    private boolean readonly;

    private String value;

    private String placeholder;

    private List<Map<String, String>> rules;

    private String subtype;

}
