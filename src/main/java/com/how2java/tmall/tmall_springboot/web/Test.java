package com.how2java.tmall.tmall_springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@RestController
public class Test {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String[] p=new String[2];
        String a ="p";
        String d="";
        String b="o";
        String c =a+d+b;
        l.add(a);
        l.add(b);
        p[0]=a;
        p[1]=b;
        System.out.println(p);
        System.out.println(l.size());
        System.out.println(c);
        tt(8);
        System.out.println();
    }
    public static void  tt(int i)
    {
        TreeSet<String>  vv= new TreeSet<String>();
        vv.add("dd");
        //String[] l=  vv.toArray();



          String []t= new String[i];

        System.out.println(t.length);
    }
}
