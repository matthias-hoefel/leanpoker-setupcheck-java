package org.leanpoker.setupcheck;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetupCheckTest {

	@Test
	public void testSayHello_World_HelloWorld() {
		assertEquals("Hello World", SetupCheck.sayHello("World"));
	}

}
