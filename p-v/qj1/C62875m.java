package qj1;

import cl1.C54951d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import ph1.C62293i;
import ph1.C62297m;
import rx3.C13598b0;

/* renamed from: qj1.m */
public final class C62875m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62898o f178414d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62875m(C62898o oVar) {
        super(0);
        this.f178414d = oVar;
    }

    public Object invoke() {
        Log.m105928w("FinderLiveAdVideoPlugin", "loadStartupVideo come onFirstFrameRendered.");
        C62898o oVar = this.f178414d;
        oVar.mo87847g1(C54951d.C54952a.STARTUP_VIDEO_PLAYING_FIRST_FRAME);
        C63170ze zeVar = (C63170ze) oVar.mo87687E0(C63170ze.class);
        if (zeVar != null) {
            zeVar.mo88089Z0();
        }
        C62297m e = C62293i.f177081a.mo87360e(oVar.mo87686C0().f151977d.f157075s);
        if (e != null) {
            e.mo84322g();
        }
        C32224a<C13598b0> aVar = oVar.f178500u;
        if (aVar != null) {
            aVar.invoke();
        }
        oVar.f178500u = null;
        return C13598b0.f38549a;
    }
}
