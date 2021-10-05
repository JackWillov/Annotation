package Taks1;

import Taks1.Date;
import Taks1.Dates;

@Date(days = Date.day.SUNDAY, number = 4, month = Date.months.FEBRUARY, year = 2021, format = "01.10.2021")


public class Main {
    @Dates({
            @Date(days = Date.day.SUNDAY, number = 4, month = Date.months.FEBRUARY, year = 2021, format = "01.10.2021"),
            @Date(days = Date.day.WEDNESDAY, number = 6, month = Date.months.OCTOBER, year = 2020, format = "02.40.2024")
    })
    int a;


}