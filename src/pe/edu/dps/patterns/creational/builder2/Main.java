package pe.edu.dps.patterns.creational.builder2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buider user");

        User user2 = new User(2, "jose");
        user2.setAge(15);
        user2.setPhone(124698);
        user2.setProfession("SE");

        User user = new UserBuilder().age(18).familyName("Flores").phone(9856422).name("Jose").build();
        User user3 = new UserBuilder().name("Jose").profession("Ingeniero").age(15).build();
        User user4 = new UserBuilder().name("Jose").familyName("Chura").age(20).build();




    }
}
