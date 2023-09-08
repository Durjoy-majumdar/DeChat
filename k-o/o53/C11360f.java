package o53;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import q53.C12049b0;
import q53.C12057d0;
import qo3.C12925w;
import rx3.C13598b0;
import s43.C13624e;

/* renamed from: o53.f */
public final class C11360f extends C87413o implements C32226l<C12049b0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11367m f33455d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11360f(C11367m mVar) {
        super(1);
        this.f33455d = mVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C12049b0) obj, LocaleUtil.ITALIAN);
        C12049b0 b0Var = this.f33455d.f33469c;
        if (b0Var != null) {
            b0Var.f35096c.mo5085n();
            C13624e eVar = this.f33455d.f33467a;
            C12925w wVar = new C12057d0(eVar.f38608l, eVar.f38598b).f35131b;
            wVar.f36937s = new C11359e(this.f33455d);
            wVar.mo5086o();
            return C13598b0.f38549a;
        }
        C87412m.m108603p("consumePanel");
        throw null;
    }
}
