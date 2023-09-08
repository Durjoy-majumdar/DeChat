package androidx.compose.p002ui.platform;

import p1166z0.C112535a;
import p1166z0.C112541g;
import p436a1.C103245l;
import p436a1.C27726j0;

/* renamed from: androidx.compose.ui.platform.w1 */
public final class C103705w1 {
    /* renamed from: a */
    public static final boolean m137998a(C27726j0 j0Var, float f, float f2, C27726j0 j0Var2, C27726j0 j0Var3) {
        C112541g gVar = new C112541g(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (j0Var2 == null) {
            j0Var2 = C103245l.m136700a();
        }
        j0Var2.mo55580e(gVar);
        if (j0Var3 == null) {
            j0Var3 = C103245l.m136700a();
        }
        j0Var3.mo55586j(j0Var, j0Var2, 1);
        boolean isEmpty = j0Var3.isEmpty();
        j0Var3.reset();
        j0Var2.reset();
        return !isEmpty;
    }

    /* renamed from: b */
    public static final boolean m137999b(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = C112535a.m153728b(j);
        float c = C112535a.m153729c(j);
        return ((f5 * f5) / (b * b)) + ((f6 * f6) / (c * c)) <= 1.0f;
    }
}
