package com.dameng.datamaster.domain;

import com.dameng.datamaster.domain.impl.FloatValue;
import com.dameng.datamaster.utils.ObjectMapperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ProtoValueTest {

    @Test
    public void test() throws JsonProcessingException {


    }


    @Test
    public void jsonTest() throws JsonProcessingException {
        String format =
                "    [\n" +
                        "        {\n" +
                        "          \"required\": true,\n" +
                        "          \"message\": \"不能为空\",\n" +
                        "          \"trigger\": \"blur\"\n" +
                        "        },\n" +
                        "        {\n" +
                        "          \"min\": 1,\n" +
                        "          \"max\": 8,\n" +
                        "          \"type\": \"string\",\n" +
                        "          \"message\": \"长度在1~8个字符\",\n" +
                        "          \"trigger\": \"blur\"\n" +
                        "        }\n" +
                        "      ]";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(format);
        Iterator<JsonNode> iterator = jsonNode.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    @Test
    public void testJson2() throws JsonProcessingException {
        ObjectMapper objectMapper = ObjectMapperUtils.getObjectMapper();
        List<String> stringList = new ArrayList<>();

        stringList.add("sdsds");
        System.out.println(objectMapper.writeValueAsString(stringList));
    }

}
