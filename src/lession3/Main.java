package lession3;

import lession_2.FptStudent;

import java.util.ArrayList;

public class Main {
    public  static void main(String[] args){
    FptStudent[]  fptStudents = new FptStudent[4];
    fptStudents[0] = new FptStudent();
    fptStudents[1] = new FptStudent();

    int[] arr = new int[4];
    arr[0] =10;
    arr[1] =20;

        ArrayList<FptStudent> fArr =new ArrayList<>();
        fArr.add(new FptStudent());
        fArr.add(new FptStudent());
        fArr.add(new FptStudent());
        fArr.get(0).run();

        for(int i = 0 ;i< fArr.size(); i++){
            fArr.get(i).FptStudent("abc");
        }

        for(FptStudent fx : fArr){
            fx.FptStudent("ABC");
        }

        ArrayList<String> strArr = new ArrayList<String>();
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(10);

        T2204Student ts = new T2204Student();
        ts.run();
        ts.setMark(5);
        System.out.println(ts.getMark());

    }
}
