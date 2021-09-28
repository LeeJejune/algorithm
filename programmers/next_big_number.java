class Solution {
    public int solution(int n) {
        String n1 = Integer.toBinaryString(n);
        int bitcount = Integer.bitCount(n);
        for (int i = n+1; ; i++){
            String n2 = Integer.toBinaryString(n);
            if(bitcount == Integer.bitCount(i)){
                return i;
            }
        }
    }
}