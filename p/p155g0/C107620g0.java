package p155g0;

import android.os.Build;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103618e1;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p175j0.C60690y0;
import p246u1.C111096z;
import p267x.C111888b2;
import p267x.C111893c2;
import p267x.C111953r1;
import p267x.C111958s1;
import p267x.C111959t1;
import p267x.C38422j1;
import p560i2.C108322d;
import p560i2.C33181m;
import p721v0.C111299g;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: g0.g0 */
public final class C107620g0 extends C87413o implements C32226l<C32224a<? extends C112539e>, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C108322d f322011d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<C33181m> f322012e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107620g0(C108322d dVar, C60690y0<C33181m> y0Var) {
        super(1);
        this.f322011d = dVar;
        this.f322012e = y0Var;
    }

    public Object invoke(Object obj) {
        C65503j jVar;
        C32224a aVar = (C32224a) obj;
        C87412m.m108594g(aVar, "center");
        C65503j.C65504a aVar2 = C65503j.C65504a.f188490d;
        C111959t1 t1Var = C111959t1.f335173h;
        C32245e0 e0Var = new C32245e0(aVar);
        C107618f0 f0Var = new C107618f0(this.f322011d, this.f322012e);
        C111096z<C32224a<C112539e>> zVar = C111958s1.f335171a;
        C38422j1 j1Var = C38422j1.f101366d;
        C87412m.m108594g(j1Var, "magnifierCenter");
        C87412m.m108594g(t1Var, "style");
        C32226l<C103618e1, C13598b0> lVar = C103612c1.f306063a;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            if (i >= 28) {
                z = true;
            }
            if (z) {
                jVar = C111299g.m151787b(aVar2, (C32226l) null, new C111953r1(e0Var, j1Var, Float.NaN, f0Var, i == 28 ? C111888b2.f334982a : C111893c2.f334992a, t1Var), 1, (Object) null);
            } else {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
        } else {
            jVar = aVar2;
        }
        return C103612c1.m137790a(aVar2, lVar, jVar);
    }
}
