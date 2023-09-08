package c31;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: c31.d */
public class C79926d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79924b f234148d;

    /* renamed from: e */
    public final /* synthetic */ C79925c f234149e;

    public C79926d(C79927e eVar, C79924b bVar, C79925c cVar) {
        this.f234148d = bVar;
        this.f234149e = cVar;
    }

    public void run() {
        if (!this.f234148d.mo58762c()) {
            Log.m105924i("MicroMsg.SystemCrashFixPatch", this.f234149e.getClass().getCanonicalName() + " : start");
            this.f234148d.start();
            boolean d = this.f234148d.mo58763d();
            this.f234148d.mo58761b();
            Log.m105924i("MicroMsg.SystemCrashFixPatch", this.f234149e.getClass().getCanonicalName() + " : " + d);
            return;
        }
        Log.m105924i("MicroMsg.SystemCrashFixPatch", this.f234149e.getClass().getCanonicalName() + " has failed before");
    }
}
