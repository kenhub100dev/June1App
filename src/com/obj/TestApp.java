/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obj;

/**
 *
 * @author kenta_000
 */
public class TestApp {
    
    public static void main(String [] args){
        System.out.println("hey there");
        //added comment.
        System.out.println("It's important to know");
        Person person = new Person(99,"Jill_davis",100);
        System.out.println(person);
        System.out.println(person.getName());
    }
    
}
