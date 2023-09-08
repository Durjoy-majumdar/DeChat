package tg3;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: tg3.w */
public class C90497w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f260107d;

    /* renamed from: e */
    public final /* synthetic */ C90494u f260108e;

    public C90497w(C90494u uVar, long j) {
        this.f260108e = uVar;
        this.f260107d = j;
    }

    public void run() {
        Log.m105919d("MicroMsg.TrafficStatistic", "onDownstreamTraffic downstream : %s", Long.valueOf(this.f260107d));
        this.f260108e.f260099c += Math.max(0, this.f260107d);
        this.f260108e.mo124665a(false);
    }
}
