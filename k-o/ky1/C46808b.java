package ky1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import ky1.C46803a;

/* renamed from: ky1.b */
public class C46808b implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C46803a f125942d;

    public C46808b(C46803a aVar) {
        this.f125942d = aVar;
    }

    public boolean onTimerExpired() {
        C46803a aVar = this.f125942d;
        if (aVar.f125932h == C46803a.C46807c.stopped) {
            Log.m105924i("MicroMsg.GameJsCore", "destroy");
            aVar.f125932h = C46803a.C46807c.destroyed;
            aVar.f125930f.mo72031a(new C46810d(aVar, "onDestroy"));
            MTimerHandler mTimerHandler = new MTimerHandler(new C46809c(aVar), false);
            aVar.f125933i = mTimerHandler;
            mTimerHandler.startTimer(60000);
        }
        return false;
    }
}
