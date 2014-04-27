
package com.cxf.sample;

import javax.jws.WebService;

@WebService(endpointInterface = "com.cxf.sample.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

