package com.example.demo.easyPracticeTest;

public class MergeTwoSortedList {
    //You are given the heads of two sorted linked lists list1 and list2.
    //
    //Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    //
    //Return the head of the merged linked list

   //todo: https://leetcode.com/problems/merge-two-sorted-lists/description/

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        return list1;
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
