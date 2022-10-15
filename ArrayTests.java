import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1, 2, 3, 4, 5, 6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  //this test passes
  @Test
  public void testaverageWithoutLowest(){
    //takes in doubles
    double[] input1 = {10.0, 20.0, 30.0, 40.0, 50.0};
    assertEquals(35.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  //test double of lowest number
  @Test
  public void testaverageWithoutLowest2(){
    //takes in doubles
    double[] input1 = {10.0, 10.0, 20.0, 30.0, 40.0, 50.0};
    assertEquals(35.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

}


