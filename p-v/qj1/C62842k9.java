package qj1;

import android.os.Bundle;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.k9 */
public final class C62842k9 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f178342d;

    /* renamed from: e */
    public final /* synthetic */ String f178343e;

    /* renamed from: f */
    public final /* synthetic */ C62949r8 f178344f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62842k9(long j, String str, C62949r8 r8Var) {
        super(0);
        this.f178342d = j;
        this.f178343e = str;
        this.f178344f = r8Var;
    }

    public Object invoke() {
        Bundle bundle = new Bundle();
        bundle.putLong("PARAM_FINDER_LIVE_SEND_MSG_SESSION_ID", this.f178342d);
        bundle.putString("PARAM_FINDER_LIVE_NOTIFY_SEND_MSG_CONTENT", this.f178343e);
        this.f178344f.f178641p.statusChange(C58124b.C58125b.FINGER_LIVE_NOTIFY_POST_MSG_RESULT, bundle);
        return C13598b0.f38549a;
    }
}
