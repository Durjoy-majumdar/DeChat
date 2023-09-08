package p009c2;

import p735w1.C38006x;
import p735w1.C38007y;

/* renamed from: c2.g */
public final class C28481g {
    /* renamed from: a */
    public static final long m38222a(long j, long j2) {
        int i;
        int f = C38006x.m41698f(j);
        int e = C38006x.m41697e(j);
        boolean z = false;
        if (C38006x.m41698f(j2) < C38006x.m41697e(j) && C38006x.m41698f(j) < C38006x.m41697e(j2)) {
            if (C38006x.m41698f(j2) <= C38006x.m41698f(j) && C38006x.m41697e(j) <= C38006x.m41697e(j2)) {
                f = C38006x.m41698f(j2);
                e = f;
            } else {
                if (C38006x.m41698f(j) <= C38006x.m41698f(j2) && C38006x.m41697e(j2) <= C38006x.m41697e(j)) {
                    i = C38006x.m41696d(j2);
                } else {
                    int f2 = C38006x.m41698f(j2);
                    if (f < C38006x.m41697e(j2) && f2 <= f) {
                        z = true;
                    }
                    if (z) {
                        f = C38006x.m41698f(j2);
                        i = C38006x.m41696d(j2);
                    } else {
                        e = C38006x.m41698f(j2);
                    }
                }
            }
            return C38007y.m41701a(f, e);
        }
        if (e > C38006x.m41698f(j2)) {
            f -= C38006x.m41696d(j2);
            i = C38006x.m41696d(j2);
        }
        return C38007y.m41701a(f, e);
        e -= i;
        return C38007y.m41701a(f, e);
    }
}
