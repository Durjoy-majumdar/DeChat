package p868x0;

import androidx.compose.p002ui.platform.C103612c1;
import gy3.C87412m;
import p1104d1.C106969c;
import p436a1.C103274x;
import p631o1.C109836f;
import p721v0.C111294a;
import p721v0.C65503j;

/* renamed from: x0.n */
public final class C111989n {
    /* renamed from: a */
    public static C65503j m152718a(C65503j jVar, C106969c cVar, boolean z, C111294a aVar, C109836f fVar, float f, C103274x xVar, int i, Object obj) {
        C111294a aVar2;
        C109836f fVar2;
        C65503j jVar2 = jVar;
        boolean z2 = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            int i2 = C111294a.f333218a;
            aVar2 = C111294a.C111295a.f333222d;
        } else {
            aVar2 = aVar;
        }
        if ((i & 8) != 0) {
            int i3 = C109836f.f328763a;
            fVar2 = C109836f.C109837a.f328767d;
        } else {
            fVar2 = fVar;
        }
        float f2 = (i & 16) != 0 ? 1.0f : f;
        C103274x xVar2 = (i & 32) != 0 ? null : xVar;
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(cVar, "painter");
        C87412m.m108594g(aVar2, "alignment");
        C87412m.m108594g(fVar2, "contentScale");
        return jVar.mo74972i0(new C111987m(cVar, z2, aVar2, fVar2, f2, xVar2, C103612c1.f306063a));
    }
}
