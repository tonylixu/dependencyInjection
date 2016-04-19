/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tony.dependencyInjection;

/**
 *
 * @author txu
 */
public class EmailServiceInjector implements MessageServiceInjector
{
    @Override
    public Consumer getConsumer()
    {
        return new MyApplication(new EmailServiceImpl());
    }
}
