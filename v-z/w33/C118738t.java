package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import fy3.C32226l;
import gy3.C87412m;
import iy3.C60641c;
import p1177ce.C113291d;
import p212oe.C117750b;
import p269xe.d$$i;

/* renamed from: w33.t */
public final class C118738t {
    /* renamed from: a */
    public static final C104289g m167430a(C104289g gVar, String str, C32226l lVar) {
        C104289g gVar2 = new C104289g();
        lVar.invoke(gVar2);
        gVar.put(str, gVar2.toString());
        return gVar;
    }

    /* renamed from: b */
    public static final float m167431b(long j, long j2) {
        return ((float) C60641c.m70921b((((((float) j) * 10.0f) / ((float) j2)) * ((float) 100)) * 20.0f)) / 20.0f;
    }

    /* renamed from: c */
    public static final void m167432c(C114467i iVar) {
        C87412m.m108594g(iVar, "<this>");
        if (C117750b.m166049g()) {
            C113291d.C113292a.C113308d dVar = new C113291d.C113292a.C113308d();
            dVar.mo165870i();
            dVar.f339024a.append("| BizTest: '");
            dVar.f339024a.append(iVar.f343167p);
            dVar.mo165862a("'\n");
            new d$$i().mo165859a(iVar, dVar);
            dVar.mo165867f();
            dVar.mo165865d();
        }
    }
}
