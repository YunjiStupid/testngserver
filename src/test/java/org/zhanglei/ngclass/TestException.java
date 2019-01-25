package org.zhanglei.ngclass;

import org.testng.annotations.Test;

/**
 * @author zhanglei
 * @description
 * @date 2019/1/24
 */
public class TestException {

    @Test(expectedExceptions = ArithmeticException.class)
    public void TestException(){
        int i = 1 / 0;
        System.out.println("值是什么呢！！！！" + i);
    }

    @Test(timeOut = 3100)
    public void testTimeOut() throws InterruptedException{
        Thread.sleep(3000);
    }

    @Test(timeOut = 1000)
    public void testTimeOut22222(){
        while(true){

        }
    }
}
