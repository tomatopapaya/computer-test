# -*- coding: utf-8 -*-
"""
Created on Tue Nov 16 21:44:17 2021

@author: ASUS
"""
a=[77,5,5,22,13,55,97,4,796,1,0,9]
b=[0,1,2,3,4,5,6,7,8,9]
c=[]
d=[]
e=[]
a1=set(a)
a2=list(a1)
for i in a2:
    for j in b:
        if i==j:
            c.append(i)
print("a跟b的交集:",c)
d=a2
for i in c:
   d.remove(i)
print("a跟b的差集",d)   

e=a+b
for j in c:
    e.remove(j)
e1=set(e)
e2=list(e1)
print("a跟b的聯集:",e2)
