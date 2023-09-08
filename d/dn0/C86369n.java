package dn0;

import an0.C79592a;
import bn0.C79724h;
import fn0.C87002g;

/* renamed from: dn0.n */
public class C86369n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f251102d;

    /* renamed from: e */
    public final /* synthetic */ long f251103e;

    /* renamed from: f */
    public final /* synthetic */ C79724h f251104f;

    public C86369n(C86370o oVar, String str, long j, C79724h hVar) {
        this.f251102d = str;
        this.f251103e = j;
        this.f251104f = hVar;
    }

    public void run() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            j = C87002g.m108010d(this.f251102d);
        } catch (OutOfMemoryError unused) {
            C87002g.m108023q(5, "VideoProxy", "initCache, calculate cacheSize OOM usedSpace set to 0", (Throwable) null);
            j = 0;
        }
        long min = Math.min(this.f251103e + j, C79592a.m96648a().f233407j);
        this.f251104f.f233666d = min;
        C87002g.m108023q(4, "VideoProxy", "initCache, update cacheSize=" + min + ", timeCost=" + (System.currentTimeMillis() - currentTimeMillis), (Throwable) null);
    }
}
