package com.dameng.datamaster.mapper;

import com.dameng.datamaster.domain.dao.SuperDataDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SuperDataMapper {

    int insert(SuperDataDO superDataDO);

}
