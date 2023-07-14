public abstract class Customer {
    private String name;
    private Grade grade;
    private Payment discountMethod;
    private double bonusPoints;

    public double getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(double bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public Customer(String name, Grade grade, Payment discountMethod) {
        this.name = name;
        this.grade = grade;
        this.discountMethod = discountMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Payment getDiscountMethod() {
        return discountMethod;
    }

    public void setDiscountMethod(Payment discountMethod) {
        this.discountMethod = discountMethod;
    }


    // 유저 정보 출력 메소드
    public abstract void printUserInfo();

    //동일 객체인지 비교
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else return false;
    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }



}
