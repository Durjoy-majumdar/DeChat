package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: cj1.s5 */
public final class C28589s5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f78474d;

    public C28589s5(long j) {
        this.f78474d = j;
    }

    public final void run() {
        Log.m105924i("Finder.LiveExceptionMonitor", "enterLive liveId:" + this.f78474d);
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
        singleMMKV.putLong("PARAM_LIVE_ID", this.f78474d);
        singleMMKV.putBoolean("PARAM_IS_SCREEN_OFF", false);
        singleMMKV.putBoolean("PARAM_IS_FLOAT", false);
        singleMMKV.putBoolean("PARAM_IS_FOREGROUND", true);
        singleMMKV.commit();
    }
}
