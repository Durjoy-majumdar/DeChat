package hw1;

import java.util.LinkedList;

/* renamed from: hw1.l */
public class C98551l<E> extends LinkedList<E> {

    /* renamed from: d */
    public byte[] f289006d = new byte[0];

    public boolean add(E e) {
        boolean add;
        synchronized (this.f289006d) {
            add = super.add(e);
        }
        return add;
    }

    public void clear() {
        synchronized (this.f289006d) {
            super.clear();
        }
    }

    /* renamed from: f */
    public E mo137925f() {
        synchronized (this.f289006d) {
            if (size() <= 0) {
                return null;
            }
            E poll = poll();
            return poll;
        }
    }

    public int size() {
        int size;
        synchronized (this.f289006d) {
            size = super.size();
        }
        return size;
    }
}
