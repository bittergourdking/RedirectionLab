public class PigLatin {
  public static String pigLatinSimple(String s) {
    String answer = "";
    s.toLowerCase();
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e'
    || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
      answer = s + "hay";
    } else {
      answer = s.substring(1) + s.substring(0, 1) + "ay";
    }
    return answer;
  }

  public static String pigLatin(String s) {
    s.toLowerCase();
    String[] digraph = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl",
    "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh",
    "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (s.length() > 1) {
      for (int i = 0; i < digraph.length; i++) {
        if (s.substring(0, 2).equals(digraph[i])) {
          return s.substring(2) + s.substring(0, 2) + "ay";
        }
      }
    }
    return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s) {
    String answer = "";
    s.toLowerCase();
    return answer;
  }

  public static void main(String[]args) {

  }
}
