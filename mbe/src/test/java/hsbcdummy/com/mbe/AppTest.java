package hsbcdummy.com.mbe;

import hsbcdummy.com.mbe.makedummyrestfulcall.DummyRestfulCallMaker;

import org.powermock.api.mockito.PowerMockito;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    @SuppressWarnings("deprecation")
	public void dummyMethodIncludePowerMock(){
    	DummyRestfulCallMaker mockDummyRestfulCallMaker = PowerMockito.mock(DummyRestfulCallMaker.class);
        PowerMockito.when(mockDummyRestfulCallMaker.returnTwo()).thenReturn(0);
        Assert.assertEquals(0, mockDummyRestfulCallMaker.returnTwo());
    }
    
}
