package com.sss;

import com.sss.ormbase.autogenerator.model.T;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EasyRunApplicationTests {

	@Test
	public void contextLoads() {
		T t = T.builder().c1(1).build();
		System.out.println(t);

		T t1 = new T();
		t1.setC1(1);
		t1.setC2(2);
		System.out.println(t1);
	}

}
