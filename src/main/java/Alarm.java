public class Alarm {
    public static void main(String[] args) {
        int nPeople = 31;
        System.out.println(checkNumberPeople(nPeople));
    }

    public static String checkNumberPeople(int n){
        String result = null;
        if (n>30){
            result = "Zu viele Personen";
            return result;
        }else{
            result = "Maximale Personenzahl nicht überschritten";
            return result;
        }
    }

    public static String defineAlarmLevel(String color){
        String Message = null;
        switch(color){
            case "rot":
                Message = "keine Personen erlaubt";
            break;
            case "gelb":
                Message = "max. 30 Personen erlaubt";
            break;
            case "grün":
                Message = "max. 60 Personen erlaubt";
            break;
        }
        return Message;
    }
}
