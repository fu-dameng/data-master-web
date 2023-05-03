package com.dameng.datamaster.mapper;

import com.dameng.datamaster.domain.dao.FormValue;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FormValueMapper {

    int insertFormValue(FormValue formValue);

    FormValue selectFormValueByKey(String key);

}
