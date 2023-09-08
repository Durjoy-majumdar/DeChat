package ea3;

import java.util.Comparator;
import ux3.C65486b;

/* renamed from: ea3.p */
public final class C7621p<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Integer.valueOf(((String) t2).length()), Integer.valueOf(((String) t).length()));
    }
}
