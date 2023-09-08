package e93;

import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45700h;

/* renamed from: e93.l */
public final class C45579l {

    /* renamed from: a */
    public boolean f123287a;

    /* renamed from: b */
    public String f123288b = "";

    /* renamed from: c */
    public C45700h.C45703c f123289c;

    /* renamed from: d */
    public long f123290d;

    /* renamed from: e */
    public long f123291e;

    /* renamed from: f */
    public int f123292f;

    /* renamed from: a */
    public final void mo71102a(long j) {
        this.f123291e += j;
        this.f123292f++;
        Log.m105927v("MicroMsg.WebPrefetcherResPerformanceHelper", "recordResCost: %d ms, loadResCostTotal: %d, loadResCount: %d", Long.valueOf(j), Long.valueOf(this.f123291e), Integer.valueOf(this.f123292f));
    }
}
