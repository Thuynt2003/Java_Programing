package HoaDonTienDien;

import java.util.ArrayList;

public class Main {
    public  static void main(String[] args){
        HoaDonTienDien vn = new HoaDonTienDien(01,"nguyen thi thuy","02/12/2020",200,"sinh hoat");
        vn.tienDien();
        HoaDonTienDien.HoaDonTienDienNuocNgoai nn = new HoaDonTienDien.HoaDonTienDienNuocNgoai(02,"nguyen van b","02/12/2020",200,"Nhat ban");
        nn.tienDienNuocNgoai();
    }
}
