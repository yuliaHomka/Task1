
public class MyObject implements MyObjectIntf, Comparable<MyObject> {

    private Integer elem;
    private int compareCount = 0;

    public MyObject() {
        this.compareCount = 0;
        this.elem = (int)(Math.random() * 100000);
    }

    public void print() {
        System.out.print(this.elem);
        System.out.print(' ');
    }

    public Integer getElem() {
        return elem;
    }

    public void setElem(Integer elem) {
        this.elem = elem;
    }

    public void setCompareCount(int compareCount) {
        this.compareCount = compareCount;
    }

    public int getCompareCount() {
        return compareCount;
    }

    @Override
    public int compareTo(MyObject comparableElem) {
        this.compareCount += 1;
        if (this.elem > comparableElem.getElem()) return 1;
        if (this.elem < comparableElem.getElem()) return -1;
        return 0;
    }
}