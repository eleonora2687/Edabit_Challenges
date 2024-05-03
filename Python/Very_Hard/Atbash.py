# Atbash Cipher

# The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.

# Create a function that takes a string and applies the Atbash cipher to it.


""" def convert(letter):
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
print(atbash("Vmxibkgrlm zmw wvxibkgrlm ziv rwvmgrxzo uli gsv Zgyzhs xrksvi.")) """




# Tic Tac Toe
# Given a 3x3 matrix of a completed tic-tac-toe game, create a function that returns whether the game is a win for "X", "O", or a "Draw", 
# where "X" and "O" represent themselves on the matrix, and "E" represents an empty spot.

""" def tic_tac_toe(board):
    winner="Draw"
    for i in range(3):
        if board[i][0]=='X' and board[i][1] =='X' and board[i][2]=='X':
            winner="X"
            return winner
    for j in range(3):
        if board[0][j]=='X' and board[1][j] =='X' and board[2][j]=='X':
            winner="X"
            return winner
    if board[0][0]=='X' and board[1][1]=='X' and board[2][2]=='X':
        winner="X"
        return winner
    if board[0][2]=='X' and board[1][1]=='X' and board[2][0]=='X':
        winner="X"
        return winner
    
    for i in range(3):
        if board[i][0]=='O' and board[i][1] =='O' and board[i][2]=='O':
            winner="O"
            return winner
    for j in range(3):
        if board[0][j]=='O' and board[1][j] =='O' and board[2][j]=='O':
            winner="O"
            return winner
    if board[0][0]=='O' and board[1][1]=='O' and board[2][2]=='O':
        winner="O"
        return winner
    if board[0][2]=='O' and board[1][1]=='X' and board[2][0]=='O':
        winner="O"
        return winner
    return winner



print(tic_tac_toe([
  ["X", "O", "X"],
  ["O", "X",  "O"],
  ["O", "X",  "X"]
]))
   
print(tic_tac_toe([
  ["O", "O", "O"],
  ["O", "X", "X"],
  ["E", "X", "X"]
]))

print(tic_tac_toe([
  ["X", "X", "O"],
  ["O", "O", "X"],
  ["X", "X", "O"]
]))     
    

print(tic_tac_toe([
	["X", "O", "O"],
	["X", "O", "O"],
	["X", "X", "X"]
]))
   
print(tic_tac_toe([
	["X", "X", "O"],
	["O", "O", "X"],
	["X", "X", "O"]
]))

print(tic_tac_toe([
	["X", "O", "X"],
	["O", "X", "O"],
	["E", "E", "X"]
]))

print(tic_tac_toe([
	["X", "O", "E"],
	["X", "O", "E"],
	["E", "O", "X"]
]))
    
"""