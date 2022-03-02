class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int num = 1;
        if (n%2==1) {arr[n/2] = 0;}
        for (int i=0; i<n/2; i++) {
            arr[i] = num;
            arr[n-i-1] = -num;
            num++;
        }
        return arr;
    }
}
