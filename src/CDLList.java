public class CDLList<T> {

    private class DLLNode<T> {
        private T info;
        private DLLNode<T> next, prev;
        public DLLNode(T el, DLLNode<T> next, DLLNode<T> prev) {
            this.info = el;
            this.next = next;
            this.prev = prev;
        }
        public DLLNode(T el) {
            this(el, null, null);
        }
        public DLLNode() {
            this(null, null, null);
        }
    }

    protected DLLNode<T> first = null;
    protected DLLNode<T> last = null;
    protected int length = 0;

    public CDLList() {
        first = last = null;
    }
    public boolean add(T el) {
        DLLNode<T> n = new DLLNode<>(el);
        if (length == 0) { // if empty
            first = last = n;
            n.next = n.prev = n;
        } else {
            last.next = n;
            n.prev = last;
            n.next = first;
            first.prev = n;
            last = n;
        }
        length++;
        return true;
    }
    public boolean delete(T el) {
        if (length == 0) return false; // if empty

        DLLNode<T> current = first;
        do {
            if (current.info.equals(el)) {
                if (current == first) first = current.next; // if the first node is to be deleted, change the pointer
                if (current == last) last = current.prev; // if the first node is to be deleted, change the pointer

                // delete the node
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current = null;

                length--;
                return true;
            }
            current = current.next;
        } while (current != first);
        return false; // if we returned back to first, the el doesn't exist
    }
    public T findMiddle() {
        if (length == 0) return null; // if empty

        DLLNode<T> current = first;
        for (int i = 0; i < (length-1) / 2; i++) { // find the middle node
            current = current.next;
        }
        return current.info;
    }
    public void reverse() {
        if (length == 0) return; // if empty

        DLLNode<T> current = first;
        DLLNode<T> temp;
        do {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        } while (current != first); // loop until you return back to the first node

        // update first and last
        temp = first;
        first = last;
        last = temp;
    }
    public int size() {
        return length;
    }
    public void display() {
        if (length == 0) {
            System.out.println("The list is empty.");
            return;
        }

        DLLNode<T> current = first;
        do {
            System.out.print(current.info + " --> ");
            current = current.next;
        } while (current != first);
        System.out.println("(back to head)"); // To show the circular property
    }
}