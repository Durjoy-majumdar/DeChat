package o41;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o41.a */
public class C117709a<T> implements Iterable<T>, Iterator<T> {

    /* renamed from: d */
    public List<WeakReference<T>> f352035d = new ArrayList();

    /* renamed from: e */
    public int f352036e = 0;

    public void add(T t) {
        if (t != null) {
            mo182401f();
            if (!contains(t)) {
                ((ArrayList) this.f352035d).add(new WeakReference(t));
            }
        }
    }

    public boolean contains(T t) {
        if (t == null) {
            return false;
        }
        mo182401f();
        Iterator it = ((ArrayList) this.f352035d).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null && weakReference.get() == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo182401f() {
        Iterator it = ((ArrayList) this.f352035d).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
    }

    /* renamed from: h */
    public void mo182402h(T t) {
        if (t != null) {
            mo182401f();
            Iterator it = ((ArrayList) this.f352035d).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference != null && weakReference.get() == t) {
                    it.remove();
                }
            }
        }
    }

    public boolean hasNext() {
        return this.f352036e < ((ArrayList) this.f352035d).size();
    }

    public Iterator<T> iterator() {
        mo182401f();
        this.f352036e = 0;
        return this;
    }

    public T next() {
        T t;
        while (this.f352036e < ((ArrayList) this.f352035d).size()) {
            List<WeakReference<T>> list = this.f352035d;
            int i = this.f352036e;
            this.f352036e = i + 1;
            WeakReference weakReference = (WeakReference) ((ArrayList) list).get(i);
            if (weakReference != null && (t = weakReference.get()) != null) {
                return t;
            }
        }
        return null;
    }

    public int size() {
        mo182401f();
        return ((ArrayList) this.f352035d).size();
    }
}
