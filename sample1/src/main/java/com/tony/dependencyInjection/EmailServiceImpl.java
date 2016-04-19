package com.tony.dependencyInjection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.inject.Singleton;

/**
 *
 * @author txu
 */
@Singleton
public class EmailServiceImpl implements MessageService
{
    public boolean sendMessage(String msg, String receiver)
    {
        // Logic to send email
        System.out.println("Email sent to " + receiver + " with Message=" + msg);
        return true;
    }
}
