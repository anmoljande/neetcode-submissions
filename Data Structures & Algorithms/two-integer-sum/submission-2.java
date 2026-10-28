class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> numMapping = new HashMap<>();
        for (int index = 0; index < numbers.length; index++) {
            int diff = (target - numbers[index]);
            if (numMapping.containsKey(diff)) {
                return new int[] {numMapping.get(diff), index};
            } else {
                numMapping.put(numbers[index], index);
            }
        }
        return new int[] {};
    }
}
