package com.imooc.miaosha.redis;

/**
 * @author wang tian
 * @version 2.0
 * @date 2020/6/22 11:31
 */
public class GoodsKey extends BasePrefix {
    public GoodsKey(int expireSeconds, String prefix) {
        super(expireSeconds,prefix);
    }
    public static  GoodsKey getGoodsList =new GoodsKey(60,"gl");
    public static  GoodsKey getGoodsDetail =new GoodsKey(60,"gd");
}
