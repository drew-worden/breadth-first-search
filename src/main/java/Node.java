import java.util.ArrayList;
import java.util.List;

public class Node {
    private Object element;
    private boolean visited;
    private List<Node> neighbors;

    public Node(Object element) {
        this.element = element;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public boolean getVisited() {
        return this.visited;
    }

    public void setVisited(boolean status) {
        this.visited = status;
    }

    public void addNeighbor(Node node) {
        this.neighbors.add(node);
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }
}
