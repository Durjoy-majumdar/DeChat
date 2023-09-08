package s80;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kj2.C117407d;
import p80.C110193b;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111139a;
import v80.C111412a;
import w80.C111742d;

/* renamed from: s80.a */
public abstract class C110777a implements GLSurfaceView.Renderer {

    /* renamed from: a */
    public int f331376a;

    /* renamed from: b */
    public int f331377b;

    /* renamed from: c */
    public int f331378c;

    /* renamed from: d */
    public int f331379d;

    /* renamed from: e */
    public int f331380e;

    /* renamed from: f */
    public int f331381f;

    /* renamed from: g */
    public C111139a f331382g;

    /* renamed from: h */
    public byte[] f331383h;

    /* renamed from: i */
    public SurfaceTexture f331384i;

    /* renamed from: j */
    public C110194c f331385j;

    /* renamed from: k */
    public boolean f331386k;

    /* renamed from: l */
    public boolean f331387l;

    /* renamed from: m */
    public int f331388m;

    /* renamed from: n */
    public int f331389n;

    /* renamed from: o */
    public boolean f331390o;

    /* renamed from: p */
    public C110778a f331391p;

    /* renamed from: q */
    public C32226l<? super SurfaceTexture, C13598b0> f331392q;

    /* renamed from: r */
    public C32224a<C13598b0> f331393r;

    /* renamed from: s */
    public boolean f331394s;

    /* renamed from: s80.a$b */
    public static final class C90152b implements SurfaceTexture.OnFrameAvailableListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l f258851d;

        public C90152b(C32226l lVar) {
            this.f258851d = lVar;
        }

        public final /* synthetic */ void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.f258851d.invoke(surfaceTexture);
        }
    }

    /* renamed from: s80.a$a */
    public static final class C110778a {

        /* renamed from: a */
        public long f331395a;

        /* renamed from: b */
        public int f331396b;

        /* renamed from: c */
        public long f331397c;

        /* renamed from: d */
        public long f331398d;

        /* renamed from: e */
        public long f331399e;
    }

    public C110777a() {
        this(0, 0, 0, 0, 0, 0, 63, (C8480h) null);
    }

    public C110777a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f331376a = i;
        this.f331377b = i2;
        this.f331378c = i3;
        this.f331379d = i4;
        this.f331380e = i5;
        this.f331381f = i6;
        this.f331388m = -1;
        this.f331391p = new C110778a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r5 == false) goto L_0x0027;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m150772l(s80.C110777a r1, byte[] r2, boolean r3, int r4, java.lang.Object r5) {
        /*
            if (r5 != 0) goto L_0x0042
            r4 = r4 & 2
            r5 = 1
            if (r4 == 0) goto L_0x0008
            r3 = 1
        L_0x0008:
            r1.getClass()
            java.lang.String r4 = "frame"
            gy3.C87412m.m108594g(r2, r4)
            if (r3 == 0) goto L_0x0033
            byte[] r3 = r1.f331383h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r3)
            r4 = 0
            if (r3 != 0) goto L_0x0027
            byte[] r3 = r1.f331383h
            if (r3 == 0) goto L_0x0024
            int r3 = r3.length
            int r0 = r2.length
            if (r3 != r0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            if (r5 != 0) goto L_0x002c
        L_0x0027:
            int r3 = r2.length
            byte[] r3 = new byte[r3]
            r1.f331383h = r3
        L_0x002c:
            byte[] r3 = r1.f331383h
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r4, r3, r4, r5)
            goto L_0x0035
        L_0x0033:
            r1.f331383h = r2
        L_0x0035:
            u80.a r2 = r1.f331382g
            if (r2 == 0) goto L_0x0041
            byte[] r1 = r1.f331383h
            gy3.C87412m.m108591d(r1)
            r2.mo162880o(r1)
        L_0x0041:
            return
        L_0x0042:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: input"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s80.C110777a.m150772l(s80.a, byte[], boolean, int, java.lang.Object):void");
    }

    /* renamed from: o */
    public static /* synthetic */ void m150773o(C110777a aVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            aVar.mo157956n(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: release");
    }

    /* renamed from: f */
    public abstract C111139a mo157952f();

    /* renamed from: g */
    public C110194c mo157953g() {
        return this.f331385j;
    }

    /* renamed from: h */
    public int mo162332h() {
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            return aVar.f332769x;
        }
        return 0;
    }

    /* renamed from: i */
    public int mo162333i() {
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            return aVar.f332768w;
        }
        return 0;
    }

    /* renamed from: j */
    public C110194c mo157954j() {
        return this.f331385j;
    }

    /* renamed from: k */
    public void mo157955k(boolean z) {
        if (this.f331394s) {
            Log.printInfoStack("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " initRenderProcInGlesThread, already init", new Object[0]);
            return;
        }
        this.f331387l = z;
        this.f331382g = mo157952f();
        Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " exec func initGLTextureRender  mirror : " + this.f331390o);
        mo159590t(this.f331378c, this.f331379d);
        mo159591u(this.f331376a, this.f331377b);
        mo159589r(this.f331389n);
        mo159588m(this.f331390o);
        if (this.f331387l && (this.f331384i == null || this.f331388m <= 0)) {
            this.f331385j = C110193b.m149776b(false, 12);
            GLES20.glFinish();
            C110194c cVar = this.f331385j;
            int i = -1;
            if (cVar != null) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(cVar.f329652e);
                C32226l<? super SurfaceTexture, C13598b0> lVar = this.f331392q;
                surfaceTexture.setOnFrameAvailableListener(lVar != null ? new C90152b(lVar) : null);
                this.f331384i = surfaceTexture;
                C110194c cVar2 = this.f331385j;
                if ((cVar2 != null ? cVar2.f329652e : -1) <= 0) {
                    Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", "markCreateExternalTextureFailed");
                    C117407d.INSTANCE.mo182089r(985, 55, 1);
                }
                Log.printInfoStack("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " createSurfaceTexture:" + this.f331385j, new Object[0]);
            }
            C110194c cVar3 = this.f331385j;
            if (cVar3 != null) {
                i = cVar3.f329652e;
            }
            this.f331388m = i;
            C111139a aVar = this.f331382g;
            if (aVar != null) {
                aVar.mo159578p(i);
            }
        }
        Log.printInfoStack("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " createSurfaceTexture:" + z + ", surfaceTexture:" + this.f331384i, new Object[0]);
        this.f331394s = true;
    }

    /* renamed from: m */
    public void mo159588m(boolean z) {
        Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " set mirror: " + z);
        this.f331390o = z;
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.mo158479j(z);
        }
    }

    /* renamed from: n */
    public void mo157956n(boolean z) {
        SurfaceTexture surfaceTexture;
        Log.printInfoStack("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " called release, shouldDestroySurfaceTexture: " + z + ", externalTextureObj:" + this.f331385j + ", surfaceTexture:" + this.f331384i, new Object[0]);
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.mo158471l();
        }
        C110194c cVar = this.f331385j;
        if (cVar != null) {
            cVar.close();
        }
        this.f331385j = null;
        GLES20.glFinish();
        if (z && (surfaceTexture = this.f331384i) != null) {
            surfaceTexture.release();
        }
        synchronized (this) {
            this.f331384i = null;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        this.f331394s = false;
    }

    public void onDrawFrame(GL10 gl10) {
        if (this.f331386k) {
            Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", "do clear frame");
            this.f331386k = false;
        } else if (this.f331383h == null && this.f331388m == -1) {
            Log.m105920e("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " there is no input ,do you dismiss setting input");
        } else {
            C110778a aVar = this.f331391p;
            aVar.getClass();
            long currentTicks = Util.currentTicks();
            aVar.f331397c = currentTicks;
            if (aVar.f331398d == 0) {
                aVar.f331398d = currentTicks;
            }
            mo157957p();
            C110778a aVar2 = this.f331391p;
            aVar2.f331396b++;
            aVar2.f331395a += Util.ticksToNow(aVar2.f331397c);
            aVar2.f331399e = Util.currentTicks();
            if (this.f331387l) {
                C111412a.f333531a.mo163073a(false);
            }
            C32224a<C13598b0> aVar3 = this.f331393r;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " onSurfaceChanged width:" + i + ", height:" + i2);
        mo159590t(i, i2);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " onSurfaceCreated");
        C111742d.f334647a.mo163463f();
    }

    /* renamed from: p */
    public void mo157957p() {
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.mo162879m();
        }
    }

    /* renamed from: q */
    public void mo162335q(C32226l<? super IntBuffer, C13598b0> lVar) {
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        StringBuilder sb = new StringBuilder();
        sb.append("glTextureRenderProc is null ?");
        sb.append(this.f331382g == null);
        Log.printInfoStack("MicroMsg.Media.AbsSurfaceRenderer", sb.toString(), new Object[0]);
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.f332762q = lVar;
        }
    }

    /* renamed from: r */
    public void mo159589r(int i) {
        Log.printInfoStack("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " change rotate ,old degree : " + this.f331389n + " , new degree : " + i, new Object[0]);
        this.f331389n = i;
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.mo143262q(i);
        }
    }

    /* renamed from: s */
    public void mo162336s() {
        Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", "takePhoto");
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.f332766u = true;
        }
    }

    /* renamed from: t */
    public void mo159590t(int i, int i2) {
        Log.printInfoStack("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " updateDrawViewSize ,width : " + i + " , height : " + i2, new Object[0]);
        this.f331378c = i;
        this.f331379d = i2;
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.mo158522s(i, i2);
        }
    }

    /* renamed from: u */
    public void mo159591u(int i, int i2) {
        Log.printInfoStack("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " updateTextureSize ,width : " + i + " , height : " + i2, new Object[0]);
        this.f331376a = i;
        this.f331377b = i2;
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.mo143263u(i, i2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C110777a(int r5, int r6, int r7, int r8, int r9, int r10, int r11, gy3.C8480h r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = 0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r6
        L_0x000e:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0014
            r1 = r12
            goto L_0x0015
        L_0x0014:
            r1 = r7
        L_0x0015:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r8
        L_0x001c:
            r5 = r11 & 16
            r6 = 1
            if (r5 == 0) goto L_0x0023
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = r9
        L_0x0024:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002a
            r11 = 1
            goto L_0x002b
        L_0x002a:
            r11 = r10
        L_0x002b:
            r5 = r4
            r6 = r12
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s80.C110777a.<init>(int, int, int, int, int, int, int, gy3.h):void");
    }
}
