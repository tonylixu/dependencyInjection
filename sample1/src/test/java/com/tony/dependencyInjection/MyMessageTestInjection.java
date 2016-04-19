package com.tony.dependencyInjection;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by txu on 2016-04-19.
 */
public class MyMessageTestInjection
{
    private Injector injector;

    @Before
    public void setUp() throws Exception
    {
        injector = Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                bind(MessageService.calss).to(MockMessageService.class);
            }
        });
    }

    @After
    public void tearDown() throws Exception {
        injector = null;
    }

    @Test
    public void test() {
        MyMessageTestInjection injectionTest = injector.getInstance(MyMessageTest.class);
        Assert.assertArrayEquals(true, injectionTest.sendMessage("Hi Tony", "Tony@lixu.ca"));
    }
}
