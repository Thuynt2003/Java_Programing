package HoaDonTienDien;


public class HoaDonTienDien {
    int maKhachHang;
    String name;
    String ngayXuatHoaDon;
    int soLuong;
    float thanhTien;
    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public HoaDonTienDien(int maKhachHang, String name, String ngayXuatHoaDon, int soLuong ) {
        this.maKhachHang = maKhachHang;
        this.name = name;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
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
}
