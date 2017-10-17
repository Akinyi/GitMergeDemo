import junit.framework.TestCase;
import org.junit.Test;

import inlämningsuppgift02v2.CompareLastInlogg;
import java.time.Period;

public class CompareLastInloggTest {
    CompareLastInlogg cli = new CompareLastInlogg();
    String date = "2016-12-22";
    String date2 = "2015-08-02";
   
    @Test
    public final void compareLastInloggSupportedTest() {
        TestCase.assertEquals(cli.compareLastInlogg(date), 0);
        TestCase.assertEquals(cli.compareLastInlogg(date2), 2);
        TestCase.assertTrue(cli.compareLastInlogg(date) == 0 );
        TestCase.assertFalse(cli.compareLastInlogg(date2)== 1);
                
    }
}    
