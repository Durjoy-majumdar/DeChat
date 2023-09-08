package qh3;

import java.util.HashSet;
import java.util.Iterator;
import qh3.C89661b;

/* renamed from: qh3.a */
public class C89660a<T> implements C89661b.C89663b<T> {

    /* renamed from: d */
    public final String f257889d;

    /* renamed from: e */
    public T f257890e;

    /* renamed from: f */
    public HashSet<C89661b.C89662a<T>> f257891f;

    /* renamed from: g */
    public final Object f257892g = new Object();

    public C89660a(String str, T t) {
        this.f257889d = str;
        this.f257891f = new HashSet<>();
        this.f257890e = t;
    }

    /* renamed from: b */
    public final void mo123985b(C89661b.C89662a<T> aVar) {
        boolean remove;
        synchronized (this.f257892g) {
            remove = this.f257891f.remove(aVar);
        }
        if (remove) {
            mo123988e(aVar);
        }
    }

    /* renamed from: c */
    public final void mo123986c(C89661b.C89662a<T> aVar) {
        boolean add;
        synchronized (this.f257892g) {
            add = this.f257891f.add(aVar);
        }
        if (add) {
            mo123987d(aVar);
        }
    }

    /* renamed from: d */
    public void mo123987d(C89661b.C89662a<T> aVar) {
    }

    /* renamed from: e */
    public void mo123988e(C89661b.C89662a<T> aVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo123989f(T t) {
        T t2 = this.f257890e;
        if (!(t == t2 || (t != null && t.equals(t2)))) {
            this.f257890e = t;
            synchronized (this.f257892g) {
                Iterator<C89661b.C89662a<T>> it = this.f257891f.iterator();
                while (it.hasNext()) {
                    it.next().mo123994a(this, t);
                }
            }
        }
    }

    public T get() {
        return this.f257890e;
    }

    public final String name() {
        return this.f257889d;
    }

    public String toString() {
        return "Status: " + this.f257889d;
    }
}
