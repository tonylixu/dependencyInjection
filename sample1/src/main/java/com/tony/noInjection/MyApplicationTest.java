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
public class MyApplicationTest
{

    public static void main(String[] args)
    {
        MyApplication app = new MyApplication();
        app.processMessages("Hi Tony", "tony@abc.com");
    }
}
