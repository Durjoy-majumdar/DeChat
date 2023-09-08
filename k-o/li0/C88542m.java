package li0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: li0.m */
public abstract class C88542m<R> {

    /* renamed from: a */
    public R f255746a;

    /* renamed from: b */
    public final Object f255747b;

    /* renamed from: c */
    public final long f255748c;

    /* renamed from: d */
    public long f255749d;

    /* renamed from: e */
    public long f255750e;

    /* renamed from: f */
    public final Runnable f255751f;

    /* renamed from: g */
    public volatile MMHandler f255752g;

    /* renamed from: li0.m$a */
    public class C88543a implements Runnable {
        public C88543a() {
        }

        public void run() {
            C88542m.this.getClass();
            Log.m105924i("MicroMsg.SDK.SyncTask", "task run manualFinish = false");
            C88542m.this.getClass();
            C88542m mVar = C88542m.this;
            mVar.mo123009c(mVar.mo122994b());
            C88542m mVar2 = C88542m.this;
            mVar2.f255750e = Util.ticksToNow(mVar2.f255749d);
        }
    }

    public C88542m() {
        this(0, (Object) null);
    }

    /* renamed from: a */
    public R mo123008a(MMHandler mMHandler) {
        if (mMHandler == null) {
            Log.m105918d("MicroMsg.SDK.SyncTask", "null handler, task in exec thread, return now");
            return mo122994b();
        }
        this.f255752g = mMHandler;
        Log.m105924i("MicroMsg.SDK.SyncTask", "sync task exec...");
        if (Thread.currentThread().getId() == mMHandler.getLooper().getThread().getId()) {
            Log.m105924i("MicroMsg.SDK.SyncTask", "same tid, task in exec thread, return now");
            return mo122994b();
        }
        this.f255749d = Util.currentTicks();
        try {
            synchronized (this.f255747b) {
                Log.m105924i("MicroMsg.SDK.SyncTask", "sync task exec at synchronized");
                mMHandler.post(this.f255751f);
                this.f255747b.wait(this.f255748c);
            }
        } catch (InterruptedException e) {
            Log.printErrStackTrace("MicroMsg.SDK.SyncTask", e, "", new Object[0]);
        }
        long ticksToNow = Util.ticksToNow(this.f255749d);
        Log.m105925i("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + this.f255746a, Long.valueOf(ticksToNow), Long.valueOf(this.f255750e), Long.valueOf(ticksToNow - this.f255750e));
        return this.f255746a;
    }

    /* renamed from: b */
    public abstract R mo122994b();

    /* renamed from: c */
    public void mo123009c(R r) {
        Log.m105924i("MicroMsg.SDK.SyncTask", "setResultFinish ");
        this.f255746a = r;
        synchronized (this.f255747b) {
            Log.m105924i("MicroMsg.SDK.SyncTask", "setResultFinish synchronized");
            this.f255747b.notify();
        }
    }

    public C88542m(long j, R r) {
        this.f255747b = new Object();
        this.f255751f = new C88543a();
        this.f255748c = j;
        this.f255746a = r;
    }
}
