public class MyObjectArray {

    private MyObject[] array;


    public MyObjectArray(int count) {
        this.array = new MyObject[count];
        for (int i = 0; i < count; i++){
            this.array[i] = new MyObject();
        }
    }

    public void print() {
        int length = this.array.length;
        if (length > 100) length = 100;
        System.out.print("count = ");
        System.out.print(this.array.length);
        System.out.print(":  ");
//        for (MyObject elem: this.array){
        for (int i = 0; i < length; i++) {
            this.array[i].print();
        }
        System.out.println();
    }

    public int length() {
        return this.array.length;
    }

    public MyObject[] getArray() {
        return this.array;
    }

    public int commonCompareCount() {
        int sum = 0;
        for(var i: array) {
            sum += i.getCompareCount();
        }
        return sum;
    }

    public void printCompareCount() {
        System.out.print("compareCount = ");
        System.out.print(this.commonCompareCount());
    }

    public MyObjectArray copy() {
        int length = this.array.length;
        var copyArray = new MyObjectArray(length);
        for (int i = 0; i < length; i++){
            copyArray.array[i].setElem(this.array[i].getElem());
        }
        return copyArray;
    }

}
