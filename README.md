# GraphSort

![image](https://github.com/user-attachments/assets/187566ba-3682-4d0e-8472-d699c404fdd3)
This assingment was given to me to be done by hand but i found it boring cause I already understood the concept so I just tested myself by trying to solve the problem with code.
Each letter is represented as a node with an integer value corresponding to their position in the alphabet order (0 - 25).
The edge is made according to the image and I topologically sort the graph with the algorithm.

##The Algorithm
For each node in order I perform dfs traversal until the current node has no adjacent nodes, then I add that node to a stack. I also keep track of all visited nodes to prevent infinte recursions.
At the end of the process I will have a stack that represents the order of the nodes in reverse topological order which I will then use to draw a new graph with topological order to answer the assignment.
