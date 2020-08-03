package com.sbrf.Practice_day6;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
     MyClass2 t = new MyClass2();
     t.setName(1);
     t.setNum(10);
     MyClass1 t2 = new MyClass1();
     t2.setName("Василий");
     t2.setNum(10);
     getMet(t2);
     copy(t,t2);
     callFly(t2);
     System.out.println(t2.getName() + " / " + t.getNum());
    }
    public static void getMet(Object a) {
        Method[] methods = a.getClass().getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }
    }
    public static void copy(Object s, Object d) throws Exception{
        Class sClass = s.getClass();
        Class dClass = d.getClass();
        Field[] sFields = sClass.getDeclaredFields();
        Field[] dClassFields = dClass.getDeclaredFields();
        for(Field sField:sFields){
            Field dField = dClass.getDeclaredField(sField.getName());
            if(dField!=null){
                sField.setAccessible(true);
                dField.setAccessible(true);
                if(dField.getType()==sField.getType())
                    dField.set(d, sField.get(s));
            }
        }
    }
    public static void callFly(Object obj) throws Exception {
            Method method = obj.getClass().getDeclaredMethod("Fly");
            method.setAccessible(true);
            method.invoke(obj);
    }
}
