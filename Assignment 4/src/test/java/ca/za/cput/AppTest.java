package ca.za.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    /**
     * Rigorous Test :-)
     */

    @Test
    public void testingPostGrad() throws Exception
    {
        Student stud = new PostGrad("Name","StudentNumber", 50.00);
        Assert.assertEquals("Matthew", "Name",stud.getName());
        Assert.assertEquals("216011671","StudentNumber",((PostGrad)stud).getNum());
        Assert.assertEquals("50.00",50.00,((PostGrad)stud).getLoanAmount(),0);
    }

    @Test
    public void testingUnderGrad(){
     Student stud1 = new UnderGrad("Name","StudentNumber", 50.00);
     Assert.assertEquals("Matthew", "Name",stud1.getName());
     Assert.assertEquals("216011671 ","StudentNumber",((UnderGrad)stud1).getNum());
     Assert.assertEquals("50.00",50.00,((UnderGrad)stud1).getLoanAmount(),0);
}

}
