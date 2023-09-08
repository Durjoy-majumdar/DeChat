package ve1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;
import te3.C50717oq2;

/* renamed from: ve1.i0 */
public final class C65606i0 extends C87413o implements C32226l<C50717oq2, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188783d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65606i0(C60905o oVar) {
        super(1);
        this.f188783d = oVar;
    }

    public Object invoke(Object obj) {
        C50717oq2 oq22 = (C50717oq2) obj;
        C87412m.m108594g(oq22, LocaleUtil.ITALIAN);
        C65604i iVar = C65604i.f188772a;
        Context context = this.f188783d.f173499A;
        C87412m.m108593f(context, "holder.context");
        iVar.mo89682h(context, this.f188783d.mo17363j(), oq22.f139316f);
        return C13598b0.f38549a;
    }
}
