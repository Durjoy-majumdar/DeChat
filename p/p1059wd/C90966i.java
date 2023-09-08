package p1059wd;

import com.tencent.magicbrush.MBRuntime;
import gy3.C87412m;
import p1033sd.C90172b;
import p1059wd.C90954a;
import p416qd.C89598h;

/* renamed from: wd.i */
public final class C90966i extends C90954a implements Runnable {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90966i(MBRuntime mBRuntime, C90172b bVar) {
        super(mBRuntime, bVar);
        C87412m.m108594g(mBRuntime, "runtime");
        C87412m.m108594g(bVar, "jsThreadHandler");
    }

    /* renamed from: b */
    public C90954a.C90956b mo125025b() {
        return C90954a.C90956b.NativeLocker;
    }

    /* renamed from: d */
    public void mo125027d() {
    }

    /* renamed from: e */
    public void mo125028e() {
    }

    /* renamed from: f */
    public void mo125029f() {
        this.f260999e.mo123773p(new i$$a(this), false);
    }

    /* renamed from: g */
    public void mo125030g() {
        this.f260999e.mo123773p(this, false);
    }

    public void run() {
        C89598h.m112045b("AnimationFrameHandler", "hy: start native raf looper", new Object[0]);
        MBRuntime mBRuntime = this.f260998d;
        if (mBRuntime.f235052a != 0) {
            mBRuntime.nativeNotifyAnimationFrameLooper(mBRuntime.f235052a);
        }
    }
}
