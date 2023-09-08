package s50;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d50.C58114h;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i72.C108382h;
import j90.C108667e;
import javax.microedition.khronos.opengles.GL10;
import k90.C108965b;
import k90.C108968c;
import k90.C108970d;
import kg3.C76577a;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import w80.C111742d;
import y80.C66557b;

/* renamed from: s50.k */
public final class C110747k implements C108667e {

    /* renamed from: d */
    public final HandlerThread f331232d;

    /* renamed from: e */
    public MMHandler f331233e;

    /* renamed from: f */
    public C111742d.C65942b f331234f;

    /* renamed from: g */
    public C108965b f331235g;

    /* renamed from: h */
    public EGLSurface f331236h;

    /* renamed from: i */
    public Object f331237i;

    /* renamed from: j */
    public C110760u f331238j;

    /* renamed from: n */
    public C58114h f331239n;

    /* renamed from: o */
    public C32224a<C13598b0> f331240o;

    /* renamed from: s50.k$a */
    public static final class C110748a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110747k f331241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110748a(C110747k kVar) {
            super(0);
            this.f331241d = kVar;
        }

        public Object invoke() {
            C110747k kVar = this.f331241d;
            EGLSurface eGLSurface = kVar.f331236h;
            if (eGLSurface != null) {
                C111742d.C65942b bVar = kVar.f331234f;
                EGL14.eglDestroySurface(bVar != null ? bVar.f189591a : null, eGLSurface);
            }
            C110760u uVar = this.f331241d.f331238j;
            if (uVar != null) {
                uVar.mo157956n(true);
            }
            C108965b bVar2 = this.f331241d.f331235g;
            if (bVar2 != null) {
                C108965b.m147848h(bVar2, false, false, 2, (Object) null);
            }
            C111742d.C65942b bVar3 = this.f331241d.f331234f;
            if (bVar3 != null) {
                C111742d.f334647a.mo163471q(bVar3);
            }
            this.f331241d.f331233e.removeCallbacksAndMessages((Object) null);
            this.f331241d.f331232d.quitSafely();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: s50.k$b */
    public static final class C110749b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110747k f331242d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110749b(C110747k kVar) {
            super(0);
            this.f331242d = kVar;
        }

        public Object invoke() {
            SurfaceTexture b;
            C108965b bVar = this.f331242d.f331235g;
            if (!(bVar == null || (b = bVar.mo160064b()) == null)) {
                b.updateTexImage();
            }
            C110747k kVar = this.f331242d;
            Object obj = kVar.f331237i;
            if (obj != null) {
                if (kVar.f331236h == null) {
                    if ((obj instanceof Surface) && !((Surface) obj).isValid()) {
                        kVar.f331236h = null;
                    } else if (!(obj instanceof SurfaceHolder) || ((SurfaceHolder) obj).getSurface().isValid()) {
                        Log.m105924i("MicroMsg.LiveCoreRender", "makeOutputSurface");
                        C111742d.C111743a aVar = C111742d.f334647a;
                        C111742d.C65942b bVar2 = kVar.f331234f;
                        C87412m.m108591d(bVar2);
                        EGLSurface h = aVar.mo163465h(bVar2.f189591a, obj);
                        kVar.f331236h = h;
                        C111742d.C65942b bVar3 = kVar.f331234f;
                        EGL14.eglMakeCurrent(bVar3 != null ? bVar3.f189591a : null, h, h, bVar3 != null ? bVar3.f189593c : null);
                    } else {
                        kVar.f331236h = null;
                    }
                }
                C108965b bVar4 = this.f331242d.f331235g;
                if (bVar4 != null) {
                    bVar4.mo160066d((GL10) null);
                }
                C110747k kVar2 = this.f331242d;
                C111742d.C65942b bVar5 = kVar2.f331234f;
                if (bVar5 != null) {
                    EGLDisplay eGLDisplay = bVar5.f189591a;
                    EGLSurface eGLSurface = kVar2.f331236h;
                    if (eGLSurface == null) {
                        eGLSurface = bVar5.f189592b;
                    }
                    EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: s50.k$c */
    public static final class C110750c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f331243d;

        public C110750c(C32224a aVar) {
            this.f331243d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f331243d.invoke();
        }
    }

    /* renamed from: s50.k$d */
    public static final class C110751d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Object f331244d;

        /* renamed from: e */
        public final /* synthetic */ C110747k f331245e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110751d(Object obj, C110747k kVar) {
            super(0);
            this.f331244d = obj;
            this.f331245e = kVar;
        }

        public Object invoke() {
            Object obj = this.f331244d;
            if (obj != null) {
                C110747k kVar = this.f331245e;
                kVar.f331236h = null;
                kVar.f331237i = obj;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: s50.k$e */
    public static final class C110752e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<SurfaceTexture, C13598b0> f331246d;

        /* renamed from: e */
        public final /* synthetic */ C110747k f331247e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110752e(C32226l<? super SurfaceTexture, C13598b0> lVar, C110747k kVar) {
            super(0);
            this.f331246d = lVar;
            this.f331247e = kVar;
        }

        public Object invoke() {
            C32226l<SurfaceTexture, C13598b0> lVar = this.f331246d;
            SurfaceTexture surfaceTexture = null;
            if (lVar != null) {
                C108965b bVar = this.f331247e.f331235g;
                lVar.invoke(bVar != null ? bVar.mo160064b() : null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tryCameraPreview  ");
            C108965b bVar2 = this.f331247e.f331235g;
            if (bVar2 != null) {
                surfaceTexture = bVar2.mo160064b();
            }
            sb.append(surfaceTexture);
            Log.printInfoStack("MicroMsg.LiveCoreRender", sb.toString(), new Object[0]);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: s50.k$f */
    public static final class C110753f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f331248d;

        /* renamed from: e */
        public final /* synthetic */ int f331249e;

        /* renamed from: f */
        public final /* synthetic */ C110747k f331250f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110753f(int i, int i2, C110747k kVar) {
            super(0);
            this.f331248d = i;
            this.f331249e = i2;
            this.f331250f = kVar;
        }

        public Object invoke() {
            if (this.f331248d <= 0 || this.f331249e <= 0) {
                int A = C76577a.m92145A(MMApplicationContext.getContext());
                int j = C76577a.m92159j(MMApplicationContext.getContext());
                String str = "updateDrawSize:" + A + " x " + j;
                C87412m.m108594g(str, "debugText");
                Log.m105924i("MicroMsg.LiveCore", str);
                C108965b bVar = this.f331250f.f331235g;
                if (bVar != null) {
                    bVar.mo160067e((GL10) null, A, j);
                }
            } else {
                String str2 = "updateDrawSize:" + this.f331248d + " x " + this.f331249e;
                C87412m.m108594g(str2, "debugText");
                Log.m105924i("MicroMsg.LiveCore", str2);
                C108965b bVar2 = this.f331250f.f331235g;
                if (bVar2 != null) {
                    bVar2.mo160067e((GL10) null, this.f331248d, this.f331249e);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C110747k() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("MicroMsg.LiveCoreRender", 10);
        this.f331232d = a;
        a.start();
        MMHandler mMHandler = new MMHandler(a.getLooper());
        this.f331233e = mMHandler;
        mMHandler.post(new C110745j(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.mo160065c();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p156gj.C8325f0 mo162266a() {
        /*
            r4 = this;
            gj.f0 r0 = new gj.f0
            k90.b r1 = r4.f331235g
            r2 = 0
            if (r1 == 0) goto L_0x0010
            p80.c r1 = r1.mo160065c()
            if (r1 == 0) goto L_0x0010
            int r1 = r1.f329657j
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            k90.b r3 = r4.f331235g
            if (r3 == 0) goto L_0x001d
            p80.c r3 = r3.mo160065c()
            if (r3 == 0) goto L_0x001d
            int r2 = r3.f329658n
        L_0x001d:
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s50.C110747k.mo162266a():gj.f0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r3 != false) goto L_0x0025;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162267b(fy3.C32226l<? super java.lang.Integer, rx3.C13598b0> r6) {
        /*
            r5 = this;
            s50.u r0 = r5.f331238j
            if (r0 != 0) goto L_0x0005
            goto L_0x003e
        L_0x0005:
            if (r6 != 0) goto L_0x0016
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r0.f331283M
            if (r1 == 0) goto L_0x000e
            r1.stopTimer()
        L_0x000e:
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r0.f331283M
            if (r1 == 0) goto L_0x003c
            r1.quitSafely()
            goto L_0x003c
        L_0x0016:
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r0.f331283M
            r2 = 1
            if (r1 == 0) goto L_0x0025
            r3 = 0
            boolean r1 = r1.isQuit()
            if (r1 != r2) goto L_0x0023
            r3 = 1
        L_0x0023:
            if (r3 == 0) goto L_0x0033
        L_0x0025:
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            s50.t r3 = new s50.t
            r3.<init>(r0)
            java.lang.String r4 = "LiveRenderFpsCounter"
            r1.<init>((java.lang.String) r4, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r3, (boolean) r2)
            r0.f331283M = r1
        L_0x0033:
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r0.f331283M
            if (r1 == 0) goto L_0x003c
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.startTimer(r2)
        L_0x003c:
            r0.f331281K = r6
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s50.C110747k.mo162267b(fy3.l):void");
    }

    /* renamed from: c */
    public void mo162268c(Object obj) {
        mo148312q(new C110751d(obj, this));
    }

    /* renamed from: d */
    public final void mo162269d(int i, int i2) {
        mo148312q(new C110753f(i, i2, this));
    }

    public EGLContext getEGLContext() {
        C111742d.C65942b bVar = this.f331234f;
        if (bVar != null) {
            return bVar.f189593c;
        }
        return null;
    }

    public C108382h getFrameDataCallback() {
        C108965b bVar = this.f331235g;
        if (bVar != null) {
            return bVar.mo160063a();
        }
        return null;
    }

    public C110194c getPreviewTexture() {
        C110760u uVar = this.f331238j;
        if (uVar != null) {
            return uVar.mo157953g();
        }
        return null;
    }

    /* renamed from: i */
    public void mo148308i(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        C108965b bVar = this.f331235g;
        SurfaceTexture surfaceTexture = null;
        if ((bVar != null ? bVar.mo160064b() : null) == null) {
            this.f331240o = new C110752e(lVar, this);
            return;
        }
        if (lVar != null) {
            C108965b bVar2 = this.f331235g;
            lVar.invoke(bVar2 != null ? bVar2.mo160064b() : null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tryCameraPreview  ");
        C108965b bVar3 = this.f331235g;
        if (bVar3 != null) {
            surfaceTexture = bVar3.mo160064b();
        }
        sb.append(surfaceTexture);
        Log.printInfoStack("MicroMsg.LiveCoreRender", sb.toString(), new Object[0]);
    }

    /* renamed from: j */
    public void mo148309j(C110777a aVar, boolean z) {
        C87412m.m108594g(aVar, "renderer");
        Log.printInfoStack("MicroMsg.LiveCoreRender", "setPreviewRenderer cpuCrop:" + z, new Object[0]);
        C108965b bVar = this.f331235g;
        if (bVar != null) {
            C108965b.m147848h(bVar, false, false, 3, (Object) null);
        }
        C108965b cVar = z ? new C108968c(this) : new C108970d(this);
        this.f331235g = cVar;
        cVar.mo160070i(aVar);
    }

    /* renamed from: m */
    public void mo148310m(C66557b bVar) {
        C87412m.m108594g(bVar, "cameraConfig");
        Log.printInfoStack("MicroMsg.LiveCoreRender", "updateCameraConfig:" + bVar, new Object[0]);
        C108965b bVar2 = this.f331235g;
        if (bVar2 != null) {
            bVar2.mo160071j(bVar);
        }
    }

    /* renamed from: n */
    public void mo148311n() {
        C110777a aVar;
        C108965b bVar = this.f331235g;
        if (bVar != null && (aVar = bVar.f326404c) != null) {
            aVar.f331386k = true;
        }
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        this.f331233e.post(new C110750c(aVar));
    }

    public void release() {
        Log.m105924i("MicroMsg.LiveCoreRender", "release live render manager");
        mo148312q(new C110748a(this));
    }

    public void requestRender() {
        mo148312q(new C110749b(this));
    }

    /* renamed from: s */
    public void mo148314s() {
    }

    public void setOnDrawListener(C32226l<? super C110194c, C13598b0> lVar) {
        Log.printInfoStack("MicroMsg.LiveCoreRender", "setOnDrawListener", new Object[0]);
        C108965b bVar = this.f331235g;
        if (bVar != null) {
            bVar.f326406e = lVar;
        }
    }
}
