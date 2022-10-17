package lession_2;
import lession_1.Student;

import java.util.ArrayList;

public class FptStudent{
    String code;
    String name;
    String tel;


    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public FptStudent(String code, String name, String tel) {
        this.code = code;
        this.name = name;
        this.tel = tel;
    }

    public FptStudent() {
        System.out.println("Hello");
    }

    public void run(){
        System.out.println("chay 5km/h");
    };
    public void run(String name){
        System.out.println("ten hoc sinh " + name);
    }
    public void run(int x){
        System.out.println("chay 10km/h");
    }
    public void run( int x,String y){
        System.out.println("chay 20km/h");
    }
    public  void FptStudent(String msg){
        System.out.println(msg);
    }
    public  void FptStudent(String code,String name ,String tel){
        System.out.println("Ma hoc sinh:" + code);
        System.out.println("Ten hoc sinh:" + name);
        System.out.println("Tel hoc sinh:" + tel);
    }
}
