package edu.MeikTranel.AssignmentFX;

/**
 * @author meiktranel
 */
public class StringUtils {
    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }
}
