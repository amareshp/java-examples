package com.amareshp.string;

import java.util.*;

/**
 * input = "abcZdeaYabddefXddlkXmnoqYxxymZddxYmmghXxxmnZddopXZYabrty"
 * Find the shortest substring that has the characters X, Y and Z. Order of these characters does not matter
 */
public class FindSubstringHavingKeys {
    public static String shortestSubstringHavingKeys(String input, Set<Character> keys) {
        char[] inputArr = input.toCharArray();
        String shortestSubstr = null;
        String result = null;
        Map<Character, Integer> keyIndex = new HashMap<>();
        TreeMap<Integer, Character> indexKey = new TreeMap<>();
        System.out.println("Keys: " + collectionToStr(keys, ","));
        for(int i = 0; i < inputArr.length; i++) {
            Character currentChar = inputArr[i];
            if(keys.contains(currentChar)) {
                if(keyIndex.containsKey(currentChar)) {
                    Integer index = keyIndex.get(currentChar);
                    indexKey.remove(index);
                }
                keyIndex.put(currentChar, i);
                indexKey.put(i, currentChar);
                if(indexKey.size() == keys.size()) {
                    int firstIndex = indexKey.firstKey();
                    int lastIndex = indexKey.lastKey();
                    result = input.substring(firstIndex, (lastIndex+1));
                    System.out.println(result);
                    if(shortestSubstr == null || result.length() < shortestSubstr.length()) {
                        shortestSubstr = result;
                    }
                    Integer leftIndex = indexKey.firstKey();
                    Character leftChar = indexKey.firstEntry().getValue();
                    indexKey.remove(leftIndex);
                    keyIndex.remove(leftChar);
                }
            }
        }

        System.out.println("Shortest substring: " + shortestSubstr);
        return shortestSubstr;
    }

    public static void main(String[] args) {
        Set<Character> keys = new HashSet<>();
        keys.add('X');
        keys.add('Y');
        keys.add('Z');
        String result = shortestSubstringHavingKeys("abcZdeaYabddefXddlkXmnoqYxxymZddxYmmghXxxmnZddopXZYabrty", keys);
        System.out.println("Result: " + result);
    }

    public static <T> String collectionToStr(Collection<T> collection, String separator) {
        StringBuilder stringBuilder = new StringBuilder();
        for(T element : collection) {
            stringBuilder.append(element.toString() + separator);
        }
        String result = stringBuilder.toString();
        if(result != null && result.length() > 1) {
            result = result.substring(0, (result.length()-1) );
        }
        return result;
    }
}
