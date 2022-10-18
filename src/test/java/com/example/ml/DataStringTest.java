package com.example.ml;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.example.ml.dataset.DataString;

public class DataStringTest {

    
    private DataString totestSAS;// Type as a String with String value;
    private DataString totestSAF;// Type as a String with Float value;
    private DataString totestSAI;// Type as a String with Integer value;

    private String testValueTrue="Hello Test";
    private float floatToAdd=1.5f;
    private String testAsFloatAdd="3.0";
    private int intToAdd=1;
    private float floatToDivedeBy=2.5f;
    private float floatToMultiplyBy=2.5f;


    @Before
    public void setUp(){
        totestSAS = new DataString();
        totestSAS.data="Hello Test";
        totestSAF = new DataString();
        totestSAF.data = "1.5";
        totestSAI = new DataString();
        totestSAI.data = "1";
        
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /*
     * Start Testing implantation of all DataString methodes 
     */
    @Test
    public void getDataDataString(){
        assertTrue(testValueTrue.equals(totestSAS.data));
    }
    @Test(expected = Exception.class)
    public void addFloatDataString() throws Exception{
        totestSAS.addFloat(floatToAdd);
    }
    @Test(expected = Exception.class)
    public void addIntDataString() throws Exception{
        totestSAS.addInt(intToAdd);
    }
    @Test(expected = Exception.class)
    public void divedDataString() throws Exception{
        totestSAS.divede(floatToDivedeBy);
    }
    @Test(expected = Exception.class)
    public void multiplyDataString() throws Exception{
        totestSAS.multiply(floatToMultiplyBy);
    }
    @Test
    public void toStringTest(){
        assertTrue(testValueTrue.equals(totestSAS.toString()));
        
    }
    @Test(expected = Exception.class)
    public void toFloatTest()throws Exception{
        totestSAS.toFloat();
        
    } 
    @Test(expected = Exception.class)
    public void toIntTest()throws Exception{
       totestSAS.toInt();
        
    }
    @Test
    public void asFloatAddFloat() throws Exception{
        totestSAF.addFloat(floatToAdd);
        assertTrue(testAsFloatAdd.equals(totestSAF.data));
    }

    

    

}
