
// Definición de la clase Node, que representa cada nodo del árbol binario
public class Node {
    int value; // Valor entero que almacena el nodo
    Node left; // Referencia al nodo hijo izquierdo
    Node right; // Referencia al nodo hijo derecho

    // Constructor que inicializa un nodo con un valor dado
    public Node(int value) {
        this.value = value; // Se asigna el valor recibido al campo "value"
        
        // Al crear un nuevo nodo, inicialmente no tiene hijos
        this.left = null;
        this.right = null;
    }
}
