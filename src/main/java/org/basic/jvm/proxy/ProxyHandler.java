package org.basic.jvm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @author: yqg
 * @date: 2022.03.11
 */
public class ProxyHandler implements InvocationHandler {
    private Object obj;

    public ProxyHandler(Object obj) {
        this.obj = obj;
    }

    public ProxyHandler() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("调用前");
        Object invoke = method.invoke(obj, args);
        System.err.println("调用后");
        return invoke;
    }

}
