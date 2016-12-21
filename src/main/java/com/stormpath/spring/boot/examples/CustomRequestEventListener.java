package com.stormpath.spring.boot.examples;


import com.stormpath.sdk.servlet.authc.SuccessfulAuthenticationRequestEvent;
import com.stormpath.sdk.servlet.event.RequestEventListenerAdapter;

class CustomRequestEventListener extends RequestEventListenerAdapter {

    @Override
    public void on(SuccessfulAuthenticationRequestEvent e) {
        System.out.println("Received successful authentication request event: " + e.getAuthenticationResult().getAccount().getEmail());
    }
}