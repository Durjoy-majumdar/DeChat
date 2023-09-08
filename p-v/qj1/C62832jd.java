package qj1;

import android.os.Bundle;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.jd */
public final class C62832jd extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bundle f178324d;

    /* renamed from: e */
    public final /* synthetic */ C62712dd f178325e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62832jd(Bundle bundle, C62712dd ddVar) {
        super(0);
        this.f178324d = bundle;
        this.f178325e = ddVar;
    }

    public Object invoke() {
        Bundle bundle = this.f178324d;
        boolean z = false;
        boolean z2 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR") : false;
        Bundle bundle2 = this.f178324d;
        if (bundle2 != null) {
            z = bundle2.getBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_VISITOR_CLICK_CLOSE");
        }
        this.f178325e.mo87727e1(z2, true, z);
        return C13598b0.f38549a;
    }
}
