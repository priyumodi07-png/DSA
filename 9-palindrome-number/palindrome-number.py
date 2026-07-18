class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        # Negative numbers are not palindromes
        if x < 0:
            return False

        # Convert to string and check if reversed is same
        s = str(x)
        return s == s[::-1]
