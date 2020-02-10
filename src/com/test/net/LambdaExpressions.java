package com.test.net;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpressions {
	
	public static void main(String args[]) {
		Map<String, Object> testMap  = new HashMap<>();
		testMap.put("Hello", 1);
		testMap.put("Hello1", 2);
		System.out.println("testMap====="+testMap.remove("Hello"));
		testMap.entrySet().stream().map(entry -> String.format("%s : %s", entry.getKey(), entry.getValue()))
        .forEach(System.out::println);
	}
	
}
interface myAdd{
	int add(int a,int b);
	void foo();
}