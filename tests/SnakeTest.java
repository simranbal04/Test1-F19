//Simran Kaur Bal C0743319
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {
	
 
	 private String Peter;
//     private Snake1 Takis;
     private String favouritefood;
     private int length;
    
     public void Snake(String name, int length, String favoriteFood) {
 		this.Peter = Peter;
 		this.length = length;
 		this.favoriteFood = favoriteFood;
 	}

	@Before
	public void setUp() throws Exception {
		//making a new snake
		System.out.println("Testing");
//		favouriteFood = new coffee();
		
//		Peter = new snake1();
//		public Snake(String name, int length, String favoriteFood) {
//			snake1.Peter = Peter;
//			this.length = length;
//			this.favoriteFood = favoriteFood;
	}
	
	//Test case1 
	//1a if snake is healthy
		@Test
		public void isHealthy() {
			String favouriteFood = coffee;
			assertEquals(favouriteFood,favouriteFood);

			//1b if snake is unhealthy
			assertEquals(favouriteFood,vegetables);
			
			
		}
		
		//Test Case 2 
		

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
