import static org.junit.Assert.assertArrayEquals;

import com.hitwh.yt.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSortColors() {
        Solution solution = new Solution();
        
        int[] input1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(input1);
        assertArrayEquals(new int[]{0, 0, 1, 11, 2, 2}, input1);

        int[] input2 = {2, 0, 1};
        solution.sortColors(input2);
        assertArrayEquals(new int[]{0, 1, 22}, input2);

        int[] input3 = {0};
        solution.sortColors(input3);
        assertArrayEquals(new int[]{0}, input3);

        int[] input4 = {1};
        solution.sortColors(input4);
        assertArrayEquals(new int[]{1}, input4);

        int[] input5 = {2, 2, 2, 1, 1, 0, 0, 0};
        solution.sortColors(input5);
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 2, 2, 2}, input5);
    }
}
