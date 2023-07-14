public enum Grade {
    BRONZE(0.1),
    SILVER(0.2),
    GOLD(0.3);

    private final double discountRate;

    //생성자
    Grade(double discountRate) {
        this.discountRate = discountRate;
    }

    //getter
    public double getDiscountRate() {
        return discountRate;
    }
}
