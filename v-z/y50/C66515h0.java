package y50;

import android.content.Context;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: y50.h0 */
public final class C66515h0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f191340d;

    /* renamed from: e */
    public final /* synthetic */ Context f191341e;

    /* renamed from: f */
    public final /* synthetic */ LiveConfig f191342f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66515h0(C101218e0 e0Var, Context context, LiveConfig liveConfig) {
        super(0);
        this.f191340d = e0Var;
        this.f191341e = context;
        this.f191342f = liveConfig;
    }

    public Object invoke() {
        this.f191340d.mo140680z();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LIVE_FIRST_VISITOR_INT_SYNC, 0);
        C66527o.f191369a.mo90610g(this.f191341e, this.f191342f);
        return C13598b0.f38549a;
    }
}
