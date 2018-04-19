package com.itheima.girl;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class GirlApplication {

	public static void main(String[] args) {
		String aa=new String("ss");


		System.out.println("ss"==aa);//false
		System.out.println("ss".equals(aa));//true
		System.out.println("ss"=="ss");//true

	}

	public GirlApplication() {



	}


	@Test
	public void smallCase_01(){




	}


}
