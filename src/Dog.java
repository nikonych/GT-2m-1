final public class Dog extends Mammals {


    @Override
    void drinkMilk(){
        System.out.println("Dog drinks milk");
    }

    public Dog(String name, int age, ColorEnum color) {
        super(name, age, color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name=" + getName() +
                " Age=" + getAge() +
                " EyeColor=" + getEyeColor() +
                "}";
    }


}