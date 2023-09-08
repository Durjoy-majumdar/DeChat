package p241t0;

import gy3.C59742g;
import gy3.C8478d0;
import gy3.C87412m;
import hy3.C33145a;
import hy3.C60233d;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import my3.C61595o;
import p241t0.C110872v;
import p854l0.C109072c;
import rx3.C13598b0;
import sx3.C36904l0;

/* renamed from: t0.j0 */
public final class C110858j0<T> implements List<T>, C60233d {

    /* renamed from: d */
    public final C110872v<T> f331625d;

    /* renamed from: e */
    public final int f331626e;

    /* renamed from: f */
    public int f331627f;

    /* renamed from: g */
    public int f331628g;

    /* renamed from: t0.j0$a */
    public static final class C110859a implements ListIterator<T>, C33145a {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f331629d;

        /* renamed from: e */
        public final /* synthetic */ C110858j0<T> f331630e;

        public C110859a(C8478d0 d0Var, C110858j0<T> j0Var) {
            this.f331629d = d0Var;
            this.f331630e = j0Var;
        }

        public void add(Object obj) {
            Object obj2 = C110875w.f331664a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        public boolean hasNext() {
            return this.f331629d.f27483d < this.f331630e.f331628g - 1;
        }

        public boolean hasPrevious() {
            return this.f331629d.f27483d >= 0;
        }

        public T next() {
            int i = this.f331629d.f27483d + 1;
            C110875w.m151169a(i, this.f331630e.f331628g);
            this.f331629d.f27483d = i;
            return this.f331630e.get(i);
        }

        public int nextIndex() {
            return this.f331629d.f27483d + 1;
        }

        public T previous() {
            int i = this.f331629d.f27483d;
            C110875w.m151169a(i, this.f331630e.f331628g);
            this.f331629d.f27483d = i - 1;
            return this.f331630e.get(i);
        }

        public int previousIndex() {
            return this.f331629d.f27483d;
        }

        public void remove() {
            Object obj = C110875w.f331664a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        public void set(Object obj) {
            Object obj2 = C110875w.f331664a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }
    }

    public C110858j0(C110872v<T> vVar, int i, int i2) {
        C87412m.m108594g(vVar, "parentList");
        this.f331625d = vVar;
        this.f331626e = i;
        this.f331627f = vVar.mo162554k();
        this.f331628g = i2 - i;
    }

    public boolean add(T t) {
        mo162479f();
        this.f331625d.add(this.f331626e + this.f331628g, t);
        this.f331628g++;
        this.f331627f = this.f331625d.mo162554k();
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        C87412m.m108594g(collection, "elements");
        return addAll(this.f331628g, collection);
    }

    public void clear() {
        int i;
        C109072c<? extends T> cVar;
        C110849h i2;
        boolean z;
        if (this.f331628g > 0) {
            mo162479f();
            C110872v<T> vVar = this.f331625d;
            int i3 = this.f331626e;
            int i4 = this.f331628g + i3;
            vVar.getClass();
            do {
                Object obj = C110875w.f331664a;
                synchronized (obj) {
                    C110872v.C110873a aVar = (C110872v.C110873a) C110865n.m151145h((C110872v.C110873a) vVar.f331660d, C110865n.m151146i());
                    i = aVar.f331662d;
                    cVar = aVar.f331661c;
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                C87412m.m108591d(cVar);
                C109072c.C109073a<? extends T> d = cVar.mo160319d();
                d.subList(i3, i4).clear();
                C109072c<? extends T> build = d.build();
                if (C87412m.m108589b(build, cVar)) {
                    break;
                }
                synchronized (obj) {
                    C110872v.C110873a aVar2 = (C110872v.C110873a) vVar.f331660d;
                    synchronized (C110865n.f331651c) {
                        i2 = C110865n.m151146i();
                        C110872v.C110873a aVar3 = (C110872v.C110873a) C110865n.m151158u(aVar2, vVar, i2);
                        z = true;
                        if (aVar3.f331662d == i) {
                            aVar3.mo162569c(build);
                            aVar3.f331662d++;
                        } else {
                            z = false;
                        }
                    }
                    C110865n.m151150m(i2, vVar);
                }
            } while (!z);
            this.f331628g = 0;
            this.f331627f = this.f331625d.mo162554k();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo162479f() {
        if (this.f331625d.mo162554k() != this.f331627f) {
            throw new ConcurrentModificationException();
        }
    }

    public T get(int i) {
        mo162479f();
        C110875w.m151169a(i, this.f331628g);
        return this.f331625d.get(this.f331626e + i);
    }

    public int indexOf(Object obj) {
        mo162479f();
        int i = this.f331626e;
        Iterator it = C61595o.m72301i(i, this.f331628g + i).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            if (C87412m.m108589b(obj, this.f331625d.get(a))) {
                return a - this.f331626e;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f331628g == 0;
    }

    public Iterator<T> iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        mo162479f();
        int i = this.f331626e + this.f331628g;
        while (true) {
            i--;
            if (i < this.f331626e) {
                return -1;
            }
            if (C87412m.m108589b(obj, this.f331625d.get(i))) {
                return i - this.f331626e;
            }
        }
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (remove((Object) it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        int i;
        C109072c<? extends T> cVar;
        C110849h i2;
        boolean z;
        C87412m.m108594g(collection, "elements");
        mo162479f();
        C110872v<T> vVar = this.f331625d;
        int i3 = this.f331626e;
        int i4 = this.f331628g + i3;
        vVar.getClass();
        int size = vVar.size();
        do {
            Object obj = C110875w.f331664a;
            synchronized (obj) {
                C110872v.C110873a aVar = (C110872v.C110873a) C110865n.m151145h((C110872v.C110873a) vVar.f331660d, C110865n.m151146i());
                i = aVar.f331662d;
                cVar = aVar.f331661c;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(cVar);
            C109072c.C109073a<? extends T> d = cVar.mo160319d();
            d.subList(i3, i4).retainAll(collection);
            C109072c<? extends T> build = d.build();
            if (C87412m.m108589b(build, cVar)) {
                break;
            }
            synchronized (obj) {
                C110872v.C110873a aVar2 = (C110872v.C110873a) vVar.f331660d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110872v.C110873a aVar3 = (C110872v.C110873a) C110865n.m151158u(aVar2, vVar, i2);
                    if (aVar3.f331662d == i) {
                        aVar3.mo162569c(build);
                        aVar3.f331662d++;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                C110865n.m151150m(i2, vVar);
            }
        } while (!z);
        int size2 = size - vVar.size();
        if (size2 > 0) {
            this.f331627f = this.f331625d.mo162554k();
            this.f331628g -= size2;
        }
        return size2 > 0;
    }

    public T set(int i, T t) {
        C110875w.m151169a(i, this.f331628g);
        mo162479f();
        T t2 = this.f331625d.set(i + this.f331626e, t);
        this.f331627f = this.f331625d.mo162554k();
        return t2;
    }

    public final int size() {
        return this.f331628g;
    }

    public List<T> subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > this.f331628g) {
            z = false;
        }
        if (z) {
            mo162479f();
            C110872v<T> vVar = this.f331625d;
            int i3 = this.f331626e;
            return new C110858j0(vVar, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public ListIterator<T> listIterator(int i) {
        mo162479f();
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = i - 1;
        return new C110859a(d0Var, this);
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        C87412m.m108594g(collection, "elements");
        mo162479f();
        boolean addAll = this.f331625d.addAll(i + this.f331626e, collection);
        if (addAll) {
            this.f331628g += collection.size();
            this.f331627f = this.f331625d.mo162554k();
        }
        return addAll;
    }

    public final T remove(int i) {
        mo162479f();
        T remove = this.f331625d.remove(this.f331626e + i);
        this.f331628g--;
        this.f331627f = this.f331625d.mo162554k();
        return remove;
    }

    public void add(int i, T t) {
        mo162479f();
        this.f331625d.add(this.f331626e + i, t);
        this.f331628g++;
        this.f331627f = this.f331625d.mo162554k();
    }
}
