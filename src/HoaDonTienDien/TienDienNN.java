package HoaDonTienDien;

public class TienDienNN extends HoaDonTienDien {
        String quocTich;

        public TienDienNN(int maKhachHang, String name,String ngayXuatHoaDon, int soLuong,String quocTich ){
            super(maKhachHang,name,ngayXuatHoaDon,soLuong);
            this.quocTich = quocTich;
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
