import java.util.*;

public class TwoSum {

    public static void find(int[] nums,int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int diff = target-nums[i];

            if(map.containsKey(diff)){
                System.out.println("Pair: "+nums[i]+" "+diff);
                return;
            }

            map.put(nums[i],i);
        }
    }

    public static void main(String[] args){

        int arr[]={300,200,500,100};

        find(arr,500);
    }
}
