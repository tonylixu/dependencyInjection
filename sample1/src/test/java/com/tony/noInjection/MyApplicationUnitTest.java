/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tony.noInjection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author txu
 */
public class MyApplicationUnitTest
{

    public static MyApplication app = null;
    String message;
    String receiver;

    @Before
    public void setUp()
    {
        app = new MyApplication();
        message = "Hi Tony";
        receiver = "tony@abc.com";
    }

    @Test
    public void test()
    {
        app.processMessages(message, receiver);
    }

    @After
    public void tear()
    {
        app = null;
    }

}
