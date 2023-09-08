package mz1;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.os.Process;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j90.C108668f;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import k90.C108964a;
import k90.C108970d;
import p565ir.C60606n;
import p80.C110194c;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: mz1.k */
public final class C109651k implements C108668f {

    /* renamed from: d */
    public final HandlerThread f328258d;

    /* renamed from: e */
    public final MMHandler f328259e;

    /* renamed from: f */
    public C111742d.C65942b f328260f;

    /* renamed from: g */
    public final C109657q f328261g = new C109657q();

    /* renamed from: h */
    public final C108970d f328262h = new C108970d(this);

    /* renamed from: i */
    public int f328263i;

    /* renamed from: j */
    public int f328264j;

    /* renamed from: n */
    public EGLSurface f328265n;

    /* renamed from: o */
    public C109650f f328266o;

    /* renamed from: p */
    public long f328267p;

    /* renamed from: q */
    public long f328268q;

    /* renamed from: r */
    public Surface f328269r;

    /* renamed from: s */
    public C32224a<C13598b0> f328270s;

    /* renamed from: t */
    public final C109653b f328271t;

    /* renamed from: mz1.k$d */
    public static final class C88866d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f256322d;

        public C88866d(C32224a aVar) {
            this.f256322d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f256322d.invoke();
        }
    }

    /* renamed from: mz1.k$a */
    public static final class C109652a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109651k f328272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109652a(C109651k kVar) {
            super(0);
            this.f328272d = kVar;
        }

        public Object invoke() {
            C109651k kVar = this.f328272d;
            C111742d.C65942b k = C111742d.C111743a.m152352k(C111742d.f334647a, (Surface) null, (SurfaceTexture) null, 1, 1, (EGLContext) null, 16, (Object) null);
            kVar.getClass();
            kVar.f328260f = k;
            C109651k kVar2 = this.f328272d;
            kVar2.f328261g.mo159591u(kVar2.f328263i, kVar2.f328264j);
            this.f328272d.f328261g.mo159589r(0);
            C109651k kVar3 = this.f328272d;
            kVar3.f328262h.mo160070i(kVar3.f328261g);
            this.f328272d.f328262h.mo160068f((GL10) null, (EGLConfig) null);
            C109651k kVar4 = this.f328272d;
            C108970d dVar = kVar4.f328262h;
            dVar.f326402a.mo148312q(new C108964a(dVar, new C88865j(kVar4), true, 0));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mz1.k$b */
    public static final class C109653b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109651k f328273d;

        public C109653b(C109651k kVar) {
            this.f328273d = kVar;
        }

        public void run() {
            this.f328273d.getClass();
            this.f328273d.getClass();
            C109651k kVar = this.f328273d;
            C109650f fVar = kVar.f328266o;
            if (fVar != null) {
                Log.m105926v("MicroMsg.GameLiveRenderManager", "start push render " + (System.currentTimeMillis() - kVar.f328267p));
                kVar.f328267p = System.currentTimeMillis();
                C110194c c = kVar.f328262h.mo160065c();
                fVar.f328257G = c != null ? c.f329652e : -1;
                fVar.mo162879m();
                Log.m105926v("MicroMsg.GameLiveRenderManager", "end push render " + (System.currentTimeMillis() - kVar.f328267p));
                C110194c cVar = fVar.f332754i;
                if (cVar != null) {
                    ((C60606n) C86312j.m106911c(C60606n.class)).mo85050bT(kVar.mo160869c().f189593c, cVar.f329652e, cVar.f329657j, cVar.f329658n, 0);
                    if (System.currentTimeMillis() - kVar.f328268q > 10000) {
                        kVar.f328268q = System.currentTimeMillis();
                        Log.m105924i("MicroMsg.GameLiveRenderManager", "send external data: " + cVar.f329652e + " size:" + cVar.f329657j + ' ' + cVar.f329658n + " cost:" + (System.currentTimeMillis() - kVar.f328267p));
                    }
                }
            }
        }
    }

    /* renamed from: mz1.k$c */
    public static final class C109654c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109651k f328274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109654c(C109651k kVar) {
            super(0);
            this.f328274d = kVar;
        }

        public Object invoke() {
            C109651k kVar = this.f328274d;
            if (!(kVar.f328263i == 0 || kVar.f328264j == 0)) {
                long nanoTime = System.nanoTime();
                C109651k kVar2 = this.f328274d;
                if (kVar2.f328265n != null) {
                    EGLDisplay eGLDisplay = kVar2.mo160869c().f189591a;
                    C109651k kVar3 = this.f328274d;
                    EGLSurface eGLSurface = kVar3.f328265n;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, kVar3.mo160869c().f189593c);
                }
                this.f328274d.f328262h.mo160066d((GL10) null);
                C109651k kVar4 = this.f328274d;
                if (kVar4.f328265n != null) {
                    EGL14.eglSwapBuffers(kVar4.mo160869c().f189591a, this.f328274d.f328265n);
                }
                long currentTimeMillis = System.currentTimeMillis();
                C109651k kVar5 = this.f328274d;
                if (currentTimeMillis - kVar5.f328267p >= 30) {
                    kVar5.f328271t.run();
                }
                float nanoTime2 = ((float) (System.nanoTime() - nanoTime)) / ((float) 1000000000);
                Log.m105926v("MicroMsg.GameLiveRenderManager", "virv: renderTime " + nanoTime2 + " fps: " + (((float) 1) / nanoTime2));
            }
            return C13598b0.f38549a;
        }
    }

    public C109651k() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("GameLiveRenderThread", 10);
        this.f328258d = a;
        a.start();
        this.f328259e = new MMHandler(a.getLooper());
        mo148312q(new C109652a(this));
        Log.m105924i("MicroMsg.GameLiveRenderManager", "resume");
        mo148312q(new C88869p(this));
        this.f328271t = new C109653b(this);
    }

    /* renamed from: a */
    public static final void m148964a(C109651k kVar) {
        if (kVar.f328265n != null) {
            EGLDisplay eGLDisplay = kVar.mo160869c().f189591a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(kVar.mo160869c().f189591a, kVar.f328265n);
        }
    }

    /* renamed from: b */
    public static final void m148965b(C109651k kVar, int i) {
        kVar.getClass();
        int myTid = Process.myTid();
        if (myTid > 0) {
            try {
                Process.setThreadPriority(myTid, i);
                Log.m105919d("MicroMsg.GameLiveRenderManager", "setThreadPriority priority=%d tid=%d", Integer.valueOf(i), Integer.valueOf(myTid));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.GameLiveRenderManager", e, "setThreadPriority priority=%d tid=%d", Integer.valueOf(i), Integer.valueOf(myTid));
            }
        }
    }

    /* renamed from: c */
    public final C111742d.C65942b mo160869c() {
        C111742d.C65942b bVar = this.f328260f;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("eglEnvironment");
        throw null;
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        this.f328259e.post(new C88866d(aVar));
    }

    public void requestRender() {
        mo148312q(new C109654c(this));
    }
}
