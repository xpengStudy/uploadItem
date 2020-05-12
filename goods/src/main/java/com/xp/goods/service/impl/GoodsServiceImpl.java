package com.xp.goods.service.impl;

import com.xp.core.Goods;
import com.xp.core.Order;
import com.xp.goods.mapper.GoodsMapper;
import com.xp.goods.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.UUID;

@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;


    public int createGoods(Goods goods) {
        return goodsMapper.createGoods(goods);
    }

    @Override
    public boolean killGoods(String  code,String uid) {

        Boolean flag = true;
        if(StringUtils.isEmpty(code)){
            System.out.println(" 请输入 必填参数code！！");
        }

        try {
            // 根据code 查询商品库存信息
            Goods goods = goodsMapper.getGoods(code);
            // 修改库存
            goodsMapper.killGoods(code,goods.getVersion());

            // 新增订单
            Order order = new Order();
            order.setGoodCode(code);
            order.setSerinum(UUID.randomUUID().toString());
            order.setUid(Integer.valueOf(uid));
            goodsMapper.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }

        return flag;
    }

    @Override
    public Integer getVersion(String code) {
        return goodsMapper.getVersion(code);
    }



}
