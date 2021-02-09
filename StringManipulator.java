public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        String together = a.trim() + b.trim();
        return together;
    }
    public Integer getIndexOrNull(String word, String letter) {
        if(word.indexOf(letter) < 0) {
            return null;
        }
        return word.indexOf(letter);
    }
    public String concatSubstring(String a, int b, int c, String d) {
        return a.substring(b,c) +  d;
    }

}