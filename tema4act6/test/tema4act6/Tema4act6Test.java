/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tema4act6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laura
 */
public class Tema4act6Test {
    
    public Tema4act6Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test donde se comprueba la solución con 5 grados ºF a ºC
     */
    @Test
    public void testFahrenheittocelsiu_5() {
        System.out.println("fahrenheittocelsius");
        double num = -5.0;
        double expResult = -20.5556;
        double result = Tema4act6.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la solución con 0 grados ºF a ºC
     */
    @Test
    public void testFahrenheittocelsius_0() {
        System.out.println("fahrenheittocelsius");
        double num = 0.0;
        double expResult = -17.7778;
        double result = Tema4act6.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la solución con 15 grados ºF a ºC
     */
    @Test
    public void testFahrenheittocelsius_15() {
        System.out.println("fahrenheittocelsius");
        double num = 15.0;
        double expResult = -9.4444;
        double result = Tema4act6.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la solución con 32 grados ºF a ºC
     */
    @Test
    public void testFahrenheittocelsius_32() {
        System.out.println("fahrenheittocelsius");
        double num = 32.0;
        double expResult = 0.0;
        double result = Tema4act6.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test donde se comprueba la solución con -5 grados ºC a ºF
     */
    @Test
    public void testCelsiustofahrenheit5() {
        System.out.println("celsiustofahrenheit");
        double num = -5.0;
        double expResult = 23.0;
        double result = Tema4act6.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la solución con 0 grados ºC a ºF
     */
    @Test
    public void testCelsiustofahrenheit0() {
        System.out.println("celsiustofahrenheit");
        double num = 0.0;
        double expResult = 32.0;
        double result = Tema4act6.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la solución con 15 grados ºC a ºF
     */
    @Test
    public void testCelsiustofahrenheit15() {
        System.out.println("celsiustofahrenheit");
        double num = 15.0;
        double expResult = 59.0;
        double result = Tema4act6.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la solución con 32 grados ºC a ºF
     */
    @Test
    public void testCelsiustofahrenheit32() {
        System.out.println("celsiustofahrenheit");
        double num = 32.0;
        double expResult = 89.6;
        double result = Tema4act6.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of main method, of class Tema4act6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Tema4act6.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * La X significa 10, la I significa I
     */
    @Test
    public void testRoman2dec() {
        System.out.println("roman2dec");
        String uno = "XXI";
        int expResult = 21;
        int result = Tema4act6.roman2dec(uno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * La M significa 1000, la X significa 10, la V significa 5 y la I significa 1
     */
    @Test
    public void testDec2roman() {
        System.out.println("dec2roman");
        int dos = 2016;
        String expResult = "MMXVI";
        String result = Tema4act6.dec2roman(dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of dollar2euro method, of class Tema4act6.
     */
    @Test
    public void testDollar2euro() {
        System.out.println("dollar2euro");
        double d = 10.5;
        double expResult = 9.39;
        double result = Tema4act6.dollar2euro(d);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of euro2dollar method, of class Tema4act6.
     */
    @Test
    public void testEuro2dollar() {
        System.out.println("euro2dollar");
        double e = 20.30;
        double expResult = 22.72;
        double result = Tema4act6.euro2dollar(e);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
