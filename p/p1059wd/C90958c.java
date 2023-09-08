package p1059wd;

import android.os.Handler;
import android.view.Choreographer;
import com.tencent.magicbrush.MBRuntime;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p1033sd.C90172b;
import p1059wd.C90954a;
import p748xd.C91175g;
import p748xd.g$$b;
import rx3.C13598b0;

/* renamed from: wd.c */
public final class C90958c extends C90954a {

    /* renamed from: i */
    public final C90962e f261013i = new C90962e();

    /* renamed from: j */
    public final C90954a.C90956b f261014j = C90954a.C90956b.ChoreographerInMainThread;

    /* renamed from: n */
    public volatile Choreographer f261015n;

    /* renamed from: o */
    public final C90959a f261016o = new C90959a();

    /* renamed from: wd.c$a */
    public final class C90959a implements Choreographer.FrameCallback, Runnable {

        /* renamed from: d */
        public long f261017d;

        public C90959a() {
        }

        public void doFrame(long j) {
            this.f261017d = j;
            C90958c.this.f261013i.getClass();
            C90958c cVar = C90958c.this;
            cVar.f260999e.mo123773p(cVar.f261016o, false);
        }

        public void run() {
            C90958c cVar = C90958c.this;
            if (cVar.f261001g) {
                synchronized (cVar.f261000f) {
                    Choreographer choreographer = cVar.f261015n;
                    if (choreographer != null) {
                        choreographer.postFrameCallback(cVar.f261016o);
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
                C90958c.this.mo125026c(((double) this.f261017d) / 1000000.0d);
            }
        }
    }

    /* renamed from: wd.c$b */
    public static final class C90960b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C90958c f261019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90960b(C90958c cVar) {
            super(0);
            this.f261019d = cVar;
        }

        public Object invoke() {
            C90958c cVar = this.f261019d;
            synchronized (cVar.f261000f) {
                cVar.f261015n = Choreographer.getInstance();
                if (cVar.f261001g) {
                    Choreographer choreographer = cVar.f261015n;
                    C87412m.m108591d(choreographer);
                    choreographer.postFrameCallback(cVar.f261016o);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90958c(MBRuntime mBRuntime, C90172b bVar) {
        super(mBRuntime, bVar);
        C87412m.m108594g(mBRuntime, "runtime");
        C87412m.m108594g(bVar, "jsThreadHandler");
    }

    /* renamed from: b */
    public C90954a.C90956b mo125025b() {
        return this.f261014j;
    }

    /* renamed from: d */
    public void mo125027d() {
        Handler handler = C91175g.f261413a;
        C91175g.m114415b(new g$$b(new C90960b(this)));
    }

    /* renamed from: e */
    public void mo125028e() {
    }

    /* renamed from: f */
    public void mo125029f() {
        if (this.f261015n != null) {
            Choreographer choreographer = this.f261015n;
            C87412m.m108591d(choreographer);
            choreographer.removeFrameCallback(this.f261016o);
        }
    }

    /* renamed from: g */
    public void mo125030g() {
        if (this.f261015n != null) {
            Choreographer choreographer = this.f261015n;
            C87412m.m108591d(choreographer);
            choreographer.removeFrameCallback(this.f261016o);
            Choreographer choreographer2 = this.f261015n;
            C87412m.m108591d(choreographer2);
            choreographer2.postFrameCallback(this.f261016o);
        }
    }
}
