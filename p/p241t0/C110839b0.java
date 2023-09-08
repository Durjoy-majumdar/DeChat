package p241t0;

import gy3.C87412m;
import hy3.C33145a;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: t0.b0 */
public final class C110839b0<T> implements ListIterator<T>, C33145a {

    /* renamed from: d */
    public final C110872v<T> f331593d;

    /* renamed from: e */
    public int f331594e;

    /* renamed from: f */
    public int f331595f;

    public C110839b0(C110872v<T> vVar, int i) {
        C87412m.m108594g(vVar, "list");
        this.f331593d = vVar;
        this.f331594e = i - 1;
        this.f331595f = vVar.mo162554k();
    }

    /* renamed from: a */
    public final void mo162443a() {
        if (this.f331593d.mo162554k() != this.f331595f) {
            throw new ConcurrentModificationException();
        }
    }

    public void add(T t) {
        mo162443a();
        this.f331593d.add(this.f331594e + 1, t);
        this.f331594e++;
        this.f331595f = this.f331593d.mo162554k();
    }

    public boolean hasNext() {
        return this.f331594e < this.f331593d.size() - 1;
    }

    public boolean hasPrevious() {
        return this.f331594e >= 0;
    }

    public T next() {
        mo162443a();
        int i = this.f331594e + 1;
        C110875w.m151169a(i, this.f331593d.size());
        T t = this.f331593d.get(i);
        this.f331594e = i;
        return t;
    }

    public int nextIndex() {
        return this.f331594e + 1;
    }

    public T previous() {
        mo162443a();
        C110875w.m151169a(this.f331594e, this.f331593d.size());
        this.f331594e--;
        return this.f331593d.get(this.f331594e);
    }

    public int previousIndex() {
        return this.f331594e;
    }

    public void remove() {
        mo162443a();
        this.f331593d.remove(this.f331594e);
        this.f331594e--;
        this.f331595f = this.f331593d.mo162554k();
    }

    public void set(T t) {
        mo162443a();
        this.f331593d.set(this.f331594e, t);
        this.f331595f = this.f331593d.mo162554k();
    }
}
