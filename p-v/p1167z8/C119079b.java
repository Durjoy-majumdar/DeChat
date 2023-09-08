package p1167z8;

import sun.misc.Unsafe;

/* renamed from: z8.b */
public final /* synthetic */ class C119079b {
    /* renamed from: a */
    public static /* synthetic */ boolean m167872a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
