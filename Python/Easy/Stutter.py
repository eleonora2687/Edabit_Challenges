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

