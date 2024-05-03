# Finding Adjacent Nodes
# A graph is a set of nodes and edges that connect those nodes.

# Graph Example

# There are two types of graphs; directed and undirected. In an undirected graph, the edges between nodes have no particular direction (like a two-way street) whereas in a directed graph, each edge has a direction associated with it (like a one-way street).

# For two nodes in a graph to be considered adjacent to one another, there must be an edge between them. In the example given above, nodes 0 and 1 are adjacent, but nodes 0 and 2 are not.

# We can encode graphs using an adjacency matrix. An adjacency matrix for a graph with "n" nodes is an "n * n" matrix where the entry at row "i" and column "j" is a 0 if nodes "i" and "j" are not adjacent, and 1 if nodes "i" and "j" are adjacent.

# For the example above, the adjacency matrix would be as follows:

# [
#   [ 0, 1, 0, 0 ],
#   [ 1, 0, 1, 1 ],
#   [ 0, 1, 0, 1 ],
#   [ 0, 1, 1, 0 ]
# ]
# A one indicates that a connection is true and a zero indicates a connection is false.

# Here is how the above model might be written out:

# On the first row, node 0 does not connect to itself, but it does connect to node 1. It does not connect to node 2 or node 3. The row is written as 0, 1, 0, 0.
# On the second row, node 1 connects to node 0, node 2 and node 3, but it does not connect to itself. The row is written as 1, 0, 1, 1.
# On the third row, node 2 does not connect to node 0, but it does connect to node 1, does not connect to itself, and it does connect to node 3. The row is written as 0, 1, 0, 1
# On the fourth row, node 3 does not connect to node 0, but it does connect to node 1 and node 2. It does not connect to itself. The row is written as 0, 1, 1, 0.
# Your task is to determine if two nodes are adjacent in an undirected graph when given the adjacency matrix and the two nodes.



""" def is_adjacent(matrix, node1, node2):
    if matrix[node1][node2] == 1:
        return True
    return False

matrix = [[0,1,0,0],[1,0,1,1],[0,1,0,1],[0,1,1,0]]
print(is_adjacent(matrix, 0, 1))
print(is_adjacent(matrix, 0, 2))
print(is_adjacent(matrix, 2, 1))

matrix = [[0,1,0,1,1], [1,0,1,0,0],[0,1,0,1,0],[1,0,1,0,1],[1,0,0,1,0]]
print(is_adjacent(matrix, 0, 3))
print(is_adjacent(matrix, 1, 4))
print(is_adjacent(matrix, 3, 2)) 

"""

# Drunken Python
# Python got drunk and the built-in functions str() and int() are acting odd:
#     str(4) ➞ 4

# str("4") ➞ 4

# int("4") ➞ "4"

# int(4) ➞ "4"
# You need to create two functions to substitute str() and int(). 
# A function called int_to_str() that converts integers into strings and a function called str_to_int() that converts strings into integers.

""" from ast import literal_eval

def int_to_str(num):
    converted_num = "%s" % num
    return converted_num
    
def str_to_int(num):
    int_value = literal_eval(num)
    return int_value
	
print(int_to_str(4))
print(int_to_str(65))
print(int_to_str(29348))
print(int_to_str(49583908545))

print(int_to_str(str_to_int('4')))
print(int_to_str(str_to_int('65')))
print(int_to_str(str_to_int('29348')))
print(int_to_str(str_to_int('49583908545')))

 """


# Right Shift by Division

# The right shift operation is similar to floor division by powers of two.

# Sample calculation using the right shift operator ( >> ):

# 80 >> 3 = floor(80/2^3) = floor(80/8) = 10
# -24 >> 2 = floor(-24/2^2) = floor(-24/4) = -6
# -5 >> 1 = floor(-5/2^1) = floor(-5/2) = -3
# Write a function that mimics (without the use of >>) the right shift operator and returns the result from the two given integers.


""" def shift_to_right(x, y):
    return x//2**y

print(shift_to_right(80,3))
print(shift_to_right(-24,2))
print(shift_to_right(-5, 1))
print(shift_to_right(4666,6))
print(shift_to_right(3777,6))
print(shift_to_right(-512,10))
print(shift_to_right(1024,5))
print(shift_to_right(38, 0))
print(shift_to_right(192, 4))
 """
 
 
