package Task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    @Writer( stringValue = "John", intValue = 12)
    private String firstName;
    @Writer( stringValue = "John", intValue = 12)
    private String secondName;
    @Writer( stringValue = "John", intValue = 12)
    private int age;




}
