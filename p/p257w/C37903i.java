package p257w;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: w.i */
public final class C37903i {
    /* renamed from: a */
    public static C37902h0 m41593a(C37948y yVar, C37924q0 q0Var, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            q0Var = C37924q0.Restart;
        }
        C37924q0 q0Var2 = q0Var;
        if ((i & 4) != 0) {
            j = (long) 0;
        }
        C87412m.m108594g(yVar, "animation");
        C87412m.m108594g(q0Var2, "repeatMode");
        return new C37902h0(yVar, q0Var2, j, (C8480h) null);
    }

    /* renamed from: b */
    public static C37944w0 m41594b(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C37944w0(f, f2, obj);
    }

    /* renamed from: c */
    public static C37905j1 m41595c(int i, int i2, C37950z zVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            zVar = C37890a0.f100293a;
        }
        C87412m.m108594g(zVar, "easing");
        return new C37905j1(i, i2, zVar);
    }
}
