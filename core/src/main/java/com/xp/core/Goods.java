package com.xp.core;

import lombok.Data;

/*****
 *  商品库存表
 */
@Data
public class Goods extends BaseEntity{

    // 商品名称
    private String name;
    // 商品编号
    private String code;
    // 库存数量
    private Integer storenum;
    // 版本号
    private Integer version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStorenum() {
        return storenum;
    }

    public void setStorenum(Integer storenum) {
        this.storenum = storenum;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
