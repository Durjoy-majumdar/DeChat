package oa0;

import ca0.C54683f0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55302j;
import fa0.C107536d;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p175j0.C60690y0;
import p435a0.C103161k;
import rx3.C13598b0;

/* renamed from: oa0.p */
public final class C61977p extends C87413o implements C32228q<C103161k, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f176177d;

    /* renamed from: e */
    public final /* synthetic */ C54683f0 f176178e;

    /* renamed from: f */
    public final /* synthetic */ C55302j f176179f;

    /* renamed from: g */
    public final /* synthetic */ C60690y0<C61949a> f176180g;

    /* renamed from: h */
    public final /* synthetic */ C60690y0<Boolean> f176181h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61977p(boolean z, C54683f0 f0Var, C55302j jVar, C60690y0<C61949a> y0Var, C60690y0<Boolean> y0Var2) {
        super(3);
        this.f176177d = z;
        this.f176178e = f0Var;
        this.f176179f = jVar;
        this.f176180g = y0Var;
        this.f176181h = y0Var2;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C103161k kVar = (C103161k) obj;
        C108504h hVar = (C108504h) obj2;
        int intValue = ((Number) obj3).intValue();
        C87412m.m108594g(kVar, "$this$MusicSelectorExpand");
        if ((intValue & 14) == 0) {
            intValue |= hVar.mo51619x(kVar) ? 4 : 2;
        }
        if ((intValue & 91) == 18 && hVar.mo51575a()) {
            hVar.mo51581d();
        } else if (this.f176177d) {
            C107536d.m145665a(kVar, new C61976o(this.f176178e, this.f176179f, this.f176180g, this.f176181h), hVar, intValue & 14);
        }
        return C13598b0.f38549a;
    }
}
