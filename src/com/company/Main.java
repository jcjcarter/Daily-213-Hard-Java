package com.company;

public class Main {

    public static void main(String[] args) {

        int maxDiscrpancy = 0;
        for (int begin = 0; begin < args[0].length(); begin++) {
            for (int end = args[0].length(); end > begin ; end--) {
                for (int step = 1; step < end - begin; step++) {
                    String s = stepstring(args[0], begin, end, step);
                    int d = discrepancy(s);
                    if (d > maxDiscrpancy){
                        maxDiscrpancy = d;
                    }
                }
            }
        }
        System.out.println(maxDiscrpancy);
    }

    public static int count(String s, char c){
        int count = 0;
        for (char symbol : s.toCharArray()){
            if (symbol == c){
                count++;
            }
        }
        return count;
    }

    public static int discrepancy(String s){
        return Math.abs(count(s,'a') - count(s, 'b'));
    }

    public static String stepstring(String s, int begin, int end, int step){
        StringBuilder sb = new StringBuilder();
        for (int i = begin; i < end; i+= step) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
