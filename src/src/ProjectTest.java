import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
public class ProjectTest {

    Project einfach, mittel, lang, leer;

    @Before
    public void setUp() {
        einfach = new Project(new String[][]{{"A","B"},{"B","C"}});
        mittel = new Project(new String[][]{{"A","B"},{"B","C"},{"C","D"}});
        lang = new Project(new String[][]{{"A","B"},{"B","C"},{"C","D"},{"D","E"},{"E","F"}});
    }

    @Test
    public void isWellSorted_leer_True() { assertTrue(leer.isWellSorted(new String[]{})); }

    @Test
    public void iswellSorted_einfach1_True() { assertTrue(mittel.isWellSorted(new String[]{"A","B"}));}

    @Test
    public void iswellSorted_mittel1_True() { assertTrue(mittel.isWellSorted(new String[]{"A","B","C","D"}));}

    @Test
    public void iswellSorted_mittel2_True() { assertTrue(mittel.isWellSorted(new String[]{"B","A","C","D"}));}

    @Test
    public void iswellSorted_mittel3_False() { assertTrue(mittel.isWellSorted(new String[]{"A","B","D","C"}));}

    @Test
    public void iswellSorted_lang1_True() { assertTrue(mittel.isWellSorted(new String[]{"A","B","C","D","E","F"}));}

    @Test
    public void iswellSorted_lang2_False() { assertTrue(mittel.isWellSorted(new String[]{"A","B","F","E","D","C"}));}



}
