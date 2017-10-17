import junit.framework.TestCase;
import org.junit.Test;

import inlämningsuppgift02v2.FindID;

public class FindIDTest {
    FindID fid = new FindID();
    String customerNr = "7605251437";
    String pnr = "7605251437";
    String pnr2 = "7804231234";
    
    @Test
    public final void findIDSupportedTest() {
        TestCase.assertEquals(fid.findID(customerNr, pnr), 1);
        TestCase.assertEquals(fid.findID(customerNr, pnr2), 2);
        TestCase.assertTrue(fid.findID(customerNr, pnr) == 1);
        TestCase.assertFalse(fid.findID(customerNr, pnr) == 2);
                
    }
    
    
}
