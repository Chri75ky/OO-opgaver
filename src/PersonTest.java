public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("alex", 20);

        String name = person.getName();
        int age = person.getAge();


        System.out.println("your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println(person);

        person.hasBirthday();
        int age2 = person.getAge();
        System.out.println(person);
        System.out.println("Your age is: " + age2);

    }
}
