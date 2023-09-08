package po0;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import in0.C87760d;
import p964fd.C86826e;

public final /* synthetic */ class g$$a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C89421g f257453d;

    public /* synthetic */ g$$a(C89421g gVar) {
        this.f257453d = gVar;
    }

    public final boolean onTimerExpired() {
        C89421g gVar = this.f257453d;
        C86826e eVar = gVar.f257444a;
        if (eVar == null) {
            return true;
        }
        C87760d dVar = eVar.f252033h;
        gVar.mo123747h(dVar != null ? dVar.getCurrentPosition() : 0, (int) (gVar.f257446c * 1000.0d));
        return true;
    }
}
