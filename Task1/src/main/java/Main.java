public class Main {

    public static void main (String args []) {
        var method = new Sort();
        int count =  (int) (Math.random() * 100 + 100);
        MyObjectArray array = new MyObjectArray(count);
        System.out.println("before");
        array.print();

        int low = 0;
        int high = array.length() - 1;

        method.quickSort(array.getArray(), low, high, true);
        System.out.println("after");
        array.print();
        array.printCompareCount();
    }

}
