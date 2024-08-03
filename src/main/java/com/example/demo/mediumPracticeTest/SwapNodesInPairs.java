package com.example.demo.mediumPracticeTest;

import com.example.demo.helpingClasses.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SwapNodesInPairs {
    /*Given a linked list, swap every two adjacent nodes and return its head.
    You must solve the problem without modifying the values in the list's nodes
    (i.e., only nodes themselves may be changed.)*/

    public ListNode swapPairs(ListNode head) {
        ListNode listNode = new ListNode(0); // Dummy node
        listNode.next = head;
        ListNode current = listNode; // Use a pointer to traverse the list

        while (current.next != null && current.next.next != null) {
            // Identify the nodes to be swapped
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Perform the swap
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to the next pair
            current = first;
        }
        return listNode.next;
    }
}
/*
* Intuition:
* Use pointer manipulation to swap nodes in pairs without modifying their values.
*
* Approach:
* Create a dummy node pointing to the head.Use a pointer to traverse and swap nodes in pairs.
* Adjust pointers to maintain the list structure.Return the new head of the swapped list.
*
* Complexity
* Time Complexity: ( O(n) ) (linear traversal of the list)
* Space Complexity: ( O(1) ) (constant extra space)
* */
