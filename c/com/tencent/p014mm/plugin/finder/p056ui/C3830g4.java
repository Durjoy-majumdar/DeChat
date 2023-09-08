package com.tencent.p014mm.plugin.finder.p056ui;

import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import lp1.C10608c;
import lp1.C10612f;
import lp1.C10617j;
import lp1.C10623n;
import lp1.C10625o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.g4 */
public final class C3830g4 extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17363d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3830g4(FinderShareFeedRelUI finderShareFeedRelUI) {
        super(1);
        this.f17363d = finderShareFeedRelUI;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
        if (iResponse.getPullType() != 2 && (iResponse instanceof FinderFeedShareRelativeListLoader.C2673c)) {
            C39818r rVar = C39818r.f106831a;
            C10612f fVar = (C10612f) rVar.mo62444c(this.f17363d).mo75002a(C10612f.class);
            FinderFeedShareRelativeListLoader.C2673c cVar = (FinderFeedShareRelativeListLoader.C2673c) iResponse;
            fVar.getClass();
            C10625o oVar = (C10625o) rVar.mo62444c(fVar.getActivity()).mo75002a(C10625o.class);
            String str = cVar.f13594a;
            oVar.getClass();
            C87412m.m108594g(str, "<set-?>");
            oVar.f32012q = str;
            C10623n nVar = (C10623n) rVar.mo62444c(fVar.getActivity()).mo75002a(C10623n.class);
            String str2 = cVar.f13594a;
            nVar.getClass();
            C87412m.m108594g(str2, "<set-?>");
            nVar.f32012q = str2;
            ((C10608c) rVar.mo62444c(fVar.getActivity()).mo75002a(C10608c.class)).f31983q = cVar.f13595b;
            ((C10617j) rVar.mo62444c(fVar.getActivity()).mo75002a(C10617j.class)).getClass();
        }
        return C13598b0.f38549a;
    }
}
