package k90;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i72.C108382h;
import j90.C108668f;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import y80.C66557b;

/* renamed from: k90.b */
public abstract class C108965b {

    /* renamed from: a */
    public C108668f f326402a;

    /* renamed from: b */
    public final String f326403b = "MicroMsg.AbsPreviewController";

    /* renamed from: c */
    public C110777a f326404c;

    /* renamed from: d */
    public EGLContext f326405d;

    /* renamed from: e */
    public C32226l<? super C110194c, C13598b0> f326406e;

    /* renamed from: f */
    public final int f326407f = v2helper.VOIP_ENC_HEIGHT_LV1;

    /* renamed from: g */
    public final Object f326408g = new Object();

    /* renamed from: k90.b$a */
    public static final class C108966a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108965b f326409d;

        /* renamed from: e */
        public final /* synthetic */ boolean f326410e;

        /* renamed from: f */
        public final /* synthetic */ boolean f326411f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108966a(C108965b bVar, boolean z, boolean z2) {
            super(0);
            this.f326409d = bVar;
            this.f326410e = z;
            this.f326411f = z2;
        }

        public Object invoke() {
            Log.printInfoStack(this.f326409d.f326403b, "release", new Object[0]);
            C110777a aVar = this.f326409d.f326404c;
            if (aVar != null) {
                C110777a.m150773o(aVar, false, 1, (Object) null);
            }
            C108965b bVar = this.f326409d;
            bVar.f326405d = null;
            if (this.f326410e && this.f326411f) {
                synchronized (bVar.f326408g) {
                    try {
                        bVar.f326408g.notifyAll();
                    } catch (Exception e) {
                        Log.printErrStackTrace(bVar.f326403b, e, "notify release error", new Object[0]);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k90.b$b */
    public static final class C108967b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108965b f326412d;

        /* renamed from: e */
        public final /* synthetic */ C110777a f326413e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108967b(C108965b bVar, C110777a aVar) {
            super(0);
            this.f326412d = bVar;
            this.f326413e = aVar;
        }

        public Object invoke() {
            C32226l<? super C110194c, C13598b0> lVar = this.f326412d.f326406e;
            if (lVar != null) {
                lVar.invoke(this.f326413e.mo157953g());
            }
            return C13598b0.f38549a;
        }
    }

    public C108965b(C108668f fVar) {
        C87412m.m108594g(fVar, "view");
        this.f326402a = fVar;
    }

    /* renamed from: h */
    public static /* synthetic */ void m147848h(C108965b bVar, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            bVar.mo160069g(z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: release");
    }

    /* renamed from: a */
    public C108382h mo160063a() {
        return null;
    }

    /* renamed from: b */
    public final SurfaceTexture mo160064b() {
        SurfaceTexture surfaceTexture;
        C110777a aVar = this.f326404c;
        if (aVar == null) {
            return null;
        }
        synchronized (aVar) {
            surfaceTexture = aVar.f331384i;
        }
        return surfaceTexture;
    }

    /* renamed from: c */
    public final C110194c mo160065c() {
        C110777a aVar = this.f326404c;
        if (aVar != null) {
            return aVar.mo157954j();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo160066d(GL10 gl10) {
        C110777a aVar = this.f326404c;
        if (aVar != null) {
            aVar.onDrawFrame(gl10);
        }
    }

    /* renamed from: e */
    public final void mo160067e(GL10 gl10, int i, int i2) {
        C110777a aVar = this.f326404c;
        if (aVar != null) {
            aVar.onSurfaceChanged(gl10, i, i2);
        }
    }

    /* renamed from: f */
    public final void mo160068f(GL10 gl10, EGLConfig eGLConfig) {
        this.f326405d = EGL14.eglGetCurrentContext();
        EGL14.eglGetCurrentSurface(12377);
        C110777a aVar = this.f326404c;
        if (aVar != null) {
            aVar.onSurfaceCreated(gl10, eGLConfig);
        }
    }

    /* renamed from: g */
    public final void mo160069g(boolean z, boolean z2) {
        String str = this.f326403b;
        Log.m105924i(str, "release, needPostRenderThread:" + z + ", block:" + z2);
        C108966a aVar = new C108966a(this, z, z2);
        if (z) {
            long currentTicks = Util.currentTicks();
            Log.m105924i(this.f326403b, "start post release");
            this.f326402a.mo148312q(aVar);
            if (z2) {
                synchronized (this.f326408g) {
                    try {
                        this.f326408g.wait(100);
                    } catch (Exception e) {
                        Log.printErrStackTrace(this.f326403b, e, "wait release error", new Object[0]);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                String str2 = this.f326403b;
                Log.m105924i(str2, "wait release finished cost:" + Util.ticksToNow(currentTicks) + LocaleUtil.MALAY);
                return;
            }
            return;
        }
        aVar.invoke();
    }

    /* renamed from: i */
    public void mo160070i(C110777a aVar) {
        C87412m.m108594g(aVar, "renderer");
        this.f326404c = aVar;
        aVar.f331393r = new C108967b(this, aVar);
    }

    /* renamed from: j */
    public void mo160071j(C66557b bVar) {
        C87412m.m108594g(bVar, "cameraConfig");
        int i = 0;
        Log.printInfoStack(this.f326403b, "updateCameraConfig: " + bVar, new Object[0]);
        Point point = new Point(C66557b.f191416c, C66557b.f191415b);
        C110777a aVar = this.f326404c;
        if (aVar != null) {
            aVar.mo159591u(point.x, point.y);
        }
        C110777a aVar2 = this.f326404c;
        if (aVar2 != null) {
            Object systemService = MMApplicationContext.getContext().getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
            if (rotation != 0) {
                if (rotation == 1) {
                    i = 90;
                } else if (rotation == 2) {
                    i = 180;
                } else if (rotation == 3) {
                    i = 270;
                }
            }
            int i2 = C66557b.f191417d - i;
            int i3 = this.f326407f;
            aVar2.mo159589r((i2 + i3) % i3);
        }
        C110777a aVar3 = this.f326404c;
        if (aVar3 != null) {
            aVar3.mo159588m(C66557b.f191420g);
        }
    }
}
