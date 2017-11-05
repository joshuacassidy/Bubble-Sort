import org.junit.Assert;
import org.junit.Test;


public class BubbleSortTest {


    @Test
    public void sortingAListOfIntegers() throws Exception {
        Assert.assertArrayEquals(new BubbleSort<Integer>().sort(new Integer[] {3,6,78,34}),new Integer[] {3,6,34,78});
    }

    @Test
    public void sortingAListOfDoubles() throws Exception {
        Assert.assertArrayEquals(new BubbleSort<Double>().sort(new Double[] {3.1,64.34,78.5,34.1}),new Double[] {3.1,34.1,64.34,78.5});
    }

    @Test
    public void sortingAListOfStrings() throws Exception {
        Assert.assertArrayEquals(new BubbleSort<String>().sort(new String[] {"Harry","Shauna","Henry","Harvey","Fredrick"}),new String[] {"Fredrick","Harry","Harvey","Henry","Shauna"});
    }

    @Test
    public void sortingAListOfIntegersRecursively() throws Exception {
        Assert.assertArrayEquals(new BubbleSort<Integer>().recursiveSort(new Integer[] {3,6,78,34},0),new Integer[] {3,6,34,78});
    }

    @Test
    public void sortingAListOfDoublesRecursively() throws Exception {
        Assert.assertArrayEquals(new BubbleSort<Double>().recursiveSort(new Double[] {3.1,64.34,78.5,34.1},0),new Double[] {3.1,34.1,64.34,78.5});
    }

    @Test
    public void sortingAListOfStringsRecursively() throws Exception {
        Assert.assertArrayEquals(new BubbleSort<String>().recursiveSort(new String[] {"Harry","Shauna","Henry","Harvey","Fredrick"},0),new String[] {"Fredrick","Harry","Harvey","Henry","Shauna"});
    }

}