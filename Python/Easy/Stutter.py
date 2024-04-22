# Stuttering Function

# Write a function that stutters a word as if someone is struggling to read it. The first two letters are repeated twice with an ellipsis ... and space after each, and then the word is pronounced with a question mark ?.

def stutter(word):
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
