package arrayGraceAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArrayAssignmentTest {
    ArrayAssignment arrayAssignment ;
    @BeforeEach

    void startAllTestWith(){
        arrayAssignment = new ArrayAssignment();
        assertNotNull(arrayAssignment);
    }

    @Test
    void testMultiplyEachNumberByItSelf(){
         int [] array = {2,4,6,3,5,1};
         int [] numb = {4,16,36,9,25,1};
         assertArrayEquals(numb,arrayAssignment.Multiply(array));

    }
    @Test
    void testAscendingNumbers(){
     int [] array = {2,4,6,3,5,1} ;
     int [] ascendingNumbers = {1,2,3,4,5,6};
     assertArrayEquals(ascendingNumbers,arrayAssignment.Ascending(array));

    }

   @Test
    void testDescendingNumbers(){
        int [] array = {2,4,6,3,5,1};
        int [] descendingNumbers = {6,5,4,3,2,1};
        assertArrayEquals(descendingNumbers,arrayAssignment.Descending(array));
   }


}








