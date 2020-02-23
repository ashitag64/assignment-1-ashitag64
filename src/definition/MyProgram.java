package definition;

import adt.MyProgramADT;

import java.util.ArrayList;
import java.util.Collections;

public class MyProgram implements MyProgramADT {

    // This reference variable will store the reference to the first contact of the contact list.
    private Node head = null;

    // This variable will store the current size of the contact list.
    private int size = 0;

    //add() method to add a contact in the contact list.
    @Override
    public void add(Person data) {
        Node node = new Node(data, head);
        head = node;
        size++;
    }

    //view() method to view the complete contact list.
    @Override
    public void view() {
        try{
            if (head != null) {
                Node temp1 = head;
                ArrayList<String> listNames = new ArrayList<>(size);
                while (temp1 != null) {
                    listNames.add((String) temp1.getData().getFName());
                    temp1 = temp1.getNext();
                }
                Collections.sort(listNames);
                System.out.println("---Here are all your contacts---");
                for (int i = 0; i < listNames.size(); i++) {
                    Node temp = head;
                    while (temp != null) {
                        if (listNames.get(i).equals(temp.getData().getFName())) {
                            System.out.println("-------- * -------- * -------- * --------");
                            System.out.println(temp.getData());
                            System.out.println("-------- * -------- * -------- * --------");
                            break;
                        }
                        temp = temp.getNext();
                    }
                    System.out.println();
                }
            }
        }
        catch (NullPointerException e){
            System.out.println("Contact List is Empty!");
        }
    }

    @Override
    public void search(String item) {

    }

    @Override
    public void delete(int item) {

    }

    @Override
    public void displayList() {

    }
}
