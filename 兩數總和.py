# -*- coding: utf-8 -*-
"""
Created on Tue Nov 16 23:24:33 2021

@author: ASUS
"""
def twoSum(nums,target):
    for i in range(len(nums)):
        left = nums[i+1:]
        for j in range(len(left)):
            if (nums[i] + left[j]) == target:
                return[i, j+i+1]
nums=[2,7,11,15]
target=9
print(twoSum(nums, target))