""" def interview(lst, tot):
    if len(lst)!=8:
        return "disqualified"
    else:
        qualified=True
        for i in range(4):
            if i==0:
                if lst[i]>5 or lst[i+1]>5:
                    qualified=False
                    break
            elif i==2:
                if lst[i]>10 or lst[i+1]>10:
                    qualified=False
                    break
            elif i==4:
                if lst[i]>15 or lst[i+1]>15:
                    qualified=False
                    break
            else:
                if lst[i]>20 or lst[i+1]>20:
                    qualified=False
                    break
    if qualified==True:
        if tot<121:
            return "qualified"
        return "disqualified"
    return "disqualified"


print(interview([5, 5, 10, 10, 15, 15, 20, 20], 120))
print(interview([2, 3, 8, 6, 5, 12, 10, 18], 64))
print(interview([5, 5, 10, 10, 25, 15, 20, 20], 120))
print(interview([5, 5, 10, 10, 15, 15, 20], 120))
print(interview([5, 5, 10, 10, 15, 15, 20, 20], 130))
 """
                




""" Simple OOP Calculator

Create methods for the Calculator class that can do the following:

Add two numbers.
Subtract two numbers.
Multiply two numbers.
Divide two numbers.   

"""             
                
""" class Calculator:
    def add(self, a, b):
        return a + b
    
    def substract(self, a, b):
        return a - b
    
    def multiply(self, a, b):
        return a*b
    
    def divide(self, a, b):
        return a/b
  

calculator = Calculator()

print(calculator.add(10, 5))
print(calculator.substract(10, 5))
print(calculator.multiply(10, 5))
print(calculator.divide(10, 5))
print(calculator.add(5,5))
print(calculator.add(20,5))
print(calculator.substract(30,5))
print(calculator.substract(100,5))
print(calculator.multiply(5,5))
print(calculator.multiply(100,5))
print(calculator.divide(10,5))
print(calculator.divide(100,5))
        
         """
         
         

""" Loves Me, Loves Me Not...

"Loves me, loves me not" is a traditional game in which a person plucks off all the petals of a flower one by one, saying the phrase "Loves me" and "Loves me not" when determining whether the one that they love, loves them back.

Given a number of petals, return a string which repeats the phrases "Loves me" and "Loves me not" for every alternating petal, and return the last phrase in all caps. Remember to put a comma and space between phrases.

 """
 
 
""" def loves_me(n):
    s=""
    if n==1:
        s+="LOVES ME"
    else:
        for i in range(n-1):
            if i%2==0:
                s+="Loves me"
            else:
                s+="Loves me not"
            s+=", "
        if i%2==1:
            s+="LOVES ME"
        else:
            s+="LOVES ME NOT"
    return s

print(loves_me(1))
print(loves_me(2))
print(loves_me(3))
print(loves_me(4))
print(loves_me(5))
print(loves_me(6))
print(loves_me(7))
print(loves_me(8))
print(loves_me(9))
print(loves_me(10))
print(loves_me(11))
print(loves_me(12))
print(loves_me(13))
print(loves_me(14))
print(loves_me(15))
print(loves_me(16))
print(loves_me(17))
print(loves_me(18))
print(loves_me(19))
print(loves_me(20))
print(loves_me(21))
print(loves_me(22))
print(loves_me(23))
print(loves_me(24))
print(loves_me(25))
print(loves_me(26))
print(loves_me(27))
print(loves_me(28))
print(loves_me(29))
print(loves_me(30))
print(loves_me(31))
print(loves_me(32))
print(loves_me(33))
print(loves_me(34))
print(loves_me(35))
print(loves_me(36))
print(loves_me(37))
print(loves_me(38))
print(loves_me(39))
print(loves_me(40))
print(loves_me(41))
print(loves_me(42))
print(loves_me(43))
print(loves_me(44))
print(loves_me(45))
print(loves_me(46))
print(loves_me(47))
print(loves_me(48))
print(loves_me(49))
print(loves_me(50))
print(loves_me(51))
print(loves_me(52))
print(loves_me(53))
print(loves_me(54))
print(loves_me(55))
print(loves_me(56))
print(loves_me(57))
print(loves_me(58))
print(loves_me(59))
print(loves_me(60))
print(loves_me(61))
print(loves_me(29))
print(loves_me(62))
print(loves_me(63))
print(loves_me(64))
print(loves_me(65))
print(loves_me(66))
print(loves_me(67))
print(loves_me(68))
print(loves_me(69))
print(loves_me(70))
 """
 
