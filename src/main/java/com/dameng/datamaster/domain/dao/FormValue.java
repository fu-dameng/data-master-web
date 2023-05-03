package com.dameng.datamaster.domain.dao;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FormValue {

    /**
     * 主键
     */
    private int id;

    /**
     * form类型
     */
    private String type;

    /**
     * 唯一标识
     */
    private String key;

    /**
     * 对象的jsonData
     */
    private String jsonData;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

}
