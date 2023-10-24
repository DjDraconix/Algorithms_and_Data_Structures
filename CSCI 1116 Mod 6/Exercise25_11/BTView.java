
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;



public class BTView extends Pane {
    private BST<Integer> tree = new BST<>();
    private double radius = 15; // Tree node radius
    private double hGap = 50; // Gap between two nodes horizontally

    BTView(BST<Integer> tree) {
        this.tree = tree;
        setStatus("Tree is empty");
    }

    public void displayTree() {
        this.getChildren().clear(); // Clear the pane
        if (tree.getRoot() != null) {
            // Display tree iteratively using a queue (breadth-first)
            displayTree(tree.getRoot());
        }
    }

    private void displayTree(BST.TreeNode<Integer> root) {
        Queue<BST.TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        double currentX = getWidth() / 2;
        double currentY = 50; // Set the initial Y position

        while (!queue.isEmpty()) {
            BST.TreeNode<Integer> node = queue.poll();

            // Display a node
            Circle circle = new Circle(currentX, currentY, radius);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            getChildren().addAll(circle, new Text(currentX - 4, currentY + 4, node.element + ""));

            // Adjust X position for the next node in the same level
            currentX += hGap;

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}
