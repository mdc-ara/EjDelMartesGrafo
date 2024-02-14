package es.medac.ejdelmartesgrafo;

/**
 *
 * @author asier.ruiz
 */
public class FriendshipGraph extends Graph {
    private final int MAXV=10;
    private String[] vertices;
    private int[][] aristas;
    private int vertexCount;
    
    public FriendshipGraph() {
        vertices = new String[MAXV];
        aristas = new int[MAXV][MAXV];
        vertexCount=0;
    }

    @Override
    public void addVertex(String l1) {
    }

    @Override
    public void addEdge(String l1, String l2) {
    }

    @Override
    public void printGraph() {
    }
}
