# Atbash Cipher

# The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.

# Create a function that takes a string and applies the Atbash cipher to it.


def convert(letter):
    lower=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    upper=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
    if letter in lower:
        return lower[len(lower) - 1 - lower.index(letter)]
    elif letter in upper:
        return upper[len(upper)- 1 - upper.index(letter)]
    else:
        return letter


def atbash(txt):
    atbsh=""
    for i in range(len(txt)):
        atbsh+=convert(txt[i])
    return atbsh

print(atbash("apple"))
print(atbash("Hello world!"))
print(atbash("Christmas is the 25th of December"))
print(atbash("abcdefghijklmnopqrstuvwxyz"))
print(atbash("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))
print(atbash("The word 'atbash' derives from the the first and last 2 letters of the Hebrew alphabet."))
print(atbash("Vmxibkgrlm zmw wvxibkgrlm ziv rwvmgrxzo uli gsv Zgyzhs xrksvi."))