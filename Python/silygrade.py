import math
import os
import random
import re
import sys

#
# Complete the 'gradingStudents' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY grades as parameter.
#

def gradingStudents(grades):
    # Write your code here
    """
    new_grades=[]
    for i in grades:
        if i<38:
            new_grades.append(i);
        else:
            if (((i//5+1)* 5 - i) < 3):
            
                new_grades.append((i//5+1)*5)
            else:
                
                new_grades.append(i)
    """
    new_grades = [i+(5-i%5) if (i>=38 and i%5>2) else i for i in grades]
    return new_grades 

if __name__ == '__main__':

    grades_count = int(input().strip())

    grades = []

    for _ in range(grades_count):
        grades_item = int(input().strip())
        grades.append(grades_item)

    result = gradingStudents(grades)
    print(result)
