package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import pojo.News;

public class Test4 {

	public static void main(String[] args) {
		
			List<News> list=new ArrayList<>();
			list.add(new News(1,"pqr","The budget is an  vote on acccount","Yeah True"));
			list.add(new News(2,"abc","Election notification yet to be released ","It will release by March"));
			list.add(new News(3,"def","sports","IPL "));
			list.add(new News(3,"pqr","budget","The budget is 23LAKH CRORES"));
			list.add(new News(1,"pqr","sports","First IPL mmatch is between CSK and RCB"));
			list.add(new News(1,"pqr","budget","The budget is an vote on acccount"));
			
		Map<Object, Long> map=list.stream().collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));
		
		System.out.println(map);
		long maxval=(Collections.max(map.values()));
		System.out.println(maxval);
		for(Map.Entry<Object, Long> entry:map.entrySet())
		{
			if(entry.getValue()==maxval)
			{
				System.out.println(entry.getKey());
		}
		}
	}

}
