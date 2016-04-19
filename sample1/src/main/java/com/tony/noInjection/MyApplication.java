/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tony.noInjection;

/**
 *
 * @author txu
 */
public class MyApplication
{
    private emailSendService email = new emailSendService();

    public void processMessages(String message, String receiver)
    {
        // Do some msg validation, manipulation logic etc
        this.email.sendEmail(message, receiver);
    }
}
