package org.zhanglei.testdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhanglei.RandomEmailGenerator;

/**
 * @author zhanglei
 * @description
 * @date 2019/1/21
 */
public class TestDemo3 {

    @Test
    public void testcase1(){
        int a = 10;
        int b = 9;
        Assert.assertTrue(a >= b);
        System.out.println("testcase1");
    }

    @Test
    public void testEmailGenerator(){
        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email,"zhanglei@qq.com");
    }
}
