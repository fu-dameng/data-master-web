package com.dameng.datamaster.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private ObjectMapperUtils() {
        //...
    }

    public static String writeToString(Object o) throws JsonProcessingException {
        return objectMapper.writeValueAsString(o);
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }


}
