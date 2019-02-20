package assignment15;

import java.util.ArrayList;
import java.util.List;

import pojo.Trader;
import pojo.Transaction;

public class CLientTest {

	public static void main(String[] args) {
		Trader p=new Trader("akshay","bangalore");
		Trader q=new Trader("rohit","delhi");
		Trader r=new Trader("ankit","bombay");
		Trader s=new Trader("venkat","mumbai");
		Trader t=new Trader("revanth","delhi");
		
		List<Transaction> list=new ArrayList<Transaction>();
		list.add(new Transaction(p, 2011, 10000));
		list.add(new Transaction(q, 2014, 10500));
		list.add(new Transaction(r, 2018, 1500));
		list.add(new Transaction(s, 2019, 15000));
		list.add(new Transaction(t, 2011, 20000));
		
		int minvalue=list.stream().min((x,y)->x.getValue().compareTo(y.getValue())).map(Transaction::getValue).get();
		System.out.println("The transaction with the smallest value is:"+minvalue);

	}

}
