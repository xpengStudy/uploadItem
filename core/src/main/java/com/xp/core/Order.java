package com.xp.core;

/*****
 *  订单表
 */
public class Order extends BaseEntity{
    // 订单编号
    private String serinum;
    // 商品编号
    private String goodCode;
    // uid
    private Integer uid;

    public String getSerinum() {
        return serinum;
    }

    public void setSerinum(String serinum) {
        this.serinum = serinum;
    }

    public String getGoodCode() {
        return goodCode;
    }

    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
