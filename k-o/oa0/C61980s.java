package oa0;

import ca0.C54683f0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C28971l;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60690y0;
import rx3.C13598b0;
import te3.o74;

/* renamed from: oa0.s */
public final class C61980s extends C87413o implements C32226l<C28971l<o74>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f176186d;

    /* renamed from: e */
    public final /* synthetic */ C54683f0 f176187e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<Boolean> f176188f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61980s(C32224a<C13598b0> aVar, C54683f0 f0Var, C60690y0<Boolean> y0Var) {
        super(1);
        this.f176186d = aVar;
        this.f176187e = f0Var;
        this.f176188f = y0Var;
    }

    public Object invoke(Object obj) {
        C28971l lVar = (C28971l) obj;
        C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
        this.f176186d.invoke();
        C110008g.m149533e(this.f176188f, false);
        C32226l<String, C13598b0> lVar2 = this.f176187e.f153251c;
        String str = ((o74) lVar.f79451a).f139006d;
        C87412m.m108593f(str, "it.data.music_id");
        lVar2.invoke(str);
        return C13598b0.f38549a;
    }
}
