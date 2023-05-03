package com.dameng.datamaster.domain.dao;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SuperDataDO {

    private int id;

    /**
     * 0：false
     * 1: true
     */
    private int inline;

    private String labelPosition;

    private String labelWidth;

    private String size;

    /**
     * 0：false
     * 1: true
     */
    private int statusIcon;

    private String formItemList;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

}
