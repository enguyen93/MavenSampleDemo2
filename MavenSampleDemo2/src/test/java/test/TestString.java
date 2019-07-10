package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.first.StringOperation;

public class TestString {

	@Test
	public void concat() {
		StringOperation so = new StringOperation();
		String actual = so.concat("this is supposed to be a", " really long sentence that is concatenated");
		String expected = "this is supposed to be a really long sentence that is concatenated";
		assertEquals(expected, actual);
	}

	@Test
	public void howLong() {
		StringOperation so = new StringOperation();
		int actual = so.howLong("this should be like 22");
		int expected = 22;
		assertEquals(expected, actual);
	}

	@Test
	public void containsSomething() {
		StringOperation so = new StringOperation();
		boolean actual = so.containsSomething("This sentence should contain an a");
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
