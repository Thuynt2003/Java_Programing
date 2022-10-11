package lession_1;

public class TamGiac {
    int canh1;
    int canh2;
    int canh3;

    public int  CV(){
       return canh1+canh2+canh3 ;
    }
    public  double  DT(){
        double p =(double)(CV()/2);
        return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
    }
}
