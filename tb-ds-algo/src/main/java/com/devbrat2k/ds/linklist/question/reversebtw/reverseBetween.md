LL: Reverse Between ( ** Interview Question)
⚠️ Advanced Challenge Alert: Linked List Mastery!

Welcome to what many consider the pinnacle of Linked List challenges in this course! This exercise is not just a test of your coding skills, but also a measure of your problem-solving ability and understanding of complex data structures.

Here's how you can tackle it:

Visualize the Problem: Before diving into coding, grab a pen and paper. Sketch out the linked list and visualize each step of the process. This approach isn't just for beginners; it's exactly how seasoned developers plan their attack on complex problems.

Seek Understanding Over Speed: Take your time to really grasp each part of the problem. The goal here is deep understanding, not just a quick solution. If you find yourself stuck, that's a part of the learning process.

It's Okay to Take a Break: Feel free to step away from this challenge and return later. This course is designed to equip you with a growing set of skills, and sometimes, a bit of distance can bring new insights.

Approach Like a Pro: Remember, facing a challenging problem is what being a professional developer is all about. Use this exercise to think, plan, and code like a pro.



Now, let's dive into the exercise:

___________________________________



In the LinkedList class, implement a method called reverseBetween that reverses the nodes of the list between indexes startIndex and endIndex (inclusive).

It's important to note that you should only rearrange the nodes themselves, not just their values.

Note:  The Linked List does NOT have a tail which will make the implementation easier.

Assumption: You can assume that startIndex and endIndex are not out of bounds.

The method should have the following signature:



public void reverseBetween(int m, int n) {
// Your implementation here
}


The method should not return any value, and it should modify the original linked list.

The positions startIndex and endIndex are 0-indexed.



Example:

Given the following linked list:



1 -> 2 -> 3 -> 4 -> 5



Calling reverseBetween(1, 3) should result in the following modified linked list:



1 -> 4 -> 3 -> 2 -> 5



I highly recommend that you draw the Linked List out on a piece of paper so you can visualize the steps.

Notes:

The method should not duplicate any of the existing nodes, only rearranging the existing nodes in the list.

However, the creation of a limited number of new nodes is allowed (e.g., dummy nodes to facilitate the partitioning process).

The method should not use any extra data structures such as arrays or lists.



