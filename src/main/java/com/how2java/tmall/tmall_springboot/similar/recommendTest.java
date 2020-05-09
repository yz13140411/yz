package com.how2java.tmall.tmall_springboot.similar;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by legotime
 */
public class recommendTest {
    public static void main(String[] args) {
        String []last=null;
        int[] a = {1,2,3,4};
        String[] products = {"dog cate pen cake pie","dog cat water coco","pie cake pen cate","buff a","hh"};
        String s = "pie cake jj pen cate";
        recommend rec = new recommend();
        rec.fit(products);
        double[] doubles = rec.recommendFun(s);
        System.out.println(Arrays.toString(doubles));  //string类型
        System.out.println(rec.getProduct());//treeset类型

       String  ii=(String) Arrays.asList(rec.getProduct().toArray()).get(6);

        System.out.println(ii);

        double max = 0;    //关系
        int maxIndex = 0;   //下标
        for (int i = 0; i < doubles.length; i++) {

            if (doubles[i] > max) {
                max = doubles[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);


        System.out.println( Arrays.asList(rec.getProduct().toArray()).get(5).getClass().toString());



        //System.out.println(rec.getProduct().getClass().toString());
        //[cake, cat, cate, coco, dog, pen, pie, water]
        //[0.0, 0.0, 0.0, 0.0, 0.8, 0.0, 0.0, 0.0]

        //所以推荐　买了　pie cake pen cate　的人买 dog
    }

}