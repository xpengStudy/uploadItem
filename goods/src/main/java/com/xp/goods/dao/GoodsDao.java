package com.xp.goods.dao;

import com.xp.core.Goods;
import org.apache.ibatis.annotations.Mapper;


public interface GoodsDao {

    /*****
     *  新增商品库存信息
     * @param goods
     * @return
     */
    public int createGoods(Goods goods );

    /****
     * 秒杀下单
     * @param uid
     * @return
     */
    public boolean killGoods(Integer uid);
}
