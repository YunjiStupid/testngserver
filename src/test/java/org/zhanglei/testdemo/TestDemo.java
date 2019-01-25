package org.zhanglei.testdemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.zhanglei.RandomEmailGenerator;

/**
 * @author zhanglei
 * @description
 * @date 2019/1/21
 */
public class TestDemo {


    @BeforeClass
    public void before(){
        System.out.println("开始测试之前，跑当前方法");
    }
    @Test
    public void testcase1(){
        int a = 10;
        int b = 9;
        Assert.assertTrue(a > b);
        System.out.println("testcase1");
    }

    @Test
    public void testEmailGenerator(){
        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email,"zhanglei@qq.com");
    }

    @AfterClass
    public void after(){
        System.out.println("测试结束后的步骤");
    }
}
