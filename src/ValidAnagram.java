import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // Map<Character,Integer> sMap = new HashMap<>();
        // Map<Character,Integer> tMap = new HashMap<>();
        // for(int i = 0; i < s.length(); i++) {
        //     if(sMap.containsKey(s.charAt(i))) sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
        //     else sMap.put(s.charAt(i), 1);
        //     if(tMap.containsKey(t.charAt(i))) tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
        //     else tMap.put(t.charAt(i), 1);
        // }
        // for(Character k: sMap.keySet()) {
        //     if(!Objects.equals(sMap.get(k), tMap.get(k))) return false;
        // }
        // return true;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        s = String.valueOf(sArr);
        t = String.valueOf(tArr);

        return s.equals(t);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
