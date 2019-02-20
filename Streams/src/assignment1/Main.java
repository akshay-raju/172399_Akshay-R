package assignment1;

import java.util.List;
import java.util.stream.Collectors;

import pojo.Fruit;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
public static void main(String[] args) {
	List<Fruit> list=new ArrayList<>();
	list.add(new Fruit("apple", 130, 80, "red"));
	list.add(new Fruit("bannana", 80, 260, "yellow"));
	list.add(new Fruit("strawberry", 150, 180, "red"));
	list.add(new Fruit("litchi", 90, 60, "yellow"));
	list.add(new Fruit("chikku", 130, 80, "red"));
	list.add(new Fruit("watermelon", 80, 160, "yellow"));
	
	List<Fruit> list2=list.stream()
			.filter(p->p.getCalories()<100)
			.sorted(Comparator.comparing(Fruit::getCalories).reversed())
			
			.collect(Collectors.toList());
			list2.forEach(e->System.out.println("Fruit : "+e.getName()+" with calories: "+e.getCalories()));	
}
}
