package application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		/*
		 Covariância
		 GET - OK
		 PUT - ERROR
		 */
		//list.add(20);
		
	}

}
