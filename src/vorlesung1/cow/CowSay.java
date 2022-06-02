package vorlesung1.cow;

import java.util.Arrays;

public class CowSay {
    public static void main(String[] args) {
        CowSay cs = new CowSay();
        System.out.println(cs.say(args[0]));
    }
    public final String image = """
                   \\   ^__^
                    \\  (oo)\\_______
                       (__)\\       )\\/\\
                           ||----w |
                           ||     ||
            """;
    public String say(String s) {

        return makeLabel(s) + "\n" + image;
    }

    protected String makeLabel(String s){
        int offset = 2;
        int length = s.length() +offset;

        var top = " " + "_".repeat(length);
        var text = "< " + s + " >";
        var bottom = " " + "-".repeat(length);

        return top + "\n" + text + "\n" + bottom;
    }
}
