package application;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		
		/* 
		 Contravariância
		 GET - ERROR
		 PUT - OK
		 */
		
		//Number x = myNums.get(0); 

	}

}
