package HoaDonTienDien;

public class Main {
    public  static void main(String[] args){
        TienDienVN vn =new TienDienVN(01,"nguyen thi thuy","12/01/2022",200,"sinh hoat");
        vn.tienDien();
       TienDienNN nn = new TienDienNN(02,"nguyen van b","02/12/2020",200,"Nhat ban");
        nn.tienDienNuocNgoai();
    }
}
