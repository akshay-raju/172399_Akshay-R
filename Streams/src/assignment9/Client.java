package assignment9;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Trader;


public class Client {

	public static void main(String[] args) {
		List<Trader> list=new ArrayList<Trader>();
		list.add(new Trader("akshay","bangalore"));
		list.add(new Trader("rohit","pune"));
		list.add(new Trader("venkat","bangalore"));
		list.add(new Trader("revanth","andhra"));
		list.add(new Trader("ankit","bombay"));
		
		List<String> cities=list.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
		cities.stream().forEach(System.out::println);

	}

}
