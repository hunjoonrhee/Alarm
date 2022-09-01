import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmTest {
    @Test
    void checkNumberPeopleTestforUnder30(){
        //GIVEN
        int n = 30;
        //WHEN
        String actual = Alarm.checkNumberPeople(n);
        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", actual);

    }

    @Test
    void checkNumberPeopleTestforUpper30(){
        //GIVEN
        int n = 31;
        //WHEN
        String actual = Alarm.checkNumberPeople(n);
        //THEN
        assertEquals("Zu viele Personen", actual);

    }

    @Test
    void defineAlarmLevelTestforRed(){
        //GIVEN
        String color = "rot";
        //WHEN
        String actual = Alarm.defineAlarmLevel(color);
        //THEN
        assertEquals("keine Personen erlaubt", actual);

    }
    @Test
    void defineAlarmLevelTestforYellow(){
        //GIVEN
        String color = "gelb";
        //WHEN
        String actual = Alarm.defineAlarmLevel(color);
        //THEN
        assertEquals("max. 30 Personen erlaubt", actual);

    }
    @Test
    void defineAlarmLevelTestforGreen(){
        //GIVEN
        String color = "grün";
        //WHEN
        String actual = Alarm.defineAlarmLevel(color);
        //THEN
        assertEquals("max. 60 Personen erlaubt", actual);

    }
}
