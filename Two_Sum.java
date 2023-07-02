/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.ArrayList;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        ArrayList<Integer> ansList = new ArrayList<>(10);

        for (int i = 0; i < nums.length; i++) {
            
            for (int j = i + 1; j < nums.length; j++) {
                int sum = 0;
                sum += nums[i] + nums[j];
                if (sum == target) {
                    ansList.add(i);
                    ansList.add(j);
                }
            }
        }

        int size = ansList.size();
        int[] ans = new int[size];

        // Converting list to array
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        System.out.println(ans);
    }
}
