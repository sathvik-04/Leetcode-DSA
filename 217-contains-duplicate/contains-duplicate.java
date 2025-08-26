class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet <Integer> storage=new  HashSet<>();

        for(int num:nums){
            if(storage.contains(num)){
                return true;
            }
            storage.add(num);
        }
        return false;
    }
}