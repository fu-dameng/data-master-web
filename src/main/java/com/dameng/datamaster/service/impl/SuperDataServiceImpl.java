package com.dameng.datamaster.service.impl;

import com.dameng.datamaster.domain.dao.SuperDataDO;
import com.dameng.datamaster.mapper.SuperDataMapper;
import com.dameng.datamaster.service.SuperDataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
@Slf4j
public class SuperDataServiceImpl implements SuperDataService {

    @Resource
    private ObjectMapper objectMapper;

    @Resource
    private SuperDataMapper superDataMapper;

    @Override
    public int insert(String jsonData) {
        SuperDataDO superDataDO = new SuperDataDO();
        try {
            JsonNode tree = objectMapper.readTree(jsonData);
            superDataDO.setInline(tree.get("inline").asBoolean() ? 1 : 0);
            superDataDO.setStatusIcon(tree.get("statusIcon").asBoolean() ? 1 : 0);
            superDataDO.setSize(tree.get("size").asText());
            superDataDO.setLabelPosition(tree.get("labelPosition").asText());
            superDataDO.setLabelWidth(tree.get("labelWidth").asText());
            superDataDO.setFormItemList(tree.get("formItemList").toString());
            superDataDO.setCreateTime(LocalDateTime.now());
            superDataDO.setUpdateTime(LocalDateTime.now());
            return superDataMapper.insert(superDataDO);
        } catch (JsonProcessingException e) {
            log.error("json解析错误");
            e.printStackTrace();
            return -1;
        }
    }

}
