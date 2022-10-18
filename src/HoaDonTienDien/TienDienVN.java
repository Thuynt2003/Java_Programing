package HoaDonTienDien;

public class TienDienVN extends HoaDonTienDien{
        String doiTuongKhachHang;

        public TienDienVN(int maKhachHang, String name, String ngayXuatHoaDon, int soLuong ,String doiTuongKhachHang) {
            super(maKhachHang,name,ngayXuatHoaDon,soLuong);
            this.doiTuongKhachHang = doiTuongKhachHang;

        }
        public String getDoiTuongKhachHang() {
            return doiTuongKhachHang;
        }

        public void setDoiTuongKhachHang(String doiTuongKhachHang) {
            this.doiTuongKhachHang = doiTuongKhachHang;
        }

        public float tienDien(){
            if(soLuong<=50){
                thanhTien = soLuong*1000;
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
}
