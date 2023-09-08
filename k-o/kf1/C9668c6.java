package kf1;

import cm1.C55018j0;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: kf1.c6 */
public final class C9668c6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C2829n f30036d;

    /* renamed from: e */
    public final /* synthetic */ C55018j0 f30037e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9668c6(C2829n nVar, C55018j0 j0Var) {
        super(0);
        this.f30036d = nVar;
        this.f30037e = j0Var;
    }

    public Object invoke() {
        C2829n.m2663b(this.f30036d, this.f30037e, (Object) null, 0, 6, (Object) null);
        C2829n nVar = this.f30036d;
        long longExtra = nVar.f14111d.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0);
        if (longExtra > 0) {
            C61926c.m72666K(0, new C10012v5(nVar, longExtra));
        }
        return C13598b0.f38549a;
    }
}
