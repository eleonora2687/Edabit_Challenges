def is_adjacent(matrix, node1, node2):
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