
package es.medac.ejdelmartesgrafo;

/**
 *
 * @author asier.ruiz
 */
public class EjDelMartesGrafo {

    public static void main(String[] args) {
        FriendshipGraph g = new FriendshipGraph();
        
        g.addVertex("Alice");
        g.addVertex("Bob");
        g.addVertex("Charlie");
        g.addEdge("Alice","Bob");
        g.addEdge("Bob", "Charlie");
        
        g.printGraph();
    }
}
