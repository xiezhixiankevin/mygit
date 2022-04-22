package com.xiezhixian.mygit.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <Description> MyInvocationHandler
 *
 * @author 26802
 * @version 1.0
 * @ClassName MyInvocationHandler
 * @taskId
 * @see com.xiezhixian.mygit.test
 */
public class MyInvocationHandler implements InvocationHandler {

    private final Object object;

    MyInvocationHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前");

        Object o = method.invoke(object,args);

        System.out.println("调用后");

        return o;
    }

    public static void main(String[] args) {
        MessageServiceImpl service = new MessageServiceImpl();
        MessageService instance = (MessageService)Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), new MyInvocationHandler(service));
        instance.sendMessage("xzx");
        instance.printUser("谢志贤");

        System.out.println(instance.getClass());
    }

}
