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
public class MyMessageTest
{
    public static void main(String[] args)
    {
        String msg = "Hi Tony";
        String email = "tony@abc.com";
        String cellphone = "111-222-3333";
        String kik_id = "kikaccount";
        MessageServiceInjector injector = null;
        Consumer app = null;

        // Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        // Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, cellphone);

        // Send Kik message
        injector = new KikServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, kik_id);
    }
}
