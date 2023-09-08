package p955df;

import java.io.File;
import java.util.Comparator;
import ux3.C65486b;

/* renamed from: df.f */
public final class C86270f<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
    }
}
