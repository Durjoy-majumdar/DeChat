package w04;

import gy3.C87412m;

/* renamed from: w04.c */
public final class C118711c {
    /* renamed from: a */
    public static final boolean m167394a(Throwable th) {
        C87412m.m108594g(th, "<this>");
        Class cls = th.getClass();
        while (!C87412m.m108589b(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }
}
