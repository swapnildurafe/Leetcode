import java.util.*;
class Convert{
    public static boolean isValid(int num){
        while(num > 0){
            if(num % 10 == 0) return false;
            num = num / 10;
        }
        return true;
    }

    public static int[] check(int n){
        for(int i=1;i<n;i++){
            int j = n - i;
            if(isValid(i) && isValid(j)){
                return new int[] {i,j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int n = 21;
        System.out.println(Arrays.toString(check(n)));
        int m = 290;
        System.out.println(Arrays.toString(check(m)));
    }
}