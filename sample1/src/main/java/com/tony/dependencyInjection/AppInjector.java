package com.tony.dependencyInjection;

import com.google.inject.AbstractModule;

/**
 * Created by txu on 2016-04-18.
 */
public class AppInjector extends AbstractModule {

    @Override
    protected void configure()
    {
        bind(MessageService.class).to(EmailServiceImpl.class);
    }
}
