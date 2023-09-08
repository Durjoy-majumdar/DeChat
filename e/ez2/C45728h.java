package ez2;

import java.util.Comparator;
import rz2.C48201c;
import ux3.C65486b;

/* renamed from: ez2.h */
public final class C45728h<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Integer.valueOf(((C48201c) t2).field_CreateTime), Integer.valueOf(((C48201c) t).field_CreateTime));
    }
}
