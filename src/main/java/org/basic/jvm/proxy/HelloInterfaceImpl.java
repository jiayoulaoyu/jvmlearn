package org.basic.jvm.proxy;

/**
 * @Description:
 * @author: yqg
 * @date: 2022.03.11
 */
public class HelloInterfaceImpl implements HelloInterface {
    @Override
    public void sayHello() {
        System.err.println("sayHello");
    }
}
