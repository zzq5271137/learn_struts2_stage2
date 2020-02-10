package com.mycomp.struts2;

import com.mycomp.domain.Goods;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/*
 * List集合接收参数
 * 一个表单中有两个商品
 * 详见form6.jsp
 */

public class MyformAction5 extends ActionSupport {
    private List<Goods> goodsList;

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public String getReqParams() {
        System.out.println("List集合接收参数:");
        System.out.println(goodsList);
        return null;
    }

}
