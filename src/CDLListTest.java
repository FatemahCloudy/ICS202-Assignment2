import static org.junit.Assert.*;
import org.junit.Test;

public class CDLListTest {
    @Test
    public void testEmptyList() {
        CDLList<Integer> list = new CDLList<>();
        assertEquals(list.size(), 0);
        assertFalse(list.delete(5));
        assertNull(list.findMiddle());
    }
    @Test
    public void testAdd() {
        CDLList<Integer> list = new CDLList<>();
        list.add(5);
        assertEquals(list.size(), 1);
    }
    @Test
    public void testDelete() {
        CDLList<Integer> list = new CDLList<>();
        list.add(5);
        assertTrue(list.delete(5));
    }
    @Test
    public void testFindMiddleOdd() {
        CDLList<Integer> list = new CDLList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        assertEquals(list.findMiddle(), Integer.valueOf(6));
    }
    @Test
    public void testFindMiddleEven() {
        CDLList<Integer> list = new CDLList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        assertEquals(list.findMiddle(), Integer.valueOf(6));
    }
    @Test
    public void testSize() {
        CDLList<Integer> list = new CDLList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        assertEquals(list.size(), 3);
    }
    @Test
    public void testReverse() {
        CDLList<Integer> list = new CDLList<>();
        for (int i = 0; i <= 10; i+= 1) {
            list.add(i);
        }
        System.out.println("Check if the list was reversed");
        list.display();
        list.reverse();
        list.display();
    }

}