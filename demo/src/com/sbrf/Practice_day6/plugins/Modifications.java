package com.sbrf.Practice_day6.plugins;

import com.sbrf.Practice_day6.Plugins;

@Plugins
public class Modifications {
        public void foo1(String arg){
            System.out.println("aClass1 foo1 run with " + arg);
        }
        @Deprecated
        public void cool(String arg){
            System.out.println("AnyClass2 сool run with " + arg);
        }
        public void foo2(String arg){
            System.out.println("aClass1  foo2 run with " + arg);
        }
        public void foo3(String arg){
            System.out.println("aClass1  foo3 run with " + arg);
        }
    }

