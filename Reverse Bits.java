/*
QUESTION:
Reverse bits of a given 32 bits unsigned integer.
Example 1:

Input: 00000010100101000001111010011100
Output: 00111001011110000010100101000000
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
so return 964176192 which its binary representation is 00111001011110000010100101000000.
*/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
         int result = 0;
        int mask = 1;
        for (int i = 0; i < 32; i ++) {
            int digit = n & mask;
            result = (result << 1);
            if (digit != 0) {
                 result = result + 1;
            }
            mask = (mask << 1);
        }
        return result;
}
}
