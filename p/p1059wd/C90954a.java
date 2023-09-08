package p1059wd;

import com.tencent.magicbrush.MBRuntime;
import gy3.C8480h;
import gy3.C87412m;
import p1033sd.C90172b;
import p416qd.C89598h;
import rx3.C13598b0;
import rx3.C13603j;

/* renamed from: wd.a */
public abstract class C90954a {

    /* renamed from: h */
    public static final C90955a f260997h = new C90955a((C8480h) null);

    /* renamed from: d */
    public final MBRuntime f260998d;

    /* renamed from: e */
    public final C90172b f260999e;

    /* renamed from: f */
    public final Object f261000f = new Object();

    /* renamed from: g */
    public boolean f261001g;

    /* renamed from: wd.a$a */
    public static final class C90955a {
        public C90955a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C90954a mo125033a(MBRuntime mBRuntime, C90172b bVar, C90956b bVar2) {
            C90954a aVar;
            C87412m.m108594g(mBRuntime, "runtime");
            C87412m.m108594g(bVar, "jsThreadHandler");
            C87412m.m108594g(bVar2, "strategy");
            int ordinal = bVar2.ordinal();
            if (ordinal == 0) {
                aVar = new C90957b(mBRuntime, bVar);
            } else if (ordinal == 1) {
                aVar = new C90958c(mBRuntime, bVar);
            } else if (ordinal == 2) {
                aVar = new C90961d(mBRuntime, bVar);
            } else if (ordinal == 3) {
                aVar = new C90967j(mBRuntime, bVar);
            } else if (ordinal == 4) {
                aVar = new C90966i(mBRuntime, bVar);
            } else {
                throw new C13603j();
            }
            C89598h.m112045b("AnimationFrameHandler", "AnimationFrameHandler[" + aVar.mo125025b().name() + "] create " + Thread.currentThread().getName(), new Object[0]);
            aVar.mo125027d();
            return aVar;
        }
    }

    /* renamed from: wd.a$b */
    public enum C90956b {
        ChoreographerInJsThread,
        ChoreographerInMainThread,
        EglSurfaceSwapLocker,
        SchedulerLocker,
        NativeLocker
    }

    public C90954a(MBRuntime mBRuntime, C90172b bVar) {
        C87412m.m108594g(mBRuntime, "runtime");
        C87412m.m108594g(bVar, "jsThreadHandler");
        this.f260998d = mBRuntime;
        this.f260999e = bVar;
    }

    /* renamed from: a */
    public final void mo125024a() {
        C89598h.m112045b("AnimationFrameHandler", "AnimationFrameHandler[%s] destroy", mo125025b().name());
        synchronized (this.f261000f) {
            if (this.f261001g) {
                C89598h.m112045b("AnimationFrameHandler", "AnimationFrameHandler[%s] pause automatically", mo125025b().name());
                mo125031h();
            }
            mo125028e();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public abstract C90956b mo125025b();

    /* renamed from: c */
    public final void mo125026c(double d) {
        MBRuntime mBRuntime = this.f260998d;
        if (mBRuntime.f235052a != 0) {
            mBRuntime.nativeNotifyAnimationFrame(mBRuntime.f235052a, d);
        }
    }

    /* renamed from: d */
    public abstract void mo125027d();

    /* renamed from: e */
    public abstract void mo125028e();

    /* renamed from: f */
    public abstract void mo125029f();

    /* renamed from: g */
    public abstract void mo125030g();

    /* renamed from: h */
    public final void mo125031h() {
        C89598h.m112045b("AnimationFrameHandler", "AnimationFrameHandler[%s] pause", mo125025b().name());
        synchronized (this.f261000f) {
            if (this.f261001g) {
                mo125029f();
                this.f261001g = false;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: i */
    public final void mo125032i() {
        C89598h.m112045b("AnimationFrameHandler", "AnimationFrameHandler[%s] resume", mo125025b().name());
        synchronized (this.f261000f) {
            if (!this.f261001g) {
                mo125030g();
                this.f261001g = true;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
