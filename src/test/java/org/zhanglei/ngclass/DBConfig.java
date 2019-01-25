package org.zhanglei.ngclass;

import org.testng.annotations.*;

/**
 * @author zhanglei
 * @description
 * @date 2019/1/24
 */
public class DBConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite()
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @BeforeTest()
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest()
    public void afterTest() {
        System.out.println("@AfterTest");
    }
}
