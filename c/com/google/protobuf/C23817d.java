package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.d */
public abstract class C23817d<E> extends AbstractList<E> implements C23908o0.C23919j<E> {

    /* renamed from: d */
    public boolean f68221d = true;

    /* renamed from: O */
    public final void mo37522O() {
        this.f68221d = false;
    }

    /* renamed from: Q */
    public boolean mo37523Q() {
        return this.f68221d;
    }

    public boolean add(E e) {
        mo37528f();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo37528f();
        return super.addAll(collection);
    }

    public void clear() {
        mo37528f();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void mo37528f() {
        if (!this.f68221d) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo37528f();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo37528f();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo37528f();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo37528f();
        return super.addAll(i, collection);
    }
}
