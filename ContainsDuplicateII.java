import java.util.*;
class ContainsDuplicateII{
    public static boolean isContain(int[] nums, int n){
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int prevIndex = hm.get(nums[i]);
                if(i-prevIndex <= n){
                    return true;
                }
            }
            hm.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(isContain(nums,k));
    }
}