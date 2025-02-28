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
        DLLNode<T> n = new DLLNode(el, first, last);
        return true;
    }
    public boolean delete(T el) {
        DLLNode<T> current = first;
        while (current != null) {
            if (current.info.equals(el)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current = null;
                return true;
            }
        }
        return false;
    }
    public T findMiddle() {
        DLLNode<T> current = first;
        for (int i = 0; i <= (length-1) / 2; i++) {
            current = current.next;
        }
        return current.info;
    }
    // TODO: Complete this method
    public void reverse() {}
    public int size() {
        return length;
    }
    public void display() {
        DLLNode<T> current = first;
        while (current != null) {
            System.out.print(current.info + " --> ");
            current = current.next;
        }
    }


}