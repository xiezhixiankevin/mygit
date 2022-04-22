package com.xiezhixian.mygit.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <Description> MyFanSheClass
 *
 * @author 26802
 * @version 1.0
 * @ClassName MyFanSheClass
 * @taskId
 * @see com.xiezhixian.mygit.test
 */
public class MyFanSheClass {

    private String name = "name";

    public void publicMethod(String str){
        System.out.println(str+name);
    }

    private void privateMethod(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        try {
            Class<?> myFanSheClass = Class.forName("com.xiezhixian.mygit.test.MyFanSheClass");
            Object instance = myFanSheClass.newInstance();
            //反射获取所有方法
            Method[] methods = myFanSheClass.getDeclaredMethods();
            for (Method method : methods){
                System.out.println(method.getName());
            }
            //调用方法
            Method publicMethod = myFanSheClass.getDeclaredMethod("publicMethod", String.class);
            publicMethod.invoke(instance,"public");
            Method privateMethod = myFanSheClass.getDeclaredMethod("privateMethod", String.class);
            privateMethod.setAccessible(true);
            privateMethod.invoke(instance,"private");

            Field name = myFanSheClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(instance,"反射");
            publicMethod.invoke(instance,"public");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
