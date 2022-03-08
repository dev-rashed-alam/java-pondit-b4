package genericsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsExample {

    /**
     * Generics is a java feature which is used for reducing bugs and adding an extra layer of abstraction over types.
     * Basically it is used for compile time type safety and if we use generics we don't need explicit type casting.
     * <p>
     * Generics do not support covariant return type. For that we need to use Unbound and bound wild card.
     * Question mark (?) symbol represent wild card.
     * <p>
     * When we use ? mark inside diamond head it's called unbound wild card (<?>).
     * In unbound wild card there is no fixed type we can use any kind of type but which extend Object class.
     * <p>
     * Bound wild card divides into two types upper bound and lowe bound.
     * Upper bound means an unknown type will extend a known type (<? extend Number>)
     * In place of question mark there will be any subclass of Number class.
     * <p>
     * Lower bound means an unknown type will be supper class of a known class (<? supper Integer>)
     * In place of question mark any supper class will allow of Integer class.
     **/

    static void unBound(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    static void upperBound(List<? extends Number> list) {
        for (Number item : list) {
            System.out.println(item);
        }
    }

    static void lowerBound(List<? super Integer> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        System.out.println("========Unbound Example=======");
        unBound(intList);
        System.out.println("========Upper bound Example=======");
        upperBound(intList);
        System.out.println("========Lower bound Example=======");
        lowerBound(intList);
    }
}
