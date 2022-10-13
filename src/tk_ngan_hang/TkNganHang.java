package tk_ngan_hang;

public class TkNganHang {
    String id;
    String name;
    int balance;
    public TkNganHang(){
    }

    public TkNganHang(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void  tk(){
        System.out.println( "So du tai khoan :"+ getBalance());
    }
    public TkNganHang credit(int amount){
        TkNganHang cr = new TkNganHang();
        if(balance>0){
        cr.balance =this.getBalance() + amount;
        cr.tk();
        }
        return cr;
    }
    public TkNganHang debit(int amount){
        TkNganHang db = new TkNganHang();
        if(balance<amount){
            System.out.println("Thanh Toan Khong thanh Cong");
        }else {
            db.balance = this.getBalance() - amount;
            db.tk();
        }
        return db;
    }

    public TkNganHang tranferTo(TkNganHang tk2, int amount) {
       TkNganHang ck = new TkNganHang();
       if(this.balance<amount){
           System.out.println("Chuyen tien khong thanh cong");
       }else {
           ck.balance = tk2.balance +amount;
           this.balance = this.balance - amount;
           System.out.println("so du tai khoan " + tk2.getId()+ " hien tai: " + ck.balance);
           System.out.println("so du tai khoan " + getId()+ " hien tai: " + this.balance);
       }

        return ck;
    }

    {

    }

}
