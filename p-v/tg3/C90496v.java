package tg3;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: tg3.v */
public class C90496v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f260105d;

    /* renamed from: e */
    public final /* synthetic */ C90494u f260106e;

    public C90496v(C90494u uVar, long j) {
        this.f260106e = uVar;
        this.f260105d = j;
    }

    public void run() {
        Log.m105919d("MicroMsg.TrafficStatistic", "onUpstreamTraffic upstream : %s", Long.valueOf(this.f260105d));
        this.f260106e.f260098b += Math.max(0, this.f260105d);
        this.f260106e.mo124665a(false);
    }
}
