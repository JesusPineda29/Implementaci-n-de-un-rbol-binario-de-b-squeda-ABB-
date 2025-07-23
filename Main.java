import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.insert(val);
        }

        System.out.println("Valores a insertar en el Árbol:");
        System.out.println(Arrays.toString(values));

        System.out.println("Árbol tras insertar:");
        tree.printTree();

        tree.delete(20);
        System.out.println("Árbol tras borrar 20:");
        tree.printTree();

        tree.delete(30);
        System.out.println("Árbol tras borrar 30:");
        tree.printTree();

        tree.delete(50);
        System.out.println("Árbol tras borrar 50:");
        tree.printTree();

        System.out.println("Recorrido PreOrder:");
        tree.preOrder();

        System.out.println("Recorrido InOrder:");
        tree.inOrder();

        System.out.println("Recorrido PostOrder:");
        tree.postOrder();
    }
}
