package xz3;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: xz3.w */
public class C112189w extends AbstractList<String> implements RandomAccess, C112188n {

    /* renamed from: d */
    public final C112188n f335892d;

    /* renamed from: xz3.w$a */
    public class C112190a implements ListIterator<String> {

        /* renamed from: d */
        public ListIterator<String> f335893d;

        public C112190a(C112189w wVar, int i) {
            this.f335893d = wVar.f335892d.listIterator(i);
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f335893d.hasNext();
        }

        public boolean hasPrevious() {
            return this.f335893d.hasPrevious();
        }

        public Object next() {
            return this.f335893d.next();
        }

        public int nextIndex() {
            return this.f335893d.nextIndex();
        }

        public Object previous() {
            return this.f335893d.previous();
        }

        public int previousIndex() {
            return this.f335893d.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: xz3.w$b */
    public class C112191b implements Iterator<String> {

        /* renamed from: d */
        public Iterator<String> f335894d;

        public C112191b(C112189w wVar) {
            this.f335894d = wVar.f335892d.iterator();
        }

        public boolean hasNext() {
            return this.f335894d.hasNext();
        }

        public Object next() {
            return this.f335894d.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C112189w(C112188n nVar) {
        this.f335892d = nVar;
    }

    /* renamed from: B */
    public void mo36565B(C23156c cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C112188n mo36566a() {
        return this;
    }

    /* renamed from: c */
    public List<?> mo36570c() {
        return this.f335892d.mo36570c();
    }

    /* renamed from: e */
    public C23156c mo36572e(int i) {
        return this.f335892d.mo36572e(i);
    }

    public Object get(int i) {
        return (String) this.f335892d.get(i);
    }

    public Iterator<String> iterator() {
        return new C112191b(this);
    }

    public ListIterator<String> listIterator(int i) {
        return new C112190a(this, i);
    }

    public int size() {
        return this.f335892d.size();
    }
}
