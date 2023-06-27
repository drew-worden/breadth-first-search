import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.addNeighbor(n2);
        n1.addNeighbor(n3);
        n2.addNeighbor(n4);
        n2.addNeighbor(n5);
        n3.addNeighbor(n6);
        n3.addNeighbor(n7);

        List<Node> allNodes = new ArrayList<>();
        allNodes.add(n1);
        allNodes.add(n2);
        allNodes.add(n3);
        allNodes.add(n4);
        allNodes.add(n5);
        allNodes.add(n6);
        allNodes.add(n7);

        graph.setAllNodes(allNodes);

        BreadthFirstSearch searchEngine = new BreadthFirstSearch();
        searchEngine.search(graph);
    }
}
