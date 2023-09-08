package b92;

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
import java.nio.ByteBuffer;
import p80.C110194c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u80.C111141c;
import w80.C111742d;

/* renamed from: b92.a */
public final class C104065a {

    /* renamed from: a */
    public int f307788a;

    /* renamed from: b */
    public int f307789b;

    /* renamed from: c */
    public C32226l<? super C104065a, C13598b0> f307790c;

    /* renamed from: d */
    public Handler f307791d;

    /* renamed from: e */
    public HandlerThread f307792e = C97749e.m126093a("MicroMsg.ScreenProjectCanvasRendererMgr" + hashCode(), 10);

    /* renamed from: f */
    public C111141c f307793f;

    /* renamed from: g */
    public SurfaceTexture f307794g;

    /* renamed from: h */
    public C32228q<? super ByteBuffer, ? super Integer, ? super Integer, C13598b0> f307795h;

    /* renamed from: i */
    public Surface f307796i;

    /* renamed from: j */
    public C111742d.C65942b f307797j;

    /* renamed from: k */
    public volatile boolean f307798k;

    /* renamed from: l */
    public final C13601g f307799l = C36568h.m40985a(C104067b.f307801d);

    /* renamed from: b92.a$a */
    public static final class C104066a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C104065a f307800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104066a(C104065a aVar) {
            super(0);
            this.f307800d = aVar;
        }

        public Object invoke() {
            C104065a aVar = this.f307800d;
            aVar.f307797j = C111742d.C111743a.m152351i(C111742d.f334647a, aVar.f307788a, aVar.f307789b, (EGLContext) null, 4, (Object) null);
            C104065a aVar2 = this.f307800d;
            C111141c cVar = new C111141c(aVar2.f307788a, aVar2.f307789b, 0, 0, 0, 0, 60, (C8480h) null);
            aVar2.f307793f = cVar;
            cVar.f332764s = new C104070c(aVar2);
            C110194c cVar2 = (C110194c) ((C36570n) aVar2.f307799l).getValue();
            C111141c cVar3 = aVar2.f307793f;
            if (cVar3 != null) {
                cVar3.f332801G = ((C110194c) ((C36570n) aVar2.f307799l).getValue()).f329652e;
            }
            SurfaceTexture surfaceTexture = new SurfaceTexture(cVar2.f329652e);
            aVar2.f307794g = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(aVar2.f307788a, aVar2.f307789b);
            SurfaceTexture surfaceTexture2 = aVar2.f307794g;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setOnFrameAvailableListener(new C104071d(aVar2));
            }
            aVar2.f307796i = new Surface(aVar2.f307794g);
            C111742d.C65942b bVar = aVar2.f307797j;
            if (bVar != null) {
                EGLDisplay eGLDisplay = bVar.f189591a;
                EGLSurface eGLSurface = bVar.f189592b;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f189593c)) {
                    Log.m105920e("MicroMsg.ScreenProjectCanvasRendererMgr", "makeEGLCurrent failed ");
                }
            }
            aVar2.f307790c.invoke(aVar2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b92.a$b */
    public static final class C104067b extends C87413o implements C32224a<C110194c> {

        /* renamed from: d */
        public static final C104067b f307801d = new C104067b();

        public C104067b() {
            super(0);
        }

        public Object invoke() {
            return new C110194c(false, 19);
        }
    }

    /* renamed from: b92.a$c */
    public static final class C104068c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f307802d;

        public C104068c(C32224a aVar) {
            this.f307802d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f307802d.invoke();
        }
    }

    public C104065a(int i, int i2, C32226l<? super C104065a, C13598b0> lVar) {
        C87412m.m108594g(lVar, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f307788a = i;
        this.f307789b = i2;
        this.f307790c = lVar;
        int i3 = C58834h.f168432b;
        Log.m105924i("MicroMsg.ScreenProjectCanvasRendererMgr", "device height is " + this.f307788a + " and " + this.f307789b);
        this.f307792e.start();
        this.f307791d = new Handler(this.f307792e.getLooper());
        mo145664a(new C104066a(this));
    }

    /* renamed from: a */
    public final void mo145664a(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        if (this.f307792e.isAlive()) {
            this.f307791d.post(new C104068c(aVar));
        } else {
            Log.m105920e("MicroMsg.ScreenProjectCanvasRendererMgr", "queue in error");
        }
    }

    /* renamed from: b */
    public final void mo145665b(int i, int i2) {
        C111141c cVar = this.f307793f;
        if (cVar != null) {
            cVar.mo143263u(i, i2);
        }
        SurfaceTexture surfaceTexture = this.f307794g;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        if (i < i2) {
            C111141c cVar2 = this.f307793f;
            if (cVar2 != null) {
                cVar2.f332758m = 270;
            }
            if (cVar2 != null) {
                cVar2.f332759n = false;
            }
            if (cVar2 != null) {
                cVar2.f332760o = false;
            }
            if (cVar2 != null) {
                cVar2.mo158522s(i2, i);
            }
            C111141c cVar3 = this.f307793f;
            if (cVar3 != null) {
                cVar3.mo162881r(i2, i);
            }
        } else {
            C111141c cVar4 = this.f307793f;
            if (cVar4 != null) {
                cVar4.f332758m = 0;
            }
            if (cVar4 != null) {
                cVar4.f332760o = true;
            }
            if (cVar4 != null) {
                cVar4.f332759n = true;
            }
            if (cVar4 != null) {
                cVar4.mo158522s(i, i2);
            }
            C111141c cVar5 = this.f307793f;
            if (cVar5 != null) {
                cVar5.mo162881r(i, i2);
            }
        }
        this.f307788a = i;
        this.f307789b = i2;
        C111141c cVar6 = this.f307793f;
        if (cVar6 != null) {
            cVar6.f332766u = true;
        }
    }
}
