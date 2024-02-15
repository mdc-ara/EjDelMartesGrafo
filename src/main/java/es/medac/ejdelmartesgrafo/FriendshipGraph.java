package es.medac.ejdelmartesgrafo;

/**
 *
 * @author asier.ruiz
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class FriendshipGraph extends Graph {
    private HashMap<String, List<String>> adjVertices;
    
    public FriendshipGraph() {
        adjVertices = new HashMap<>();
    }

    @Override
    public void addVertex(String l1) {
        adjVertices.putIfAbsent(l1, new ArrayList<>());
    }

    @Override
    public void addEdge(String l1, String l2) {
        adjVertices.get(l1).add(l2);
        adjVertices.get(l2).add(l1);
    }

    @Override
    public void printGraph() {
        for(String vertice: adjVertices.keySet()){
            // Las listas implementan toString
            System.out.println(vertice + " tiene amistad con: "+ adjVertices.get(vertice));
        }
    }
}
