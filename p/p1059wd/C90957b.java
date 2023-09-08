package p1059wd;

import android.view.Choreographer;
import com.tencent.magicbrush.MBRuntime;
import gy3.C87412m;
import p1033sd.C90172b;
import p1059wd.C90954a;
import p416qd.C89598h;

/* renamed from: wd.b */
public final class C90957b extends C90954a implements Choreographer.FrameCallback {

    /* renamed from: i */
    public final C90962e f261008i = new C90962e();

    /* renamed from: j */
    public Choreographer f261009j;

    /* renamed from: n */
    public int f261010n;

    /* renamed from: o */
    public final C90954a.C90956b f261011o = C90954a.C90956b.ChoreographerInJsThread;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90957b(MBRuntime mBRuntime, C90172b bVar) {
        super(mBRuntime, bVar);
        C87412m.m108594g(mBRuntime, "runtime");
        C87412m.m108594g(bVar, "jsThreadHandler");
    }

    /* renamed from: b */
    public C90954a.C90956b mo125025b() {
        return this.f261011o;
    }

    /* renamed from: d */
    public void mo125027d() {
    }

    public void doFrame(long j) {
        if (this.f261001g) {
            this.f261008i.getClass();
            Choreographer choreographer = this.f261009j;
            if (choreographer != null) {
                choreographer.postFrameCallback(this);
            }
            mo125026c(((double) j) / 1000000.0d);
        }
    }

    /* renamed from: e */
    public void mo125028e() {
    }

    /* renamed from: f */
    public void mo125029f() {
        Choreographer choreographer = this.f261009j;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this);
        }
    }

    /* renamed from: g */
    public void mo125030g() {
        Choreographer j = mo125035j(true);
        if (j != null) {
            j.removeFrameCallback(this);
        }
        if (j != null) {
            j.postFrameCallback(this);
        }
    }

    /* renamed from: j */
    public final Choreographer mo125035j(boolean z) {
        Choreographer choreographer;
        Choreographer choreographer2 = this.f261009j;
        if (choreographer2 != null) {
            return choreographer2;
        }
        this.f261010n++;
        try {
            choreographer = Choreographer.getInstance();
        } catch (Exception e) {
            if (this.f261010n == 1 || this.f261010n % 100000 == 0) {
                C89598h.m112046c("AnimationFrameHandler", e, "get choreographer failed [" + this.f261010n + "] times. but it's ok, i will try it later if needed. " + e, new Object[0]);
            }
            choreographer = null;
        }
        if (choreographer != null || !z) {
            if (choreographer != null) {
                this.f261009j = choreographer;
            }
            return choreographer;
        }
        this.f260999e.mo123773p(new b$$a(this), false);
        return null;
    }
}
