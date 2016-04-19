package com.tony.dependencyInjection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author txu
 */
public class KikServiceImpl implements MessageService
{
    @Override
    public boolean sendMessage(String msg, String receiver)
    {
        // Logic to send Kik message
        System.out.println("Kik message send to " + receiver + " with Message=" + msg);
        return true;
    }
}
