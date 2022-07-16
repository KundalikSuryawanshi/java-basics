package com.shlok.advance;

import java.util.*;

//collection framework
//all obj of collection framework contain in java.util
    public class Advance
{
        /*  LIST OR ARRAYLIST  */
   /* public static void main(String[] args) throws Exception
    {
        ArrayList<String> Student = new ArrayList<>();
        //size = n   n+n/2+1 ; it will make new array copy old array in it and dump old array
        //it will create a list //String is the type of data add in list
        Student.add("gaurav");
        //add() method is used to add elements in list
        Student.add("saurav");
        // new added value add at the last of a list
        Student.add("pravin");
        System.out.println(Student);
        //it will print the list
        Student.add(1,"siddhesh");
        //it will add sidhesh at 1st index
        //we can also add whole other list in another list by using .addAll(name_of_newlist);
        System.out.println(Student.get(3));
        // .get(index_no)-will fetch value of 3rd index
        Student.remove(1);
        //remove()- it will remove that element which index has specified
        List<Integer> mob = new ArrayList<>();
        mob.add(12345);
        mob.add(23456);
        mob.add(34567);
        System.out.println(mob);
        mob.remove(Integer.valueOf(12345));
        //it will remove that type of element from array list
        //mob.clear();//it will delete all the list
        //mob.set(3,45678);
        //it will set this value at 3rd index
        mob.contains(12345);
        //it will return boolean value if this value contain or not

        //Time complexity - O(n)

        //if you put object inside the println() then it invoke its to string method
        mob.size(); //it will return the size of a list
        for (int i = 0; i < mob.size(); i++) {
            System.out.println(mob);
        }
        //Iterator
        // hasnext - it will check whether it have next element or not
       Iterator<Integer> it = mob.iterator();
        while (it.hasNext());
        System.out.println("iterator"+it.next());
        //it will check whether next element is present or not if present then print

    } */

                /*      STACK       */
       /* public static void main(String[] args) {
            *//*list in first out type of data structure
            * in stack new element add at the top and remove elements from the top *//*
            Stack<String> animals =  new Stack<>();
            //create a stack with animals name
            animals.push("cat");
             //last element
            animals.push("dog");
             // push()- used to add element in stack
            animals.push("lion");   //upper element
            System.out.println("Stack:"+animals);   //print stack
            System.out.println(animals.peek());     // to see the which element is on top
            animals.pop();      //to delete top element
            animals.poll();     //to remove first entered element
            System.out.println(animals.peek());
            //it will return as which element is inline to out
            System.out.println(animals);
        }*/


                /*      QUEUE       */
        /*public static void main(String[] args) {
            *//*in stack by default element add from rear side and remove from front side
            * we can implement queue by linked list or arraylist
            * queue is an interface which implements linkedlist or arraylist
            * priority queue - in which we can set priority on arguments
            * in queue first entered element remove first by poll function*//*

            //queue by linkedlist
            Queue<Integer> queue = new LinkedList<>(); //to create a Queue
            queue.offer(12345);     //offer() - used to add element in queue
            queue.offer(23456);     //just add value in queue do not return anything
            queue.offer(34567);
            System.out.println(queue);
            //print queue  //if not values contain then it will return null
            //queue.element(3423);
            //it aslo use to add element but if queue is empty it will throws exception
            queue.poll();               //to remove first entered element
            System.out.println(queue);
            System.out.println(queue.peek());
            // it will return us which element is reddy to remove next
            *//*
            * if you want your app perform action else app crash then to add data use add function in queue
            * if data not add then app crash or exception throws
            * remove() - also used to remove element from the queue
            * normal linked list is most similar to the arraylist
            * i *//*

    }*/
                /*      LIST      */
        /*public static void main(String[] args) {
            List<Integer> list = new LinkedList<>();    //create list of integer type
            list.add(1212);                             //add element in it
            list.add(1,1213);              //add element at 1st index
            System.out.println(list);                   //print list
            System.out.println(list.get(1));            //get 1st index element from list
            List<Integer> newList = new ArrayList<>();  //another list
            newList.add(1111);       //add element in it
            newList.add(2222);       //add element in it
            System.out.println(list);     //print list
            System.out.println(newList);      //print list

        }*/

    /*      PRIORITY QUEUE         */
       /* public static void main(String[] args) {
        *//*queue implements priority queue so all methods and functions will work here
        * it means heep as a small element comes at the top but all element not in ascending order*//*
            Queue<Integer> priorityQueue = new PriorityQueue<>();
            priorityQueue.offer(9999);
            priorityQueue.offer(8888);// to add element
            priorityQueue.offer(7777);
            System.out.println(priorityQueue);// to print queue
            priorityQueue.poll();//to remove top element
            // and all Queue's method will work here
        *//* MEANHEAP - by default it is in it small element at first
        * if you want max number at the top then pass comparator inside the constructor of queue
        * *//*
            Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            // in this large element come first
            // this queue is work on maxheap and Comparator.___will give many more method
    }*/

    /*      ARRAY DEQUE         */
    //slide window technique
    //in this we can add element on both side means head or tell
    //it also implements queue so all queue's method will work here
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(1234);
        adq.offer(2345);



    }
}