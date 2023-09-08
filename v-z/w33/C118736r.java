package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: w33.r */
public final class C118736r extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f355271d;

    /* renamed from: e */
    public final /* synthetic */ C114467i f355272e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118736r(boolean z, C114467i iVar) {
        super(1);
        this.f355271d = z;
        this.f355272e = iVar;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        C118738t.m167430a(gVar, APMidasPayAPI.ENV_DEV, new C118733o(this.f355272e, this.f355271d));
        C118738t.m167430a(gVar, "app", new C118734p(this.f355272e));
        if (this.f355271d) {
            C118738t.m167430a(gVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, new C118735q(this.f355272e));
        }
        return C13598b0.f38549a;
    }
}
