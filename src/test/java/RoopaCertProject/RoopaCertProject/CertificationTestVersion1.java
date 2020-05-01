package RoopaCertProject.RoopaCertProject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CertificationTestVersion1 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CertificationTestVersion1( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CertificationTestVersion1.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void test1()
    {
        System.out.println("Version 1 of Devops certification project");
    }
}
