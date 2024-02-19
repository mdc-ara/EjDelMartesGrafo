Los "Ejercicios del Martes" forman parte del curso de Programación de 1º de CFGS de DAM. Está pensado para ser desarrollado en papel.

Ejercicio: Red de amigos

Imagina que estás construyendo una red social para conectar amigos. En esta red, una conexión entre dos personas significa que son amigas. La relación de amistad es recíproca; es decir, si Alice es amiga de Bob, Bob también es amigo de Alice. Este tipo de relación se puede representar mediante un grafo no dirigido, donde cada persona es un nodo(vértice) y cada relación de amistad es una arista que conecta dos nodos.

Dada la clase abstracta:
```
public abstract class Graph {
    public abstract void addVertex(String label);
    public abstract void addEdge(String label1, String label2);
    public abstract void printGraph();
}
```
Implementa un grafo no dirigido concreto, FriendshipGraph, que herede Graph e implemente su Interface. Piensa y codifica la estructura de datos(atributos) así como los métodos para añadir vértices (personas), añadir aristas (relaciones de amistad) e imprimir el grafo (mostrar todas las amistades).

Un ejemplo de uso de esa clase:
```
public static void main(String[] args) {
    FriendshipGraph graph = new FriendshipGraph();
    graph.addVertex("Alice");
    graph.addVertex("Bob");
    graph.addVertex("Charlie");
    graph.addEdge("Alice", "Bob");
    graph.addEdge("Bob", "Charlie");

    graph.printGraph();
}
```
