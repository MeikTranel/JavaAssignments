package ut.edu.MeikTranel.JavaAssignments.ProceduralProgramming;


import edu.MeikTranel.JavaAssignments.ProceduralProgramming.ProceduralSorting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Meik on 21.08.2017.
 */
public class ProceduralSortingTest {

    @Test
    public void testBubbleSort() throws Exception {
        int[] source = new int[] {21,3,4};
        ProceduralSorting.BubbleSort(source);
        Assert.assertArrayEquals(new int[]{3,4,21},source);
    }

    @Test
    public void testSelectionSort() throws Exception {
        int[] source = new int[] {21,3,4};
        ProceduralSorting.selectionSort(source);
        Assert.assertArrayEquals(new int[]{3,4,21},source);
    }

    @Test
    public void testCharSort() throws Exception {
        String source = "Mein Name ist Meik Tranel!";
        String result = ProceduralSorting.charSort(source);
        Assert.assertEquals("    !MMNTaaeeeeiiiklmnnrst",result);
    }

}