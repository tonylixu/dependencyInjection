/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tony.dependencyInjection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author txu
 */
public class MyApplicationJUnitTest
{
    private MessageServiceInjector injector;

    @Before
    public void setUp()
    {
        // Mock the injector with anonymous class
        injector = new MessageServiceInjector()
        {
            @Override
            public Consumer getConsumer()
            {
                // Mock the message service
                return new MyApplication(new MessageService()
                {

                    @Override
                    public boolean sendMessage(String msg, String rec)
                    {
                        System.out.println("Mock Message Service implementation");
                        return true;
                    }
                });
            }
        };
    }

    @Test
    public void test()
    {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Tony", "tony@abc.com");
    }

    @After
    public void tear()
    {
        injector = null;
    }

}
