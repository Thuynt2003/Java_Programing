package lession_6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){//LocalDate lấy ngày tháng năm
        LocalDate ld = LocalDate.now(); //lấy ngày hiện tại
        System.out.println(ld.getMonthValue());
        LocalDate ld2 =LocalDate.of(2022 ,12,25); //tạo ngày cụ thể
        System.out.println(ld.plusMonths(1));//plus là cộng
        LocalDate ld3 = LocalDate.parse("2022-11-25");// lấy ra chuỗi định daạng ngày và giờ
        System.out.println(ld3);
        long c = ChronoUnit.DAYS.between(ld,ld3);//lấy khoảng cách giữa ngày
        System.out.println(c);

        //lấy ngày tháng năm+ giờ
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1.minusHours(1));//minus l trừ
        LocalDateTime t2 = LocalDateTime.of(2022,10,27,12,15);
        LocalDateTime t3 = LocalDateTime.parse("2022-10-27T14:45:38");
        System.out.println(t3);
    }
}
