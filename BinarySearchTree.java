public class BinarySearchTree {
    
    private Node root; // Nodo raíz del árbol

    // Constructor: Inicializa el árbol vacío
    public BinarySearchTree() {
        this.root = null;
    }

    // Método público para insertar un valor en el árbol
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Método privado recursivo que realiza la inserción
    private Node insertRec(Node current, int value) {
        if (current == null) return new Node(value); // Si no hay nodo, crea uno nuevo

        if (value < current.value) {
            current.left = insertRec(current.left, value); // Inserta en la izquierda
        } else if (value > current.value) {
            current.right = insertRec(current.right, value); // Inserta en la derecha
        }
        return current;
    }

    // Método público para eliminar un valor del árbol
    public void delete(int value) {
        root = deleteRec(root, value); // Elimina el valor usando recursión
    }

    // Método privado recursivo para eliminar un nodo
    private Node deleteRec(Node current, int value) {
        if (current == null) return null; // Valor no encontrado

        if (value < current.value) {
            current.left = deleteRec(current.left, value); // Buscar en izquierda
        } else if (value > current.value) {
            current.right = deleteRec(current.right, value); // Buscar en derecha
        } else {
            // Caso: nodo con un hijo o ninguno
            if (current.left == null) return current.right;
            if (current.right == null) return current.left;

            // Caso: nodo con dos hijos, se reemplaza con el menor de la derecha
            int min = findMin(current.right);
            current.value = min;
            current.right = deleteRec(current.right, min);
        }
        return current;
    }

    // Busca el valor mínimo en un subárbol
    private int findMin(Node node) {
        int min = node.value;
        while (node.left != null) {
            node = node.left;
            min = node.value;
        }
        return min;
    }

    // Recorrido preorden (raíz → izquierda → derecha)
    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    // Recorrido inorden (izquierda → raíz → derecha)
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.value + " ");
            inOrderRec(node.right);
        }
    }

    // Recorrido postorden (izquierda → derecha → raíz)
    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.value + " ");
        }
    }

    // Imprime el árbol en inorden
    public void printTree() {
        printTreeRec(root);
        System.out.println();
    }

    private void printTreeRec(Node node) {
        if (node != null) {
            printTreeRec(node.left);
            System.out.print(node.value + " ");
            printTreeRec(node.right);
        }
    }
}
