package qy3;

import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: qy3.v0 */
public final class C63351v0 {

    /* renamed from: a */
    public final WeakReference<ClassLoader> f179716a;

    /* renamed from: b */
    public final int f179717b;

    public C63351v0(ClassLoader classLoader) {
        C87412m.m108594g(classLoader, "classLoader");
        this.f179716a = new WeakReference<>(classLoader);
        this.f179717b = System.identityHashCode(classLoader);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C63351v0) && this.f179716a.get() == ((C63351v0) obj).f179716a.get();
    }

    public int hashCode() {
        return this.f179717b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r1 = this;
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.f179716a
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = "<null>"
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qy3.C63351v0.toString():java.lang.String");
    }
}
