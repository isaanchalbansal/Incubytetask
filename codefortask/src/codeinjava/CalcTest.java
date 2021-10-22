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
    
}
