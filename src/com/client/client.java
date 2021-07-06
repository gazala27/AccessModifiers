package com.client;

public class client {
    public void publicfun(){
        System.out.println("public class");
    }
    void fun(){
        System.out.println("default class");
    }
    private void privatefun(){
        System.out.println("private class");
    }
    protected void protectefun(){
        System.out.println("protected class");
    }
}
class message {
    public void publicfun(){
        System.out.println("public class");
    }
    void fun(){
        System.out.println("public class");
    }
    private void privatefun(){
        System.out.println("public class");
    }
    protected void protectefun(){
        System.out.println("public class");
    }
}
//classes -> a package can have only one public class,multiply default class and zero private
// and protectec class.

//function ->

