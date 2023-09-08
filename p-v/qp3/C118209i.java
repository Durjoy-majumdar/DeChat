package qp3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import qp3.C118207h;

/* renamed from: qp3.i */
public class C118209i<T> implements Iterator<T> {

    /* renamed from: d */
    public final Iterator<? extends T> f353355d;

    /* renamed from: e */
    public final C118207h.C118208a f353356e;

    /* renamed from: f */
    public boolean f353357f = false;

    public C118209i(Iterator<? extends T> it, C118207h.C118208a aVar) {
        this.f353355d = it;
        this.f353356e = aVar;
    }

    public boolean hasNext() {
        boolean hasNext = this.f353355d.hasNext();
        if (!hasNext && !this.f353357f) {
            this.f353356e.mo177698h();
            this.f353357f = true;
        }
        return hasNext;
    }

    public T next() {
        try {
            return this.f353355d.next();
        } catch (NoSuchElementException e) {
            if (!this.f353357f) {
                this.f353356e.mo177698h();
                this.f353357f = true;
            }
            throw e;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
