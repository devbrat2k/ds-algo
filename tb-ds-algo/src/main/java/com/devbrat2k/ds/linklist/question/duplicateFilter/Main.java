package com.devbrat2k.ds.linklist.question.duplicateFilter;

public class Main {

    public static void main(String[] args) {

        DuplicateFilterLinkedList myLinkedList = new DuplicateFilterLinkedList(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.removeDuplicates();

        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            3
            4

        */

    }

}
