public class Node {
    private int val;
    private int weight;

    public Node() {
        val = 0;
        weight = 0;
    }

    public Node(int init) {
        val = init;
    }

    public int getVal() {
        return val;
    }

    public int getWeight() {
        return weight;
    }

    public void merge(Node n) {
        if (n.getVal() == val) {
            // complete merging algorithm
        }
    }

    public void calculateWeight() {

    }
}