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
public class emailSendService
{
    public void sendEmail(String message, String receiver)
    {
        // Logic to send email
        System.out.println("Email sent to " + receiver + " with Message=" + message);
    }
}
