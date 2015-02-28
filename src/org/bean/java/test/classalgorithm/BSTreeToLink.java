package org.bean.java.test.classalgorithm;

import java.util.Random;

/**
 * Created by Administrator on 2015/2/28.
 */
public class BSTreeToLink {

    static TreeNode root;
    static DoubleLinkedList list = new DoubleLinkedList();
    static int N = 0;

    static class TreeNode {

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        int value;
        TreeNode left;
        TreeNode right;

        @Override
        public String toString() {
            return "TreeNode{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value, null, null);
        }

        if (root.value >= value) {
            root.left = insertNode(root.left, value);
        } else {
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    public static void pprint(TreeNode root) {
        System.out.print("(");
        if (root != null) {
            System.out.print(root.value);
            pprint(root.left);
            pprint(root.right);
        }
        System.out.print(")");
    }

    public static boolean search(TreeNode root, int value) {
        boolean result = false;
        if (root == null) {
            return result;
        }
        if (root.value > value) {
            return search(root.left, value);
        } else if (root.value < value) {
            return search(root.right, value);
        } else {
            result = true;
        }

        return result;
    }

    public static DoubleLinkedList changeTreeToLink(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left != null) {
            changeTreeToLink(root.left);
        }

        list.add(root);

        if (root.right != null) {
            changeTreeToLink(root.right);
        }
        return list;
    }

    static class DoubleLinkedList {
        private int N=0 ;		// number of elements on list
        private Node pre;	 // sentinel before first item
        private Node post;	// sentinel after last item

        public int getN(){ return N ;}
        public DoubleLinkedList() {
            pre  = new Node();
            post = new Node();
            pre.next = post;
            post.prev = pre;
        }

        // linked list node helper data type
        class Node {
            private TreeNode item;
            private Node next;
            private Node prev;

            public TreeNode getItem(){ return this.item ;}
            public Node getNext(){ return this.next ;}
        }

        public Node getPre(){ return this.pre.next ;}
        public Node getPost(){ return this.post.prev ;}
        public boolean isEmpty()	{ return N == 0; }
        public int size()		   { return N;	  }

        // add the item to the list
        public void add(TreeNode item) {
            Node n = new Node() ;
            n.item = item ;
            if(isEmpty()){
                this.pre = n ;
                this.post = n ;
                n.prev = null ;
                n.next = null ;
            }else{
                n.prev = this.post ;
                n.next = this.post.next ;
                this.post.next = n ;
                this.post = n ;
            }
            N++ ;
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            Node n = this.pre ;
            while(n!=null){
                s.append(n.item.value + " ");
                n = n.next ;
            }
            return s.toString();
        }
    }

    public static void main(String args[]) {
        int N = 10;

        Random random = new Random(System.currentTimeMillis());

        root = insertNode(root, 10);
        for (int i = 0; i < N; i++) {
            root = insertNode(root, random.nextInt() % 50);
        }

        pprint(root);
        System.out.println(search(root, 10));
        DoubleLinkedList list1 = changeTreeToLink(root) ;
        System.out.println(list1.toString());
    }

}
