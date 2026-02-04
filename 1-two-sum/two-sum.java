class Solution {
    public int[] twoSum(int[] nums, int target) {
        
HashMap<Integer,Integer> seen= new HashMap<>();

for(int i=0;i<nums.length;i++){
  int compliment= target-nums[i];
  if(seen.containsKey(compliment)){
    return new int[] {seen.get(compliment),i};
   
  }else{
    seen.put(nums[i],i);
  }

}
return new int[] {};

    }
    public static void main(String[] args){
        Solution s=new Solution();
        int[] result1=s.twoSum(new int[]{2,7,11,15},9);
        System.out.println("["+result1[0]+","+ result1[1]+"]");
    }
}