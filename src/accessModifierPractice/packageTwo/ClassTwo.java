package accessModifierPractice.packageTwo;

import accessModifierPractice.packageOne.ClassOne;

public class ClassTwo extends ClassOne {
    public static void main(String[] args) {
        protectedMethod();
        publicMethod();
    }
}
