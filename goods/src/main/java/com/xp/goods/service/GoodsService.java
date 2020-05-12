package com.xp.goods.service;

import com.xp.core.Goods;
import com.xp.core.Order;

public interface GoodsService {

    /*****
     *  新增商品库存信息
     * @param goods
     * @return*/
    public int createGoods(Goods goods );

    /****
     * 秒杀下单
     * @param code
     * @return
     */
    public boolean killGoods(String code,String uid);

    /*****
     * 获取版本号
     * @param code
     * @return
     */
    Integer getVersion(String code);

}
