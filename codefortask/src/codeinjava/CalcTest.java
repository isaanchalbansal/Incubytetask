package codeinjava ;
import static org.junit.Assert.assertEquals;  
import org.junit.Test;
public class CalcTest {
  public static void main(String args[]) {
    org.junit.runner.JUnitCore.main("codeinjava.CalcTest");
  }
  @Test
  public void emptyString() {
    assertEquals(0, StringCalc.add(""));
  }
  @Test
  public void singleNumber(){
    assertEquals(1, StringCalc.add("1"));
  }
  @Test
  public void testTwoStrings(){
    assertEquals(3, StringCalc.add("1,2"));
  }
  @Test
  public void testMultipleNumbers(){
	  assertEquals(18, StringCalc.add("4,6,8"));
  }
  @Test
  public void testwithNewLine(){
    assertEquals(6, StringCalc.add("1\n2,3"));
  }
  @Test
  public void testOtherDelimiter(){
    assertEquals(3, StringCalc.add("//;\n1;2"));
  }
  @Test
  public void testForNegatives(){
    try {
      StringCalc.add("-4,6");
    }
    catch (IllegalArgumentException e){
      assertEquals(e.getMessage(), "Negatives not allowed: -4");
    }
    try {
      StringCalc.add("1,-2,3,-4");
    }
    catch (IllegalArgumentException e){
      assertEquals(e.getMessage(), "Negatives not allowed: -2,-4");
    }
  }

}
