package raMavArt1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class FirstTest1 {
First _obj;
	
	@Test
	public void test1() {
		 _obj = new First();
		
		 String str = _obj.HelloPrint();
		 if (str.equals("Hello"))
			 System.out.println("pass");
		 else
			fail("FirstTestFailed");
		 
	}
	@Test
	public void test2()
	{
		 _obj = new First();
			
		 String str = _obj.HelloPrint();
		 if (str.equals("Hello"))
			 		fail("FirstTestFailed");
	}

}
