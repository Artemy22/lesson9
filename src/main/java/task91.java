import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/*
1. Создать аннотацию, которая принимает параметры для метода.
Написать код, который вызовет метод, помеченный этой аннотацией, и передаст параметры аннотации в вызываемый метод.
 */

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Test {
    int a();

    int b();
}

class Multiply {
    @Test(a = 123, b = 456)
    static void myRes(int a, int b) {
        System.out.println(a * b);
    }
}

public class task91 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Multiply.class;
            Method method = cls.getDeclaredMethod("myRes", int.class, int.class);
            if (method.isAnnotationPresent(Test.class)) {

                Test ma = method.getAnnotation(Test.class);
                method.invoke(null, ma.a(), ma.b());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}