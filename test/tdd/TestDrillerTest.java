package tdd;

import chapterFour.TestDriller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

    @Test
    public void testOneToFourCopies(){
        TestDriller jambDrill = new TestDriller();
        int total = jambDrill.jambPractice(1);
        assertEquals(2000,total);
    }

    @Test
    public void testFiveToNine(){
        TestDriller jambDrill = new TestDriller();
        int total = jambDrill.jambPractice(5);
        assertEquals(9500,total);
    }

    @Test
    public void testTenToTwentyNine(){
        TestDriller jambDrill = new TestDriller();
        int total = jambDrill.jambPractice(10);
        assertEquals(16_000,total);
    }

    @Test
    public void testThirtyToFortyNine(){
        TestDriller jambDrill = new TestDriller();
        int total = jambDrill.jambPractice(30);
        assertEquals(45_000, total);
    }

    @Test
    public void testFiftyToNinetyNine(){
        TestDriller jambDrill = new TestDriller();
        int total = jambDrill.jambPractice(50);
        assertEquals(65_000, total);
    }

    @Test
    public void testHundredToHundredAndNinetyNine(){
        TestDriller jambDrill = new TestDriller();
        int total = jambDrill.jambPractice(100);
        assertEquals(120_000, total);
    }

    @Test
    public void testTwoHundredToFourHundredAndNinetyNine(){
        TestDriller jambDrill = new TestDriller();
        int total = jambDrill.jambPractice(200);
        assertEquals(220_000, total);
    }

    @Test
    public void testfiveHundredAndAbove() {
        TestDriller jambDrill = new TestDriller();
        int total = jambDrill.jambPractice(500);
        assertEquals(500_000, total);
    }
}
