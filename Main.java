import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        DiGraphAdjListImplem graph = new DiGraphAdjListImplem(14);

        graph.addEdge(toInteger('m'), toInteger('q'));
        graph.addEdge(toInteger('m'), toInteger('r'));
        graph.addEdge(toInteger('m'), toInteger('x'));
        graph.addEdge(toInteger('n'), toInteger('o'));
        graph.addEdge(toInteger('n'), toInteger('q'));
        graph.addEdge(toInteger('n'), toInteger('u'));
        graph.addEdge(toInteger('o'), toInteger('r'));
        graph.addEdge(toInteger('o'), toInteger('s'));
        graph.addEdge(toInteger('o'), toInteger('v'));
        graph.addEdge(toInteger('p'), toInteger('o'));
        graph.addEdge(toInteger('p'), toInteger('s'));
        graph.addEdge(toInteger('p'), toInteger('z'));
        graph.addEdge(toInteger('q'), toInteger('t'));
        graph.addEdge(toInteger('r'), toInteger('u'));
        graph.addEdge(toInteger('r'), toInteger('y'));
        graph.addEdge(toInteger('s'), toInteger('r'));
        graph.addEdge(toInteger('u'), toInteger('t'));
        graph.addEdge(toInteger('v'), toInteger('w'));
        graph.addEdge(toInteger('v'), toInteger('x'));
        graph.addEdge(toInteger('w'), toInteger('z'));
        graph.addEdge(toInteger('y'), toInteger('v'));
        
        Stack<Integer> stack = graph.sort();
        while (!stack.isEmpty())
        {
            System.out.println(toChar(stack.pop()));
        }
        
    }

    private static int toInteger(char c)
    {
        return (int)c - 109;
    }

    private static char toChar(int n)
    {
       return (char) (n+109);
    }
}