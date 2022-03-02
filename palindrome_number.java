class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int copy = 0, y = x;
        while (x > 0) {
            copy = copy * 10 + x%10;
            x /= 10;
        }
        if (y == copy) {
            return true;
        } else {
            return false;
        }
    }
}
