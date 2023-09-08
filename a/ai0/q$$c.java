package ai0;

import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import zt3.C119157j;

public class q$$c implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C79575q f233347d;

    /* renamed from: ai0.q$$c$a */
    public class C79576a implements Runnable {
        public C79576a() {
        }

        public void run() {
            q$$c.this.f233347d.mo109689g();
            q$$c.this.f233347d.mo109684b();
        }
    }

    public q$$c(C79575q qVar) {
        this.f233347d = qVar;
    }

    public boolean onTimerExpired() {
        if (this.f233347d.f233338i) {
            Log.m105928w("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer, timer already stopped");
            return false;
        }
        Log.m105921e("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "checkShowAdTimer timeOut, realTime:%s", Long.valueOf(Util.nowMilliSecond() - this.f233347d.f233337h));
        ((C119157j) C119157j.f356862d).mo183895z(new C79576a());
        C79575q qVar = this.f233347d;
        HandlerThread handlerThread = qVar.f233336g;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            qVar.f233336g = null;
        }
        return false;
    }
}
