public class DscountMethod implements DiscountMethod {

    @Override
    public double applyDiscount(double amount, Customer customer) {
        return amount * (1 - customer.getGrade().getDiscountRate());
    }
}
