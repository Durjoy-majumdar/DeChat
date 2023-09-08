package p267x;

import androidx.compose.p002ui.platform.C103612c1;
import gy3.C8480h;
import gy3.C87412m;
import p436a1.C103252o0;
import p436a1.C103257q;
import p436a1.C103266t0;
import p436a1.C103272w;
import p721v0.C65503j;

/* renamed from: x.b */
public final class C111885b {
    /* renamed from: a */
    public static C65503j m152605a(C65503j jVar, C103257q qVar, C103266t0 t0Var, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            t0Var = C103252o0.f304457a;
        }
        C103266t0 t0Var2 = t0Var;
        float f2 = (i & 4) != 0 ? 1.0f : f;
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(qVar, "brush");
        C87412m.m108594g(t0Var2, "shape");
        return jVar.mo74972i0(new C111880a((C103272w) null, qVar, f2, t0Var2, C103612c1.f306063a, 1, (C8480h) null));
    }

    /* renamed from: b */
    public static final C65503j m152606b(C65503j jVar, long j, C103266t0 t0Var) {
        C87412m.m108594g(jVar, "$this$background");
        C87412m.m108594g(t0Var, "shape");
        return jVar.mo74972i0(new C111880a(new C103272w(j), (C103257q) null, 0.0f, t0Var, C103612c1.f306063a, 6, (C8480h) null));
    }

    /* renamed from: c */
    public static /* synthetic */ C65503j m152607c(C65503j jVar, long j, C103266t0 t0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            t0Var = C103252o0.f304457a;
        }
        return m152606b(jVar, j, t0Var);
    }
}
