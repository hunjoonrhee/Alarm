import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmTest {
    @Test
    void checkNumberPeopleTestforUnder30(){
        //GIVEN
        int n = 29;
        //WHEN
        String actual = Alarm.checkNumberPeople(n);
        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", actual);

    }

    @Test
    void checkNumberPeopleTestforUpper30(){
        //GIVEN
        int n = 30;
        //WHEN
        String actual = Alarm.checkNumberPeople(n);
        //THEN
        assertEquals("Zu viele Personen", actual);

    }
}
