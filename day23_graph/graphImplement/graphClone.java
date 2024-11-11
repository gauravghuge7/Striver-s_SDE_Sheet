package day23_graph.graphImplement;

import java.util.ArrayList;


class Node {
    private int val;
    ArrayList<Node> neighBours;

    // NOTE:
    public Node() {
        val = 0;
        this.neighBours = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, ArrayList<Node> neighBour) {

        this.val = val;
        this.neighBours = neighBour;
    }

}


public class graphClone {


    public static void main(String[] args) {

        Node start = new Node(0);

    }

}
