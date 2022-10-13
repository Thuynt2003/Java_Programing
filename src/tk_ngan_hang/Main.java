package tk_ngan_hang;

public class Main {
    public static void main(String[] args) {
        TkNganHang tk = new TkNganHang("Th1", "nguyen thi thuy", 200);
        TkNganHang tk2 = new TkNganHang("Th2", "nguyen van b", 300);
        TkNganHang rt = tk.debit(10);
        TkNganHang nt = tk.credit(20);
        TkNganHang ck = tk.tranferTo(tk2,20);

    }

}
