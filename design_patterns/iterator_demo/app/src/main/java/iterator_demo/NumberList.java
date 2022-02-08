package iterator_demo;

public class NumberList implements Container {
    public int nums[] = {1, 2, 3, 4, 5};

    @Override
    public Iterator getIterator() {
        return new NumberIterator();
    }

    private class NumberIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < nums.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return nums[index++];
            }
            return null;
        }
    }
}
