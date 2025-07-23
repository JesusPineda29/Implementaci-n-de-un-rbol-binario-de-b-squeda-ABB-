import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.insert(val);
        }

        System.out.println("\nValores a insertar en el Árbol:");
        System.out.println(Arrays.toString(values)); // Muestra el array correctamente

        System.out.println("\nÁrbol tras insertar:");
        tree.printTree();

        tree.delete(20);
        System.out.println("\nÁrbol tras borrar 20:");
        tree.printTree();

        tree.delete(30);
        System.out.println("\nÁrbol tras borrar 30:");
        tree.printTree();

        tree.delete(50);
        System.out.println("\nÁrbol tras borrar 50:");
        tree.printTree();

        // Recorridos
        System.out.println("\nRecorrido PreOrden:");
        tree.preOrder();

        System.out.println("\nRecorrido InOrden:");
        tree.inOrder();

        System.out.println("\nRecorrido PostOrden:");
        tree.postOrder();
    }
}
