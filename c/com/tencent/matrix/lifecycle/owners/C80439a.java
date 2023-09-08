package com.tencent.matrix.lifecycle.owners;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.owners.a */
public class C80439a<T> extends ArrayList<T> {

    /* renamed from: d */
    public final ArrayList<T> f235401d;

    /* renamed from: e */
    public final C80440a f235402e;

    /* renamed from: com.tencent.matrix.lifecycle.owners.a$a */
    public interface C80440a {
        /* renamed from: a */
        void mo111956a(Object obj);

        /* renamed from: b */
        void mo111957b(Object obj);
    }

    public C80439a(ArrayList<T> arrayList, C80440a aVar) {
        this.f235401d = arrayList;
        this.f235402e = aVar;
    }

    public boolean add(T t) {
        boolean add = this.f235401d.add(t);
        try {
            this.f235402e.mo111957b(t);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.ArrayListProxy", th, "", new Object[0]);
        }
        return add;
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.f235401d.addAll(collection);
        try {
            for (Object b : collection) {
                this.f235402e.mo111957b(b);
            }
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.ArrayListProxy", th, "", new Object[0]);
        }
        return addAll;
    }

    public void clear() {
        this.f235401d.clear();
    }

    public boolean contains(Object obj) {
        return this.f235401d.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f235401d.containsAll(collection);
    }

    public T get(int i) {
        return this.f235401d.get(i);
    }

    public int indexOf(Object obj) {
        return this.f235401d.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f235401d.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.f235401d.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f235401d.lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return this.f235401d.listIterator();
    }

    public boolean remove(Object obj) {
        boolean remove = this.f235401d.remove(obj);
        try {
            this.f235402e.mo111956a(obj);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.ArrayListProxy", th, "", new Object[0]);
        }
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f235401d.removeAll(collection);
        try {
            for (Object a : collection) {
                this.f235402e.mo111956a(a);
            }
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.ArrayListProxy", th, "", new Object[0]);
        }
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f235401d.retainAll(collection);
    }

    public T set(int i, T t) {
        return this.f235401d.set(i, t);
    }

    public int size() {
        return this.f235401d.size();
    }

    public List<T> subList(int i, int i2) {
        return this.f235401d.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f235401d.toArray();
    }

    public ListIterator<T> listIterator(int i) {
        return this.f235401d.listIterator(i);
    }

    public <T1> T1[] toArray(T1[] t1Arr) {
        return this.f235401d.toArray(t1Arr);
    }

    public void add(int i, T t) {
        this.f235401d.add(i, t);
        try {
            this.f235402e.mo111957b(t);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.ArrayListProxy", th, "", new Object[0]);
        }
    }

    public T remove(int i) {
        T remove = this.f235401d.remove(i);
        try {
            this.f235402e.mo111956a(remove);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.ArrayListProxy", th, "", new Object[0]);
        }
        return remove;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.f235401d.addAll(i, collection);
        try {
            for (Object b : collection) {
                this.f235402e.mo111957b(b);
            }
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.ArrayListProxy", th, "", new Object[0]);
        }
        return addAll;
    }
}
