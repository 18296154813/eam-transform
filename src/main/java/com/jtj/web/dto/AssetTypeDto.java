package com.jtj.web.dto;

import com.jtj.web.common.BaseDto;

public class AssetTypeDto extends BaseDto {

    private String name;
    private Long pid;
    private Integer order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
