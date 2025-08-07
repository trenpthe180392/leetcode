package slidingwindow;

import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;             // Con trỏ trái và phải cho cửa sổ trượt
        int maxLength = 0;                  // Biến lưu độ dài lớn nhất của chuỗi con hợp lệ
        HashSet<Character> seen = new HashSet<>(); // HashSet để lưu các ký tự đã xuất hiện trong cửa sổ

        // Duyệt từng ký tự bằng con trỏ phải
        while (right < s.length()) {
            char curr = s.charAt(right);    // Lấy ký tự tại vị trí right

            // Nếu ký tự chưa từng xuất hiện trong cửa sổ
            if (!seen.contains(curr)) {
                seen.add(curr);                             // Thêm ký tự vào cửa sổ (HashSet)
                maxLength = Math.max(maxLength, right - left + 1); // Cập nhật độ dài lớn nhất
                right++;                                    // Mở rộng cửa sổ về bên phải
            } else {
                // Nếu gặp ký tự trùng, thu hẹp cửa sổ từ bên trái
                seen.remove(s.charAt(left));                // Xóa ký tự tại con trỏ trái khỏi HashSet
                left++;                                     // Di chuyển con trỏ trái sang phải
            }
        }

        return maxLength; // Trả về độ dài chuỗi con không lặp dài nhất
    }
}
