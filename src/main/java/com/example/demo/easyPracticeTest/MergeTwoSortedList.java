package com.example.demo.easyPracticeTest;

import com.example.demo.helpingClasses.ListNode;

public class MergeTwoSortedList {
    //You are given the heads of two sorted linked lists list1 and list2.
    //
    //Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    //
    //Return the head of the merged linked list

   //todo: https://leetcode.com/problems/merge-two-sorted-lists/description/

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode current = list;
        while(list1!=null && list2!=null){
            if (list1.val>=list2.val){
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }
        if (list1!=null)
            current.next = list1;
        else
            current.next = list2;

        return list.next;
    }
}
/*
* Intuition
* list node that serves as a placeholder to build the merged list
* current pointer to keep track of the last node in the merged list
* initially current is set to the list node.
*
* Approach
* Iterate through each both input list, when both are not null, compare the values,
* append the smaller value to the merged list by setting current.next to the node with smaller value
* and then move the pointer to the next node in the merged list.
* appending the remaining node of the non-exhausted list to the merged list
* return the list.next as the head of the merged list(while skipping the list node itself)
*
* Complexity
Time complexity:O(n+m)    0ms
Space complexity:O(1)   42.52MB (excluding the space for the output list, we are only using few additional pointers)
* n - length of list1, m -  length of list2
* */
