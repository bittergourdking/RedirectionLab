import java.util.*;
public class PigLatin {
  public static String pigLatinSimple(String s) {
    String lowerS = s.toLowerCase();
    if (lowerS.charAt(0) == 'a' || lowerS.charAt(0) == 'e'
    || lowerS.charAt(0) == 'i' || lowerS.charAt(0) == 'o' || lowerS.charAt(0) == 'u') {
      return lowerS + "hay";
    } else {
      return lowerS.substring(1) + lowerS.substring(0, 1) + "ay";
    }
  }

  public static String pigLatin(String s) {
    String lowerS = s.toLowerCase();
    String[] digraph = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl",
    "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh",
    "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (lowerS.length() > 1) {
      for (int i = 0; i < digraph.length; i++) {
        if (lowerS.substring(0, 2).equals(digraph[i])) {
          return lowerS.substring(2) + lowerS.substring(0, 2) + "ay";
        }
      }
    }
    return pigLatinSimple(lowerS);
  }

  public static String pigLatinBest(String s) {
    String lowerS = s.toLowerCase();
    if (Character.isLetter(lowerS.charAt(0))) {
      if (Character.isLetter(lowerS.charAt(lowerS.length() - 1))
      || Character.isDigit(lowerS.charAt(lowerS.length() - 1))) {
        return pigLatin(lowerS);
      } else {
        String punc = lowerS.substring(lowerS.length() - 1);
        s = pigLatin(lowerS.substring(0, lowerS.length() - 1));
        return s + punc;
      }
    } else {
      return lowerS;
    }
  }

  public static void main(String[]args) {
    Scanner n = new Scanner( System.in );
    while (n.hasNextLine()) {
      Scanner o = new Scanner ( n.nextLine() );
      while (o.hasNext()) {
        System.out.print(pigLatinBest(o.next()));
        if (o.hasNext()) {
          System.out.print(" ");
        }
      }
      if (n.hasNextLine()) {
        System.out.println();
      }
    }
  }
}
