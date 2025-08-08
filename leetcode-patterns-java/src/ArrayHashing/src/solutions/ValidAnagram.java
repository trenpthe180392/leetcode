/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutions;

import java.util.HashMap;

/**
 *
 * @author Acer
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        //Neu 2 chuoi khong cung do dai
        if (s.length() != t.length()) {
            return false;
        }
        //Tao HashMap de xu li van de
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //Luc nay se day du lieu vao trong HashMap voi key la ky tu va value la se lay gia tri la 0 +1 neu khong ton tai ky tu va se tra ve gia tri value truoc do +1
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        //ta se thuc hien so sanh key va valua cua hashmap
        return countS.equals(countT);
    }
}
