package lession_1;


import java.util.Scanner;

public class PhanSo {

    public PhanSo() {}
    private int mauso;
    private int tuso;

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public void hienThiPhanSo() {
        System.out.println(this.tuso+"\\"+this.mauso);
    };

    private int timUSCLN(int a,int b){
        int r=a%b;
        while (r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
    private boolean kiemTraToiGian(){
        if(timUSCLN(tuso,mauso)==1){
            return true;
        }
        return false;
    }
    public void toiGianPS(){
        int x=timUSCLN(tuso,mauso);
        tuso/=x;
        mauso/=x;
    }
    public float nghichDaoPhanSo(){
        int bientam = tuso;
        tuso = mauso;
        mauso = bientam;
        return 0 ;
    }

    public static PhanSo congPhanSo(PhanSo ps1, PhanSo ps2){
        int ts = ps1.tuso * ps2.mauso + ps2.tuso * ps1.mauso;
        int ms;
        if(ps1.mauso == ps2.mauso){
            ms = ps1.mauso;
        }else {
         ms = ps1.mauso * ps2.mauso;
        }
        PhanSo psKetqua = new PhanSo();
        psKetqua.setTuso(ts);
        psKetqua.setMauso(ms);
        return psKetqua;
    }
    public static PhanSo truPhanSo(PhanSo ps1, PhanSo ps2){
        int ts = ps1.tuso * ps2.mauso - ps2.tuso * ps1.mauso;
        int ms;
        if(ps1.mauso == ps2.mauso){
            ms = ps1.mauso;
        }else {
            ms = ps1.mauso * ps2.mauso;
        }
        PhanSo psKetqua = new PhanSo();
        psKetqua.setTuso(ts);
        psKetqua.setMauso(ms);
        return psKetqua;
    }
    public static PhanSo tichPhanSo(PhanSo ps1, PhanSo ps2) {
        int ts = ps1.tuso * ps2.tuso;
        int ms = ps1.mauso * ps2.mauso;
        PhanSo psKetqua = new PhanSo();
        psKetqua.setTuso(ts);
        psKetqua.setMauso(ms);
        return psKetqua;
    }
    public static PhanSo thuongPhanSo(PhanSo ps1, PhanSo ps2){
        int ts = ps1.tuso * ps2.mauso ;
        int ms = ps1.mauso * ps2.tuso;
        PhanSo psKetqua = new PhanSo();
        psKetqua.setTuso(ts);
        psKetqua.setMauso(ms);
        return psKetqua;
    }
}
