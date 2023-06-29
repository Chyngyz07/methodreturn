import java.util.Random;

public class Main {
    public static void main(String[] args) {
      int []c =new int[300];
      san(new int[300]);

    }
    static int san(int[]arr){
        Random ran =new Random();
        int san=0;
        for (int i = 0; i <= 4; i++) {
            arr = new int[]{ran.nextInt(0, 300)};
            san=arr[i];
            san++;
        }if(arr[san]/3==0){
            return san;
        }if(arr[san]/4==0){
            return san;
        }if(arr[san]/5==0){
            return san;
        }return san;
    }
}



