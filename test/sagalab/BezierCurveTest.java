
package sagalab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class BezierCurveTest {
    
    /**
     * Test of evaluate method, of class BezierCurve.
     */
    @Test
    public void testEvaluate() {
        System.out.println("evaluate");
        {
        BezierCurve instance = new BezierCurve(Arrays.asList(new Point(1.0, 1.0)));
        Point p0 = instance.evaluate(0.0);
        assertEquals(1.0, p0.getX(), 1.0e-10);
        assertEquals(1.0, p0.getY(), 1.0e-10);
        Point p1 = instance.evaluate(0.25);
        assertEquals(1.0, p1.getX(), 1.0e-10);
        assertEquals(1.0, p1.getY(), 1.0e-10);
        Point p2 = instance.evaluate(0.5);
        assertEquals(1.0, p2.getX(), 1.0e-10);
        assertEquals(1.0, p2.getY(), 1.0e-10);
        Point p3 = instance.evaluate(0.75);
        assertEquals(1.0, p3.getX(), 1.0e-10);
        assertEquals(1.0, p3.getY(), 1.0e-10);
        Point p4 = instance.evaluate(1.0);
        assertEquals(1.0, p4.getX(), 1.0e-10);
        assertEquals(1.0, p4.getY(), 1.0e-10);
        }
        {
        BezierCurve instance = new BezierCurve(Arrays.asList(new Point(-1.0, -1.0), new Point(1.0, 1.0)));
        Point p0 = instance.evaluate(0.0);
        assertEquals(-1.0, p0.getX(), 1.0e-10);
        assertEquals(-1.0, p0.getY(), 1.0e-10);
        Point p1 = instance.evaluate(0.25);
        assertEquals(-0.5, p1.getX(), 1.0e-10);
        assertEquals(-0.5, p1.getY(), 1.0e-10);
        Point p2 = instance.evaluate(0.5);
        assertEquals(0.0, p2.getX(), 1.0e-10);
        assertEquals(0.0, p2.getY(), 1.0e-10);
        Point p3 = instance.evaluate(0.75);
        assertEquals(0.5, p3.getX(), 1.0e-10);
        assertEquals(0.5, p3.getY(), 1.0e-10);
        Point p4 = instance.evaluate(1.0);
        assertEquals(1.0, p4.getX(), 1.0e-10);
        assertEquals(1.0, p4.getY(), 1.0e-10);
        }
        {
        BezierCurve instance = new BezierCurve(Arrays.asList(new Point(-1.0, 0.0), new Point(0.0, 2.0), new Point(1.0, 0.0)));
        Point p0 = instance.evaluate(0.0);
        assertEquals(-1.0, p0.getX(), 1.0e-10);
        assertEquals(0.0, p0.getY(), 1.0e-10);
        Point p1 = instance.evaluate(0.25);
        assertEquals(-0.5, p1.getX(), 1.0e-10);
        assertEquals(0.75, p1.getY(), 1.0e-10);
        Point p2 = instance.evaluate(0.5);
        assertEquals(0.0, p2.getX(), 1.0e-10);
        assertEquals(1.0, p2.getY(), 1.0e-10);
        Point p3 = instance.evaluate(0.75);
        assertEquals(0.5, p3.getX(), 1.0e-10);
        assertEquals(0.75, p3.getY(), 1.0e-10);
        Point p4 = instance.evaluate(1.0);
        assertEquals(1.0, p4.getX(), 1.0e-10);
        assertEquals(0.0, p4.getY(), 1.0e-10);
        }
        {
        BezierCurve instance = new BezierCurve(Arrays.asList(new Point(-1.0, 1.0), new Point(-1.0, -1.0), new Point(1.0, 1.0), new Point(1.0, -1.0)));
        Point p0 = instance.evaluate(0.0);
        assertEquals(-1.0, p0.getX(), 1.0e-10);
        assertEquals(1.0, p0.getY(), 1.0e-10);
        Point p1 = instance.evaluate(0.25);
        assertEquals(-11.0/16.0, p1.getX(), 1.0e-10);
        assertEquals(0.125, p1.getY(), 1.0e-10);
        Point p2 = instance.evaluate(0.5);
        assertEquals(0.0, p2.getX(), 1.0e-10);
        assertEquals(0.0, p2.getY(), 1.0e-10);
        Point p3 = instance.evaluate(0.75);
        assertEquals(11.0/16.0, p3.getX(), 1.0e-10);
        assertEquals(-0.125, p3.getY(), 1.0e-10);
        Point p4 = instance.evaluate(1.0);
        assertEquals(1.0, p4.getX(), 1.0e-10);
        assertEquals(-1.0, p4.getY(), 1.0e-10);
        }        
    }

    /**
     * Test of getControlPoints method, of class BezierCurve.
     */
    @Test
    public void testGetControlPoints() {
        System.out.println("getControlPoints");
        BezierCurve instance = new BezierCurve(Arrays.asList(new Point(-1.0, 1.0), new Point(-1.0, -1.0), new Point(0.0, 0.0), new Point(1.0, 1.0), new Point(1.0, -1.0)));
        List<Point> result = instance.getControlPoints();
        assertEquals(-1.0, result.get(0).getX(), 1.0e-10);
        assertEquals(1.0, result.get(0).getY(), 1.0e-10);
        assertEquals(-1.0, result.get(1).getX(), 1.0e-10);
        assertEquals(-1.0, result.get(1).getY(), 1.0e-10);
        assertEquals(0.0, result.get(2).getX(), 1.0e-10);
        assertEquals(0.0, result.get(2).getY(), 1.0e-10);
        assertEquals(1.0, result.get(3).getX(), 1.0e-10);
        assertEquals(1.0, result.get(3).getY(), 1.0e-10);
        assertEquals(1.0, result.get(4).getX(), 1.0e-10);
        assertEquals(-1.0, result.get(4).getY(), 1.0e-10);
    }

    /**
     * Test of getDegree method, of class BezierCurve.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        
        BezierCurve instance0 = new BezierCurve(Arrays.asList(new Point(1.0, 1.0)));
        assertEquals(Integer.valueOf(0), instance0.getDegree());
        
        BezierCurve instance1 = new BezierCurve(Arrays.asList(new Point(-1.0, -1.0), new Point(1.0, 1.0)));
        assertEquals(Integer.valueOf(1), instance1.getDegree());
        
        BezierCurve instance2 = new BezierCurve(Arrays.asList(new Point(-1.0, 0.0), new Point(0.0, 2.0), new Point(1.0, 0.0)));
        assertEquals(Integer.valueOf(2), instance2.getDegree());
        
        BezierCurve instance3 = new BezierCurve(Arrays.asList(new Point(-1.0, 1.0), new Point(-1.0, -1.0), new Point(1.0, 1.0), new Point(1.0, -1.0)));
        assertEquals(Integer.valueOf(3), instance3.getDegree());
    }
    
    /**
     * Test whether BezierCurve class is immutable.
     */
    @Test
    public void testImmutable(){
        System.out.println("immutable");

        List<Point> controlPoints = Arrays.asList(new Point(-1.0, -1.0), new Point(0.0, 1.0), new Point(1.0, -1.0));
        List<Point> argument = new ArrayList<>(controlPoints);
        BezierCurve curve = new BezierCurve(argument);
        
        argument.clear();
        List<Point> cp1 = curve.getControlPoints();
        assertEquals(controlPoints.get(0).getX(), cp1.get(0).getX(), 1.0e-10);
        assertEquals(controlPoints.get(0).getX(), cp1.get(0).getX(), 1.0e-10);
        assertEquals(controlPoints.get(1).getX(), cp1.get(1).getX(), 1.0e-10);
        assertEquals(controlPoints.get(1).getX(), cp1.get(1).getX(), 1.0e-10);
        assertEquals(controlPoints.get(2).getX(), cp1.get(2).getX(), 1.0e-10);
        assertEquals(controlPoints.get(2).getX(), cp1.get(2).getX(), 1.0e-10);
            
        curve.getControlPoints().clear();
        List<Point> cp2 = curve.getControlPoints();
        assertEquals(controlPoints.get(0).getX(), cp2.get(0).getX(), 1.0e-10);
        assertEquals(controlPoints.get(0).getX(), cp2.get(0).getX(), 1.0e-10);
        assertEquals(controlPoints.get(1).getX(), cp2.get(1).getX(), 1.0e-10);
        assertEquals(controlPoints.get(1).getX(), cp2.get(1).getX(), 1.0e-10);
        assertEquals(controlPoints.get(2).getX(), cp2.get(2).getX(), 1.0e-10);
        assertEquals(controlPoints.get(2).getX(), cp2.get(2).getX(), 1.0e-10);
            
        curve.evaluate(0.5);
        List<Point> cp3 = curve.getControlPoints();
        assertEquals(controlPoints.get(0).getX(), cp3.get(0).getX(), 1.0e-10);
        assertEquals(controlPoints.get(0).getX(), cp3.get(0).getX(), 1.0e-10);
        assertEquals(controlPoints.get(1).getX(), cp3.get(1).getX(), 1.0e-10);
        assertEquals(controlPoints.get(1).getX(), cp3.get(1).getX(), 1.0e-10);
        assertEquals(controlPoints.get(2).getX(), cp3.get(2).getX(), 1.0e-10);
        assertEquals(controlPoints.get(2).getX(), cp3.get(2).getX(), 1.0e-10);
            
        curve.getDegree();
        List<Point> cp4 = curve.getControlPoints();
        assertEquals(controlPoints.get(0).getX(), cp4.get(0).getX(), 1.0e-10);
        assertEquals(controlPoints.get(0).getX(), cp4.get(0).getX(), 1.0e-10);
        assertEquals(controlPoints.get(1).getX(), cp4.get(1).getX(), 1.0e-10);
        assertEquals(controlPoints.get(1).getX(), cp4.get(1).getX(), 1.0e-10);
        assertEquals(controlPoints.get(2).getX(), cp4.get(2).getX(), 1.0e-10);
        assertEquals(controlPoints.get(2).getX(), cp4.get(2).getX(), 1.0e-10);
    }
    
}
