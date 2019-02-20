package assignment5;

import java.util.List;
import java.util.stream.Collectors;

import pojo.News;

import java.util.ArrayList;

public class ClientTest {
	
	public static void main(String[] args) {
		List<News> list=new ArrayList<>();
		list.add(new News(101,"xyz","The budget is an  vote on acccount","Yeah True budget"));
		list.add(new News(102,"abc","Election notification yet to be released ","It will release by March"));
		list.add(new News(103,"def","sports","IPL "));
		list.add(new News(103,"xyz","budget","The budget is 23LAKH CRORES"));
		list.add(new News(101,"xyz","sports","First IPL mmatch is between CSK and RCB"));
		list.add(new News(101,"xyz","budget","The budget is an vote on acccount"));
		
	List<News> list1=list.stream().filter(n->n.getComment().contains("budget")).collect(Collectors.toList());
	long l=list1.stream().count();
	System.out.println("The word budget in comments  :"+l);
	
	}
}

