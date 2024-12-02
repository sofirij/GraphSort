import java.util.*;

public class DiGraphAdjListImplem
{
   private int V;
   private LinkedList<Integer>[] adj;
   
   @SuppressWarnings("unchecked")
   public DiGraphAdjListImplem(int V)
   {
      this.V = V;
      adj = new LinkedList[V];
      for (int v=0; v < V; v++)
         adj[v] = new LinkedList<Integer>();
   }
   
   public void addEdge(int v, int w)
   {
      adj[v].add(w);
   }
   
   public Iterable<Integer> adj(int v)
   {
      return adj[v];
   }
   
   public String toString()
   {
      String str = "";
      for (int i=0; i < V; i++)
      {
         str += "Vertex " + i + " is connected to: ";
         for (int v : adj[i])
            str += v + " ";
         str += "\n";
      }
      return str;
   }

   //reverse the direction of the edges
   public DiGraphAdjListImplem transpose()
   {
      DiGraphAdjListImplem graph = new DiGraphAdjListImplem(V);

      for (int i = 0; i < adj.length; i++)
      {
         for (int n : adj[i])
         {
            graph.addEdge(n, i);
         }
      }

      return graph;
   }

   public Stack<Integer> sort()
   {
      Stack<Integer> result = new Stack<>();
      HashSet<Integer> visited = new HashSet<>();
      Stack<Integer> stack = new Stack<>();

      for (int i = 0; i < adj.length; i++)
      {
         //add the edge to dfs onto the stack
         if (!visited.contains(i))
         {
            stack.push(i);
         }
         dfs(visited, stack, result);
      }

      return result;
   }

   private int toInteger(char c)
   {
      return (int)c;
   }

   private char toChar(int n)
   {
      return (char) n;
   }

   //perform topographical sort using dfs
   private void dfs(HashSet<Integer> visited, Stack<Integer> stack, Stack<Integer> result)
   {
      if (stack.isEmpty())
      {
         return;
      }

      //get the node to perform work on
      int pop = stack.pop();

      visited.add(pop);


      //perform dfs on all adjacent nodes
      for (int n : adj[pop])
      {
         if (!visited.contains(n))
         {
            stack.push(n);
         }

         dfs(visited, stack, result);
      }

      //add node worked on to the result
      result.push(pop);
   }
   
}
