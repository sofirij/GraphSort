# GraphSort

![Graph Diagram](https://github.com/user-attachments/assets/187566ba-3682-4d0e-8472-d699c404fdd3)

GraphSort is a Java project that demonstrates topological sorting of a directed graph using an adjacency list representation. The project was inspired by a manual assignment, but was implemented in code to automate and visualize the solution process.

## Project Overview
This project models each letter as a node, assigning an integer value based on its position in the alphabet (0-25). The graph is constructed using an array of linked lists, where each node contains a list of its adjacent nodes (edges). The edges are defined according to the diagram above.

## Features
- Directed graph representation using adjacency lists
- Topological sorting using depth-first search (DFS)
- Stack-based approach to generate the topological order
- Prevention of infinite recursion by tracking visited nodes

## The Algorithm
For each node in order, a DFS traversal is performed until the current node has no adjacent nodes. The node is then added to a stack. Once all adjacent nodes of a parent node are pushed to the stack, the parent node is also pushed. Visited nodes are tracked to avoid cycles and infinite recursion. At the end, the stack contains the nodes in reverse topological order, which can be used to draw or analyze the graph in topological order.

## Usage
1. Clone or download this repository.
2. Compile the Java files:
   ```powershell
   javac Main.java DiGraphAdjListImplem.java
   ```
3. Run the program:
   ```powershell
   java Main
   ```
4. The output will display the topological order of the nodes based on the graph structure.

## Motivation
This project was created to automate a manual graph assignment, providing a practical demonstration of graph algorithms and data structures in Java.

