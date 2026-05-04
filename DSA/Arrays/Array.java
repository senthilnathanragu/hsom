public class Array {
    private int[] items;
    private int size;
    private int count;

    public Array(int length) {
        items = new int[length];
        size = length;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        // if the items is full, resize it
        // add a new item in the end
        if(items.length == count) {
            // Create a new array (twice the size)
            // Copy all the existing items
            // Set "items" to this new array
            int[] newItems = new int[size * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        // Shift the items to the left to fill the hole
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            items[i] = items[i+1];
        count--;
    }

    public int indexOf(int item) {
        // if we find it, return index
        // Otherwise, return -1
        // Runtime complexity -> O(n)
        for (int i = 0; i < items.length; i++) {
            if(items[i] == item)
                return i;
        }
        return -1;
    }
}
