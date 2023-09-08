package ux3;

/* renamed from: ux3.b */
public class C65486b {
    /* renamed from: a */
    public static final <T extends Comparable<?>> int m77169a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
