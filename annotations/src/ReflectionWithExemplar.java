public class ReflectionWithExemplar {
    public static void main(String[] args) {
        Clazz clazz = new Clazz();
        Class reflectionOfClazz = clazz.getClass();
        System.out.println("Person have: Hands= " + ((Human) reflectionOfClazz.getAnnotation(Human.class)).amountOfHands());
        System.out.println("\nLegs: " + ((Human) reflectionOfClazz.getAnnotation(Human.class)).amountOfLegs());
        System.out.println("\nHead=" + ((Human) reflectionOfClazz.getAnnotation(Human.class)).amountOfHeads());
        System.out.println("\ndog with name: " + ((Human) reflectionOfClazz.getAnnotation(Human.class)).DogName());
    }


}
