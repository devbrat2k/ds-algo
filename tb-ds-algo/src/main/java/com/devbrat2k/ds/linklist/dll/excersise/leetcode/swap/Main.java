package com.devbrat2k.ds.linklist.dll.excersise.leetcode.swap;

public class Main {

    public static void main(String[] args) {

        SwapDoubleLinkedList myDLL = new SwapDoubleLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before swap:");
        myDLL.printList();

        myDLL.swapFirstLast();

        System.out.println("\nDLL after swap:");
        myDLL.printList();


        /*
       		EXPECTED OUTPUT:
        	----------------
            DLL before swap:
            1
            2
            3
            4
            5

            DLL after swap:
            5
            2
            3
            4
            1

     	*/

    }

}