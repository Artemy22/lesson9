import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/*
"2. Написать класс TextContainer, который содержит в себе строку.
С помощью механизма аннотаций указать
1) в какой файл должен сохраниться текст
2) метод, который выполнит сохранение. Написать класс Saver,
который сохранит поле класса TextContainer в указанный файл."
 */

@Target(value=ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)
@interface testAnn {
    String name();
}

class Saver {

}

public class task91TextContainer {
    String newString = "Some string";
}
