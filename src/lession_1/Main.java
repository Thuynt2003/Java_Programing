package lession_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//       Student s =new Student() ;
//       s.age =18 ;
//       s.name = "Thuy";
//       Student s2 =new Student();
//       s2.age =12;
//       s2.name = "thuy2";
//       s.showInfo();
//       s2.showInfo();


        Scanner sc =  new Scanner(System.in);

//        bài tính diện dích và chu vi tam giác
//        TamGiac t = new TamGiac();
//        System.out.println("nhap canh 1 :");
//        t.canh1 = sc.nextInt();
//        System.out.println("nhap canh 2 :");
//        t.canh2 = sc.nextInt();
//        System.out.println("nhap canh 3 :");
//        t.canh3 = sc.nextInt();
//        System.out.println("chu vi :"+ t.CV());
//        System.out.println("dien tich :"+ t.DT());

//      Bài tập về phân số
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo psTong = new PhanSo();
        PhanSo psHieu = new PhanSo();
        PhanSo psTich = new PhanSo();
        PhanSo psThuong = new PhanSo();
        System.out.println("nhap tu so1 :");
        ps1.setTuso(sc.nextInt());
        System.out.println("nhap mau so1 (mau so ! 0) :");
        ps1.setMauso(sc.nextInt());
        System.out.println("nhap tu so2 :");
        ps2.setTuso(sc.nextInt());
        System.out.println("nhap mau so2 (mau so ! 0) :");
        ps2.setMauso(sc.nextInt());

//        hiển thị phân số
        System.out.println("phan so 1:");
        ps1.hienThiPhanSo();
        System.out.println("phan so thu 2 :");
        ps2.hienThiPhanSo();

//        Tối giản phân số
        System.out.println("phan so 1 toi gian :");
        ps1.toiGianPS();
        ps1.hienThiPhanSo();
        System.out.println("phan so 2 toi gian :");
        ps2.toiGianPS();
        ps2.hienThiPhanSo();



//      tính tông hai phan so
        psTong = PhanSo.congPhanSo(ps1, ps2);
        System.out.println(" tong hai phan so:" + psTong.getTuso() + "/" + psTong.getMauso());

//      tính tông hai phan so
        psHieu = PhanSo.truPhanSo(ps1,ps2);
        System.out.println(" hieu hai phan so:" + psHieu.getTuso() + "/" + psHieu.getMauso());
//      tính tông hai phan so
        psTich = PhanSo.tichPhanSo(ps1,ps2);
        System.out.println(" hieu hai phan so:" + psTich.getTuso() + "/" + psTich.getMauso());
//      tính tông hai phan so
        psThuong = PhanSo.thuongPhanSo(ps1,ps2);
        System.out.println(" hieu hai phan so:" + psThuong.getTuso() + "/" + psThuong.getMauso());

//      hiển thị số nghịch đảo
        System.out.println("So nghich dao:");
        ps1.nghichDaoPhanSo();
        ps1.hienThiPhanSo();
        System.out.println("So nghich dao:");
        ps2.nghichDaoPhanSo();
        ps2.hienThiPhanSo();

    }
//
}

