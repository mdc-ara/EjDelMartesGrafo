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
        for(int i=0;i<vertexCount;i++){
            for(int ii=0;ii<vertexCount;ii++){
                aristas[i][ii]==0;
            }
        }
    }

    @Override
    public void addVertex(String l1) {
        if(vertexCount>=MAXV){
            System.err.println("Grafo lleno");
            return;
        }
        vertices[vertexCount]=l1;
        vertexCount++;
    }

    // Devuelve la posición de l1 en el vector o un índice imposible del si no lo encuentra
    private int buscaPos(String l1){
        for(int i=0;i<vertexCount;i++){
            if(vertices[i].equals(l1)){
                return(i);
            }
        }
        return(-1);
    }
    
    @Override
    public void addEdge(String l1, String l2) {
        int posl1 = buscaPos(l1);
        int posl2 = buscaPos(l2);
        
        if(posl1 == -1 || posl2 == -1 ){
            System.err.println("Algún vértice no existe");
            return();
        }
        aristas[posl1][posl2]=1;
        aristas[posl2][posl1]=1;        
    }

    @Override
    public void printGraph() {
        for(int i=0;i<vertexCount;i++){
            System.out.print(vertices[i] + " tiene amistad con:");
            for(int ii=0;ii<vertexCount;ii++){
                if(aristas[i][ii]==1){
                    System.out.print(" "+vertices[ii]);
                }
            }
            System.out.println();
        }
    }
}
