package com.example.demo.helpingClasses;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListNode implements Iterable<Integer> {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public Iterator<Integer> iterator() {
        return new ListNodeIterator(this);
    }

    //define an iterator for listNode
    public class ListNodeIterator implements Iterator<Integer>{
        private ListNode current;

        public ListNodeIterator(ListNode head) {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current !=null;
        }

        @Override
        public Integer next() {
            int value = current.val;
            current = current.next;
            return value;
        }
    }
}
