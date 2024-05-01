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
                
class Calculator:
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
        
        