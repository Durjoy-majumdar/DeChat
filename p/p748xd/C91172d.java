package p748xd;

import android.os.SystemClock;
import p416qd.C89598h;

/* renamed from: xd.d */
public abstract class C91172d<R> {

    /* renamed from: a */
    public R f261405a;

    /* renamed from: b */
    public Object f261406b = new Object();

    /* renamed from: c */
    public long f261407c;

    /* renamed from: d */
    public long f261408d;

    /* renamed from: e */
    public boolean f261409e;

    /* renamed from: f */
    public Runnable f261410f = new C91173a();

    /* renamed from: xd.d$a */
    public class C91173a implements Runnable {
        public C91173a() {
        }

        public void run() {
            C89598h.m112045b("MicroMsg.SDK.SyncTask", "task run manualFinish = " + C91172d.this.f261409e, new Object[0]);
            C91172d dVar = C91172d.this;
            if (dVar.f261409e) {
                dVar.mo123497a();
            } else {
                dVar.mo123497a();
                dVar.mo125233b(null);
            }
            C91172d dVar2 = C91172d.this;
            dVar2.f261408d = SystemClock.elapsedRealtime() - dVar2.f261407c;
        }
    }

    public C91172d(long j, R r, boolean z) {
        this.f261405a = r;
        this.f261409e = z;
    }

    /* renamed from: a */
    public abstract R mo123497a();

    /* renamed from: b */
    public void mo125233b(R r) {
        C89598h.m112045b("MicroMsg.SDK.SyncTask", "setResultFinish ", new Object[0]);
        this.f261405a = r;
        synchronized (this.f261406b) {
            C89598h.m112045b("MicroMsg.SDK.SyncTask", "setResultFinish synchronized", new Object[0]);
            this.f261406b.notify();
        }
    }
}
