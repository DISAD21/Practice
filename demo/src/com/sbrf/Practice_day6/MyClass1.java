package com.sbrf.Practice_day6;

public class MyClass1 <T>{
        private T num;
        private T name;
        public MyClass1(){}
        @RunMe
        public void Test(String a)
        {
                System.out.println("RunMe работает");
        }
        public void Fly(){
            System.out.println("Работает");
        }
        public T getNum(){ return num; }
        public void setNum(T num){ this.num = num; }
        public  T getName(){ return name; }
        public void setName(T name){ this.name = name; }
}
