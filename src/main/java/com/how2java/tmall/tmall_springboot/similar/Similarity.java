package com.how2java.tmall.tmall_springboot.similar;

import java.io.Serializable;


public interface Similarity extends Serializable{
    double distance(String s1, String s2);
}

