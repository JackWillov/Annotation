package Task2;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
public class SecondTaskMain {

    @SneakyThrows
    public static void main(String[] args) {
        User user = new User();
        giveName(user);
        System.out.println(user.getFirstName());
        System.out.println(user.getSecondName());
        System.out.println(user.getAge());

    }
    @SneakyThrows
    public static void giveName(User user){
        Field[] fields = user.getClass().getDeclaredFields();
        for (Field field : fields) {
            Writer writer = user.getClass().getAnnotation(Writer.class);
            field.setAccessible(true);
            if (field.getType() == int.class){
                field.set(user, writer.intValue());
            } else {
                field.set(user, writer.stringValue() );
            }

        }
        }


    }



