package com.assignment8;

public class Test8 {

	public static void main(String[] args) {
		 Runnable r= ()->
         {for(int i=0;i<10;i++) 
         {
       	  System.out.println("mythread  "+i);
         }
	
         };
 Thread t=new Thread(r); 
 t.start();
 try {
	Thread.sleep(900000000);
} catch (InterruptedException e) {
	
System.out.println("interrupted exception in thread");
}
 for(int i=11;i<20;i++) 
 {
	  System.out.println("main thread"+i);
 }
	}

}
