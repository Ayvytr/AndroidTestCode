package com.ayvytr.test.proxy;

import com.ayvytr.logger.L;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {

    private Object bean;

    public JdkProxy(Object bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("wakeup")){
            L.e("早安~~~");
        }else if(methodName.equals("sleep")){
            L.e("晚安~~~");
        }

        return method.invoke(bean, args);
    }
}