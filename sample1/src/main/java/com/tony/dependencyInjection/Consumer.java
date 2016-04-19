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
public interface Consumer
{
    void processMessages(String msg, String receiver);
}
