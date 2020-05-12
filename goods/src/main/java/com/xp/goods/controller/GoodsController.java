package com.xp.goods.controller;

import com.xp.core.Goods;
import com.xp.core.ResponseDTO;
import com.xp.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("/creategoods")
    public ResponseDTO  createGoods(@RequestBody Goods goods){

        int id = goodsService.createGoods(goods);
        return new ResponseDTO("200","操作成功！",id);
    }

    @PostMapping("/killGoods")
    public ResponseDTO killGoods(@RequestBody Goods goods,@RequestParam("uid")String uid){

        if(null==goods){
            return new ResponseDTO("500","请输入必填参数！",null);
        }
        if(StringUtils.isEmpty(goods.getCode())){
            return new ResponseDTO("500","请输入code!",null);
        }
        if(StringUtils.isEmpty(uid)){
            return new ResponseDTO("500","请输入用户uid!",null);
        }

        Boolean  flag = goodsService.killGoods(goods.getCode(),uid);
        if(flag){
            return new ResponseDTO("200","秒杀成功！",null);

        }else{
            return new ResponseDTO("500","秒杀失败！",null);
        }
    }
}
