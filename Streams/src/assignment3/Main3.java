package assignment3;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Fruit;

import java.util.ArrayList;
import java.util.Comparator;

public class Main3 {
public static void main(String[] args) {
	List<Fruit> list=new ArrayList<>();
	list.add(new Fruit("apple", 130, 80, "red"));
	list.add(new Fruit("bannana", 80, 260, "yellow"));
	list.add(new Fruit("strawberry", 150, 180, "pink"));
	list.add(new Fruit("pomogranate", 80, 180, "red"));
	list.add(new Fruit("litchi", 90, 60, "white"));
	list.add(new Fruit("chikku", 130, 80, "brown"));
	list.add(new Fruit("watermelon", 80, 160, "red"));
	
	List<Fruit> list2=list.stream()
			.filter(e->e.getColor()=="red")
			.sorted(Comparator.comparing(Fruit::getPrice))
			
			.collect(Collectors.toList());
			list2.forEach(e->System.out.println(e.getName()+" "+e.getColor()+" "+e.getPrice()));
	
	
}
}
