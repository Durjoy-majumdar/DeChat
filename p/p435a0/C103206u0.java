package p435a0;

import androidx.compose.p002ui.platform.C103612c1;
import gy3.C87412m;
import p721v0.C65503j;

/* renamed from: a0.u0 */
public final class C103206u0 implements C103203t0 {

    /* renamed from: a */
    public static final C103206u0 f304394a = new C103206u0();

    /* renamed from: a */
    public C65503j mo142936a(C65503j jVar, float f, boolean z) {
        C87412m.m108594g(jVar, "<this>");
        if (((double) f) > 0.0d) {
            return jVar.mo74972i0(new C103156i0(f, z, C103612c1.f306063a));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }
}
