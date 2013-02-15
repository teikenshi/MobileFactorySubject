package jec.CM12.test;

import static org.junit.Assert.*;
import jec.CM12.java.DataEntity;
import jec.CM12.java.SimpleJudgeToolsImp;

import org.junit.Before;
import org.junit.Test;


public class SimpleJudgeToolsImpTest {
	private static SimpleJudgeToolsImp sjt = new SimpleJudgeToolsImp(); 
	DataEntity pe;
	
	@Before
	public void setUp() throws Exception {
		pe=new DataEntity();
	}
	
	@Test
	public void testSimpleJudge1() throws Exception {
		pe.setTime(10);
		pe.setStart(11);
		pe.setEnd(11);
		
		assertEquals(sjt.createMessage(pe, false, false),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge2() throws Exception {
		pe.setTime(11);
		pe.setStart(11);
		pe.setEnd(11);
		
		assertEquals(sjt.createMessage(pe, true, false),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge3() throws Exception {
		pe.setTime(12);
		pe.setStart(11);
		pe.setEnd(11);
		
		assertEquals(sjt.createMessage(pe, false, false),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge4() throws Exception {
		pe.setTime(9);
		pe.setStart(10);
		pe.setEnd(12);
		
		assertEquals(sjt.createMessage(pe, false, false),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge5() throws Exception {
		pe.setTime(10);
		pe.setStart(10);
		pe.setEnd(12);
		
		assertEquals(sjt.createMessage(pe, true, false),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge6() throws Exception {
		pe.setTime(11);
		pe.setStart(10);
		pe.setEnd(12);
		
		assertEquals(sjt.createMessage(pe, true, false),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge7() throws Exception {
		pe.setTime(12);
		pe.setStart(10);
		pe.setEnd(12);
		
		assertEquals(sjt.createMessage(pe, false, false),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge8() throws Exception {
		pe.setTime(13);
		pe.setStart(10);
		pe.setEnd(12);
		
		assertEquals(sjt.createMessage(pe, false, false),sjt.simpleJudge(pe));
	}
	@Test
	public void testSimpleJudge9() throws Exception {
		pe.setTime(9);
		pe.setStart(12);
		pe.setEnd(10);
		
		assertEquals(sjt.createMessage(pe, true, true),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge10() throws Exception {
		pe.setTime(10);
		pe.setStart(12);
		pe.setEnd(10);
		
		assertEquals(sjt.createMessage(pe, false, true),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge11() throws Exception {
		pe.setTime(11);
		pe.setStart(12);
		pe.setEnd(10);
		
		assertEquals(sjt.createMessage(pe, false, true),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge12() throws Exception {
		pe.setTime(12);
		pe.setStart(12);
		pe.setEnd(10);
		
		assertEquals(sjt.createMessage(pe, true, true),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge13() throws Exception {
		pe.setTime(13);
		pe.setStart(12);
		pe.setEnd(10);
		
		assertEquals(sjt.createMessage(pe, true, true),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge14() throws Exception {
		pe.setTime(0);
		pe.setStart(23);
		pe.setEnd(0);
		
		assertEquals(sjt.createMessage(pe, false, true),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge15() throws Exception {
		pe.setTime(11);
		pe.setStart(23);
		pe.setEnd(0);
		
		assertEquals(sjt.createMessage(pe, false, true),sjt.simpleJudge(pe));
	}
	
	@Test
	public void testSimpleJudge16() throws Exception {
		pe.setTime(23);
		pe.setStart(23);
		pe.setEnd(0);
		
		assertEquals(sjt.createMessage(pe, true, true),sjt.simpleJudge(pe));
	}
}
