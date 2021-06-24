import java.util.Arrays;

public class Main {
    public static int[] arr = new int[13];
    static int c = 0;
    static void f(int index){
        if(index == 13){
            int h1 = arr[1] + arr[3] + arr[6] + arr[8];
            int h2 = arr[8] + arr[9] + arr[10] + arr[11];
            int h3 = arr[1] + arr[4] + arr[7] + arr[11];
            int h4 = arr[2] + arr[3] + arr[4] + arr[5];
            int h5 = arr[2] + arr[6] + arr[9] + arr[12];
            int h6 = arr[5] + arr[7] + arr[10] + arr[12];
            if (isSame(h1,h2,h3,h4,h5,h6)){
                System.out.println(Arrays.toString(arr));
                c++;
            }
            return;
        }
        for(int i = 1;i<=12;i++){
            if(!isContains(i)){
                arr[index] = i;
                f(index+1);
                arr[index] = 0;
            }
        }
    }
    public static void main(String[] args) {
        f(1);
        System.out.println(c);
    }
    static boolean isContains(int integer){
        for (int i : arr) {
            if(i == integer)return true;
        }return false;
    }
    static boolean isSame(int... test){
        int m = test[0];
        for (int i : test) {
            if(m != i)return false;
        }
        return true;
    }
}
