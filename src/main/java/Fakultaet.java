public class Fakultaet {
    public static void main(String[] args) {
        System.out.println(calculatefactorial(8));
        System.out.println(calculatefactorial(10));
    }

    public static int calculatefactorial(int n){
        int result = 1;
        if(n == 0 || n == 1){
            result = 1;
        }else{
            for (int i = 0; i<n-1; i++){
                result = result*(n-i);
            }
        }

        return result;
    }

    public static int calfactorial(int n){
        int result = 1;
        if(n == 0 || n == 1){
            result = 1;
        }else{
            int i = 0;
            while(i<n-1){
                result = result*(n-i);
                i++;
            }
        }

        return result;
    }
}
