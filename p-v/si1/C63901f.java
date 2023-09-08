package si1;

import al1.C54130j;
import android.os.Bundle;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: si1.f */
public final class C63901f extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63902g f181127d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63901f(C63902g gVar) {
        super(1);
        this.f181127d = gVar;
    }

    public Object invoke(Object obj) {
        if (((Number) obj).intValue() == 1) {
            Bundle bundle = new Bundle();
            C63902g gVar = this.f181127d;
            C54130j bindLinkMicUser = gVar.getBindLinkMicUser();
            bundle.putString("PARAM_FINDER_LIVE_MIC_ID", bindLinkMicUser != null ? bindLinkMicUser.f152002f : null);
            gVar.getBasePlugin().f177936g.statusChange(C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, bundle);
        }
        return C13598b0.f38549a;
    }
}
