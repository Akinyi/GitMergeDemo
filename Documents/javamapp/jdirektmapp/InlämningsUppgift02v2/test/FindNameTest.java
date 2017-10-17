import junit.framework.TestCase;
import org.junit.Test;

import inlämningsuppgift02v2.FindName;

public class FindNameTest {
    FindName fid = new FindName();
    String customerName = "Miguel Svansson";
    String name = "miguel svansson";
    String name2 = "Calculus Mittson";
    
    
    // WORKS
    @Test
    public final void findNameSupportedTest() {
        TestCase.assertEquals(fid.findName(customerName, name), 1);
        TestCase.assertEquals(fid.findName(customerName, name2), 2);
        TestCase.assertTrue(fid.findName(customerName, name) == 1);
        TestCase.assertFalse(fid.findName(customerName, name) == 2);
                
    }
    
    // WORKS
//    @Test
//    public final void findNameSupportedTest() {
//        TestCase.assertEquals(fid.findName(customerName, name), customerName);
//       
//        TestCase.assertTrue(fid.findName(customerName, name) == customerName);
//        TestCase.assertFalse(fid.findName(customerName, name2) == name2);
//                
//    }
    
    
}
