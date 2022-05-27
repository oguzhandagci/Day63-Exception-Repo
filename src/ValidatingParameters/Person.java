package ValidatingParameters;

public class Person {
    public static void main(String[] args) {
        Person human = new Person("Ozzy", 33);
        System.out.println(human.getName());
        System.out.println(human.getAge());
    }

    private String name;
    private int age;

    public Person(String name, int age) {

        if (((!name.isBlank() || name.length() < 40)) && (age > 0 && age < 120)) {
            this.name = name;
            this.age = age;
        }
        else
            throw new IllegalArgumentException("Enter valid values");
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
