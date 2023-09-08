package p1059wd;

import android.os.SystemClock;
import com.tencent.magicbrush.MBRuntime;
import gy3.C87412m;
import p1033sd.C90172b;
import p1059wd.C90954a;

/* renamed from: wd.d */
public final class C90961d extends C90954a implements Runnable {

    /* renamed from: i */
    public final C90954a.C90956b f261020i = C90954a.C90956b.EglSurfaceSwapLocker;

    /* renamed from: j */
    public double f261021j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90961d(MBRuntime mBRuntime, C90172b bVar) {
        super(mBRuntime, bVar);
        C87412m.m108594g(mBRuntime, "runtime");
        C87412m.m108594g(bVar, "jsThreadHandler");
    }

    /* renamed from: b */
    public C90954a.C90956b mo125025b() {
        return this.f261020i;
    }

    /* renamed from: d */
    public void mo125027d() {
    }

    /* renamed from: e */
    public void mo125028e() {
    }

    /* renamed from: f */
    public void mo125029f() {
        this.f261021j = 0.0d;
    }

    /* renamed from: g */
    public void mo125030g() {
        this.f260999e.mo123773p(this, false);
    }

    public void run() {
        if (this.f261001g) {
            boolean z = false;
            this.f260999e.mo123773p(this, false);
            if (this.f261021j == 0.0d) {
                z = true;
            }
            if (z) {
                this.f261021j = (double) SystemClock.elapsedRealtime();
            }
            mo125026c(this.f261021j);
            this.f261021j = (double) SystemClock.elapsedRealtime();
        }
    }
}
