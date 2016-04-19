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
public class SMSServiceImpl implements MessageService
{
    @Override
    public boolean sendMessage(String msg, String receiver)
    {
        // Logic to send SMS
        System.out.println("SMS sent to " + receiver + " with Message=" + msg);
        return true;
    }

}
