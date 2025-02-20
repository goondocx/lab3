import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests 
{
	@Test 
	public void testReverseInPlace() 
  {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() 
  {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2()
  {
    int[] input = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input);
  }

  @Test
  public void testReversed2()
  {
    int[] input = {7, 8, 1, 4};
    assertArrayEquals(new int[]{4, 1, 8, 7}, ArrayExamples.reversed(input));
  }

}
