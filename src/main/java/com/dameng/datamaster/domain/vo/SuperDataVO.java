package com.dameng.datamaster.domain.vo;

import com.dameng.datamaster.domain.ProtoValue;
import com.dameng.datamaster.domain.dao.SuperDataDO;
import com.dameng.datamaster.utils.ObjectMapperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

@Data
public class SuperDataVO {

    private int id;

    private boolean inline;

    private String labelPosition;

    private String labelWidth;

    private String size;

    private boolean statusIcon;

    private List<ProtoValue> formItemList;

    public static SuperDataVO fromDO(SuperDataDO superDataDO) {
        SuperDataVO superDataVO = new SuperDataVO();
        BeanUtils.copyProperties(superDataDO, superDataVO);
        superDataVO.setInline(superDataDO.getInline() == 1);
        superDataVO.setStatusIcon(superDataDO.getStatusIcon() == 1);
        List<ProtoValue> protoValues = new ArrayList<>();

        ObjectMapper objectMapper = ObjectMapperUtils.getObjectMapper();
        try {
            JsonNode tree = objectMapper.readTree(superDataDO.getFormItemList());
            if (tree.isArray()) {
                for (JsonNode node : tree) {
                    protoValues.add(ProtoValue.fromJson(node.toString()));
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        superDataVO.setFormItemList(protoValues);

        return superDataVO;
    }

    public SuperDataDO convertToDO() {
        SuperDataDO superDataDO = new SuperDataDO();
        BeanUtils.copyProperties(this, superDataDO);
        superDataDO.setInline(inline ? 1 : 0);
        superDataDO.setStatusIcon(statusIcon ? 1 : 0);
        try {
            superDataDO.setFormItemList(ObjectMapperUtils.getObjectMapper().writeValueAsString(formItemList));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return superDataDO;
    }

}
