public class WebUser extends Customer{
    public WebUser(String name, Grade grade, Payment discountMethod) {
        super(name, grade, discountMethod);
    }


    @Override
    public void printUserInfo() {
        System.out.println("접속 경로: 모바일");
        System.out.println("이름: " + getName());
        System.out.println("등급: " + getGrade());
    }
}
