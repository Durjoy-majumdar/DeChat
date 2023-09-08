package bz3;

import gy3.C87412m;

/* renamed from: bz3.e */
public final class C113219e {
    /* renamed from: a */
    public static final Class<?> m154929a(ClassLoader classLoader, String str) {
        C87412m.m108594g(classLoader, "<this>");
        C87412m.m108594g(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
