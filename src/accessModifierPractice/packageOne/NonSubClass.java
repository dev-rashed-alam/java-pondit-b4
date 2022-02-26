package accessModifierPractice.packageOne;

public class NonSubClass {
    public static void main(String[] args) {
        ClassOne.defaultMethod();
        ClassOne.protectedMethod();
        ClassOne.publicMethod();
    }
}
