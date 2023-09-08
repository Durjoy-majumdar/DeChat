package pj1;

import java.util.Comparator;
import java.util.Map;
import ux3.C65486b;

/* renamed from: pj1.e */
public final class C11941e<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a((Integer) ((Map.Entry) t2).getValue(), (Integer) ((Map.Entry) t).getValue());
    }
}
