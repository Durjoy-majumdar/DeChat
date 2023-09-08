package ss3;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import ss3.C36788a;

/* renamed from: ss3.b */
public final class C36791b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C36788a f97704d;

    /* renamed from: e */
    public final /* synthetic */ long f97705e;

    /* renamed from: f */
    public final /* synthetic */ long f97706f;

    public C36791b(C36788a aVar, long j, long j2) {
        this.f97704d = aVar;
        this.f97705e = j;
        this.f97706f = j2;
    }

    public final void run() {
        C36788a aVar = this.f97704d;
        if (!aVar.f97701g) {
            C36788a.C36790b bVar = aVar.f97700f.get(Long.valueOf(this.f97705e));
            if (bVar == null) {
                bVar = new C36788a.C36790b(0, 1, (C8480h) null);
                this.f97704d.f97700f.put(Long.valueOf(this.f97705e), bVar);
            }
            bVar.f97703a += this.f97706f;
            Log.m105927v("MicroMsg.ScanCostManager", "addFrameDecodeCodeCost frameId: %d, cost: %d, total: %s", Long.valueOf(this.f97705e), Long.valueOf(this.f97706f), Long.valueOf(bVar.f97703a));
        }
    }
}
