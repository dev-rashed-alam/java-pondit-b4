package class21;

import java.lang.reflect.Field;

public class AnnotationTest {
    @BookInfo(bookName = "Spring in Action", author = "Craig Walls", isbn = "978-1617294945", publisher = "Manning")
    public String springInAction;

    public static void main(String[] args) throws NoSuchFieldException {
        Field field = AnnotationTest.class.getDeclaredField("springInAction");
        field.setAccessible(true);

        BookInfo bookInfo = (BookInfo) field.getAnnotations()[0];
        System.out.println(bookInfo.bookName());
    }
}
