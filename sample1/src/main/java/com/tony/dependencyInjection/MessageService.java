/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tony.dependencyInjection;

/**
 *
 * Provides the base contract for the services
 */
public interface MessageService
{
    boolean sendMessage(String msg, String receiver);
}
