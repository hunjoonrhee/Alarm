public class Alarm {
    public static void main(String[] args) {
        int nPeople = 60;
        String alarmlevel = "gelb";
        System.out.println(checkNumberPeople(nPeople, alarmlevel));

    }

    public static String checkNumberPeople(int n, String alarmlevel){
        String Message = null;
        switch (alarmlevel){
            case "rot":
                Message = "keine Personen erlaubt";
            break;
            case "gelb":
                if(n>30){
                Message = "max. 30 Personen erlaubt. Zu viele Personen.";
                } else{
                    Message = "max. 30 Personen erlaubt. Maximale Personenzahl ist nicht überschritten.";
                }
            break;
            case "grün":
                if(n>60){
                    Message = "max. 60 Personen erlaubt. Zu viele Personen.";
                } else{
                    Message = "max. 60 Personen erlaubt. Maximale Personenzahl ist nicht überschritten.";
                }
        }
        return Message;
    }
}
