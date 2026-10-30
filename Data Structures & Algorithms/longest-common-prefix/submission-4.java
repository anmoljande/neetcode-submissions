class Solution {
    public String longestCommonPrefix(String[] strs) {
        String smallestWord = Arrays.stream(strs).min(Comparator.comparing(String::length)).get();
        int j = 0;
        int commonPre = Integer.MAX_VALUE;
        for (int i = 1; i < strs.length; i++) {
            while (j < smallestWord.length() && strs[i].charAt(j) == smallestWord.charAt(j)) {
                j++;
            }
            commonPre = Math.min(commonPre, j);
            j = 0;
        }
        if(strs.length == 1){
            return strs[0];
        }
        return smallestWord.substring(0, commonPre);
    }
}