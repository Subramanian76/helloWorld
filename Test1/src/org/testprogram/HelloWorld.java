package org.testprogram;

import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		
		Animal obj = new Animal();
		System.out.println("Animal : "+obj.Showinfo());
		
		Reptiles obj1 = new Reptiles();
		System.out.println(obj1.Showinfo());
		
		Crocodile croc = new Crocodile();
		System.out.println(croc.Showinfo());
		
		Fish obj2 = new Fish();
		System.out.println(obj2.Showinfo());
		
		Eel el = new Eel();
		System.out.println(el.Showinfo());
		
		Bird obj3 = new Bird();
		System.out.println(obj3.Showinfo());
		
		Eagle eg = new Eagle();
		System.out.println(eg.Showinfo());
		
		ArrayList<String> li = new ArrayList<>();
		ArrayList<Integer> li2 = new ArrayList<>();
		ArrayList<Integer> li3 = new ArrayList<>();
		li.add("sf");
		li.add("sdf");
		li.add("sfdf");
		System.out.println(li.indexOf("sf"));
		System.out.println(li.get(2));
		System.out.println(li);
		li2.add(2);
		li2.add(5);
		li2.add(1);
		li2.add(10);
		li3.add(3);
		li3.add(4);
		li3.add(1);
		li3.add(17);
		
		for(int s : li2) {
			System.out.println(s);
		}
		
		li2.sort(null);
		System.out.println(li2);
		
		
		

	}

}
