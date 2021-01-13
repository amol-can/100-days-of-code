package com.leetcode.ds.array;

public class StringChallenge {
    public static void main(String[] args) {
        //String result = StringChallenge("hellz*3");
        String result = StringChallenge("fun times!");
        System.out.println(result);
    }

    public static String StringChallenge(String str){
        char[] chars = str.toCharArray();
        StringBuffer sf=new StringBuffer();
        for(char c: chars) {
            char newChar;
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (c == 'z') {
                    newChar = 'a';
                }else
                    newChar = ++c;
                sf.append(newChar);
            }else{
                sf.append(c);
            }
        }
        System.out.println("Sequance: "+ sf);
        char[] alpha = sf.toString().toCharArray();
        StringBuffer finalString = new StringBuffer();

        for (char ch: alpha){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                finalString.append(Character.toUpperCase(ch));
            }else{
                finalString.append(ch);
            }
        }

        return finalString.toString();
    }
}
