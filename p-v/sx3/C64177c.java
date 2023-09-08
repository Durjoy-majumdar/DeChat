package sx3;

import gy3.C8480h;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: sx3.c */
public abstract class C64177c<E> extends C64173a<E> implements List<E> {

    /* renamed from: d */
    public static final C64178a f181897d = new C64178a((C8480h) null);

    /* renamed from: sx3.c$a */
    public static final class C64178a {
        public C64178a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo88915a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }
    }

    /* renamed from: sx3.c$b */
    public class C64179b implements Iterator<E>, C33145a {

        /* renamed from: d */
        public int f181898d;

        public C64179b() {
        }

        public boolean hasNext() {
            return this.f181898d < C64177c.this.mo52189f();
        }

        public E next() {
            if (hasNext()) {
                C64177c<E> cVar = C64177c.this;
                int i = this.f181898d;
                this.f181898d = i + 1;
                return cVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: sx3.c$c */
    public class C64180c extends C64177c<E>.b implements ListIterator<E> {
        public C64180c(int i) {
            super();
            int f = C64177c.this.mo52189f();
            if (i < 0 || i > f) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + f);
            }
            this.f181898d = i;
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return this.f181898d > 0;
        }

        public int nextIndex() {
            return this.f181898d;
        }

        public E previous() {
            if (hasPrevious()) {
                C64177c<E> cVar = C64177c.this;
                int i = this.f181898d - 1;
                this.f181898d = i;
                return cVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f181898d - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: sx3.c$d */
    public static final class C64181d<E> extends C64177c<E> implements RandomAccess {

        /* renamed from: e */
        public final C64177c<E> f181901e;

        /* renamed from: f */
        public final int f181902f;

        /* renamed from: g */
        public int f181903g;

        public C64181d(C64177c<? extends E> cVar, int i, int i2) {
            C87412m.m108594g(cVar, "list");
            this.f181901e = cVar;
            this.f181902f = i;
            C64177c.f181897d.mo88915a(i, i2, cVar.mo52189f());
            this.f181903g = i2 - i;
        }

        /* renamed from: f */
        public int mo52189f() {
            return this.f181903g;
        }

        public E get(int i) {
            int i2 = this.f181903g;
            if (i >= 0 && i < i2) {
                return this.f181901e.get(this.f181902f + i);
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C87412m.m108594g(collection, "other");
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object b : this) {
            if (!C87412m.m108589b(b, it.next())) {
            }
        }
        return true;
        return false;
    }

    public abstract E get(int i);

    public int hashCode() {
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object b : this) {
            if (C87412m.m108589b(b, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C64179b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C87412m.m108589b(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C64180c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C64181d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C64180c(i);
    }
}
