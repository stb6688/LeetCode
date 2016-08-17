package com.leetcode.oj;

import java.util.Arrays;

public abstract class WiggleSortII {
	public abstract void wiggleSort(int[] nums);
	public static void main(String[] args) {
		WiggleSortII instance = new SolutionIII();
		int[] nums;
		
//		nums = new int[]{1,5,1,1,6,4}; // [1, 5, 1, 6, 1, 4]
		
		nums = new int[]{1,3,2,2,3,1};
		
//		nums = new int[]{3,7,7,8,3,8,8,9,3,5,3,8,8,8,4,1,9,6,4,10,5,4,9,2,5,10,5,9,8,8,1,9,4,1,1,7,3,8,4,8,4,7,8,5,10,2,9,5,7,4,5,6,9,10,3,5,3,2,3,1,8,4,10,1,6,7,6,5,5,10,5,3,5,5,10,7,9,5,5,4,2,2,2,3,3,5,6,8,9,5,4,1,4,10,7,1,6,4,6,10,3,2,3,1,2,3,9,9,2,6,7,4,10,4,3,8,5,2,8,2,5,7,7,3,9,5,7,10,8,9,6,6,7,3,7,1,9,3,4,4,9,9,1,6,9,7,1,7,2,8,4,2,3,4,9,9,8,10,6,4,4,2,9,5,7,2,3,9,9,6,7,2,1,8,9,6,3,4,2,3,8,6,10,10,8,6,2,8,7,8,4,9,10,6,3,7,1,4,4,9,3,10,6,3,5,2,9,5,10,3,8,7,3,8,1,7,8,3,9,7,7,5,7,6,6,9,1,6,5,8,9,2,4,10,1,6,7,1,9,1,1,7,9,3,4,5,6,3,1,1,9,1,5,9,9,5,5,2,2,2,1,3,10,8,5,10,8,6,6,7,5,6,6,4,5,7,10,1,3,6,5,9,9,8,3,9,10,9,8,1,3,10,1,6,7,10,5,10,8,1,7,5,1,3,6,10,7,4,10,5,4,2,5,7,10,8,2,9,6,6,9,3,3,10,1,2,3,6,5,5,5,10,8,8,10,8,5,4,7,1,9,3,10,6,9,8,5,8,3,4,4,4,10,6,1,3,9,10,5,2,5,9,8,3,8,8,8,6,5,2,3,6,5,2,7,3,3,4,7,1,9,7,6,4,9,6,1,10,9,3,3,3,5,9,6,1,4,1,5,10,10,7,7,4,2,6,5,9,2,2,2,9,10,10,2,7,10,9,4,9,9,2,2,1,8,1,1,9,7,10,3,4,8,7,6,1,7,2,6,1,2,2,9,1,6,2,3,3,10,3,9,6,5,8,10,9,5,2,8,7,5,3,4,2,1,2,10,4,3,6,2,7,4,2,3,1,1,7,5,10,9,6,3,10,9,2,10,5,6,8,5,5,2,6,3,2,1,2,2,4,9,9,1,7,10,6,2,9,8,4,7,5,5,8,7,4,2,10,4,3,8,7,4,2,8,6,10,9,3,5,1,7,2,6,9,2,6,6,9,3,1,10,6,8,5,9,9,8,4,7,9,3,10,5,1,7,2,3,9,10,8,6,10,10,4,2,9,8,2,10,3,5,4,8,6,4,3,1,6,7,1,3,8,5,9,6,4,10,10,8,2,3,2,7,4,1,4,10,9,2,2,4,9,9,2,5,1,1,10,10,5,8,2,3,7,4,5,4,4,4,4,9,3,10,9,3,7,10,1,5,3,4,5,6,6,4,8,10,8,7,2,3,9,3,10,7,4,1,2,1,5,9,3,9,6,3,10,10,8,8,5,8,2,6,3,2,5,9,1,2,1,7,1,10,7,10,5,2,6,5,6,1,2,10,8,4,10,7,6,6,9,10,3,1,4,8,9,2,3,5,2,9,4,2,5,2,5,2,4,5,7,7,6,2,8,6,4,7,3,1,9,6,10,8,6,7,6,6,7,2,8,8,9,10,3,2,4,5,6,10,8,1,1,3,2,3,2,1,10,7,7,7,4,10,3,9,4,8,10,7,1,4,7,8,4,5,10,9,5,4,9,6,10,9,8,7,4,3,9,3,8,3,5,7,6,9,3,4,8,3,6,2,6,4,5,4,8,7,1,2,1,3,5,7,9,10,10,8,1,4,9,5,3,2,8,2,4,6,2,9,5,10,8,4,2,5,3,9,4,4,10,3,6,7,7,4,7,1,1,6,9,1,3,10,7,9,8,7,6,9,8,3,9,8,3,1,5,3,4,3,9,9,2,5,10,3,8,3,6,3,1,9,6,2,2,4,5,1,6,4,4,3,5,4,9,1,1,4,5,5,2,2,10,4,7,2,3,1,2,10,1,5,7,2,2,10,9,4,10,1,8,3,2,5,7,10,4,2,5,2,7,8,8,3,1,10,9,8,1,9,8,10,2,6,9,1,4,1,7,5,4,6,2,10,5,5,9,5,10,5,9,6,7,4,1,5,3,9,9,4,1,7,9,2,3,9,3,8,5,6,10,7,6,4,1,2,9,9,9,3,8,3,1,7,7,6,4,4,1,10,4,10,1,7,10,2,10,10,4,9,6,7,7,10,3,4,1,8,4,9,10,10,9,1,8,6,8,5,8,7};
		
		instance.wiggleSort(nums);
		System.out.println("result=" + Arrays.toString(nums));
	}
	
	
	static class SolutionIII extends WiggleSortII {
		public void wiggleSort(int[] nums) {
	        boolean peak = false;
	        for (int i = 0; i+1 < nums.length; i++) {
System.out.println("i=" + i);
System.out.println(Arrays.toString(nums));
if (i == 4)
	System.out.println();
	            if ((peak && nums[i] <= nums[i+1]) || (!peak && nums[i] >= nums[i+1])) {
	                int j = i+1;
	                for (; j < nums.length; j++) {
	                    if (peak && nums[i] > nums[j]) // search for num < curr
	                        break;
	                    else if (!peak && nums[i] < nums[j]) // search for num > curr
	                        break;
	                }
//System.out.println("i=" + i + ", j=" + j);
	                swap(nums, i+1, j);
	            }
	            peak ^= true;
	        }
	    }
	    
	    private void swap(int[] nums, int i, int j) {
	        if (i != j) {
	            nums[i] = nums[i] ^ nums[j];
	            nums[j] = nums[i] ^ nums[j];
	            nums[i] = nums[i] ^ nums[j];
	        }
	    }
	}
	
	
	static class SolutionII extends WiggleSortII {
		public void wiggleSort(int[] nums) {
	        Arrays.sort(nums);
	        int delta = (nums.length + 1)/2;
	        int[] result = new int[nums.length];
	        int l = 0, r = l + delta;
	        for (int i = 0; i < nums.length; i++) {
	            if (i % 2 == 0)
	            	result[i] = nums[l++];
	            else
	            	result[i] = nums[r++];
	        }
	        for (int i = 0; i < nums.length; nums[i] = result[i], i++);
	    }
	}
	
	
	// Solution I: TLE, Logic Correct
    // backtracking, time complexity is hard to tell, but could be ~ O(n^2).
    // sort nums
    // bt to lace num at idx: swap with some num on right.
    // modify & restore
	static class SolutionI extends WiggleSortII {
		public void wiggleSort(int[] nums) {
	        Arrays.sort(nums);
	        bt(nums, 0);
	    }
	    
	    private boolean bt(int[] nums, int idx) {
	        // termination
	        if (idx == nums.length)
	            return true;
	        for (int j = idx; j < nums.length; j++) {
	            if (idx - 1 >= 0 && ((idx%2 == 0 && nums[j] >= nums[idx-1]) || (idx%2 == 1 && nums[j] <= nums[idx-1])))
	                continue;
	            swap(nums, idx, j); // modify
	            if (bt(nums, idx+1))
	                return true;
	            swap(nums, idx, j); // restore
	        }
	        return false;
	    }
	    
	    private void swap(int[] nums, int l, int r) {
	        if (l != r) {
	            int tmp = nums[l];
	            nums[l] = nums[r];
	            nums[r] = tmp;
	        }
	    }
	}
}
