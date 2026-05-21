package leetcode.code;
//#approach 1 
class Solution{
    public int FindDuplicateNumber(int[] nums){
        int slow=0;
        int fast =0;
        do{
            slow= nums[slow];  //floyd's repetition check.
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

//#approach 2
class Solution {
    public int findDuplicate(int[] nums) {
        int left=0;
        int rigth=nums.length;
        while(left< rigth){
            int mid= left + (rigth-left)/2;
            int c=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    c++;
                }
            }
            if(c<=mid){
                left = mid+1;
            }else{
                rigth=mid;
            }
        }
        return left;
    }
}
