package test.java;

import main.java.Ball;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BallTester {


    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    private static void testing2(int actual, int expected) {
        assertNotEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests maxBall");
        testing(Ball.maxBall(15), 4);
        testing(Ball.maxBall(37), 10);
        testing(Ball.maxBall(45), 13);
        testing(Ball.maxBall(99), 28);
        testing(Ball.maxBall(85), 24);
    }

//    @Test
//    public void testBoundary(){
//        testing2(Ball.maxBall(Integer.MAX_VALUE), 10);
//        testing2(Ball.maxBall(Integer.MIN_VALUE), 10);
//        testing2(Ball.maxBall(0), 0);
//        testing2(Ball.maxBall(10), 0);
//        testing2(Ball.maxBall(0), 10);
//    }
}
