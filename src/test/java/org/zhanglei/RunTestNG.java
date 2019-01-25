package org.zhanglei;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanglei
 * @description java启动类
 * @date 2019/1/23
 */
public class RunTestNG {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("..\\testngserver\\src\\main\\resources\\testng.xml");
        testNG.setTestSuites(suites);
        testNG.run();

        //等待执行结果，然后去执行失败用例
        TestNG testNG1 = new TestNG();
        List<String> suites1 = new ArrayList<String>();
        suites1.add(".\\test-output\\testng-failed.xml");
        testNG1.setTestSuites(suites1);
        testNG1.run();
    }
}
