package com.google.protobuf;

/* renamed from: com.google.protobuf.e */
public final class C16987e {

    /* renamed from: a */
    public static final Class<?> f45993a;

    /* renamed from: b */
    public static final boolean f45994b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f45993a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f45994b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m16777a() {
        return f45993a != null && !f45994b;
    }
}
