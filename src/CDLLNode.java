public class CDLLNode<T> {
    public T info;
    public CDLLNode<T> next, prev;
    public CDLLNode() {
        info = null; next = null; prev = null;
    }
    public CDLLNode(T info) {
        this.info = info;
        next = null;
        prev = null;
    }
    public CDLLNode(T info, CDLLNode<T> n, CDLLNode<T> p) {
        this.info = info;
        this.next = n;
        this.prev = p;
    }
}
