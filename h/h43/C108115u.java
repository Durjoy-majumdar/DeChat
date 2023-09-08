package h43;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l33.C109247e;
import p80.C110194c;
import rx3.C13598b0;
import u33.C111130b;
import w80.C111742d;
import z33.C112595h;

/* renamed from: h43.u */
public final class C108115u {

    /* renamed from: a */
    public int f323738a;

    /* renamed from: b */
    public int f323739b;

    /* renamed from: c */
    public C111742d.C65942b f323740c;

    /* renamed from: d */
    public C108107q0 f323741d;

    /* renamed from: e */
    public SurfaceTexture f323742e;

    /* renamed from: f */
    public Surface f323743f;

    /* renamed from: g */
    public boolean f323744g;

    /* renamed from: h */
    public C110194c f323745h;

    /* renamed from: i */
    public boolean f323746i;

    /* renamed from: j */
    public boolean f323747j;

    /* renamed from: k */
    public C32226l<? super C108115u, C13598b0> f323748k;

    /* renamed from: l */
    public ArrayList<C32228q<ByteBuffer, Integer, Integer, C13598b0>> f323749l;

    /* renamed from: m */
    public ArrayList<C32226l<C110194c, C13598b0>> f323750m;

    /* renamed from: n */
    public boolean f323751n;

    /* renamed from: o */
    public C32224a<C13598b0> f323752o;

    /* renamed from: p */
    public boolean f323753p;

    /* renamed from: q */
    public int f323754q;

    public C108115u() {
        this(0, 0);
    }

    /* renamed from: a */
    public static final void m146448a(C108115u uVar) {
        if (!uVar.f323751n) {
            Log.m105924i("MicroMsg.PboSurfaceRender", "onPreviewTextureFrameAvailable, looper:" + Looper.myLooper());
            uVar.f323751n = true;
        }
        uVar.mo158524c(new C108100n(uVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 != false) goto L_0x0067;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m146449b(h43.C108115u r5) {
        /*
            android.graphics.SurfaceTexture r0 = r5.f323742e
            if (r0 == 0) goto L_0x006c
            boolean r1 = r5.f323747j
            if (r1 == 0) goto L_0x0009
            goto L_0x006c
        L_0x0009:
            p80.c r1 = r5.f323745h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0015
            boolean r1 = r1.f329651d
            if (r1 != r2) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            java.lang.String r4 = "MicroMsg.PboSurfaceRender"
            if (r1 != 0) goto L_0x0067
            r1 = 26
            boolean r1 = p206nj.C11171e.m11046c(r1)
            if (r1 == 0) goto L_0x0031
            android.graphics.SurfaceTexture r1 = r5.f323742e
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.isReleased()
            if (r1 != r2) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 == 0) goto L_0x0031
            goto L_0x0067
        L_0x0031:
            r0.updateTexImage()     // Catch:{ Exception -> 0x0035 }
            goto L_0x003e
        L_0x0035:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "updateTexImage error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)
        L_0x003e:
            h43.q0 r0 = r5.f323741d
            if (r0 == 0) goto L_0x0045
            r0.mo162879m()
        L_0x0045:
            boolean r0 = r5.f323744g
            if (r0 == 0) goto L_0x006c
            java.util.ArrayList<fy3.l<p80.c, rx3.b0>> r0 = r5.f323750m
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r0.next()
            fy3.l r1 = (fy3.C32226l) r1
            h43.q0 r2 = r5.f323741d
            if (r2 == 0) goto L_0x0062
            p80.c r2 = r2.f323714D
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            r1.invoke(r2)
            goto L_0x004f
        L_0x0067:
            java.lang.String r5 = "render external texture is released"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h43.C108115u.m146449b(h43.u):void");
    }

    /* renamed from: d */
    public static void m146450d(C108115u uVar, C108091j jVar, C32226l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        uVar.getClass();
        C87412m.m108594g(jVar, "glSurface");
        uVar.mo158524c(new C108102o(uVar, jVar, lVar));
    }

    /* renamed from: c */
    public final void mo158524c(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        if (C109247e.vx0().mo163047a(0) == null) {
            Log.m105920e("MicroMsg.PboSurfaceRender", "render thread unable init");
        }
        C111130b a = C109247e.vx0().mo163047a(0);
        if (a != null) {
            a.mo162869c(aVar);
        }
    }

    /* renamed from: e */
    public final void mo158525e(Size size) {
        C87412m.m108594g(size, "cameraSize");
        Log.printInfoStack("MicroMsg.PboSurfaceRender", "updatePboAndWindowsSize is " + size.getWidth() + " and " + size.getHeight(), new Object[0]);
        C108107q0 q0Var = this.f323741d;
        if (q0Var != null) {
            q0Var.mo143263u(size.getWidth(), size.getHeight());
        }
        size.getWidth();
        size.getHeight();
    }

    public C108115u(int i, int i2) {
        this.f323738a = i;
        this.f323739b = i2;
        this.f323749l = new ArrayList<>();
        this.f323750m = new ArrayList<>();
        this.f323753p = C112595h.f337166a.mo164369c();
        this.f323744g = false;
    }
}
