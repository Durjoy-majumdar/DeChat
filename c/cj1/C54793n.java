package cj1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cj1.n */
public final class C54793n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54769i f153613d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54793n(C54769i iVar) {
        super(0);
        this.f153613d = iVar;
    }

    public Object invoke() {
        Log.m105924i("Finder.FinderLiveAnchorVerifyManager", "recoveryLive");
        C56032b bVar = this.f153613d.f153504b;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_ANCHOR_VERIFICATION_RECOVERY, (Bundle) null, 2, (Object) null);
        }
        this.f153613d.mo75675d(false);
        return C13598b0.f38549a;
    }
}
