class Solution {
    public String restoreString(String s, int[] indices) {
        int size = indices.length;
        char[] sh = new char[size];
        for (int i=0; i<size; i++) {
            sh[indices[i]] = s.charAt(i);
        }
        return String.valueOf(sh);
    }
}
