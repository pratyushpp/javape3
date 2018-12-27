import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest
{
    private static StudentMarks studentMarks;



    @BeforeClass
    public static void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
       studentMarks = new StudentMarks();

    }

    @AfterClass
    public static void teardown()
    {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentMarks = null;

    }
   @SuppressWarnings("deprecation")
   @Test
   public void checkForGrades1() {

       //act

       String expected = "O";

       //arrange

       String result =studentMarks.checkForGrades(5,new int[]{92,96,91,94,98});

       //assert

       assertEquals(expected,result);

   }


    @Test

    public void checkForGrades2() {

        //act

        String expected ="E";

        //arrange

        String result= studentMarks.checkForGrades(3,new int[]{81,85,86});

        //assert

        assertEquals(expected,result);

    }

    @Test

    public void checkForGrades3() {

        //act

        String expected ="Error...please enter positive no students";

        //arrange

        String result= studentMarks.checkForGrades(0,new int[]{81,85,86});

        //assert

        assertEquals(expected,result);

    }

    @Test

    public void checkForGrades4() {

        //act

        String expected ="Error...marks for student"+3+"is more than 100";

        //arrange

        String result= studentMarks.checkForGrades(3,new int[]{81,85,105});

        //assert

        assertEquals(expected,result);

    }

    @Test

    public void checkForGrades5() {

        //act

        String expected ="Error...marks for student"+3+"is less than 0";

        //arrange

        String result= studentMarks.checkForGrades(3,new int[]{81,85,0});

        //assert

        assertEquals(expected,result);

    }

}


