package r62;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: r62.f */
public class C36257f implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C36258g f96553d;

    public C36257f(C36258g gVar) {
        this.f96553d = gVar;
    }

    public boolean onTimerExpired() {
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105928w("MicroMsg.SimcardService", "account not init.");
            return true;
        }
        Log.m105924i("MicroMsg.SimcardService", "CheckMobileSIMType Timer");
        C36258g gVar = this.f96553d;
        if (gVar.f96561h == 0) {
            gVar.vx0(0);
        } else {
            gVar.vx0(3);
        }
        return true;
    }
}
