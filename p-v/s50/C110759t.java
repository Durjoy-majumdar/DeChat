package s50;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: s50.t */
public final class C110759t implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C110760u f331270d;

    public C110759t(C110760u uVar) {
        this.f331270d = uVar;
    }

    public final boolean onTimerExpired() {
        C110760u uVar = this.f331270d;
        C32226l<? super Integer, C13598b0> lVar = uVar.f331281K;
        if (lVar != null) {
            C13598b0 invoke = lVar.invoke(Integer.valueOf(uVar.f331280J));
        }
        this.f331270d.f331280J = 0;
        return true;
    }
}
