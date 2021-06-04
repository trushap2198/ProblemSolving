import math
import os
import random
import re
import sys

#
# Complete the 'staircase' function below.
"""
    #
   ##
  ###
 ####
#####
"""
#
# The function accepts INTEGER n as parameter.
#

def staircase(n):
    for i in range(n):
        #print(' '* (n-1-i),end = "")
        print(" "*(n-1-i) + '#' * (i+1))
        #or
        print(str('#'*i).rjust(n))

if __name__ == '__main__':
    n = int(input().strip())

    staircase(n)
