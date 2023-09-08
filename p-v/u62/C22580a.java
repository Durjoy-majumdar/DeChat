package u62;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import u62.C22583d;
import v62.C22715a;

/* renamed from: u62.a */
public final class C22580a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C22582c f64914d;

    public C22580a(C22582c cVar) {
        this.f64914d = cVar;
    }

    public boolean onTimerExpired() {
        long currentPositionMs = ((C22715a) this.f64914d).getCurrentPositionMs();
        long durationMs = ((C22715a) this.f64914d).getDurationMs();
        C22582c cVar = this.f64914d;
        C22583d.C22590g gVar = cVar.f64928q;
        if (gVar == null) {
            return true;
        }
        gVar.mo22597l(cVar, currentPositionMs, durationMs);
        return true;
    }
}
