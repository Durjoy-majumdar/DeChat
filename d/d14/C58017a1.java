package d14;

import c14.C54624g;
import f14.C58872c0;

/* renamed from: d14.a1 */
public final class C58017a1 {

    /* renamed from: a */
    public static final C58872c0 f165964a = new C58872c0("NO_VALUE");

    /* renamed from: a */
    public static final <T> C58085t0<T> m67172a(int i, int i2, C54624g gVar) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && gVar != C54624g.SUSPEND) {
                    z = false;
                }
                if (z) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new C58100z0(i, i3, gVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + gVar).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ C58085t0 m67173b(int i, int i2, C54624g gVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            gVar = C54624g.SUSPEND;
        }
        return m67172a(i, i2, gVar);
    }
}
