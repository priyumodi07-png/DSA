# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        seen = {}
        left = 0
        max_len = 0

        for right in range(len(s)):
            if s[right] in seen and seen[s[right]] >= left:
                left = seen[s[right]] + 1
            seen[s[right]] = right
            max_len = max(max_len, right - left + 1)

        return max_len
