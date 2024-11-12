package day_23_graph.graphImplement;

import java.util.ArrayList;


class Node {
    public int val;
    ArrayList<Node> neighBours;

    // NOTE:
    public Node() {
        val = 0;
        this.neighBours = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        this.neighBours = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighBour) {

        this.val = val;
        this.neighBours = neighBour;
    }


}


class demoClone {



    public Node cloneGraph(Node node) {
        Node temp = new Node(14);

        return temp;
    }
}

public class graphClone {


    public static Node createGraph() {

        Node start = new Node(0);

        start.neighBours = new ArrayList<>();

        Node temp = new Node(1);
        Node temp1 = new Node(2);
        Node temp3 = new Node(3);
        Node temp4 = new Node(4);
        Node temp5 = new Node(5);

        /* 0's neighbourd  */
        start.neighBours.add(temp);
        start.neighBours.add(temp3);
        start.neighBours.add(temp1);

        /* 1's neighbours */
        temp.neighBours = new ArrayList<>();
        temp.neighBours.add(start);
        temp.neighBours.add(temp4);

        /* 2's neighbours */

        temp1.neighBours = new ArrayList<>();
        temp.neighBours.add(start);
        temp.neighBours.add(temp5);

        /* 3's neighbours */

        temp3.neighBours = new ArrayList<>();
        temp3.neighBours.add(start);
        temp3.neighBours.add(temp5);

        /* 4's neighbours */
        temp4.neighBours.add(temp);
        temp4.neighBours.add(temp5);


        /* 5's neighbours */
        temp5.neighBours.add(temp1);
        temp5.neighBours.add(temp3);
        temp5.neighBours.add(temp4);

        return start;
    }

    public static void main(String[] args) {

        Node start = createGraph();


        System.out.println(start.val);



    }



}
