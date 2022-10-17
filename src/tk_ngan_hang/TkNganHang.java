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
    public int credit(int amount){
        if(balance>0){
            int a =this.getBalance() + amount;
           setBalance(a);
        }
        return 0;
    }
    public int debit(int amount){
        if(balance<amount){
            System.out.println("Thanh Toan Khong thanh Cong");
        }else {
            int b = this.getBalance() - amount;
           setBalance(b);
        }
        return 0;
    }

    public float tranferTo(TkNganHang tk2, int amount) {
       if(balance<amount){
           System.out.println("Chuyen tien khong thanh cong");
       }else {
           tk2.balance  +=  amount;
           this.balance -= amount;
           System.out.println("so du tai khoan " + tk2.getId()+ " hien tai: " + tk2.balance);
           System.out.println("so du tai khoan " + getId()+ " hien tai: " + this.balance);
       }

        return 0;
    }

    {

    }

}
