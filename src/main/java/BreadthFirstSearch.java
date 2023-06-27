import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    private final Queue<Node> queue;

    public BreadthFirstSearch() {
        this.queue = new LinkedList<>();
    }

    public void search(Graph graph) {
        List<Node> nodeList = graph.getAllNodes();

        for (Node n: nodeList) {
            if (!n.getVisited()) {
                n.setVisited(true);
                searchInQueue(n);
            }
        }
    }

    private void searchInQueue(Node root) {
        this.queue.add(root);
        root.setVisited(true);
        while (!this.queue.isEmpty()) {
            Node currentNode = this.queue.remove();
            System.out.println("Current node: " + currentNode.getElement());

            for (Node node: currentNode.getNeighbors()) {
                if (!node.getVisited()) {
                    node.setVisited(true);
                    this.queue.add(node);
                }
            }
        }
    }
}
