public class MobileUser extends Customer{
    public MobileUser(String name, Grade grade, Payment discountMethod) {
        super(name, grade, discountMethod);
    }


    @Override
    public void printUserInfo() {
        System.out.println("접속 경로: 웹");
        System.out.println("이름: " + getName());
        System.out.println("등급: " + getGrade());
    }
}
