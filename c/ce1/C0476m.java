package ce1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ce1.m */
public final class C0476m extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0465g f1163d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0476m(C0465g gVar) {
        super(1);
        this.f1163d = gVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
        Log.m105924i("FinderActivityEventUIC", "setAnnounceView");
        C58784w3.f168295a.mo83935h1(this.f1163d.getContext());
        return C13598b0.f38549a;
    }
}
