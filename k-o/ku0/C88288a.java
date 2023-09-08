package ku0;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83183s;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86312j;
import fl0.C86920e;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ku0.C88307l;
import org.json.JSONObject;
import p301cd.C79999m;
import p301cd.C80005q;
import p830xc.C91165a;
import p960ed.C86502b;
import p960ed.C86503c;
import p960ed.C86504d;
import p960ed.C86505e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import xk0.C91259a;
import y80.C112405g;
import y80.C66558h;
import z04.C112550d0;

/* renamed from: ku0.a */
public final class C88288a implements C86505e, C86502b, C86503c, C86504d, MagicBrushView.C80319b, C82531i.C82535d, C82531i.C82533b, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: E */
    public static final C88289a f255199E = new C88289a((C8480h) null);

    /* renamed from: F */
    public static final boolean f255200F = (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger());

    /* renamed from: G */
    public static final Size f255201G = new Size(-1, -1);

    /* renamed from: A */
    public final C88288a f255202A;

    /* renamed from: B */
    public final C88288a f255203B;

    /* renamed from: C */
    public final C88288a f255204C;

    /* renamed from: D */
    public final MagicBrushView.C80327h f255205D;

    /* renamed from: d */
    public final C80005q f255206d;

    /* renamed from: e */
    public final C79999m f255207e;

    /* renamed from: f */
    public final String f255208f;

    /* renamed from: g */
    public volatile WeakReference<C83928t1> f255209g;

    /* renamed from: h */
    public volatile boolean f255210h;

    /* renamed from: i */
    public volatile boolean f255211i = true;

    /* renamed from: j */
    public volatile boolean f255212j = C87412m.m108589b("front", "front");

    /* renamed from: n */
    public volatile Surface f255213n;

    /* renamed from: o */
    public volatile Size f255214o = f255201G;

    /* renamed from: p */
    public volatile boolean f255215p;

    /* renamed from: q */
    public volatile boolean f255216q;

    /* renamed from: r */
    public volatile boolean f255217r;

    /* renamed from: s */
    public volatile SurfaceTexture f255218s;

    /* renamed from: t */
    public volatile C112405g f255219t;

    /* renamed from: u */
    public volatile C80301a f255220u;

    /* renamed from: v */
    public volatile MagicBrushView f255221v;

    /* renamed from: w */
    public volatile MagicBrushView.C80321c f255222w;

    /* renamed from: x */
    public volatile int f255223x;

    /* renamed from: y */
    public final AtomicInteger f255224y = new AtomicInteger(0);

    /* renamed from: z */
    public final C88292d f255225z;

    /* renamed from: ku0.a$a */
    public static final class C88289a implements C86505e.C86506a {
        public C88289a(C8480h hVar) {
        }

        /* renamed from: a */
        public C86505e mo120984a(C80005q qVar, C79999m mVar) {
            C87412m.m108594g(qVar, "livePusherBroker");
            C87412m.m108594g(mVar, "livePusher");
            return new C88288a(qVar, mVar);
        }
    }

    /* renamed from: ku0.a$b */
    public static final class C88290b extends C82919r2 {
        public static final int CTRL_INDEX = -2;
        public static final String NAME = "onXWebLivePusherCameraFrame";
    }

    /* renamed from: ku0.a$c */
    public static final class C88291c extends C82919r2 {
        public static final int CTRL_INDEX = -2;
        public static final String NAME = "onXWebLivePusherCameraFrameBufferUpdate";
    }

    /* renamed from: ku0.a$d */
    public static final class C88292d {

        /* renamed from: a */
        public final String f255226a;

        /* renamed from: b */
        public final C88293e f255227b = new C88293e();

        public C88292d(String str) {
            C87412m.m108594g(str, "myTag");
            this.f255226a = str;
        }
    }

    /* renamed from: ku0.a$e */
    public static final class C88293e {

        /* renamed from: a */
        public volatile C82919r2 f255228a;
    }

    /* renamed from: ku0.a$f */
    public static final class C88294f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88288a f255229d;

        /* renamed from: e */
        public final /* synthetic */ Size f255230e;

        /* renamed from: f */
        public final /* synthetic */ C83928t1 f255231f;

        public C88294f(C88288a aVar, Size size, C83928t1 t1Var) {
            this.f255229d = aVar;
            this.f255230e = size;
            this.f255231f = t1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
            r4 = r4.mo115398S(r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                ku0.a r0 = r13.f255229d
                android.util.Size r1 = r13.f255230e
                com.tencent.mm.plugin.appbrand.page.t1 r2 = r13.f255231f
                java.util.concurrent.atomic.AtomicInteger r3 = r0.f255224y
                int r3 = r3.get()
                com.tencent.mm.plugin.appbrand.jsruntime.s r4 = r0.mo122665C()
                r5 = 0
                if (r4 == 0) goto L_0x0022
                java.nio.ByteBuffer r4 = r4.mo115398S(r3)
                if (r4 == 0) goto L_0x0022
                int r4 = r4.capacity()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L_0x0023
            L_0x0022:
                r4 = r5
            L_0x0023:
                r6 = 0
                if (r4 == 0) goto L_0x002b
                int r4 = r4.intValue()
                goto L_0x002c
            L_0x002b:
                r4 = 0
            L_0x002c:
                cd.q r7 = r0.f255206d
                int r7 = r7.f253971d
                int r8 = r1.getWidth()
                int r1 = r1.getHeight()
                r9 = 1069547520(0x3fc00000, float:1.5)
                float r10 = (float) r8
                float r10 = r10 * r9
                float r9 = (float) r1
                float r10 = r10 * r9
                int r9 = (int) r10
                java.lang.String r10 = r0.f255208f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "doCreateSharedBufferAndNotifyIfNeed, existBufferSize: "
                r11.append(r12)
                r11.append(r4)
                java.lang.String r12 = ", expectBufferSize: "
                r11.append(r12)
                r11.append(r9)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
                if (r9 == r4) goto L_0x00d9
                com.tencent.mm.plugin.appbrand.jsruntime.s r4 = r0.mo122665C()
                if (r4 == 0) goto L_0x00d2
                int r4 = r4.mo115396Q0(r9)
                java.util.concurrent.atomic.AtomicInteger r9 = r0.f255224y
                r9.set(r4)
                java.lang.String r9 = "component"
                gy3.C87412m.m108594g(r2, r9)
                ku0.a$c r9 = new ku0.a$c
                r9.<init>()
                r10 = 4
                rx3.l[] r10 = new rx3.C13604l[r10]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                rx3.l r11 = new rx3.l
                java.lang.String r12 = "livePusherId"
                r11.<init>(r12, r7)
                r10[r6] = r11
                r6 = 1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                rx3.l r7 = new rx3.l
                java.lang.String r11 = "bufferId"
                r7.<init>(r11, r4)
                r10[r6] = r7
                r4 = 2
                java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
                rx3.l r7 = new rx3.l
                java.lang.String r8 = "width"
                r7.<init>(r8, r6)
                r10[r4] = r7
                r4 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                rx3.l r6 = new rx3.l
                java.lang.String r7 = "height"
                r6.<init>(r7, r1)
                r10[r4] = r6
                java.util.Map r1 = sx3.C90364q0.m113147f(r10)
                r9.mo115165o(r1)
                r2.mo109669n(r9, r5)
                if (r3 == 0) goto L_0x00d9
                java.lang.String r1 = r0.f255208f
                java.lang.String r2 = "createSharedBufferThenNotify, release the existBuffer"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.mm.plugin.appbrand.jsruntime.s r0 = r0.mo122665C()
                if (r0 == 0) goto L_0x00d9
                r0.mo115415j1(r3)
                goto L_0x00d9
            L_0x00d2:
                java.lang.String r0 = r0.f255208f
                java.lang.String r1 = "createSharedBufferThenNotify, bufferId is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x00d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ku0.C88288a.C88294f.run():void");
        }
    }

    /* renamed from: ku0.a$g */
    public static final class C88295g extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f255232d;

        /* renamed from: e */
        public final /* synthetic */ Size f255233e;

        /* renamed from: f */
        public final /* synthetic */ C88288a f255234f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88295g(boolean z, Size size, C88288a aVar) {
            super(1);
            this.f255232d = z;
            this.f255233e = size;
            this.f255234f = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue() && this.f255232d && !C87412m.m108589b(C88288a.f255201G, this.f255233e)) {
                this.f255234f.mo122663A(this.f255233e);
            }
            return C13598b0.f38549a;
        }
    }

    public C88288a(C80005q qVar, C79999m mVar) {
        C87412m.m108594g(qVar, "livePusherBroker");
        C87412m.m108594g(mVar, "livePusher");
        this.f255206d = qVar;
        this.f255207e = mVar;
        String str = "MicroMsg.AppBrandVideoCustomRenderProcessor#" + hashCode();
        this.f255208f = str;
        this.f255225z = new C88292d(str);
        new AtomicBoolean(false);
        this.f255202A = this;
        this.f255203B = this;
        this.f255204C = this;
        this.f255205D = MagicBrushView.C80327h.VirtualView;
    }

    /* renamed from: A */
    public final void mo122663A(Size size) {
        C83928t1 t1Var;
        C83181q qVar;
        WeakReference<C83928t1> weakReference = this.f255209g;
        if (weakReference != null && (t1Var = weakReference.get()) != null) {
            C83165i a = C88307l.m110074a(t1Var);
            if (a != null && (qVar = (C83181q) a.mo63321n0(C83181q.class)) != null) {
                qVar.post(new C88294f(this, size, t1Var));
            }
        } else if (f255200F) {
            Log.m105918d(this.f255208f, "createSharedBufferAndNotifyIfNeed, insertComponent is null");
        }
    }

    /* renamed from: B */
    public final void mo122664B() {
        C88295g gVar = new C88295g(this.f255210h, this.f255214o, this);
        boolean z = this.f255210h;
        boolean z2 = f255200F;
        if (z2) {
            String str = this.f255208f;
            Log.m105918d(str, "triggerCustomVideoCaptureProcess, enableVideoCustomRender: " + z);
        }
        if (z2) {
            String str2 = this.f255208f;
            Log.m105918d(str2, "configCustomVideoCaptureIfNeed, enable: " + z);
        }
        boolean z3 = true;
        if (z == this.f255215p) {
            if (z2) {
                Log.m105918d(this.f255208f, "configCustomVideoCaptureIfNeed, not need");
            }
        } else if (!z || !this.f255207e.isPushing()) {
            String str3 = this.f255208f;
            Log.m105924i(str3, "configCustomVideoCaptureIfNeed, do enable: " + z);
            this.f255206d.mo110217G(new C88297c(this, z));
            this.f255215p = z;
        } else {
            Log.m105920e(this.f255208f, "configCustomVideoCaptureIfNeed, already push, can not enable");
            z3 = false;
        }
        if (z3) {
            mo122670H(z, gVar);
        } else {
            gVar.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: C */
    public final C83183s mo122665C() {
        C83928t1 t1Var;
        C83165i a;
        WeakReference<C83928t1> weakReference = this.f255209g;
        if (weakReference == null || (t1Var = weakReference.get()) == null || (a = C88307l.m110074a(t1Var)) == null) {
            return null;
        }
        return (C83183s) a.mo63321n0(C83183s.class);
    }

    /* renamed from: D */
    public final void mo122666D() {
        C83928t1 t1Var;
        C80301a aVar;
        WeakReference<C83928t1> weakReference = this.f255209g;
        if (weakReference == null || (t1Var = weakReference.get()) == null) {
            Log.m105920e("MicroMsg.AppBrandVideoCustomRenderProcessor", "notifyForegroundIfCan, insertComponent is null");
            return;
        }
        C91259a.C91261b bVar = C91259a.f261849c;
        String appId = t1Var.getAppId();
        C87412m.m108593f(appId, "insertComponent.appId");
        C91259a a = bVar.mo125282a(appId);
        a.mo125280c(this.f255206d.f253971d);
        if (a.mo125281d() == 1 && (aVar = this.f255220u) != null) {
            aVar.mo111506d();
        }
    }

    /* renamed from: E */
    public final void mo122667E() {
        if (this.f255221v != null) {
            MagicBrushView.C80321c cVar = this.f255222w;
            if (cVar != null) {
                Surface surface = this.f255213n;
                if (surface != null) {
                    Log.m105924i(this.f255208f, "notifyPreviewSurfaceReadyIfCan, do notify");
                    MagicBrushView.C80321c.C80322a.m97791a(cVar, surface, this.f255214o.getWidth(), this.f255214o.getHeight(), false, false, 16, (Object) null);
                } else if (f255200F) {
                    Log.m105918d(this.f255208f, "notifyPreviewSurfaceReadyIfCan, previewSurface is null");
                }
            } else if (f255200F) {
                Log.m105918d(this.f255208f, "notifyPreviewSurfaceReadyIfCan, surfaceListener is null");
            }
        } else if (f255200F) {
            Log.m105918d(this.f255208f, "notifyPreviewSurfaceReadyIfCan, previewView is null");
        }
    }

    /* renamed from: F */
    public final void mo122668F(SurfaceTexture surfaceTexture) {
        C112405g Up;
        if (f255200F) {
            String str = this.f255208f;
            Log.m105918d(str, "startCameraPreview, cameraPreviewSurface: " + surfaceTexture);
        }
        if (this.f255219t != null) {
            Log.m105924i(this.f255208f, "startCameraPreview, already started");
            return;
        }
        boolean z = this.f255212j;
        C66558h hVar = (C66558h) C86312j.m106911c(C66558h.class);
        if (hVar == null || (Up = hVar.mo90623Up(z, false, false)) == null) {
            Log.m105924i(this.f255208f, "startCameraPreview, camera is null");
            return;
        }
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        Up.mo143164d(context, !z);
        Up.mo143169h(surfaceTexture, false, CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
        Up.mo143176o(20);
        this.f255219t = Up;
    }

    /* renamed from: G */
    public final void mo122669G() {
        if (f255200F) {
            Log.m105918d(this.f255208f, "stopCameraPreview");
        }
        C112405g gVar = this.f255219t;
        if (gVar != null) {
            gVar.onDestroy();
        }
        C112405g gVar2 = this.f255219t;
        if (gVar2 != null) {
            gVar2.release();
        }
        this.f255219t = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: eb.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122670H(boolean r10, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r11) {
        /*
            r9 = this;
            boolean r0 = f255200F
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r9.f255208f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "toggleCustomVideoCaptureIfNeed, isStart: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
        L_0x001b:
            boolean r1 = r9.f255216q
            if (r10 != r1) goto L_0x0031
            if (r0 == 0) goto L_0x0029
            java.lang.String r10 = r9.f255208f
            java.lang.String r0 = "toggleCustomVideoCaptureIfNeed, not need"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
        L_0x0029:
            if (r11 == 0) goto L_0x0030
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r11.invoke(r10)
        L_0x0030:
            return
        L_0x0031:
            java.lang.String r1 = r9.f255208f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "toggleCustomVideoCaptureIfNeed, do isStart: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r1 = 1
            java.lang.String r2 = "insertComponent.appId"
            java.lang.String r3 = "livepusher"
            r4 = 0
            r5 = 0
            if (r10 == 0) goto L_0x0140
            if (r0 == 0) goto L_0x005b
            java.lang.String r6 = r9.f255208f
            java.lang.String r7 = "startCustomVideoCaptureIfNeed"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
        L_0x005b:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.t1> r6 = r9.f255209g
            if (r6 == 0) goto L_0x012c
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.appbrand.page.t1 r6 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r6
            if (r6 != 0) goto L_0x0069
            goto L_0x012c
        L_0x0069:
            android.util.Size r7 = f255201G
            android.util.Size r8 = r9.f255214o
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x0075
            r7 = r4
            goto L_0x0077
        L_0x0075:
            android.util.Size r7 = r9.f255214o
        L_0x0077:
            if (r7 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = r9.f255208f
            java.lang.String r1 = "startCustomVideoCaptureIfNeed, previewSurfaceSize is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
        L_0x0083:
            if (r11 == 0) goto L_0x013d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.invoke(r0)
            goto L_0x013d
        L_0x008c:
            ku0.j r8 = new ku0.j
            r8.<init>(r9, r11, r7)
            if (r0 == 0) goto L_0x009b
            java.lang.String r11 = r9.f255208f
            java.lang.String r0 = "setupWebGLEnv"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
        L_0x009b:
            kr0.e r11 = r6.mo116160O0()
            if (r11 == 0) goto L_0x00aa
            java.lang.Class<eb.f> r0 = p958eb.C86475f.class
            java.lang.Object r11 = r11.mo125517G0(r0)
            r4 = r11
            eb.f r4 = (p958eb.C86475f) r4
        L_0x00aa:
            if (r4 != 0) goto L_0x00bb
            java.lang.String r11 = r9.f255208f
            java.lang.String r0 = "setupWebGLEnv, webGLExt is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r8.invoke(r11)
            goto L_0x01fc
        L_0x00bb:
            com.tencent.magicbrush.a r11 = r4.mo120910U()
            if (r11 != 0) goto L_0x00d0
            java.lang.String r11 = r9.f255208f
            java.lang.String r0 = "setupWebGLEnv, mbRuntime is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r8.invoke(r11)
            goto L_0x01fc
        L_0x00d0:
            r9.f255220u = r11
            com.tencent.magicbrush.ui.MagicBrushView r0 = new com.tencent.magicbrush.ui.MagicBrushView
            android.content.Context r4 = r6.getContext()
            java.lang.String r7 = "insertComponent.context"
            gy3.C87412m.m108593f(r4, r7)
            r0.<init>((android.content.Context) r4, (com.tencent.magicbrush.p941ui.MagicBrushView.C80319b) r9)
            r0.setMagicBrush(r11)
            xd.c r4 = r0.getPreparedListeners()
            ku0.f r7 = new ku0.f
            r7.<init>(r11, r9, r8)
            r4.mo125229a(r7)
            r0.setEnableTouchEvent(r5)
            xk0.a$b r4 = xk0.C91259a.f261849c
            java.lang.String r5 = r6.getAppId()
            gy3.C87412m.m108593f(r5, r2)
            xk0.a r2 = r4.mo125282a(r5)
            cd.q r4 = r9.f255206d
            int r4 = r4.f253971d
            r2.mo125278a(r4, r0)
            com.tencent.magicbrush.ext_texture.MBExternalTextureMgr r2 = r11.f235097m
            rd.b r4 = new rd.b
            r4.<init>(r11, r3)
            r2.mo111603b(r3, r4)
            r9.f255221v = r0
            r9.mo122667E()
            r6.mo114868y(r9)
            r6.mo114864j(r9)
            boolean r11 = r6.f244563P
            if (r11 == 0) goto L_0x01fc
            java.lang.String r11 = r9.f255208f
            java.lang.String r0 = "setupWebGLEnv, isInForeground"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r9.mo122666D()
            goto L_0x01fc
        L_0x012c:
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = r9.f255208f
            java.lang.String r1 = "startCustomVideoCaptureIfNeed, insertComponent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
        L_0x0136:
            if (r11 == 0) goto L_0x013d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.invoke(r0)
        L_0x013d:
            r1 = 0
            goto L_0x01fc
        L_0x0140:
            if (r0 == 0) goto L_0x014a
            java.lang.String r6 = r9.f255208f
            java.lang.String r7 = "stopCustomVideoCaptureIfNeed"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
        L_0x014a:
            r9.mo122669G()
            if (r0 == 0) goto L_0x0156
            java.lang.String r6 = r9.f255208f
            java.lang.String r7 = "destroyWebGLExtTextureIfNeed"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
        L_0x0156:
            boolean r6 = r9.f255217r
            if (r6 != 0) goto L_0x0162
            java.lang.String r3 = r9.f255208f
            java.lang.String r4 = "destroyWebGLExtTextureIfNeed, has not registerSurface"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            goto L_0x0188
        L_0x0162:
            com.tencent.magicbrush.a r6 = r9.f255220u
            if (r6 != 0) goto L_0x0170
            if (r0 == 0) goto L_0x0188
            java.lang.String r3 = r9.f255208f
            java.lang.String r4 = "destroyWebGLExtTextureIfNeed, mbRuntime is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            goto L_0x0188
        L_0x0170:
            java.lang.String r7 = r9.f255208f
            java.lang.String r8 = "destroyWebGLExtTextureIfNeed, unregisterSurface"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            r9.f255218s = r4
            com.tencent.magicbrush.ext_texture.MBExternalTextureMgr r4 = r6.f235097m
            rd.a r3 = r4.mo111602a(r3)
            cd.q r4 = r9.f255206d
            int r4 = r4.f253971d
            r3.mo124244d(r4)
            r9.f255217r = r5
        L_0x0188:
            if (r0 == 0) goto L_0x0191
            java.lang.String r0 = r9.f255208f
            java.lang.String r3 = "destroyWebGLEnvIfNeed"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)
        L_0x0191:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.t1> r0 = r9.f255209g
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.t1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r0
            if (r0 == 0) goto L_0x01bd
            r0.mo114863i(r9)
            r0.mo114866q(r9)
            xk0.a$b r3 = xk0.C91259a.f261849c
            java.lang.String r0 = r0.getAppId()
            gy3.C87412m.m108593f(r0, r2)
            xk0.a r0 = r3.mo125282a(r0)
            cd.q r2 = r9.f255206d
            int r2 = r2.f253971d
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, xk0.a$c> r0 = r0.f261852b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
        L_0x01bd:
            zt3.t r0 = zt3.C119157j.f356862d
            ku0.d r2 = new ku0.d
            r2.<init>(r9)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r9.f255224y
            int r0 = r0.get()
            if (r0 == 0) goto L_0x01f5
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.t1> r2 = r9.f255209g
            if (r2 == 0) goto L_0x01f5
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.appbrand.page.t1 r2 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r2
            if (r2 == 0) goto L_0x01f5
            com.tencent.mm.plugin.appbrand.jsruntime.i r2 = ku0.C88307l.m110074a(r2)
            if (r2 == 0) goto L_0x01f5
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.q> r3 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r2 = r2.mo63321n0(r3)
            com.tencent.mm.plugin.appbrand.jsruntime.q r2 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q) r2
            if (r2 == 0) goto L_0x01f5
            ku0.k r3 = new ku0.k
            r3.<init>(r9, r0)
            r2.post(r3)
        L_0x01f5:
            if (r11 == 0) goto L_0x01fc
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.invoke(r0)
        L_0x01fc:
            if (r1 == 0) goto L_0x0200
            r9.f255216q = r10
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ku0.C88288a.mo122670H(boolean, fy3.l):void");
    }

    /* renamed from: I */
    public final boolean mo122671I(C91165a aVar) {
        boolean z = this.f255210h;
        JSONObject b = aVar.mo62539b();
        boolean optBoolean = b != null ? b.optBoolean("enableVideoCustomRender", z) : z;
        boolean z2 = this.f255211i;
        JSONObject b2 = aVar.mo62539b();
        boolean optBoolean2 = b2 != null ? b2.optBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, z2) : z2;
        String str = this.f255212j ? "front" : "back";
        JSONObject b3 = aVar.mo62539b();
        String optString = b3 != null ? b3.optString(V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, str) : null;
        if (optString == null) {
            optString = str;
        }
        boolean b4 = C87412m.m108589b("front", optString);
        boolean z3 = (optBoolean == z && optBoolean2 == z2 && C87412m.m108589b(optString, str)) ? false : true;
        this.f255210h = optBoolean;
        this.f255211i = optBoolean2;
        this.f255212j = b4;
        String str2 = this.f255208f;
        Log.m105924i(str2, "updateConfig, enableVideoCustomRender: " + optBoolean + ", enableCameraPreview: " + optBoolean2 + ", useFrontCamera: " + b4 + ", isConfigUpdated: " + z3);
        if (z3) {
            if (optBoolean && optBoolean2) {
                Log.m105924i(this.f255208f, "override enableCameraPreview to false");
                JSONObject b5 = aVar.mo62539b();
                if (b5 != null) {
                    b5.put(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, false);
                }
            } else if (!optBoolean && optBoolean2) {
                Log.m105924i(this.f255208f, "recover enableCameraPreview to true");
                JSONObject b6 = aVar.mo62539b();
                if (b6 != null) {
                    b6.put(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, true);
                }
            }
        }
        return z3;
    }

    /* renamed from: b */
    public void mo22089b() {
        C83928t1 t1Var;
        C80301a aVar;
        C83928t1 t1Var2;
        AppBrandRuntimeWC J1;
        if (f255200F) {
            Log.m105918d(this.f255208f, "onBackground");
        }
        mo122669G();
        WeakReference<C83928t1> weakReference = this.f255209g;
        boolean z = true;
        if (weakReference == null || (t1Var2 = weakReference.get()) == null || (J1 = t1Var2.getRuntime()) == null || true != J1.mo113064k0()) {
            z = false;
        }
        if (!z) {
            WeakReference<C83928t1> weakReference2 = this.f255209g;
            if (weakReference2 == null || (t1Var = weakReference2.get()) == null) {
                Log.m105920e("MicroMsg.AppBrandVideoCustomRenderProcessor", "notifyBackgroundIfCan, insertComponent is null");
                return;
            }
            C91259a.C91261b bVar = C91259a.f261849c;
            String appId = t1Var.getAppId();
            C87412m.m108593f(appId, "insertComponent.appId");
            C91259a a = bVar.mo125282a(appId);
            a.mo125279b(this.f255206d.f253971d);
            if (a.mo125281d() == 0 && (aVar = this.f255220u) != null) {
                aVar.mo111504c();
            }
        }
    }

    /* renamed from: c */
    public void mo22090c() {
        C13598b0 b0Var;
        boolean z = f255200F;
        if (z) {
            Log.m105918d(this.f255208f, "onForeground");
        }
        mo122666D();
        SurfaceTexture surfaceTexture = this.f255218s;
        if (surfaceTexture != null) {
            mo122668F(surfaceTexture);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null && z) {
            Log.m105918d(this.f255208f, "onForeground, cameraPreviewSurface is null");
        }
    }

    /* renamed from: d */
    public void mo120972d(int i) {
        if (f255200F) {
            String str = this.f255208f;
            Log.m105918d(str, "onGestureScale, scale: " + i);
        }
        C112405g gVar = this.f255219t;
        if (gVar != null) {
            gVar.mo143171j(true, false, i);
        }
    }

    /* renamed from: e */
    public boolean mo120973e(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
        boolean z = f255200F;
        if (z) {
            String str = this.f255208f;
            Log.m105918d(str, "onPreHandleJsApi, data: " + aVar.mo62539b());
        }
        String f = aVar.mo62543f();
        if (!(f != null && true == C112550d0.m153801u(f, "operate", false))) {
            if (z) {
                Log.m105918d(this.f255208f, "onPreHandleJsApi, not operate call");
            }
            return false;
        }
        JSONObject b = aVar.mo62539b();
        if (b == null) {
            Log.m105920e(this.f255208f, "onPreOperateJsApiCall, params is null");
        } else if (C87412m.m108589b("sendCustomVideoFrame", b.optString("type"))) {
            if (!this.f255207e.isPushing()) {
                Log.m105924i(this.f255208f, "onPreOperateJsApiCall, prevent sendCustomVideoFrame before start pushing");
                aVar.mo62551l(C86920e.f252311a);
                return true;
            }
            try {
                int i = b.getInt("bufferId");
                try {
                    int i2 = b.getInt("rotation");
                    try {
                        int i3 = b.getInt("width");
                        try {
                            int i4 = b.getInt("height");
                            C83183s C = mo122665C();
                            ByteBuffer S = C != null ? C.mo115398S(i) : null;
                            if (S == null) {
                                Log.m105920e(this.f255208f, "onPreOperateJsApiCall, videoFrameBuffer is null");
                                aVar.mo62552m("fail:videoFrameBuffer is null", C86920e.f252314d);
                                return true;
                            }
                            byte[] bArr = new byte[((int) (((float) i3) * 1.5f * ((float) i4)))];
                            S.rewind();
                            S.get(bArr);
                            this.f255206d.mo110217G(new C88299e(this, bArr, i3, i4, i2, aVar));
                            return true;
                        } catch (Exception unused) {
                            Log.m105920e(this.f255208f, "onPreOperateJsApiCall, height is null");
                            aVar.mo62552m("fail:height is null", C86920e.f252314d);
                            return true;
                        }
                    } catch (Exception unused2) {
                        Log.m105920e(this.f255208f, "onPreOperateJsApiCall, width is null");
                        aVar.mo62552m("fail:width is null", C86920e.f252314d);
                        return true;
                    }
                } catch (Exception unused3) {
                    Log.m105920e(this.f255208f, "onPreOperateJsApiCall, rotation is null");
                    aVar.mo62552m("fail:rotation is null", C86920e.f252314d);
                    return true;
                }
            } catch (Exception unused4) {
                Log.m105920e(this.f255208f, "onPreOperateJsApiCall, bufferId is null");
                aVar.mo62552m("fail:bufferId is null", C86920e.f252314d);
                return true;
            }
        }
        return false;
    }

    public Object getSurface() {
        return MagicBrushView.C80319b.C80320a.m97787a(this);
    }

    public View getThisView() {
        return null;
    }

    public MagicBrushView.C80327h getViewType() {
        return this.f255205D;
    }

    /* renamed from: k */
    public void mo120974k(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
        if (f255200F) {
            String str = this.f255208f;
            Log.m105918d(str, "onPreUpdateJsApiCall, data: " + aVar.mo62539b());
        }
        if (mo122671I(aVar)) {
            mo122664B();
        }
    }

    /* renamed from: l */
    public void mo111654l(boolean z, int i, C32226l<? super Boolean, Void> lVar, MBRuntime mBRuntime) {
        C87412m.m108594g(lVar, "callback");
        C87412m.m108594g(mBRuntime, "runtime");
        if (f255200F) {
            String str = this.f255208f;
            Log.m105918d(str, "switchRenderMode, forceRecreate: " + z + ", renderModeFlag: " + i + ", runtime: " + mBRuntime);
        }
    }

    /* renamed from: n */
    public void mo120975n(int i) {
        if (f255200F) {
            String str = this.f255208f;
            Log.m105918d(str, "onDeviceOrientationChange, rotation: " + i);
        }
        this.f255223x = i;
    }

    /* renamed from: o */
    public void mo120976o(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
        if (f255200F) {
            String str = this.f255208f;
            Log.m105918d(str, "onPreInsertJsApiCall, data: " + aVar.mo62539b());
        }
        C82381f g = aVar.mo62544g();
        if (g instanceof C83928t1) {
            this.f255209g = new WeakReference<>(g);
            mo122671I(aVar);
            mo122664B();
        }
    }

    public void onDestroy() {
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C83928t1 t1Var;
        C83181q qVar;
        boolean z = f255200F;
        if (z) {
            String str = this.f255208f;
            Log.m105926v(str, "onFrameAvailable, surfaceTexture: " + surfaceTexture);
        }
        if (!this.f255210h) {
            Log.m105924i(this.f255208f, "onFrameAvailable, videoCustomRender is not enable");
            return;
        }
        WeakReference<C83928t1> weakReference = this.f255209g;
        if (weakReference != null && (t1Var = weakReference.get()) != null) {
            int i = this.f255206d.f253971d;
            int i2 = this.f255223x;
            if (z) {
                String str2 = this.f255208f;
                Log.m105918d(str2, "onFrameAvailable, livePusherId: " + i + ", deviceOrientationRotation: " + i2);
            }
            C88292d dVar = this.f255225z;
            dVar.getClass();
            C83165i a = C88307l.m110074a(t1Var);
            if (a != null && (qVar = (C83181q) a.mo63321n0(C83181q.class)) != null) {
                C88290b bVar = new C88290b();
                bVar.mo115165o(C90364q0.m113147f(new C13604l("livePusherId", Integer.valueOf(i)), new C13604l("deviceOrientationRotation", Integer.valueOf(i2))));
                C88293e eVar = dVar.f255227b;
                eVar.getClass();
                eVar.f255228a = bVar;
                qVar.post(new C88307l.C61171a(new C88296b(dVar, t1Var)));
            }
        } else if (z) {
            Log.m105918d(this.f255208f, "onFrameAvailable, insertComponent is null");
        }
    }

    /* renamed from: q */
    public void mo120977q() {
        boolean z = f255200F;
        if (z) {
            Log.m105918d(this.f255208f, "onPreviewSurfacePreRelease");
        }
        mo122670H(false, (C32226l<? super Boolean, C13598b0>) null);
        MagicBrushView.C80321c cVar = this.f255222w;
        if (cVar != null) {
            Surface surface = this.f255213n;
            if (surface != null) {
                Log.m105924i(this.f255208f, "notifyPreviewSurfaceReleaseIfCan, do notify");
                cVar.mo55505e(surface, false);
            } else if (z) {
                Log.m105918d(this.f255208f, "notifyPreviewSurfaceReleaseIfCan, previewSurface is null");
            }
        } else if (z) {
            Log.m105918d(this.f255208f, "notifyPreviewSurfaceReleaseIfCan, surfaceListener is null");
        }
        this.f255213n = null;
    }

    /* renamed from: r */
    public void mo120978r(PointF pointF) {
        C87412m.m108594g(pointF, "pos");
        boolean z = f255200F;
        if (z) {
            String str = this.f255208f;
            Log.m105918d(str, "onFocusPositionChange, pos: " + pointF);
        }
        Size size = C87412m.m108589b(f255201G, this.f255214o) ? null : this.f255214o;
        if (size != null) {
            C112405g gVar = this.f255219t;
            if (gVar != null) {
                gVar.mo143140A(gVar.mo143167g(pointF.x, pointF.y, 1.25f, size.getWidth(), size.getHeight()), gVar.mo143167g(pointF.x, pointF.y, 1.0f, size.getWidth(), size.getHeight()));
            }
        } else if (z) {
            Log.m105918d(this.f255208f, "startCustomVideoCaptureIfNeed, previewSurfaceSize is null");
        }
    }

    /* renamed from: s */
    public C86502b mo120979s() {
        return this.f255202A;
    }

    public void setSurfaceListener(MagicBrushView.C80321c cVar) {
        if (f255200F) {
            String str = this.f255208f;
            Log.m105918d(str, "setSurfaceListener, surfaceListener: " + cVar);
        }
        this.f255222w = cVar;
        mo122667E();
    }

    /* renamed from: t */
    public C86504d mo120980t() {
        return this.f255204C;
    }

    /* renamed from: u */
    public void mo120981u(Size size) {
        C87412m.m108594g(size, "size");
        boolean z = f255200F;
        if (z) {
            String str = this.f255208f;
            Log.m105918d(str, "onPreviewSurfaceSizeUpdate, size: " + size);
        }
        this.f255214o = size;
        MagicBrushView.C80321c cVar = this.f255222w;
        if (cVar != null) {
            Surface surface = this.f255213n;
            if (surface != null) {
                Log.m105924i(this.f255208f, "notifyPreviewSurfaceSizeUpdateIfCan, do notify");
                cVar.mo55504b(surface, size.getWidth(), size.getHeight());
            } else if (z) {
                Log.m105918d(this.f255208f, "notifyPreviewSurfaceSizeUpdateIfCan, previewSurface is null");
            }
        } else if (z) {
            Log.m105918d(this.f255208f, "notifyPreviewSurfaceSizeUpdateIfCan, surfaceListener is null");
        }
        mo122664B();
        mo122663A(size);
    }

    /* renamed from: w */
    public void mo120982w(Surface surface) {
        C87412m.m108594g(surface, "previewSurface");
        if (f255200F) {
            String str = this.f255208f;
            Log.m105918d(str, "onPreviewSurfaceReady, previewSurface: " + surface);
        }
        this.f255213n = surface;
        mo122667E();
        mo122664B();
    }

    /* renamed from: z */
    public C86503c mo120983z() {
        return this.f255203B;
    }
}
