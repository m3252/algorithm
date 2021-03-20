package leetcode;

import java.util.HashMap;
import java.util.Map;


public class SingleNumber {
//
    public static void main(String[] args) {
        singleNumber(new int[]{1, 2, 2, 3, 3});
    }

    public static void singleNumber(int[] nums) {

        HashMap<Integer, Integer> temp = new HashMap<>();
        int count =0;

        for(int i=0; i<nums.length; i++){
            if(temp.get(nums[i]) != null){
                temp.put(nums[i], temp.get(nums[i]) + 1);
            }else{
                temp.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
