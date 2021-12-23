package com.demo;
class static2
{
    static int a=10;
    static int b=20;
    static void call()
    {
        System.out.println("Value1="+a);
    }
}
public class Mstatic1 {

    public static void main(String args[ ])
    {
        static2.call();
        System.out.println("Value2="+static2.b);
    }
}


