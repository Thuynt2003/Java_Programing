package HoaDonTienDien;


public class HoaDonTienDien {
     int maKhachHang;
     String name;
     String ngayXuatHoaDon;
     String doiTuongKhachHang;
     int soLuong;
    float thanhTien;
    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public HoaDonTienDien(int maKhachHang, String name, String ngayXuatHoaDon, int soLuong ,String doiTuongKhachHang) {
        this.maKhachHang = maKhachHang;
        this.name = name;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soLuong = soLuong;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayXuatHoaDon() {
        return ngayXuatHoaDon;
    }

    public void setNgayXuatHoaDon(String ngayXuatHoaDon) {
        this.ngayXuatHoaDon = ngayXuatHoaDon;
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float tienDien(){
        if(soLuong<=50){
            thanhTien = getSoLuong()*1000;
        }else if (soLuong>50 && soLuong<=100){
            thanhTien = 50*1000 + (soLuong - 50 )*1200;
        }else if (soLuong>100 && soLuong <=200){
            thanhTien = 50*1000+50*1200+(soLuong-100)*1500;
        }else if (soLuong >200){
            thanhTien = 50*1000+50*1200+100*1500+(soLuong-200)*2000;
        }
        System.out.println("tien dien can tra la :"+thanhTien);
        return 0;
    }
    public static class HoaDonTienDienNuocNgoai extends HoaDonTienDien{
        String quocTich;

        public HoaDonTienDienNuocNgoai(int maKhachHang, String name,String ngayXuatHoaDon, int soLuong,String quocTich ){
            super(maKhachHang,name,ngayXuatHoaDon,soLuong,quocTich);
            this.quocTich = quocTich;
//            this.soLuong = soLuong;
        }

        public String getQuocTich() {
            return quocTich;
        }

        public void setQuocTich(String quocTich) {
            this.quocTich = quocTich;
        }
        public  float  tienDienNuocNgoai(){
            thanhTien= soLuong*2000;
            System.out.println("tien dien can tra la :"+thanhTien);
            return thanhTien;
        }
    }

}
