package lession_2;

import lession_1.Student;

public class Main {
    public static void main(String[] args){
    Student t =new Student();
    t.age = 12;
        FptStudent ft = new FptStudent();
        ft.run();
        ft.run(10);
        ft.run(10,"hello");
        FptStudent ft1 = new FptStudent();
        ft1.FptStudent("Xin Chao Cac Ban");
        FptStudent ft2 = new FptStudent();
        ft2.FptStudent("TH1","nguyen thi thuy","T0987312522");
    }
}
