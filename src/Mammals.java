public class Mammals extends Animal{


    private ColorEnum eyeColor;

    public Mammals(String name, int age, ColorEnum color) {
        super(name, age);
        this.eyeColor = color;
    }

    public ColorEnum getEyeColor() {
        return eyeColor;
    }

    public void say(){
        System.out.println("The World!!!");
    }

    public void say(String word){
        System.out.println(word);
    }

    final public void say(String name, int age){
        System.out.println(name + " " + age);
    }


    void drinkMilk(){
        System.out.println("Drink Milk");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "eyeColor=" + eyeColor +
                " name=" + getName() +
                " age=" + getAge() +
                '}';
    }
}