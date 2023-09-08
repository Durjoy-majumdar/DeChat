package p467co;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import k10.C88059h;
import l10.C24931h;
import rx3.C13598b0;

/* renamed from: co.e */
public final class C80121e extends C87413o implements C32226l<C88059h.C88060a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<String, String, C13598b0> f234606d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80121e(C32227p<? super String, ? super String, C13598b0> pVar) {
        super(1);
        this.f234606d = pVar;
    }

    public Object invoke(Object obj) {
        C88059h.C88060a aVar = (C88059h.C88060a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        Long l = aVar.f254709a;
        if (l != null && l.longValue() == 0) {
            this.f234606d.invoke(null, C24931h.C24941d.f71082h.parseFrom(aVar.f254711c).getSessionId());
        } else {
            this.f234606d.invoke(aVar.f254710b, null);
        }
        return C13598b0.f38549a;
    }
}
