package org.zhanglei.ngclass.dataprovide;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author zhanglei
 * @description
 * @date 2019/1/25
 */
public class TestParameterDataProvider {

    @Test(dataProvider = "provideNumbers")
    public void test(int number,int excepted){
        Assert.assertEquals(number + 10,excepted);
    }

    @DataProvider(name = "provideNumbers")
    public Object[][] privadeNumber(){
        return new Object[][]{{10,20},{100,120}};
    }
}
