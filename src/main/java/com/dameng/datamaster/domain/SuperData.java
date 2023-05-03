package com.dameng.datamaster.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SuperData {

    private boolean inline;

    private String labelPosition;

    private String labelWidth;

    private String size;

    private boolean statusIcon;

    private List<ProtoValue> formItemList;
}
