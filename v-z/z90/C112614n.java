package z90;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p175j0.C60690y0;
import p631o1.C109857o;
import p631o1.C109861p;
import rx3.C13598b0;

/* renamed from: z90.n */
public final class C112614n extends C87413o implements C32226l<C109857o, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<Integer> f337252d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112614n(C60690y0<Integer> y0Var) {
        super(1);
        this.f337252d = y0Var;
    }

    public Object invoke(Object obj) {
        C109857o oVar = (C109857o) obj;
        C87412m.m108594g(oVar, LocaleUtil.ITALIAN);
        this.f337252d.setValue(Integer.valueOf((int) C112539e.m153739d(C109861p.m149328d(oVar))));
        return C13598b0.f38549a;
    }
}
