package ur0;

import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ur0.b */
public final class C90725b extends C87413o implements C32226l<C84310k, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f260588d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90725b(String str) {
        super(1);
        this.f260588d = str;
    }

    public Object invoke(Object obj) {
        C84310k kVar = (C84310k) obj;
        C87412m.m108594g(kVar, LocaleUtil.ITALIAN);
        return Boolean.valueOf(C87412m.m108589b(kVar.mo111363h(), this.f260588d));
    }
}
