package org.zhanglei.testdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author zhanglei
 * @description 软依赖和硬依赖
 * @date 2019/1/23
 */
public class TestDependence {

    @Test(groups = {"tomcat"})
    public void restartTomcatService() {
        System.out.println("Restart the tomcat server when it is down!");
    }

    @Test(groups = {"tomcat"})
    public void tomcatServiceIsDown() {
        System.out.println("tomcat service is down!");
    }

    @Test(groups = {"app"})
    public void startAppServer() {
        System.out.println("Start App service");
    }

    @Test(groups = {"app"})
    public void shutDownApp() {
        System.out.println("Shutdown App service");
    }

    @Test(alwaysRun = true)
    public void testFail(){
        Assert.assertTrue(12 < 11);
    }
}
