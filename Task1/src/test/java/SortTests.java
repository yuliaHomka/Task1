import org.junit.Test;

public class SortTests {

    @Test
    public void Test1JustQuickSort() {
        int count =  (int) (Math.random() * 20 + 100);
        MyObjectArray array = new MyObjectArray(count);
        Sort sort = new Sort();
        array.print();
        sort.quickSort(array.getArray(), 0, count -1, true);
        array.print();
    }

    @Test
    public void Test2JustQuickSort() {
        int count = 10000;
        MyObjectArray array = new MyObjectArray(count);
        Sort sort = new Sort();
        array.print();
        sort.quickSort(array.getArray(), 0, count - 1, true);
        array.print();
    }

    @Test
    public void test3InsertionSort() {
        int count =  (int) (Math.random() * 9 + 1);
        MyObjectArray array = new MyObjectArray(count);
        Sort sort = new Sort();
        array.print();
        sort.insertionSort(array.getArray(), 0, count -1);
        array.print();
    }

    @Test
    public void test4CompareMedianOf3() {
        int count =  (int) (Math.random() * 100 + 100);
        MyObjectArray array = new MyObjectArray(count);
        MyObjectArray copyArray = array.copy();
        Sort sort = new Sort();
        array.print();

        sort.quickSort(array.getArray(), 0, count -1, false);
        array.print();
        int arrayCount = array.commonCompareCount();
        System.out.print("CompareCount withOUT medianOf3 = " + arrayCount);

        sort.quickSort(copyArray.getArray(), 0, count -1, true);
        int copyArrayCount = copyArray.commonCompareCount();
        System.out.print("  " + ((arrayCount > copyArrayCount) ? ">" : "<") + " ");
        System.out.println("CompareCount WITH medianOf3 = " + copyArrayCount);
    }

    @Test
    public void test5CompareMedianOf3() {
        int count =  (int) (Math.random() * 100 + 1000);
        MyObjectArray array = new MyObjectArray(count);
        MyObjectArray copyArray = array.copy();
        Sort sort = new Sort();
        array.print();

        sort.quickSort(array.getArray(), 0, count -1, false);
        array.print();
        int arrayCount = array.commonCompareCount();
        System.out.print("CompareCount withOUT medianOf3 = " + arrayCount);

        sort.quickSort(copyArray.getArray(), 0, count -1, true);
        int copyArrayCount = copyArray.commonCompareCount();
        System.out.print("  " + ((arrayCount > copyArrayCount) ? ">" : "<") + " ");
        System.out.println("CompareCount WITH medianOf3 = " + copyArrayCount);
    }

    @Test
    public void test6CompareMedianOf3() {
        int count =  (int) (Math.random() * 100 + 10000);
        MyObjectArray array = new MyObjectArray(count);
        MyObjectArray copyArray = array.copy();
        Sort sort = new Sort();
        array.print();

        sort.quickSort(array.getArray(), 0, count -1, false);
        array.print();
        int arrayCount = array.commonCompareCount();
        System.out.print("CompareCount withOUT medianOf3 = " + arrayCount);

        sort.quickSort(copyArray.getArray(), 0, count -1, true);
        int copyArrayCount = copyArray.commonCompareCount();
        System.out.print("  " + ((arrayCount > copyArrayCount) ? ">" : "<") + " ");
        System.out.println("CompareCount WITH medianOf3 = " + copyArrayCount);
    }

    @Test
    public void test7CompareMedianOf3() {
        int count =  (int) (Math.random() * 100 + 100000);
        MyObjectArray array = new MyObjectArray(count);
        MyObjectArray copyArray = array.copy();
        Sort sort = new Sort();
        array.print();

        sort.quickSort(array.getArray(), 0, count -1, false);
        array.print();
        int arrayCount = array.commonCompareCount();
        System.out.print("CompareCount withOUT medianOf3 = " + arrayCount);

        sort.quickSort(copyArray.getArray(), 0, count -1, true);
        int copyArrayCount = copyArray.commonCompareCount();
        System.out.print("  " + ((arrayCount > copyArrayCount) ? ">" : "<") + " ");
        System.out.println("CompareCount WITH medianOf3 = " + copyArrayCount);
    }


}