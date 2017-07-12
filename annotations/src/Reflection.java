public class Reflection {
    public static void main(String[] args) {
        Class<Clazz> reflectionOfClazz = Clazz.class;
        Human annotation = reflectionOfClazz.getAnnotation(Human.class);
        System.out.println("Person have: Hands= " + annotation.amountOfHands() +
                "\nHead=" + annotation.amountOfHeads() + "\nLegs: " + annotation.amountOfLegs() + "\ndog with name: " + annotation.DogName());

    }
}
