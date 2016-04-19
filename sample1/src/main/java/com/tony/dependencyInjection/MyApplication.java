/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tony.dependencyInjection;

import com.google.inject.Inject;

/**
 *
 * @author txu
 */
public class MyApplication implements Consumer
{
    private MessageService service;

    @Inject
    public MyApplication(MessageService svc)
    {
        this.service = svc;
    }

    @Override
    public void processMessages(String msg, String receiver)
    {
        // Do some msg validation, manupulation logic etc
        this.service.sendMessage(msg, receiver);
    }
}
