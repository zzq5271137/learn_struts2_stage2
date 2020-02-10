package com.mycomp.ognl;

import com.mycomp.domain.Goods;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

public class OgnlTest {

    @Test
    public void ognlTest1() {
        // ognl基本使用
        // OgnlContext的本质是一个map
        OgnlContext ognlContext = new OgnlContext();

        // 根对象与Context对象(非根对象)是用来存数据的
        // 表达式是用来取数据的, 表达式是在Ognl.getValue()方法的第一个参数中填写

        // 根对象存数据
        ognlContext.setRoot("zzq");
        // 从根当中取数据
        Object obj = Ognl.getRoot(ognlContext);
        System.out.println(obj);

    }

    @Test
    public void ognlTest2() throws OgnlException {
        OgnlContext ognlContext = new OgnlContext();

        // 往根对象中存对象
        Goods goods = new Goods();
        goods.setName("goods01");
        goods.setPrice(12.5);
        ognlContext.setRoot(goods);

        // 获取root
        Object root = ognlContext.getRoot();

        // 从根中取数据, 直接把goods中的属性值取出来, 而不是取出goods对象本身
        // 有3个参数:
        // 1. 表达式: 取哪一个字段
        // 2. ognlContext
        // 3. root
        Object name = Ognl.getValue("name", ognlContext, root);
        Object price = Ognl.getValue("price", ognlContext, root);
        System.out.println(name);
        System.out.println(price);
    }

    @Test
    public void ognlTest3() throws OgnlException {
        OgnlContext ognlContext = new OgnlContext();

        // 往非根对象中存数据
        Goods goods = new Goods();
        goods.setName("goods01");
        goods.setPrice(12.5);
        ognlContext.put("goods01", goods);

        // 获取root
        Object root = ognlContext.getRoot();

        // 非根对象是不能够直接取某一个字段的, 只能取出你存的内容(对象)
        // 表达式需要使用"#key"
        Object res = Ognl.getValue("#goods01", ognlContext, root);
        System.out.println(res);
    }

    /*
     * Ognl调用对象方法
     */
    @Test
    public void ognlTest4() throws OgnlException {
        OgnlContext ognlContext = new OgnlContext();
        Object root = ognlContext.getRoot();

        // 在表达式中调用方法
        // 调用对象的普通方法
        Object value = Ognl.getValue("'hello'.length()", ognlContext, root);
        System.out.println(value);

        // 调用对象静态方法
        Object value2 = Ognl.getValue("@java.lang.Math@random()", ognlContext, root);
        System.out.println(value2);
    }

}
