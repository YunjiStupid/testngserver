package org.zhanglei.ngclass;

import org.testng.annotations.Test;

/**
 * @author zhanglei
 * @description
 * @date 2019/1/24
 */
public class TestGroups {

    @Test(groups = "database")
    public void testLinkedDatabase(){
        System.out.println("连接数据库");
    }

    @Test(groups = "database")
    public void testCutDatabase(){
        System.out.println("断开数据库");
    }

    @Test(groups = "createBean",priority = 2)
    public void testBean(){
        System.out.println("创建java模型");
    }

    @Test(groups = {"createBean","database"},priority = 1)
    public void testAll(){
        System.out.println("创建完java模型，再连接数据库");
    }

}
