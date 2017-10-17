import junit.framework.TestCase;
import org.junit.Test;

import inlämningsuppgift02v2.CheckMembership;

public class CheckMembershipTest {
    CheckMembership cm = new CheckMembership();
    String gymMember = "";
    int i =0, i2 = 1, i3 = -1;
    
    
    // WORKS
    @Test
    public final void checkMembershipSupportedTest() {
        TestCase.assertEquals(cm.checkMembership(i),"Nuvarande Medlem" );
        TestCase.assertEquals(cm.checkMembership(i2), "Före detta medlem");
        TestCase.assertTrue(cm.checkMembership(i) == "Nuvarande Medlem"  );
        TestCase.assertFalse(cm.checkMembership(i2) == "Nuvarande Medlem" );
        TestCase.assertTrue(cm.checkMembership(i3)== "Obehörig");
                
    }
}    
