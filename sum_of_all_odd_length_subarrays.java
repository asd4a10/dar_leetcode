class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int size = arr.length;
        int sum = 0;
        for (int i=1; i<=size; i+=2) {
            int finsum = 0;
            int cursum = 0;
            for (int j=0; j<i; j++) {
                cursum += arr[j];
            }
            finsum += cursum;
            for (int j=i; j<size; j++) {
                cursum += arr[j];
                cursum -= arr[j-i];
                finsum += cursum;
            }
            sum += finsum;
        }
        return sum;
    }
}
