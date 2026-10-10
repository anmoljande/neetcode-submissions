class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()== t.length()){
          String s1 =  Stream.of(s.split(""))
    .sorted()
    .collect(Collectors.joining()); 
    String t1 =  Stream.of(t.split(""))
    .sorted()
    .collect(Collectors.joining());
    return s1.equals(t1);
        }
        return false;

    }
}
