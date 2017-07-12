import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Human {
    int amountOfHands() default 2;

    int amountOfLegs() default 2;

    int amountOfHeads() default 1;

    String DogName() default "Unnamed";
}

@Human(amountOfHands = 1, amountOfLegs = 4, amountOfHeads = 1, DogName = "Rocky")
//some class with unclear params
public class Clazz {
    int someValue1 = 1;
    int someValue2 = 4;
    int someValu3 = 1;
    String someString = "Rocky";

}
