public class Main {
    public static void main(String[] args) {
        Mammals ObjectA = new Mammals("Ivan", 10, ColorEnum.black);
        Dog ObjectB = new Dog("Belka", 4, ColorEnum.blue);
        Dog ObjectC = new Dog("Strelka", 5, ColorEnum.brown);

        System.out.println(ObjectA.toString());
        System.out.println(ObjectB.toString());
        System.out.println(ObjectC.toString());

        ObjectA.say();
        ObjectB.say("Hello!");
        ObjectC.say(ObjectA.getName(), ObjectA.getAge());

        ObjectA.drinkMilk();
        ObjectB.drinkMilk();
    }
}
