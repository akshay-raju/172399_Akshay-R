package assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Trader;
import pojo.Transaction;

public class Test {
	public static void main(String[] args) {
		
		Trader p=new Trader("akshay","bangalore");
		Trader q=new Trader("rohit","pune");
		Trader r=new Trader("ankit","bombay");
		Trader s=new Trader("venkat","mumbai");
		Trader t=new Trader("revanth","andhra");
		
		List<Transaction> list=new ArrayList<Transaction>();
		list.add(new Transaction(p, 2011, 10000));
		list.add(new Transaction(q, 2014, 10500));
		list.add(new Transaction(r, 2018, 1500));
		list.add(new Transaction(s, 2019, 15000));
		list.add(new Transaction(t, 2011, 20000));
		
		List<Transaction> filter=list.stream().filter(e->e.getYear()==2011).sorted((x,y)->x.getValue().compareTo(y.getValue())).collect(Collectors.toList());
		filter.stream().forEach(System.out::println);
	}

}
