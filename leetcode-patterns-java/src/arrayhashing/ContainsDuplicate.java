/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayhashing;

import java.util.HashSet;

/**
 *
 * @author Acer
 */
public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        //Sử dụng cấu trúc hash để quản lý các dữ liệu đã được nhập và chuỗi
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            //nếu trong chuỗi mà có ký tự đó rồi thì trả về true luôn
            if(seen.contains(nums[i])){
                return true;
            }
            //nếu không thì thêm giá trị đó vào và tiếp tục vòng lặp
            seen.add(nums[i]);
        }
        return false;
    }
}
