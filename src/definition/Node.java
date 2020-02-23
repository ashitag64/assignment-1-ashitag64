package definition;

public class Node {
    // these are the fields for the contact list
    private Person data;
    private Node next;

    // constructor to initialize both the fields of the node
    Node(Person data, Node next) {
        this.data = data;
        this.next = next;
    }
}
