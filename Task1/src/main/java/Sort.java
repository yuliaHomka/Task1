public class Sort {

    public int minLengthForQuickSort = 50;

    public void quickSort(MyObject[] array, int low, int high, boolean useMedianOf3) {

        if (array.length == 0 || low >= high)
            return;

        if (high - low < minLengthForQuickSort) {
            this.insertionSort(array, low, high);
            return;
        }
        int middleElem = (useMedianOf3) ? this.medianOf3(array, low, high) : low + (high - low) / 2;
        var opora = array[middleElem];

        int i = low, j = high;
        while (i <= j) {
            for (; array[i].compareTo(opora) < 0; i++) ;

            for (; array[j].compareTo(opora) > 0; j--) ;

            if (i <= j) {
                swap(array[i], array[j]);
                i++;
                j--;
            }
        }

        boolean changeTypeOfSort = ((j - low) > (high - i));
        if (low < j) {
            if (changeTypeOfSort) this.quickSort(array, low, j, useMedianOf3);
            else this.insertionSort(array, low, j);
        }

        if (high > i) {
            if (!changeTypeOfSort) this.quickSort(array, i, high, useMedianOf3);
            else this.insertionSort(array, i, high);
        }
//        if (low < j) this.quickSort(array, low, j, useMedianOf3);
//        if (high > i) this.quickSort(array, i, high, useMedianOf3);
    }

    public void insertionSort(MyObject[] array, int low, int high) {
        for (int left = low + 1; left <= high; left++) {
            MyObject value = array[left];
            int i = left - 1;
            for (; i >= low; i--) {
                if (value.compareTo(array[i]) < 0) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public int medianOf3(MyObject[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        if (mid >= high) return high;

        if (array[mid].compareTo(array[low]) < 0) swap(array[mid], array[low]);
        if (array[mid].compareTo(array[high]) > 0) swap(array[mid], array[high]);
        return mid;
    }

    public void swap (MyObject a, MyObject b) {
        int tmp = a.getElem();
        a.setElem(b.getElem());
        b.setElem(tmp);
    }
}

