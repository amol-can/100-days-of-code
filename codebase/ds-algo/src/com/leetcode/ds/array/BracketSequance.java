package com.leetcode.ds.array;

import java.util.List;

public class BracketSequance {
    public static void main(String[] args) {
        //String result = searchChallenge("(c(oder)) b(yte)");
        String result = searchChallenge("(coder)(byte))");
        System.out.println(result);
    }

    public static String searchChallenge(String str){
        int startCounter = 0;
        int endCounter = 0;
        char[] chars = str.toCharArray();
        for (char ch: chars ) {
            if (ch == '('){
                startCounter = startCounter+1;
            }
            if (ch == ')'){
                endCounter = endCounter+1;
            }
        }
        if (startCounter == endCounter){
            return "1";
        }
        return "0";
    }

}
