package qj1;

import android.os.Bundle;
import c50.C54655b;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import d50.C58115i;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.we */
public final class C63091we extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63111xe f179044d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63091we(C63111xe xeVar) {
        super(0);
        this.f179044d = xeVar;
    }

    public Object invoke() {
        C58115i iVar;
        C63111xe xeVar = this.f179044d;
        xeVar.f166287d.animate().alpha(0.0f).setDuration(200).setListener(new C63061ve(xeVar)).start();
        xeVar.f179103t.stopTimer();
        Bundle bundle = new Bundle();
        C63111xe xeVar2 = this.f179044d;
        boolean z = false;
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
        xeVar2.getClass();
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54655b b = finderLiveService.mo77626b();
        if (!(b == null || (iVar = b.f172989A) == null)) {
            z = iVar.f166264k;
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z);
        xeVar2.f179099p.statusChange(C58124b.C58125b.FINDER_LIVE_MODE_SWITCH, bundle);
        C54655b b2 = finderLiveService.mo77626b();
        if (b2 != null) {
            b2.mo85705x0();
        }
        return C13598b0.f38549a;
    }
}
