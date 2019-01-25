package org.zhanglei.testdemo;

import org.testng.annotations.Test;

/**
 * 测试组
 *
 * @author zhanglei
 * @description
 * @date 2019/1/23
 */
public class TestGroups {
    @Test(groups = {"API Test"})
    public void test1(){
        System.out.println("API测试");
    }

    @Test(groups = {"function Test"})
    public void test2(){
        System.out.println("功能测试");
    }

    @Test(groups = {"API Test","function Test"})
    public void test3(){
        System.out.println("功能组2个");
    }

    @Test(groups = {"API Test","function Test"})
    public void test4(){
        System.out.println("功能组2个");
    }

    @Test(groups = {"API Test"})
    public void test5(){
        System.out.println("API测试");
    }

    @Test(groups = {"function Test"})
    public void test6(){
        System.out.println("功能测试");
    }
}
