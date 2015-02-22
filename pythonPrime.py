from math import sqrt
from time import time

def isPrime(n):

    if(n <= 2):
        return True

    square = sqrt(n) 

    return divisible(n, square, 2)

def divisible(n, square, num):

    if(n % num == 0):
        return False

    if(num >= square):
        return True

    return divisible(n, square, num + 1)

startTime = time() * 1000

for x in range (1, 104729):
    isPrime(x)

endTime = (time() * 1000) - startTime

print(endTime)
