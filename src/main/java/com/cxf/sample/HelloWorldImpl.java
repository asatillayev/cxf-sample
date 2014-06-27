
package com.cxf.sample;

import javax.jws.WebService;
import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@WebService(endpointInterface = "com.cxf.sample.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

