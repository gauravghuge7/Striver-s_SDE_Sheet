package day_23_graph.graphImplement;

import java.util.*;


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

    demoClone() {}

    public Node cloneGraph(Node node) {

        if(node == null) return null;

        Node temp = new Node(node.val);

        Queue<Node> q = new LinkedList<>();

        HashSet<Node> set = new HashSet<>();

        q.offer(node);
        set.add(node);

        while(!q.isEmpty()) {

            Node travel = q.poll();

            temp.neighBours = new ArrayList<>();

            ArrayList<Node> tempList = travel.neighBours;

            for(int i=0; i<tempList.size(); i++) {

                Node make = tempList.get(i);

                if(!set.contains(make)) {

                    set.add(make);
                    q.offer(make);

                    Node addNew = new Node(make.val);
                    temp.neighBours.add(addNew);

                }



            }

            temp = temp.neighBours.get(0);

        }

        return temp;
    }

    public  Node newGraph(Node root) {

        Node temp = new Node(root.val);

        Node curr = temp;






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

    public static void printGraph(Node head) {

        Queue<Node> q = new LinkedList<>();

        HashSet<Node> set = new HashSet<>();

        if(head == null) return;

        q.add(head);


        while(!q.isEmpty()) {

            Node temp = q.poll();

            System.out.println(temp.val);

            ArrayList<Node> NB = temp.neighBours;

            for(int i =0; i<NB.size(); i++) {
                Node travel = NB.get(i);
                if(!set.contains(travel)) {
                    set.add(travel);
                    q.offer(travel);
                }
            }
        }

    }

    public static void main(String[] args) {

        Node start = createGraph();

//        printGraph(start);

        demoClone object = new demoClone();

        Node temp = object.cloneGraph(start);

        printGraph(temp);

    }



}
