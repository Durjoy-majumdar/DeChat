package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C52112yg0;

/* renamed from: kf1.xa */
public final class C10046xa extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10029wa f30786d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10046xa(C10029wa waVar) {
        super(1);
        this.f30786d = waVar;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
        if (iResponse.getPullType() != 2) {
            C10029wa waVar = this.f30786d;
            waVar.f30740o = (C52112yg0) ((FinderTimelineFeedLoader.C2757d) iResponse).f13872a;
            waVar.mo10487n();
        }
        return C13598b0.f38549a;
    }
}
