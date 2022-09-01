public class Alarm {
    public static void main(String[] args) {
        int nPeople = 31;
        System.out.println(checkNumberPeople(nPeople));
    }

    public static String checkNumberPeople(int n){
        String result = null;
        if (n>=30){
            result = "Zu viele Personen";
            return result;
        }else{
            result = "Maximale Personenzahl nicht überschritten";
            return result;
        }
    }
}
