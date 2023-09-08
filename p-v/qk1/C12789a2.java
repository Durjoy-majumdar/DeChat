package qk1;

import java.util.Comparator;
import te3.C50767p11;
import te3.C51228sd2;
import ux3.C65486b;

/* renamed from: qk1.a2 */
public final class C12789a2<T> implements Comparator {
    public final int compare(T t, T t2) {
        C51228sd2 sd22 = (C51228sd2) t2;
        float f = (float) sd22.f141448e;
        C50767p11 p112 = sd22.f141447d;
        float f2 = 0.0f;
        Float valueOf = Float.valueOf(f * (p112 != null ? p112.f139516p : 0.0f));
        C51228sd2 sd23 = (C51228sd2) t;
        float f3 = (float) sd23.f141448e;
        C50767p11 p113 = sd23.f141447d;
        if (p113 != null) {
            f2 = p113.f139516p;
        }
        return C65486b.m77169a(valueOf, Float.valueOf(f3 * f2));
    }
}
