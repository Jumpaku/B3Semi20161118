
package sagalab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class PointTest {

    /**
     * Test of getX method, of class Point.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");

        Point instance1 = new Point(2.0, 4.3);
        assertEquals(2.0, instance1.getX(), 1.0e-10);

        Point instance2 = new Point(-0.04, 6.3);
        assertEquals(-0.04, instance2.getX(), 1.0e-10);
    }

    /**
     * Test of getY method, of class Point.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");

        Point instance1 = new Point(2.0, 4.3);
        assertEquals(4.3, instance1.getY(), 1.0e-10);

        Point instance2 = new Point(-0.04, 6.3);
        assertEquals(6.3, instance2.getY(), 1.0e-10);
    }

    /**
     * Test of internalDivide method, of class Point.
     */
    @Test
    public void testInternalDivide() {
        System.out.println("internalDivide");
        
        Point result1 = Point.internalDivide(new Point(0.6, -0.7), new Point(9.4, 8.7), 1.0, 1.0);
        assertEquals(5.0, result1.getX(), 1.0e-10);
        assertEquals(4.0, result1.getY(), 1.0e-10);
        
        Point result2 = Point.internalDivide(new Point(4.5, -0.2), new Point(-10.5, 90.3), 2.0, 3.0);
        assertEquals(-1.5, result2.getX(), 1.0e-10);
        assertEquals(36.0, result2.getY(), 1.0e-10);
    }
    
}
