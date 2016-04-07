/**
 * TestNGDemo.java   2016年4月7日 下午4:25:37 by PANGJIANLIN 
 *
 * Copyright (c) 2010 - 2016 jianlin.Pang. All rights reserved.
 * 
 */
package testNG.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void testNG() {
        System.out.println("测试一下");
    }

    //按顺序执行测试
    @Test
    public void testNG1() {
        System.out.println("这是测试--1");
    }

    @Test
    public void testNG2() {
        System.out.println("这是测试--2");
    }

    //异常的测试
    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "NullPoint")
    public void testException() {
        throw new IllegalArgumentException("NullPoint");
    }

    //分组进行测试
    @Test(groups = {"G1"})
    public void testGroup1() {
        System.out.println("这是Group1");
    }

    @Test(groups = {"G2"})
    public void testGroup2() {
        System.out.println("这是Group2");
    }

    //参数化测试
    @Test
    @Parameters({"param1", "param2"})
    public void testParam(String param1, String param2) {
        System.out.println("参数是：" + param1 + param2);
    }

    //忽略的测试
    @Test(enabled = false)
    public void testIgnore() {
        System.out.println("这个测试应该被忽略");
    }

    //依赖测试
    @Test
    public void setupEnv() {
        System.out.println("依赖测试第一步");
    }

    @Test(dependsOnMethods = {"setupEnv"})
    public void testMessage() {
        System.out.println("依赖测试第二步");
    }

}
