class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dups =  new HashSet<Integer>();
        for( int num : nums) {
            dups.add(num);
        }
        //System.out.println(nums.length);
        return dups.size() != nums.length;
    }
}