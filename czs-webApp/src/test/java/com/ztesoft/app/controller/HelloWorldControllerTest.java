package com.ztesoft.app.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello World!", new HelloWorldController().sayHello());
    }

}