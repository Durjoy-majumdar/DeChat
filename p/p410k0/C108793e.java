package p410k0;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import hy3.C60233d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import sx3.C110821n;
import sx3.C64197v;

/* renamed from: k0.e */
public final class C108793e<T> implements RandomAccess {

    /* renamed from: d */
    public T[] f325784d;

    /* renamed from: e */
    public List<T> f325785e;

    /* renamed from: f */
    public int f325786f;

    /* renamed from: k0.e$b */
    public static final class C60928b<T> implements List<T>, C60233d {

        /* renamed from: d */
        public final List<T> f173549d;

        /* renamed from: e */
        public final int f173550e;

        /* renamed from: f */
        public int f173551f;

        public C60928b(List<T> list, int i, int i2) {
            C87412m.m108594g(list, "list");
            this.f173549d = list;
            this.f173550e = i;
            this.f173551f = i2;
        }

        public boolean add(T t) {
            List<T> list = this.f173549d;
            int i = this.f173551f;
            this.f173551f = i + 1;
            list.add(i, t);
            return true;
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            C87412m.m108594g(collection, "elements");
            this.f173549d.addAll(i + this.f173550e, collection);
            this.f173551f += collection.size();
            return collection.size() > 0;
        }

        public void clear() {
            int i = this.f173551f - 1;
            int i2 = this.f173550e;
            if (i2 <= i) {
                while (true) {
                    this.f173549d.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.f173551f = this.f173550e;
        }

        public boolean contains(Object obj) {
            int i = this.f173551f;
            for (int i2 = this.f173550e; i2 < i; i2++) {
                if (C87412m.m108589b(this.f173549d.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public T get(int i) {
            C60930f.m71403a(this, i);
            return this.f173549d.get(i + this.f173550e);
        }

        public int indexOf(Object obj) {
            int i = this.f173551f;
            for (int i2 = this.f173550e; i2 < i; i2++) {
                if (C87412m.m108589b(this.f173549d.get(i2), obj)) {
                    return i2 - this.f173550e;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f173551f == this.f173550e;
        }

        public Iterator<T> iterator() {
            return new C60929c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i = this.f173551f - 1;
            int i2 = this.f173550e;
            if (i2 > i) {
                return -1;
            }
            while (!C87412m.m108589b(this.f173549d.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f173550e;
        }

        public ListIterator<T> listIterator() {
            return new C60929c(this, 0);
        }

        public boolean remove(Object obj) {
            int i = this.f173551f;
            for (int i2 = this.f173550e; i2 < i; i2++) {
                if (C87412m.m108589b(this.f173549d.get(i2), obj)) {
                    this.f173549d.remove(i2);
                    this.f173551f--;
                    return true;
                }
            }
            return false;
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "elements");
            int i = this.f173551f;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove((Object) it.next());
            }
            return i != this.f173551f;
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "elements");
            int i = this.f173551f;
            int i2 = i - 1;
            int i3 = this.f173550e;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.f173549d.get(i2))) {
                        this.f173549d.remove(i2);
                        this.f173551f--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f173551f;
        }

        public T set(int i, T t) {
            C60930f.m71403a(this, i);
            return this.f173549d.set(i + this.f173550e, t);
        }

        public final int size() {
            return this.f173551f - this.f173550e;
        }

        public List<T> subList(int i, int i2) {
            C60930f.m71404b(this, i, i2);
            return new C60928b(this, i, i2);
        }

        public Object[] toArray() {
            return C59742g.m69648a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            C87412m.m108594g(tArr, "array");
            return C59742g.m69649b(this, tArr);
        }

        public void add(int i, T t) {
            this.f173549d.add(i + this.f173550e, t);
            this.f173551f++;
        }

        public ListIterator<T> listIterator(int i) {
            return new C60929c(this, i);
        }

        public boolean addAll(Collection<? extends T> collection) {
            C87412m.m108594g(collection, "elements");
            this.f173549d.addAll(this.f173551f, collection);
            this.f173551f += collection.size();
            return collection.size() > 0;
        }

        public final T remove(int i) {
            C60930f.m71403a(this, i);
            this.f173551f--;
            return this.f173549d.remove(i + this.f173550e);
        }
    }

    /* renamed from: k0.e$c */
    public static final class C60929c<T> implements ListIterator<T>, C33145a {

        /* renamed from: d */
        public final List<T> f173552d;

        /* renamed from: e */
        public int f173553e;

        public C60929c(List<T> list, int i) {
            C87412m.m108594g(list, "list");
            this.f173552d = list;
            this.f173553e = i;
        }

        public void add(T t) {
            this.f173552d.add(this.f173553e, t);
            this.f173553e++;
        }

        public boolean hasNext() {
            return this.f173553e < this.f173552d.size();
        }

        public boolean hasPrevious() {
            return this.f173553e > 0;
        }

        public T next() {
            List<T> list = this.f173552d;
            int i = this.f173553e;
            this.f173553e = i + 1;
            return list.get(i);
        }

        public int nextIndex() {
            return this.f173553e;
        }

        public T previous() {
            int i = this.f173553e - 1;
            this.f173553e = i;
            return this.f173552d.get(i);
        }

        public int previousIndex() {
            return this.f173553e - 1;
        }

        public void remove() {
            int i = this.f173553e - 1;
            this.f173553e = i;
            this.f173552d.remove(i);
        }

        public void set(T t) {
            this.f173552d.set(this.f173553e, t);
        }
    }

    /* renamed from: k0.e$a */
    public static final class C108794a<T> implements List<T>, C60233d {

        /* renamed from: d */
        public final C108793e<T> f325787d;

        public C108794a(C108793e<T> eVar) {
            C87412m.m108594g(eVar, "vector");
            this.f325787d = eVar;
        }

        public boolean add(T t) {
            this.f325787d.mo159860b(t);
            return true;
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            C87412m.m108594g(collection, "elements");
            return this.f325787d.mo159861c(i, collection);
        }

        public void clear() {
            this.f325787d.mo159863e();
        }

        public boolean contains(Object obj) {
            return this.f325787d.mo159864f(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "elements");
            C108793e<T> eVar = this.f325787d;
            eVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!eVar.mo159864f(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public T get(int i) {
            C60930f.m71403a(this, i);
            return this.f325787d.f325784d[i];
        }

        public int indexOf(Object obj) {
            return this.f325787d.mo159866h(obj);
        }

        public boolean isEmpty() {
            return this.f325787d.mo159867i();
        }

        public Iterator<T> iterator() {
            return new C60929c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            C108793e<T> eVar = this.f325787d;
            int i = eVar.f325786f;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            T[] tArr = eVar.f325784d;
            while (!C87412m.m108589b(obj, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }

        public ListIterator<T> listIterator() {
            return new C60929c(this, 0);
        }

        public boolean remove(Object obj) {
            return this.f325787d.mo159869k(obj);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "elements");
            C108793e<T> eVar = this.f325787d;
            eVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i = eVar.f325786f;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                eVar.mo159869k(it.next());
            }
            return i != eVar.f325786f;
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "elements");
            C108793e<T> eVar = this.f325787d;
            eVar.getClass();
            int i = eVar.f325786f;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(eVar.f325784d[i2])) {
                    eVar.mo159871m(i2);
                }
            }
            return i != eVar.f325786f;
        }

        public T set(int i, T t) {
            C60930f.m71403a(this, i);
            T[] tArr = this.f325787d.f325784d;
            T t2 = tArr[i];
            tArr[i] = t;
            return t2;
        }

        public final int size() {
            return this.f325787d.f325786f;
        }

        public List<T> subList(int i, int i2) {
            C60930f.m71404b(this, i, i2);
            return new C60928b(this, i, i2);
        }

        public Object[] toArray() {
            return C59742g.m69648a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            C87412m.m108594g(tArr, "array");
            return C59742g.m69649b(this, tArr);
        }

        public void add(int i, T t) {
            this.f325787d.mo159859a(i, t);
        }

        public boolean addAll(Collection<? extends T> collection) {
            C87412m.m108594g(collection, "elements");
            C108793e<T> eVar = this.f325787d;
            eVar.getClass();
            return eVar.mo159861c(eVar.f325786f, collection);
        }

        public ListIterator<T> listIterator(int i) {
            return new C60929c(this, i);
        }

        public final T remove(int i) {
            C60930f.m71403a(this, i);
            return this.f325787d.mo159871m(i);
        }
    }

    public C108793e(T[] tArr, int i) {
        C87412m.m108594g(tArr, "content");
        this.f325784d = tArr;
        this.f325786f = i;
    }

    /* renamed from: a */
    public final void mo159859a(int i, T t) {
        mo159865g(this.f325786f + 1);
        T[] tArr = this.f325784d;
        int i2 = this.f325786f;
        if (i != i2) {
            C110821n.m150963j(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.f325786f++;
    }

    /* renamed from: b */
    public final boolean mo159860b(T t) {
        mo159865g(this.f325786f + 1);
        T[] tArr = this.f325784d;
        int i = this.f325786f;
        tArr[i] = t;
        this.f325786f = i + 1;
        return true;
    }

    /* renamed from: c */
    public final boolean mo159861c(int i, Collection<? extends T> collection) {
        C87412m.m108594g(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        mo159865g(this.f325786f + collection.size());
        T[] tArr = this.f325784d;
        if (i != this.f325786f) {
            C110821n.m150963j(tArr, tArr, collection.size() + i, i, this.f325786f);
        }
        for (T next : collection) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                tArr[i2 + i] = next;
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        this.f325786f += collection.size();
        return true;
    }

    /* renamed from: d */
    public final boolean mo159862d(int i, C108793e<T> eVar) {
        C87412m.m108594g(eVar, "elements");
        if (eVar.mo159867i()) {
            return false;
        }
        mo159865g(this.f325786f + eVar.f325786f);
        T[] tArr = this.f325784d;
        int i2 = this.f325786f;
        if (i != i2) {
            C110821n.m150963j(tArr, tArr, eVar.f325786f + i, i, i2);
        }
        C110821n.m150963j(eVar.f325784d, tArr, i, 0, eVar.f325786f);
        this.f325786f += eVar.f325786f;
        return true;
    }

    /* renamed from: e */
    public final void mo159863e() {
        T[] tArr = this.f325784d;
        int i = this.f325786f;
        while (true) {
            i--;
            if (-1 < i) {
                tArr[i] = null;
            } else {
                this.f325786f = 0;
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo159864f(T t) {
        int i = this.f325786f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (!C87412m.m108589b(this.f325784d[i2], t)) {
                if (i2 != i) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo159865g(int i) {
        T[] tArr = this.f325784d;
        if (tArr.length < i) {
            T[] copyOf = Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            this.f325784d = copyOf;
        }
    }

    /* renamed from: h */
    public final int mo159866h(T t) {
        int i = this.f325786f;
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        T[] tArr = this.f325784d;
        while (!C87412m.m108589b(t, tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: i */
    public final boolean mo159867i() {
        return this.f325786f == 0;
    }

    /* renamed from: j */
    public final boolean mo159868j() {
        return this.f325786f != 0;
    }

    /* renamed from: k */
    public final boolean mo159869k(T t) {
        int h = mo159866h(t);
        if (h < 0) {
            return false;
        }
        mo159871m(h);
        return true;
    }

    /* renamed from: l */
    public final boolean mo159870l(C108793e<T> eVar) {
        C87412m.m108594g(eVar, "elements");
        int i = this.f325786f;
        int i2 = eVar.f325786f - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                mo159869k(eVar.f325784d[i3]);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this.f325786f;
    }

    /* renamed from: m */
    public final T mo159871m(int i) {
        T[] tArr = this.f325784d;
        T t = tArr[i];
        int i2 = this.f325786f;
        if (i != i2 - 1) {
            C110821n.m150963j(tArr, tArr, i, i + 1, i2);
        }
        int i3 = this.f325786f - 1;
        this.f325786f = i3;
        tArr[i3] = null;
        return t;
    }
}
