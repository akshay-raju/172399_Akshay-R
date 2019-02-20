package com.assignment2;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orders o=(p,n)->{
			if(p>10000 && (n=="accepted"||n=="completed"))
			{
				System.out.println("price is:" +p + "  status is :" + n);
			}
			return p;
		};
            o.order(5000, "rejected");
            o.order(15000, "accepted");
            o.order(9000, "rejected");
            o.order(11000, "completed");
	}

}
