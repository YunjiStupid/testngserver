package org.zhanglei.testdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author zhanglei
 * @description
 * @date 2019/1/21
 */
public class TestDemo2 {

    @Test(priority = 2,timeOut = 3000)
    @Parameters({"name","age"})
    public void testcase1(){
        try{
            Thread.sleep(3200);
            System.out.println("Hello,My name is  years old");
        }catch (InterruptedException e){
            System.out.println(e.toString());
        }
    }

    @Test(priority = 1)
    public void testEmailGenerator(){
        /*RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();
        Assert.assertNotNull(email);
        Assert.assertEquals(email,"zhanglei@qq.com");*/
        System.out.println("哈哈哈哈哈哈哈哈哈哈哈");
    }

    @Test
    public void testAssert(){
        System.out.println("开始测试");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(12,13,"不相等！！");
        System.out.println("继续执行哈哈哈哈哈");
        softAssert.assertAll();
    }
}
