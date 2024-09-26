import org.junit.*;

import static org.junit.Assert.assertEquals;

public class unitTesting {
    @Test
    public void testSquare(){
       Modle mod= new Modle();
       int result= mod.square(5);
      assertEquals(25,result);
      System.out.println("success");
    }
    // after testing each Test case
    @After
    public void testgPer(){
        System.out.println("Test Passed");
    }
    //  before tesing a class
    @BeforeClass
    public static void openingConnection(){
        System.out.println("Connection Opening Process");
    }
    //  run:before Testing test case
    @Before
    public void confirmingOpeningConnection(){
        System.out.println("Connection Opened Successful");
    }
    @AfterClass
    public static void confirmConnectionClosing(){
        System.out.println("Connection Closed Successful");
    }
    @Test
    public void testAdd(){
      int sum=mod.add(10,2);
      assertEquals(12,sum);
    }
     @Test
    public void divideTest(){
        int divide=mod.divide(25,5);
        assertEquals(5,divide);
    }
}
