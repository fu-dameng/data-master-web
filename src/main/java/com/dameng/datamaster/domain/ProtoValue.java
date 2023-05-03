package com.dameng.datamaster.domain;

import com.dameng.datamaster.domain.impl.NumberValue;
import com.dameng.datamaster.domain.impl.StringValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

/**
 * 原型值类
 */
@Data
public abstract class ProtoValue {

    private String type;

    private String label;

    private String key;

    protected static final ObjectMapper objectMapper = new ObjectMapper();

    public static ProtoValue fromJson(String json) throws JsonProcessingException {
        JsonNode node = objectMapper.readTree(json);
        String type = node.get("type").asText();
        if (ValueType.INTEGER.getName().equals(type)) {
            return objectMapper.readValue(json, NumberValue.class);
        } else if (ValueType.STRING.getName().equals(type)) {
            return objectMapper.readValue(json, StringValue.class);
        }
        return null;
    }

    public String convertToJson() throws JsonProcessingException {
        return objectMapper.writeValueAsString(this);
    }

}
