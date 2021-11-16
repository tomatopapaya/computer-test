# -*- coding: utf-8 -*-
"""
Created on Tue Nov 16 17:53:36 2021

@author: ASUS
"""
array=[]
list=[77,5,5,22,13,55,97,4,796,1,0,9]
for j in range(12):
    min=list[0]
    for i in list:
        if min>=i:
            min=i
    print(min)
    array.append(min)
    list.remove(min)
print(array)
