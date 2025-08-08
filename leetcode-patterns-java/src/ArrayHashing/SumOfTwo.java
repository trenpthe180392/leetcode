/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayhashing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class SumOfTwo {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index
        
        //Dau tien truyen du lieu vao trong hash
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }
    
        for (int i = 0; i < nums.length; i++) {
            //thuc hien tim kiem so con lai
            int diff = target - nums[i];
            //neu ma trong hash chua key la so do va value khac voi i tuc la 2 so khac nhau
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }
}
