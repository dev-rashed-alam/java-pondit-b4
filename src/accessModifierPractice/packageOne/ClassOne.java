package accessModifierPractice.packageOne;

public class ClassOne {
    static void defaultMethod() {
        System.out.println("Message from class one default method");
    }

    private static void privateMethod() {
        System.out.println("Message from class one private method");
    }

    public static void publicMethod() {
        System.out.println("Message from class one public method");
    }

    protected static void protectedMethod() {
        System.out.println("Message from class one protected method");
    }
}
