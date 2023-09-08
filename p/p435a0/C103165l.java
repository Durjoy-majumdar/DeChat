package p435a0;

import androidx.compose.p002ui.platform.C103612c1;
import gy3.C87412m;
import p721v0.C111294a;
import p721v0.C65503j;

/* renamed from: a0.l */
public final class C103165l implements C103161k {

    /* renamed from: a */
    public static final C103165l f304321a = new C103165l();

    /* renamed from: a */
    public C65503j mo142911a(C65503j jVar, float f, boolean z) {
        C87412m.m108594g(jVar, "<this>");
        if (((double) f) > 0.0d) {
            return jVar.mo74972i0(new C103156i0(f, z, C103612c1.f306063a));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    /* renamed from: b */
    public C65503j mo142912b(C65503j jVar, C111294a.C37633b bVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(bVar, "alignment");
        return jVar.mo74972i0(new C103181p(bVar, C103612c1.f306063a));
    }
}
