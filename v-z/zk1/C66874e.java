package zk1;

import cl1.C54951d;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import fh1.C59062p2;
import fk1.C59115c;
import fy3.C32224a;
import gy3.C87413o;
import j50.C60735a;
import ph1.C62293i;
import rx3.C13598b0;

/* renamed from: zk1.e */
public final class C66874e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f192108d;

    /* renamed from: e */
    public final /* synthetic */ C59115c f192109e;

    /* renamed from: f */
    public final /* synthetic */ C59062p2 f192110f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66874e(FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, C59115c cVar, C59062p2 p2Var) {
        super(0);
        this.f192108d = finderLiveExitAnimateOpUIC;
        this.f192109e = cVar;
        this.f192110f = p2Var;
    }

    public Object invoke() {
        C58115i iVar;
        FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f192108d;
        C59115c cVar = this.f192109e;
        finderLiveExitAnimateOpUIC.getClass();
        cVar.mo84316a();
        C62293i.f177081a.mo87358c();
        C54951d dVar = (C54951d) FinderLiveService.f159376d.mo77630e(C54951d.class);
        if (dVar != null) {
            dVar.f154004i = C54951d.C54954d.SQAURE_MODE;
        }
        C60735a aVar = FinderLiveService.f159378f;
        if (!(aVar == null || (iVar = aVar.f172989A) == null)) {
            iVar.f166258e = C58115i.C58119d.LIVE_SQUARE_MODE;
            Log.m105924i("MicroMsg.LiveStatus", "liveStatusModeChange changeToSquarePanelMode");
        }
        this.f192108d.mo78201d3("squarePanelDirector");
        this.f192110f.f168978A = false;
        return C13598b0.f38549a;
    }
}
