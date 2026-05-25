public class Admin extends User {
    private String role;

    public Admin(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Role: " + role);
    }
}
