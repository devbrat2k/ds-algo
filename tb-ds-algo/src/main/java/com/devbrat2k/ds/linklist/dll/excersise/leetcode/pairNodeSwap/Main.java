package com.devbrat2k.ds.linklist.dll.excersise.leetcode.pairNodeSwap;

public class Main {

    public static void main(String[] args) {

        PairNodeSwapDoublyLinkedList myDll = new PairNodeSwapDoublyLinkedList(1);
        myDll.append(2);
        myDll.append(3);
        myDll.append(4);

        System.out.println("myDll before swapPairs:");
        myDll.printList();

        myDll.swapPairs();

        System.out.println("\nmyDll after swapPairs:");
        myDll.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            myDll before swapPairs:
            1 <-> 2 <-> 3 <-> 4

            myDll after swapPairs:
            2 <-> 1 <-> 4 <-> 3

        */

    }

}