package p436a1;

import androidx.compose.p002ui.platform.C103612c1;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a1.a0 */
public final class C103221a0 {
    /* renamed from: a */
    public static final C65503j m136602a(C65503j jVar, C32226l<? super C103224b0, C13598b0> lVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(lVar, "block");
        return jVar.mo74972i0(new C103254p(lVar, C103612c1.f306063a));
    }

    /* renamed from: b */
    public static C65503j m136603b(C65503j jVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f15, long j, C103266t0 t0Var, boolean z, C103256p0 p0Var, long j2, long j3, int i, Object obj) {
        long j4;
        C65503j jVar2 = jVar;
        int i2 = i;
        float f16 = (i2 & 1) != 0 ? 1.0f : f;
        float f17 = (i2 & 2) != 0 ? 1.0f : f2;
        float f18 = (i2 & 4) != 0 ? 1.0f : f3;
        float f19 = (i2 & 8) != 0 ? 0.0f : f4;
        float f25 = (i2 & 16) != 0 ? 0.0f : f5;
        float f26 = (i2 & 32) != 0 ? 0.0f : f6;
        float f27 = (i2 & 64) != 0 ? 0.0f : f7;
        float f28 = (i2 & 128) != 0 ? 0.0f : f8;
        float f29 = (i2 & 256) != 0 ? 0.0f : f9;
        float f35 = (i2 & 512) != 0 ? 8.0f : f15;
        if ((i2 & 1024) != 0) {
            int i3 = C103222a1.f304425c;
            j4 = C103222a1.f304424b;
        } else {
            j4 = j;
        }
        C103266t0 t0Var2 = (i2 & 2048) != 0 ? C103252o0.f304457a : t0Var;
        boolean z2 = (i2 & 4096) != 0 ? false : z;
        C103256p0 p0Var2 = (i2 & 8192) != 0 ? null : p0Var;
        long j5 = (i2 & 16384) != 0 ? C103227c0.f304432a : j2;
        long j6 = (i2 & 32768) != 0 ? C103227c0.f304432a : j3;
        C87412m.m108594g(jVar2, "$this$graphicsLayer");
        C87412m.m108594g(t0Var2, "shape");
        return jVar2.mo74972i0(new C103270v0(f16, f17, f18, f19, f25, f26, f27, f28, f29, f35, j4, t0Var2, z2, p0Var2, j5, j6, C103612c1.f306063a, (C8480h) null));
    }
}
