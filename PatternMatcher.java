import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatcher {
    public static void main(String[] args) {
        // This file is a reminder of pattern and matcher
        Pattern p = Pattern.compile("Yakob", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Big G, Yakob");
        boolean matchFound = m.find();
        if(matchFound){
            System.out.println("Match Found");
        }else{
            System.out.println("Match not found");
        }
    }
}
