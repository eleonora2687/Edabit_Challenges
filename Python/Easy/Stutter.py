# Stuttering Function
# Write a function that stutters a word as if someone is struggling to read it. The first two letters are repeated twice with an ellipsis ... and space after each, and then the word is pronounced with a question mark ?.

""" def stutter(word):
    stut=""
    for i in range(2):
        for j in range(6):
            if j == 0 or j == 1:
                stut+=word[j]
            elif j > 1 and j < 5:
                stut+='.'
            elif j == 5:
                stut+=' '
    stut+=word
    stut+='?'
    return stut

print(stutter("incredible"))
print(stutter("enthusiastic"))
print(stutter("outstanding"))
 """
 
 
# Find the Discount
# Create a function that takes two arguments: the original price and the discount percentage as integers and returns the final price after the discount.

""" def dis(price, discount):
    price = price - discount/100*price
    return round(price, 2)

print(dis(1500, 50))
print(dis(89, 20))
print(dis(100, 75))
print(dis(1500, 50))
print(dis(211, 50))
print(dis(593, 61))
print(dis(1693, 80))
print(dis(700, 10))

"""



# Radians to Degrees
# Create a function that takes an angle in radians and returns the corresponding angle in degrees rounded to one decimal place.


""" from math import pi

def radians_to_degrees(rad):
	return round(rad*180/pi,  1)

print(radians_to_degrees(1))
print(radians_to_degrees(5))
print(radians_to_degrees(7))
print(radians_to_degrees(20))
print(radians_to_degrees(50))
print(radians_to_degrees(60))
print(radians_to_degrees(100))
print(radians_to_degrees(180))

"""


# Circle or Square
# Given the radius of a circle and the area of a square, return True if the circumference of the circle is greater than the square's perimeter and 
# False if the square's perimeter is greater than the circumference of the circle.

""" from math import sqrt

def circle_or_square(rad, area):
    if 2*3.14*rad>4*sqrt(area):
        return True
    return False

print(circle_or_square(16, 625))
print(circle_or_square(8, 144))
print(circle_or_square(15, 400))
print(circle_or_square(5, 100))
print(circle_or_square(18, 900))
print(circle_or_square(1, 4))

 """
 
 
 
# Curzon Numbers
# In this challenge, establish if a given integer num is a Curzon number. If 1 plus 2 elevated to num is exactly divisible by 1 plus 2 multiplied by num, then num is a Curzon number.

# Given a non-negative integer num, implement a function that returns True if num is a Curzon number, or False otherwise.


""" def is_curzon(num):
    if (2**num+1)%(2*num+1)==0:
        return True
    return False


print(is_curzon(5))
print(is_curzon(10))
print(is_curzon(14))
print(is_curzon(86))
print(is_curzon(90))
print(is_curzon(115))
print(is_curzon(120))
print(is_curzon(194))
print(is_curzon(293)) 

"""


