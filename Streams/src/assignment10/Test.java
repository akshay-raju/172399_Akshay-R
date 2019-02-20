package assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Trader;

public class Test {

	public static void main(String[] args) {
		List<Trader> list=new ArrayList<Trader>();
		list.add(new Trader("akshay","bangalore"));
		list.add(new Trader("rohit","pune"));
		list.add(new Trader("venkat","bangalore"));
		list.add(new Trader("revanth","andhra"));
		list.add(new Trader("ankit","bombay"));
		list.add(new Trader("himesh","pune"));
		list.add(new Trader("ram","pune"));
		list.add(new Trader("adithya","pune"));
		
		List<Trader> cities=list.stream().filter(e->e.getCity().equals("pune")).sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
		cities.stream().forEach(System.out::println);
	}

}
