package p267x;

import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1116h1.C108009b;
import p1140p1.C110100f;
import p1165z.C112527l;
import p175j0.C108504h;
import p721v0.C111299g;
import p721v0.C65503j;
import p869y0.C112335u;
import p869y0.C112338v;
import rx3.C13598b0;

/* renamed from: x.q0 */
public final class C111950q0 extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ boolean f335142d;

    /* renamed from: e */
    public final /* synthetic */ C112527l f335143e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111950q0(boolean z, C112527l lVar) {
        super(3);
        this.f335142d = z;
        this.f335143e = lVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65503j) obj, "$this$composed");
        hVar.mo51557H(-618949501);
        C111947p0 p0Var = new C111947p0((C108009b) hVar.mo51598m(C103645l0.f306129j));
        C110100f<C112338v> fVar = C112335u.f336362a;
        C32226l<C103618e1, C13598b0> lVar = C103612c1.f306063a;
        C65503j a = C111299g.m151786a(new C112338v(p0Var, lVar), lVar, new C111944o0(this.f335143e, this.f335142d));
        hVar.mo51565P();
        return a;
    }
}
