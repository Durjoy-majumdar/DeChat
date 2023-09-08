package h14;

import java.util.ServiceLoader;
import y04.C112349m;
import y04.C112354s;

/* renamed from: h14.c */
public final class C108012c {

    /* renamed from: a */
    public static final C108011a[] f323455a;

    static {
        Class<C108011a> cls = C108011a.class;
        Object[] array = C112354s.m153296s(C112349m.m153278a(ServiceLoader.load(cls, cls.getClassLoader()).iterator())).toArray(new C108011a[0]);
        if (array != null) {
            f323455a = (C108011a[]) array;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
