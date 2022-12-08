public class Animal {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void voice(){
        System.out.println("Бип буб биб бам");
    }


}