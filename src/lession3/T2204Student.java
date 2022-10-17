package lession3;

 import lession_2.FptStudent;

public class T2204Student extends FptStudent {
    public String address;
    public T2204Student(String code,String name ,String tel ,String address){
        super(code,name,tel);
        this.address = address;
    }

    public T2204Student() {

    }

    @Override
    public void run(int x) {
        System.out.println("100km/h");
    }
    @Override
//    Ghi đè  dùng @Override
     public  void run(){
//        tái sử dunng mã nguồn dùng super
        super.run();
        super.run(12);
        this.run(12);
        System.out.println("50km/h");
    }
}

