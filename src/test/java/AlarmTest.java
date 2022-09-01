import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmTest {
    @Test
    void checkNumberPeopleTestforAlarmLevelRed(){
        //GIVEN
        int n = 30;
        String color = "rot";
        //WHEN
        String actual = Alarm.checkNumberPeople(n, color);
        //THEN
        assertEquals("keine Personen erlaubt", actual);

    }

    @Test
    void checkNumberPeopleTestforAlarmLevelYellowAndUnder30(){
        //GIVEN
        int n = 30;
        String color = "gelb";
        //WHEN
        String actual = Alarm.checkNumberPeople(n, color);
        //THEN
        assertEquals("max. 30 Personen erlaubt. Maximale Personenzahl ist nicht überschritten.", actual);

    }

    @Test
    void checkNumberPeopleTestforAlarmLevelYellowAndUpper30(){
        //GIVEN
        int n = 31;
        String color = "gelb";
        //WHEN
        String actual = Alarm.checkNumberPeople(n, color);
        //THEN
        assertEquals("max. 30 Personen erlaubt. Zu viele Personen.", actual);

    }

    @Test
    void checkNumberPeopleTestforAlarmLevelGreenAndUnder60(){
        //GIVEN
        int n = 60;
        String color = "grün";
        //WHEN
        String actual = Alarm.checkNumberPeople(n, color);
        //THEN
        assertEquals("max. 60 Personen erlaubt. Maximale Personenzahl ist nicht überschritten.", actual);

    }

    @Test
    void checkNumberPeopleTestforAlarmLevelGreenAndUpper60(){
        //GIVEN
        int n = 61;
        String color = "grün";
        //WHEN
        String actual = Alarm.checkNumberPeople(n, color);
        //THEN
        assertEquals("max. 60 Personen erlaubt. Zu viele Personen.", actual);

    }


}
