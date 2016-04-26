package com.leetcode.oj;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {
	
	private static final Set<Character> vowels = new HashSet<>();
    static {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
    }
    
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (true) {
            while (left < right && !vowels.contains(chars[left])) left++;
            while (left < right && !vowels.contains(chars[right])) right--;
            if (left >= right)
                break;
            else
                swap(chars, left, right);
            left++;
            right--;
        }
        
        return new String(chars);
    }
    
    private static void swap(char[] chars, int i, int j) {
        chars[i] = (char)(chars[i] ^ chars[j]);
        chars[j] = (char)(chars[i] ^ chars[j]);
        chars[i] = (char)(chars[i] ^ chars[j]);
    }
    
    public static void main(String[] args) {
    	ReverseVowelsOfAString instance = new ReverseVowelsOfAString();
    	String s;
    	
    	s = "hello";
    	String result = instance.reverseVowels(s);
    	
    	System.out.println("result: " + result);
    	
    }

}
