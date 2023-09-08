package p1059wd;

import com.tencent.magicbrush.MBRuntime;
import gy3.C87412m;
import p1033sd.C90172b;
import p1059wd.C90954a;

/* renamed from: wd.j */
public final class C90967j extends C90954a implements Runnable {

    /* renamed from: i */
    public final long f261031i = (1000000000 / ((long) 60));

    /* renamed from: j */
    public final C90968a f261032j = new C90968a();

    /* renamed from: n */
    public long f261033n;

    /* renamed from: o */
    public final C90954a.C90956b f261034o = C90954a.C90956b.SchedulerLocker;

    /* renamed from: wd.j$a */
    public static final class C90968a extends C90962e {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90967j(MBRuntime mBRuntime, C90172b bVar) {
        super(mBRuntime, bVar);
        C87412m.m108594g(mBRuntime, "runtime");
        C87412m.m108594g(bVar, "jsThreadHandler");
    }

    /* renamed from: b */
    public C90954a.C90956b mo125025b() {
        return this.f261034o;
    }

    /* renamed from: d */
    public void mo125027d() {
    }

    /* renamed from: e */
    public void mo125028e() {
    }

    /* renamed from: f */
    public void mo125029f() {
        this.f261033n = 0;
    }

    /* renamed from: g */
    public void mo125030g() {
        this.f261033n = 0;
        this.f260999e.mo123773p(this, false);
    }

    public void run() {
        if (this.f261001g) {
            if (this.f261033n == 0) {
                this.f261033n = System.nanoTime();
            }
            long nanoTime = System.nanoTime();
            long j = nanoTime - this.f261033n;
            long j2 = this.f261031i;
            if (j >= j2) {
                long j3 = j / j2;
                this.f261033n = nanoTime - (j % j2);
            }
            this.f261032j.getClass();
            mo125026c(((double) this.f261033n) / 1000000.0d);
            long nanoTime2 = System.nanoTime();
            long j4 = this.f261033n;
            long j5 = nanoTime2 - j4;
            long j6 = this.f261031i;
            this.f261033n = j4 + j6;
            if (j5 < j6) {
                do {
                } while (System.nanoTime() < this.f261033n);
            }
            this.f260999e.mo123773p(this, false);
        }
    }
}
