package DanhBa;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("nguyen van a","098764632");
        pb.updatePhone("Tran van b","098764632","123456789");
        pb.insertPhone("nguyen thi c","07654321");
    }
}
