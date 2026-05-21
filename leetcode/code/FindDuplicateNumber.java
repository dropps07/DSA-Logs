package leetcode.code;

class Solution{
    public int FindDuplicateNumber(int[] nums){
        int slow=0;
        int fast =0;
        do{
            slow= nums[slow];  //floyd's repitetion check.
            fast = nums[nums[fast]];
        }while(slow!=fast);

        slow=0;
        while(slow!=fast){   //warshalls cycle detection.
            slow= nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}