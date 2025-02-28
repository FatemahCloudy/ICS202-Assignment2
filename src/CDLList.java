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
    public int getLength() {
        return length;
    }
    public boolean isEmpty() {
        return first == null;
    }
}