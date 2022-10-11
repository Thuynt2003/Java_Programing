package lession_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Student s =new Student() ;
       s.age =18 ;
       s.name = "Thuy";
       Student s2 =new Student();
       s2.age =12;
       s2.name = "thuy2";
        s.showInfo();
        s2.showInfo();


        Scanner sc =  new Scanner(System.in);
        TamGiac t = new TamGiac();
        System.out.println("nhap canh 1 :");
        t.canh1 = sc.nextInt();
        System.out.println("nhap canh 2 :");
        t.canh2 = sc.nextInt();
        System.out.println("nhap canh 3 :");3
        t.canh3 = sc.nextInt();
        System.out.println("chu vi :"+ t.CV());
        System.out.println("dien tich :"+ t.DT());
    }
}
