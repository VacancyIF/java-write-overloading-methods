package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    private int add(Integer i, Integer j){
        return i+j;
    }

    private int add(Integer i, Integer j, Integer k){
        return i+j+k;
    }

    private int add(Integer i, Integer j, Integer k, Integer n){
        return i+j+k+n;
    }

    private String add(String a, String b, String c){
        return a+b+c;
    }
}
