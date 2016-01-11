
package org.apache.cxf;

import javax.jws.WebService;

@WebService(endpointInterface = "org.apache.cxf.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    private int count=0;
    public String sayHi(String text) {
        count++;
        if(count %2 ==0){
            while(true){

            }
        }
        return "Hello " +count+ text;
    }
}
