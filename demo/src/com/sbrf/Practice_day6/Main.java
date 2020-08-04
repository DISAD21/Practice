package com.sbrf.Practice_day6;

import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
     MyClass2 t = new MyClass2();
     t.setName(1);
     t.setNum(10);
     MyClass1 t2 = new MyClass1();
     t2.setName("Василий");
     t2.setNum(10);
     //getMet(t2);
     copy(t,t2);
     //callFly(t2);
     //System.out.println(t2.getName() + " / " + t.getNum());
     printAllClass();
     callAllUseable();
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
    private static void callAllUseable() {
        List<Object> objs = new ArrayList<>();
        objs.add(new MyClass1());
        objs.add(new MyClass2());
        for (Object obj : objs) {
            Method[] ms = obj.getClass().getMethods();
            for (Method m : ms) {
                RunMe a = m.getAnnotation(RunMe.class);
                if (a == null)
                    continue;
                String arg = a.arg();
                try {
                    m.invoke(obj, arg);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void printAllClass() {
        Reflections reflections = new Reflections( "com.sbrf.Practice_day6");
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(Plugins.class);
        for (Class<?> clazz : classes) {
            System.out.println(clazz.getCanonicalName());
        }
    }
}
