package Linkedlistinjava;

import java.util.ArrayList;
import java.util.LinkedList;

public class llsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(10.34f);
		l1.add("Link");
		l1.add('f');
		l1.add(null);
		l1.add("Link");
		
		LinkedList<String> l2=new LinkedList();
		l2.add("tom");
		l2.add("tonny");
		l2.add("Link");
		l2.add("tri");
		l2.add(null);
		l2.add("trip");
		
		ArrayList al= new ArrayList<> ();
		al.add(10);
		al.add(20.34f);
		al.add("swathi");
		al.add(20.34f);
		al.add(null);
		al.add('m');
		
		ArrayList al2= new ArrayList<> ();
		al2.add(10);
		al2.add(20.34f);
		al2.add("swathi");
		al2.add(20.34f);
		al2.add(null);
// 		al2.add('m');
		
		System.out.println(al2);
		System.out.println(al);
		System.out.println(l1);
		System.out.println(l2);
		
//		System.out.println(l1);
//		System.out.println(l1.getFirst());
//		System.out.println(l1.size());
//		System.out.println(l1.equals(l1));
//		l1.add(1,35.55f);
//		System.out.println(l1);
//		l2.descendingIterator();
//		System.out.println(l2);
//		l1.addAll(l2);
		System.out.println(l1);
		//System.out.println(l1.addAll(al));
		//System.out.println(l1.offer('p'));
		//System.out.println(l1)
		//System.out.println(l1);
//		l1.remove();
		//System.out.println(l1.element());
//		System.out.println(l1.offer(l2));
//		System.out.println(l1);
		//System.out.println(l1.peek());
		//System.out.println(l1.poll());
		//System.out.println(l1);
		//System.out.println(l1.pop());
		//System.out.println(l1);
//		l1.removeFirst();
//		System.out.println(l1);
//		System.out.println(l1.removeLast());
//		System.out.println(l1);
//		System.out.println(l1.removeLastOccurrence(null));
//		System.out.println(l2);
//		l2.removeIf(null);
//		System.out.println(l2);
		System.out.println(l1.removeLastOccurrence("Link"));
		System.out.println(l1);
	}
	

}
