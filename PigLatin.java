public class PigLatin {
  public static String pigLatinSimple(String s) {
    String answer = "";
    s.toLowerCase();
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e'
    || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
      answer = s + "hay";
    } else {
      answer = s.substring(1, s.length()) + s.substring(0, 1) + "ay";
    }
    return answer;
  }

  public static String pigLatin(String s) {
    String answer = "";
    s.toLowerCase();
    return answer;
  }

  public static String pigLatinBest(String s) {
    String answer = "";
    s.toLowerCase();
    return answer;
  }

  public static void main(String[]args) {

  }
}
