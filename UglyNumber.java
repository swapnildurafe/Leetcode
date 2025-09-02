class UglyNumber{
    public static boolean findUgly(int n){
        if(n<1){
            return false;
        }
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            }
            else if(n % 5 == 0){
                n = n / 5;
            }
            else if(n % 3 == 0){
                n = n / 3;
            }
            else{
                break;
            }
        }
        if(n == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int n = 6;
        int m = 14;
        int l = 32;
        System.out.println(findUgly(n));
        System.out.println(findUgly(m));
        System.out.println(findUgly(l));
    }
}