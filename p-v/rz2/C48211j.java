package rz2;

import java.util.Comparator;
import ux3.C65486b;

/* renamed from: rz2.j */
public final class C48211j<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Integer.valueOf(((C48201c) t2).field_CreateTime), Integer.valueOf(((C48201c) t).field_CreateTime));
    }
}
