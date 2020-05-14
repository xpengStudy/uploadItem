package com.xp.goods.mapper;

import com.xp.core.Goods;
import com.xp.core.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;

@Mapper
public interface GoodsMapper {

    /*****
     *  新增商品信息
     * @param goods
     * @return
     */
    @Insert(" INSERT INTO t_goods (`name`, `code`, `id`, `storenum`, `version`) VALUES ( #{name}, #{code}, #{id}, #{storenum}, #{version} )")
    int createGoods(Goods goods);

    /*****
     *  根据code 查询商品库存信息
     * @param code
     * @return
     */
    @Cacheable(value = "goods")
    @Select(" select * from t_goods where code = #{code} ")
    Goods getGoods(@Param("code") String code);

    /*****
     * 商品下单
     * @param code
     */
    @Update(" UPDATE `t_goods` SET  storenum = storenum - 1 ,version = version + 1   WHERE code = #{code} AND storenum > 0 and version = #{version}  ")
    void killGoods(@Param("code") String code, @Param("version") Integer version);

    /*****
     *  查询商品库存的 version 版本
     * @param code
     * @return
     */
    @Select(" SELECT version FROM t_goods where code = #{code}")
    Integer getVersion(String code);

    /*****
     *  新增订单
     * @param order
     * @return
     */
    @Insert(" INSERT INTO `t_order`(`serinum`, `goods_code`, `uid`, `id`) VALUES (#{serinum}, #{goodCode}, #{uid}, #{id});")
    int createOrder(Order order);
}
