public class SaleService {
    DscountMethod dscountMethod = new DscountMethod();
    BonusMethod bonusMethod = new BonusMethod();

    public void PayMethod(double price, Customer customer) {
        customer.printUserInfo();
        if (customer.getDiscountMethod() == Payment.Dscount) {
            System.out.println("결제 방식: 할인 결제 방식");
            System.out.println("결제 금액: " + dscountMethod.applyDiscount(price, customer));
        } else if (customer.getDiscountMethod() == Payment.Bonus) {
            System.out.println("결제 방식: 보너스 결제 방식");
            System.out.println("보너스: " + bonusMethod.applyDiscount(price, customer));
            System.out.println("결제 금액: " + price);
        }
    }
}
