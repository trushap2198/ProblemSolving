import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    n = len(arr)
    pos,negs,zeros=0,0,0
    for i in arr:
        if i<0:
            negs+=1
        elif i>0:
            pos+=1
        else:
            zeros+=1
    print("{:.6}".format(pos/n))
    print("{0:.6}\n{1:.6}".format(negs/n, zeros/n))

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
