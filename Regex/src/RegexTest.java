import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String url = "/ur123laddress/url-addr44ess/u3rl_addr5543ess";
        Pattern pattern = Pattern.compile("[/[a-z0-9]+[-|_]?[0-9a-z]+]+");
        Matcher matcher = pattern.matcher(url);
        while (matcher.find()) {
            System.out.println(matcher.group());;
        }
    }
}
