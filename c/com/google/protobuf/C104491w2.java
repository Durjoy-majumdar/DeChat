package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.w2 */
public class C104491w2 extends AbstractList<String> implements C24048u0, RandomAccess {

    /* renamed from: d */
    public final C24048u0 f309659d;

    /* renamed from: com.google.protobuf.w2$a */
    public class C104492a implements ListIterator<String> {

        /* renamed from: d */
        public ListIterator<String> f309660d;

        public C104492a(C104491w2 w2Var, int i) {
            this.f309660d = w2Var.f309659d.listIterator(i);
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f309660d.hasNext();
        }

        public boolean hasPrevious() {
            return this.f309660d.hasPrevious();
        }

        public Object next() {
            return this.f309660d.next();
        }

        public int nextIndex() {
            return this.f309660d.nextIndex();
        }

        public Object previous() {
            return this.f309660d.previous();
        }

        public int previousIndex() {
            return this.f309660d.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.w2$b */
    public class C104493b implements Iterator<String> {

        /* renamed from: d */
        public Iterator<String> f309661d;

        public C104493b(C104491w2 w2Var) {
            this.f309661d = w2Var.f309659d.iterator();
        }

        public boolean hasNext() {
            return this.f309661d.hasNext();
        }

        public Object next() {
            return this.f309661d.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C104491w2(C24048u0 u0Var) {
        this.f309659d = u0Var;
    }

    /* renamed from: a */
    public C24048u0 mo38349a() {
        return this;
    }

    /* renamed from: c */
    public List<?> mo38351c() {
        return this.f309659d.mo38351c();
    }

    /* renamed from: e */
    public C16994k mo38352e(int i) {
        return this.f309659d.mo38352e(i);
    }

    /* renamed from: g */
    public void mo38353g(C16994k kVar) {
        throw new UnsupportedOperationException();
    }

    public Object get(int i) {
        return (String) this.f309659d.get(i);
    }

    public Object getRaw(int i) {
        return this.f309659d.getRaw(i);
    }

    public Iterator<String> iterator() {
        return new C104493b(this);
    }

    public ListIterator<String> listIterator(int i) {
        return new C104492a(this, i);
    }

    public int size() {
        return this.f309659d.size();
    }
}
