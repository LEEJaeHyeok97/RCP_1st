public class BonusMethod implements DiscountMethod {


    @Override
    public double applyDiscount(double amount, Customer customer) {
        double bonusPoint = amount * (customer.getGrade().getDiscountRate());
        customer.setBonusPoints(customer.getBonusPoints() + bonusPoint);
        return bonusPoint;
    }
}
