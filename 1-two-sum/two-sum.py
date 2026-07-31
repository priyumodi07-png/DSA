class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # Dictionary acts like HashMap in Python
        map = {}

        for i in range(len(nums)):
            x = target - nums[i]
            if x in map:   # check if complement exists
                return [map[x], i]
            map[nums[i]] = i  # store current number with index

        return []

        