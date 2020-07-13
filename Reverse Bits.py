"""
QUESTION:
Reverse bits of a given 32 bits unsigned integer.
Example 1:

Input: 00000010100101000001111010011100
Output: 00111001011110000010100101000000
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
so return 964176192 which its binary representation is 00111001011110000010100101000000.
"""
class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
         ret, NUM_BITS = 0, 32
         for i in range(NUM_BITS):
            ret = ret | (n&0x1)<<(NUM_BITS-1-i)
            n = n >> 1
         return ret
        
