package Taks1;

import Taks1.Date;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.FIELD)
public @interface Dates {
    Date[] value();
}
