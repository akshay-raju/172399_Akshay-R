package assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Trader;

public class Assignment12 {

	public static void main(String[] args) {
		
			List<Trader> list=new ArrayList<Trader>();
			list.add(new Trader("akshay","bangalore"));
			list.add(new Trader("rohit","pune"));
			list.add(new Trader("venkat","bangalore"));
			list.add(new Trader("revanth","andhra"));
			list.add(new Trader("ankit","indore"));
			list.add(new Trader("himesh","pune"));
			list.add(new Trader("ram","indore"));
			list.add(new Trader("adithya","pune"));
			
			List<String> indore=list.stream().filter(e->e.getCity().equals("indore")).map(Trader::getName).collect(Collectors.toList());
			if(indore.isEmpty())
				System.out.println("traders in indore not found");
			else
			indore.stream().forEach(System.out::println);

	}

}
