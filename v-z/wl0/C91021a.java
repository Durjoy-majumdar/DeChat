package wl0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import xl0.C91283d;

/* renamed from: wl0.a */
public class C91021a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C91028g f261146d;

    public C91021a(C91028g gVar) {
        this.f261146d = gVar;
    }

    public boolean onTimerExpired() {
        Log.m105925i("MicroMsg.HCEActivityMgr", "alvinluo loop check NFC switch currentCount: %d", Integer.valueOf(this.f261146d.f261153a));
        C91028g gVar = this.f261146d;
        int i = gVar.f261153a + 1;
        gVar.f261153a = i;
        if (i > 10) {
            Log.m105925i("MicroMsg.HCEActivityMgr", "alvinluo loop check count exceed max limit: %d", 10);
            this.f261146d.mo125079d();
            this.f261146d.mo125078c();
            return false;
        } else if (!C91283d.m114512b()) {
            return true;
        } else {
            Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo loopCheck NFC switch is opened, and cancel task");
            this.f261146d.mo125079d();
            this.f261146d.mo125077b(true);
            return false;
        }
    }
}
