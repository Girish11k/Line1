package com.company;

public class Main {

    public static void main(String[] args) {

                        int x1,x2,y1,y2;
                        int a1,a2,b1,b2;
                        double dis2;
                        a1=1;b1=1;a2=2;b2=2;
                        double dis1;
                        x1=2;y1=2;x2=1;y2=0;

                        dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
                        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis1);

                        dis2=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
                        System.out.println("distancebetween"+"("+a1+","+b1+"),"+"("+a2+","+b2+")===>"+dis2);

                        if (dis1 == dis2) {
                            System.out.println("lines are equals");
                        }
                        else
                           System.out.println("lines are not equals");
    }
}
