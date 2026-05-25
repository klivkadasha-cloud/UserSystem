public class RegularUser extends User {

    public RegularUser(String name, int age) {
        super(name, age);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Type: Regular User");
    }
}
