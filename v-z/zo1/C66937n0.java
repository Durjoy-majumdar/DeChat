package zo1;

import bp1.C54519d;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import vo1.C65770a0;
import vo1.C65821t0;

/* renamed from: zo1.n0 */
public final class C66937n0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66925j0 f192319d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66937n0(C66925j0 j0Var) {
        super(0);
        this.f192319d = j0Var;
    }

    public Object invoke() {
        C16344b0 b0Var;
        C65821t0 t0Var;
        Class cls = C54519d.class;
        C66925j0.f192298t.mo90919a(this.f192319d.mo87686C0().f151977d.f157075s, this.f192319d.mo14482F0());
        if (((C54519d) this.f192319d.mo87696x0(cls)).f152846f && (b0Var = (C16344b0) this.f192319d.mo87687E0(C16344b0.class)) != null) {
            if (((C54519d) b0Var.mo87696x0(cls)).f152841C) {
                Log.m105928w(b0Var.f43699r, "ReplayTransition1:transition playing!");
            } else {
                ((C54519d) b0Var.mo87696x0(cls)).f152841C = true;
                ((C54519d) b0Var.mo87696x0(cls)).mo75377l3(1);
                Log.m105924i(b0Var.f43699r, "ReplayTransition1:playTransition ready to play!");
                b0Var.mo14484z0().hideLoadingLayer(true);
                if (b0Var.f43706y == null) {
                    b0Var.f43706y = new C16354e0(b0Var);
                    Log.m105924i(b0Var.f43699r, "initTitleFadeTask!");
                }
                b0Var.f166287d.removeCallbacks(b0Var.f43706y);
                b0Var.f166287d.postDelayed(b0Var.f43706y, 2000);
                LiveRoomControllerStore f = C65770a0.f189184r.mo89819a().mo89805f();
                if (!(f == null || (t0Var = (C65821t0) f.controller(C65821t0.class)) == null)) {
                    Log.m105924i(t0Var.f189290j, "startReplayTransition");
                    t0Var.mo89858m3();
                }
            }
        }
        return C13598b0.f38549a;
    }
}
