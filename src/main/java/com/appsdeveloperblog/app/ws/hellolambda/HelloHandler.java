/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsdeveloperblog.app.ws.hellolambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 *
 * @author ksvijaynkl
 */
public class HelloHandler implements RequestHandler<HelloInput, HelloOutput>{


    @Override
    public HelloOutput handleRequest(HelloInput i, Context cntxt) {
       HelloOutput o = new HelloOutput();
       o.setMessage("Hello "+ i.getName());
       o.setFunctionName(cntxt.getFunctionName());
       o.setMemoryLimit(cntxt.getMemoryLimitInMB());
       cntxt.getLogger().log(i.getName() + " said hello");
       
    return o;
    }
    
}
