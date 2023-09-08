package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import ej0.C86525c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: rs1.k8 */
public final class C63561k8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86525c f180252d;

    /* renamed from: e */
    public final /* synthetic */ C56711j f180253e;

    /* renamed from: f */
    public final /* synthetic */ boolean f180254f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63561k8(C86525c cVar, C56711j jVar, boolean z) {
        super(0);
        this.f180252d = cVar;
        this.f180253e = jVar;
        this.f180254f = z;
    }

    public Object invoke() {
        Log.m105924i("FinderProjectionScreenUIC", "onBreakDevice mrDevice:" + this.f180252d + ", selectedDevice:" + this.f180253e.f162605w + ", isFromClick=" + this.f180254f);
        if (C87412m.m108589b(this.f180252d, this.f180253e.f162605w)) {
            C86525c cVar = this.f180252d;
            if (cVar != null) {
                this.f180253e.getClass();
                cVar.mo121007h();
                cVar.mo121008i();
                cVar.f251389h = null;
            }
            C56711j jVar = this.f180253e;
            jVar.f162605w = null;
            jVar.f162606x = 0;
            if (jVar.mo80095i3().getVisibility() == 0) {
                if (this.f180253e.mo80093f3().isEmpty()) {
                    this.f180253e.mo80099m3(0);
                } else {
                    this.f180253e.mo80099m3(2);
                    C56711j jVar2 = this.f180253e;
                    jVar2.f162587K = 0;
                    ((MTimerHandler) ((C36570n) jVar2.f162588L).getValue()).stopTimer();
                    ((MTimerHandler) ((C36570n) jVar2.f162588L).getValue()).startTimer(0, 3000);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
