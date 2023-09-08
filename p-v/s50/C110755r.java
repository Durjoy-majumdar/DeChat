package s50;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111140b;
import w80.C111742d;

/* renamed from: s50.r */
public final class C110755r {

    /* renamed from: a */
    public int f331255a;

    /* renamed from: b */
    public int f331256b;

    /* renamed from: c */
    public C32226l<? super C110755r, C13598b0> f331257c;

    /* renamed from: d */
    public Handler f331258d;

    /* renamed from: e */
    public HandlerThread f331259e = C97749e.m126093a("MicroMsg.ScreenProjectCanvasRendererMgr" + hashCode(), 10);

    /* renamed from: f */
    public C111140b f331260f;

    /* renamed from: g */
    public SurfaceTexture f331261g;

    /* renamed from: h */
    public Bitmap f331262h;

    /* renamed from: i */
    public C32228q<? super Integer, ? super Integer, ? super Integer, C13598b0> f331263i;

    /* renamed from: j */
    public Surface f331264j;

    /* renamed from: k */
    public C111742d.C65942b f331265k;

    /* renamed from: l */
    public volatile boolean f331266l;

    /* renamed from: s50.r$a */
    public static final class C110756a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110755r f331267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110756a(C110755r rVar) {
            super(0);
            this.f331267d = rVar;
        }

        public Object invoke() {
            C110755r rVar = this.f331267d;
            rVar.f331265k = C111742d.C111743a.m152351i(C111742d.f334647a, rVar.f331255a, rVar.f331256b, (EGLContext) null, 4, (Object) null);
            C110755r rVar2 = this.f331267d;
            rVar2.f331260f = new C111140b(rVar2.f331255a, rVar2.f331256b, 0, 0, 2, 6, 12, (C8480h) null);
            C110194c cVar = new C110194c(false, 18);
            C111140b bVar = rVar2.f331260f;
            if (bVar != null) {
                bVar.f332773C = cVar.f329652e;
            }
            SurfaceTexture surfaceTexture = new SurfaceTexture(cVar.f329652e);
            rVar2.f331261g = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(rVar2.f331255a, rVar2.f331256b);
            SurfaceTexture surfaceTexture2 = rVar2.f331261g;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setOnFrameAvailableListener(new C110758s(rVar2));
            }
            rVar2.f331264j = new Surface(rVar2.f331261g);
            rVar2.f331257c.invoke(rVar2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: s50.r$b */
    public static final class C110757b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f331268d;

        public C110757b(C32224a aVar) {
            this.f331268d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f331268d.invoke();
        }
    }

    public C110755r(int i, int i2, C32226l<? super C110755r, C13598b0> lVar) {
        C87412m.m108594g(lVar, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f331255a = i;
        this.f331256b = i2;
        this.f331257c = lVar;
        int i3 = C58834h.f168432b;
        Log.m105924i("MicroMsg.ScreenProjectCanvasRendererMgr", "device height is " + this.f331255a + " and " + this.f331256b);
        this.f331259e.start();
        this.f331258d = new Handler(this.f331259e.getLooper());
        C110756a aVar = new C110756a(this);
        if (this.f331259e.isAlive()) {
            this.f331258d.post(new C110757b(aVar));
        } else {
            Log.m105920e("MicroMsg.ScreenProjectCanvasRendererMgr", "queue in error");
        }
    }

    /* renamed from: a */
    public final void mo162271a() {
        C111742d.C65942b bVar = this.f331265k;
        if (bVar != null) {
            EGLDisplay eGLDisplay = bVar.f189591a;
            EGLSurface eGLSurface = bVar.f189592b;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f189593c)) {
                Log.m105920e("MicroMsg.ScreenProjectCanvasRendererMgr", "makeEGLCurrent failed ");
            }
        }
    }

    /* renamed from: b */
    public final void mo162272b(int i, int i2) {
        C111140b bVar = this.f331260f;
        if (bVar != null) {
            bVar.mo143263u(i, i2);
        }
        SurfaceTexture surfaceTexture = this.f331261g;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        if (i > i2) {
            C111140b bVar2 = this.f331260f;
            if (bVar2 != null) {
                bVar2.f332758m = 270;
            }
            if (bVar2 != null) {
                bVar2.f332759n = false;
            }
            if (bVar2 != null) {
                bVar2.mo158522s(i2, i);
            }
            C111140b bVar3 = this.f331260f;
            if (bVar3 != null) {
                bVar3.mo162881r(i2, i);
            }
        } else {
            C111140b bVar4 = this.f331260f;
            if (bVar4 != null) {
                bVar4.f332758m = 0;
            }
            if (bVar4 != null) {
                bVar4.f332760o = true;
            }
            if (bVar4 != null) {
                bVar4.mo158522s(i, i2);
            }
            C111140b bVar5 = this.f331260f;
            if (bVar5 != null) {
                bVar5.mo162881r(i, i2);
            }
        }
        this.f331255a = i;
        this.f331256b = i2;
    }
}
