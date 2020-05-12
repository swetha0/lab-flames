package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import service.FlamesCheckService;

public class TestFlamesCheckService {
	FlamesCheckService fcs = new FlamesCheckService();
	@Test
 	public void testFindFlamesMethod() {
		String name1 = "Alex";
 		String name2 = "Joylin";
 		char temp = 'a';
 		assertEquals(temp,FlamesCheckService.findFlames(name1, name2));
 		name1 = "Steffe";
 		name2 = "Bobby";
 		temp = 'm';
 		assertEquals(temp,FlamesCheckService.findFlames(name1, name2));
 		name1 = "John";
 		name2 = "Jully";
 		temp = 'e';
 		assertEquals(temp,FlamesCheckService.findFlames(name1, name2));
 		name1 = "George";
 		name2 = "Neythiri";
 		temp = 'l';
 	    assertEquals(temp,FlamesCheckService.findFlames(name1, name2));
 		try {
 			FlamesCheckService.findFlames(null, null);
 			FlamesCheckService.findFlames("AAA", null);
 			FlamesCheckService.findFlames(null, "BBB");
 		}
 		catch(Exception e) {
 			e.printStackTrace();
 		}
	}
}
