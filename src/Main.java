import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 세일 서비스 객체 생성
        SaleService saleService = new SaleService();

        // 고객 객체 생성
        Customer p1 = new WebUser("Son", Grade.GOLD, Payment.Dscount);
        Customer p2 = new MobileUser("KangIn", Grade.SILVER, Payment.Bonus);

        // 고객 리스트 생성, 추가
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new WebUser("Mac Allister", Grade.BRONZE, Payment.Bonus));
        customers.add(new MobileUser("Alvarez", Grade.GOLD, Payment.Dscount));

        // 고객 정보 조회 & 가격 계산
        int price = 10000;
        for (Customer customer : customers) {
            System.out.println("==============");
            saleService.PayMethod(price, customer);
        }

    }
}
