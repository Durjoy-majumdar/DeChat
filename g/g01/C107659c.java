package g01;

import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e01.C107075a;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import p156gj.C107835h0;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111141c;
import w80.C111742d;
import yz0.C112509d;

/* renamed from: g01.c */
public final class C107659c {

    /* renamed from: a */
    public int f322067a;

    /* renamed from: b */
    public int f322068b;

    /* renamed from: c */
    public int f322069c;

    /* renamed from: d */
    public Surface f322070d;

    /* renamed from: e */
    public C107660a f322071e;

    /* renamed from: f */
    public MMHandler f322072f;

    /* renamed from: g */
    public HandlerThread f322073g = C97749e.m126093a("MicroMsg.ScreenCastRenderMgr" + hashCode(), 10);

    /* renamed from: h */
    public C107658b f322074h;

    /* renamed from: i */
    public C111141c f322075i;

    /* renamed from: j */
    public SurfaceTexture f322076j;

    /* renamed from: k */
    public Surface f322077k;

    /* renamed from: l */
    public C111742d.C65942b f322078l;

    /* renamed from: m */
    public boolean f322079m;

    /* renamed from: n */
    public volatile boolean f322080n;

    /* renamed from: o */
    public long f322081o;

    /* renamed from: p */
    public long f322082p;

    /* renamed from: q */
    public MTimerHandler f322083q;

    /* renamed from: g01.c$a */
    public interface C107660a {
        /* renamed from: a */
        void mo157533a(Surface surface);

        /* renamed from: b */
        void mo157534b();
    }

    /* renamed from: g01.c$b */
    public static final class C107661b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C107659c f322084d;

        /* renamed from: g01.c$b$a */
        public static final class C107662a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C107659c f322085d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C107662a(C107659c cVar) {
                super(0);
                this.f322085d = cVar;
            }

            public Object invoke() {
                C107659c cVar = this.f322085d;
                if (cVar.f322082p == -1) {
                    cVar.f322082p = Util.currentTicks();
                }
                C107659c cVar2 = this.f322085d;
                synchronized (cVar2) {
                    if (cVar2.f322079m) {
                        try {
                            long currentTicks = Util.currentTicks();
                            boolean z = false;
                            if (cVar2.f322080n) {
                                cVar2.f322080n = false;
                                try {
                                    SurfaceTexture surfaceTexture = cVar2.f322076j;
                                    if (surfaceTexture != null) {
                                        surfaceTexture.updateTexImage();
                                    }
                                } catch (Exception unused) {
                                    Log.m105924i("MicroMsg.ScreenCastRenderMgr", "render Image update");
                                }
                            }
                            cVar2.mo158074a();
                            C111141c cVar3 = cVar2.f322075i;
                            if (cVar3 != null) {
                                cVar3.mo162879m();
                            }
                            C111742d.C65942b bVar = cVar2.f322078l;
                            if (bVar != null) {
                                EGL14.eglSwapBuffers(bVar.f189591a, bVar.f189592b);
                            }
                            long j = cVar2.f322081o;
                            if (j == -1) {
                                cVar2.f322081o = Util.ticksToNow(currentTicks);
                            } else {
                                long ticksToNow = j + Util.ticksToNow(currentTicks);
                                cVar2.f322081o = ticksToNow;
                                cVar2.f322081o = ticksToNow / ((long) 2);
                            }
                            if (C112509d.f336921e == null) {
                                C112509d.f336921e = new C107075a();
                            }
                            C107075a aVar = C112509d.f336921e;
                            if (aVar != null) {
                                aVar.f320508n = cVar2.f322081o;
                            }
                            if (aVar == null) {
                                C112509d.f336921e = new C107075a();
                            }
                            C107075a aVar2 = C112509d.f336921e;
                            if (aVar2 != null && aVar2.f320506l == -1) {
                                z = true;
                            }
                            if (z) {
                                long ticksToNow2 = Util.ticksToNow(cVar2.f322082p);
                                cVar2.f322082p = ticksToNow2;
                                if (C112509d.f336921e == null) {
                                    C112509d.f336921e = new C107075a();
                                }
                                C107075a aVar3 = C112509d.f336921e;
                                if (aVar3 != null) {
                                    aVar3.f320506l = ticksToNow2;
                                }
                            }
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.ScreenCastRenderMgr", "render error in " + e);
                        }
                    } else {
                        C107658b bVar2 = cVar2.f322074h;
                        if (bVar2 != null) {
                            bVar2.mo158073a();
                        }
                    }
                }
                C107660a aVar4 = this.f322085d.f322071e;
                if (aVar4 != null) {
                    aVar4.mo157534b();
                }
                return C13598b0.f38549a;
            }
        }

        public C107661b(C107659c cVar) {
            this.f322084d = cVar;
        }

        public final boolean onTimerExpired() {
            C107659c cVar = this.f322084d;
            cVar.mo158075b(new C107662a(cVar));
            return true;
        }
    }

    /* renamed from: g01.c$c */
    public static final class C107663c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f322086d;

        public C107663c(C32224a aVar) {
            this.f322086d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f322086d.invoke();
        }
    }

    /* renamed from: g01.c$d */
    public static final class C107664d implements SurfaceTexture.OnFrameAvailableListener {

        /* renamed from: d */
        public final /* synthetic */ C107659c f322087d;

        public C107664d(C107659c cVar) {
            this.f322087d = cVar;
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.f322087d.f322080n = true;
        }
    }

    public C107659c(int i, int i2, int i3) {
        boolean z;
        this.f322067a = i;
        this.f322068b = i2;
        this.f322069c = i3;
        int i4 = C58834h.f168432b;
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_finder_screec_cast_pc_use_opengl_render;
        Class cls = C32735h.class;
        int i5 = C107835h0.f322856m.f322868H;
        if (i5 != -1) {
            if (i5 != 1) {
                z = i5 != 2 ? ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, true) : false;
                this.f322079m = z;
                this.f322073g.start();
                this.f322072f = new MMHandler(this.f322073g.getLooper());
                this.f322081o = -1;
                this.f322082p = -1;
                this.f322083q = new MTimerHandler("ScreenCastRenderTimer", (MTimerHandler.CallBack) new C107661b(this), true);
            }
        } else if (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG) {
            z = ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, true);
            this.f322079m = z;
            this.f322073g.start();
            this.f322072f = new MMHandler(this.f322073g.getLooper());
            this.f322081o = -1;
            this.f322082p = -1;
            this.f322083q = new MTimerHandler("ScreenCastRenderTimer", (MTimerHandler.CallBack) new C107661b(this), true);
        }
        z = true;
        this.f322079m = z;
        this.f322073g.start();
        this.f322072f = new MMHandler(this.f322073g.getLooper());
        this.f322081o = -1;
        this.f322082p = -1;
        this.f322083q = new MTimerHandler("ScreenCastRenderTimer", (MTimerHandler.CallBack) new C107661b(this), true);
    }

    /* renamed from: a */
    public final void mo158074a() {
        C111742d.C65942b bVar = this.f322078l;
        if (bVar != null) {
            EGLDisplay eGLDisplay = bVar.f189591a;
            EGLSurface eGLSurface = bVar.f189592b;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f189593c)) {
                Log.m105920e("MicroMsg.ScreenCastRenderMgr", "makeEGLCurrent faild ");
            }
        }
    }

    /* renamed from: b */
    public final void mo158075b(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        if (this.f322073g.isAlive()) {
            this.f322072f.post(new C107663c(aVar));
        } else {
            Log.m105920e("MicroMsg.ScreenCastRenderMgr", "queue in error");
        }
    }

    /* renamed from: c */
    public final void mo158076c() {
        if (this.f322079m) {
            this.f322075i = new C111141c(this.f322067a, this.f322068b, 0, 0, 0, 0, 60, (C8480h) null);
            C110194c cVar = new C110194c(false, 20);
            C111141c cVar2 = this.f322075i;
            if (cVar2 != null) {
                cVar2.f332801G = cVar.f329652e;
            }
            SurfaceTexture surfaceTexture = new SurfaceTexture(cVar.f329652e);
            this.f322076j = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(this.f322067a, this.f322068b);
            SurfaceTexture surfaceTexture2 = this.f322076j;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setOnFrameAvailableListener(new C107664d(this));
            }
            this.f322077k = new Surface(this.f322076j);
        } else {
            C107658b bVar = new C107658b(this.f322067a, this.f322068b);
            this.f322074h = bVar;
            Looper looper = this.f322072f.getLooper();
            C87412m.m108593f(looper, "renderHandler.looper");
            ImageReader newInstance = ImageReader.newInstance(bVar.f322059a, bVar.f322060b, 1, 1);
            bVar.f322061c = newInstance;
            if (newInstance != null) {
                newInstance.setOnImageAvailableListener(new C107657a(bVar), new Handler(looper));
            }
            ImageReader imageReader = bVar.f322061c;
            Surface surface = null;
            bVar.f322062d = imageReader != null ? imageReader.getSurface() : null;
            C107658b bVar2 = this.f322074h;
            if (bVar2 != null) {
                surface = bVar2.f322062d;
            }
            this.f322077k = surface;
        }
        Surface surface2 = this.f322077k;
        if (surface2 != null) {
            C107660a aVar = this.f322071e;
            if (aVar != null) {
                aVar.mo157533a(surface2);
            }
            this.f322083q.startTimer(((long) 1000) / ((long) this.f322069c));
        }
    }
}
