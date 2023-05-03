package com.dameng.datamaster.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SuperDataBuilder {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private Map<String, ProtoValue> values;

    public SuperDataBuilder addValue(String json) throws JsonProcessingException {
        JsonNode jsonNode = objectMapper.readTree(json);
        Iterator<String> fieldNames = jsonNode.fieldNames();
        while (fieldNames.hasNext()) {
            String field = fieldNames.next();
            JsonNode childNode = jsonNode.get(field);
            ProtoValue protoValue = ProtoValue.fromJson(childNode.toString());
            if (null == values) {
                values = new HashMap<>();
            }
            values.put(field, protoValue);
        }
        return this;
    }


}
