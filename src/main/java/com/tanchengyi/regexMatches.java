package com.tanchengyi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexMatches {
    public boolean isMatch(String pattern, String link) {

        Pattern p = Pattern.compile(pattern);   // the pattern to search for
        Matcher m = p.matcher(link);

        if (m.find())
            return true;
        else
            return false;
    }
}
