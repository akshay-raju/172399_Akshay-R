package assignment11;

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
		
		String  names=list.stream().map(Trader::getName).sorted().collect(Collectors.joining(", "));
		System.out.println("the sorted names in string format is :");
		System.out.println("------------------------------------------------------------");
		System.out.println(names);
}
}
