package io.github.wwe.java.coding.lc0001;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { 7, 2, 4, 11, 12 };
		int target = 11;
		
		solution1(nums, target);

	}
	
	public static int[] solution1(int[] nums, int target) {
		int[] resutls = null;
		int i = 0;
		while ((i < (nums.length - 1)) && (resutls == null)) {
			//System.out.println(i);
			for (int j = i + 1; j < (nums.length); j++) {
				 //System.out.println(String.format("%d, %d", nums[i], nums[j]));
				if (target == (nums[i] + nums[j])) {
					resutls = new int[2];
					resutls[0] = i;
					resutls[1] = j;
					break;
				}
			}
			i++;
		}
		if (resutls != null) {
			System.out.println(String.format("Solution found! Indexes [%d, %d]", resutls[0], resutls[1]));
		} else {
			System.out.println("Solution not found!");
		}		
		return resutls;
	}


}
