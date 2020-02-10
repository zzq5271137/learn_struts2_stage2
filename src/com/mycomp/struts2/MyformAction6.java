package com.mycomp.struts2;

import com.mycomp.domain.Goods;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/*
 * Map集合接收参数
 * 一个表单中有两个商品
 * 详见form7.jsp
 */

public class MyformAction6 extends ActionSupport {
    private Map<String, Goods> goodsMap;

    public Map<String, Goods> getGoodsMap() {
        return goodsMap;
    }

    public void setGoodsMap(Map<String, Goods> goodsMap) {
        this.goodsMap = goodsMap;
    }

    public String getReqParams() {
        System.out.println("Map集合接收参数:");
        System.out.println(goodsMap);
        return null;
    }

}
