package h43;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Size;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicBoolean;
import l33.C109247e;
import p80.C110194c;
import rx3.C13598b0;
import u33.C111130b;
import w80.C111742d;

/* renamed from: h43.f */
public abstract class C108073f {

    /* renamed from: a */
    public boolean f323608a;

    /* renamed from: b */
    public final String f323609b = ("MicroMsg.WindowSurfaceRenderer@" + hashCode());

    /* renamed from: c */
    public volatile boolean f323610c = false;

    /* renamed from: d */
    public AtomicBoolean f323611d = new AtomicBoolean(false);

    /* renamed from: e */
    public C108091j f323612e;

    /* renamed from: f */
    public C108091j f323613f;

    /* renamed from: g */
    public C108091j f323614g;

    /* renamed from: h */
    public C108091j f323615h;

    /* renamed from: i */
    public C111742d.C65942b f323616i;

    /* renamed from: j */
    public C108109r0 f323617j;

    /* renamed from: k */
    public C110194c f323618k;

    /* renamed from: l */
    public int f323619l;

    /* renamed from: m */
    public int f323620m;

    /* renamed from: n */
    public SurfaceTexture f323621n;

    /* renamed from: o */
    public Surface f323622o;

    /* renamed from: p */
    public int f323623p = (this.f323608a ^ true ? 1 : 0);

    /* renamed from: q */
    public C32228q<? super Size, ? super Integer, ? super Integer, C13598b0> f323624q;

    /* renamed from: h43.f$a */
    public static final class C108074a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108073f f323625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108074a(C108073f fVar) {
            super(0);
            this.f323625d = fVar;
        }

        public Object invoke() {
            Log.m105924i(this.f323625d.f323609b, "do WindowSurfaceRenderer release");
            C108073f fVar = this.f323625d;
            fVar.mo158484f(fVar.f323612e, 0);
            C108073f fVar2 = this.f323625d;
            fVar2.mo158484f(fVar2.f323613f, 1);
            C108073f fVar3 = this.f323625d;
            fVar3.mo158484f(fVar3.f323614g, 0);
            C108073f fVar4 = this.f323625d;
            fVar4.mo158484f(fVar4.f323615h, 0);
            Surface surface = this.f323625d.f323622o;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture surfaceTexture = this.f323625d.f323621n;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            C110194c cVar = this.f323625d.f323618k;
            if (cVar != null) {
                cVar.close();
            }
            C108109r0 r0Var = this.f323625d.f323617j;
            if (r0Var != null) {
                r0Var.mo158471l();
            }
            C108073f fVar5 = this.f323625d;
            if (fVar5.f323616i != null) {
                fVar5.f323613f = null;
                fVar5.f323612e = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h43.f$b */
    public static final class C108075b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108091j f323626d;

        /* renamed from: e */
        public final /* synthetic */ C108073f f323627e;

        /* renamed from: f */
        public final /* synthetic */ int f323628f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108075b(C108091j jVar, C108073f fVar, int i) {
            super(0);
            this.f323626d = jVar;
            this.f323627e = fVar;
            this.f323628f = i;
        }

        public Object invoke() {
            C108091j jVar = this.f323626d;
            if (jVar != null) {
                C111742d.C65942b bVar = this.f323627e.f323616i;
                if ((bVar != null ? bVar.f189591a : null) != null) {
                    if (!C87412m.m108589b(jVar.mo158508a(), EGL14.EGL_NO_SURFACE)) {
                        C111742d.C65942b bVar2 = this.f323627e.f323616i;
                        EGL14.eglDestroySurface(bVar2 != null ? bVar2.f189591a : null, this.f323626d.mo158508a());
                    } else {
                        C111742d.C65942b bVar3 = this.f323627e.f323616i;
                        if (!C87412m.m108589b(bVar3 != null ? bVar3.f189592b : null, EGL14.EGL_NO_SURFACE)) {
                            C111742d.C65942b bVar4 = this.f323627e.f323616i;
                            EGL14.eglDestroySurface(bVar4 != null ? bVar4.f189591a : null, bVar4 != null ? bVar4.f189592b : null);
                        }
                    }
                }
                C108091j jVar2 = this.f323626d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                C87412m.m108593f(eGLSurface, "EGL_NO_SURFACE");
                jVar2.getClass();
                jVar2.f323686c = eGLSurface;
                C108073f fVar = this.f323627e;
                C111742d.C65942b bVar5 = fVar.f323616i;
                if (bVar5 != null) {
                    bVar5.f189592b = EGL14.EGL_NO_SURFACE;
                }
                if (this.f323628f == 0) {
                    if (C87412m.m108589b(fVar.f323612e, this.f323626d)) {
                        this.f323627e.f323612e = null;
                    }
                } else if (C87412m.m108589b(fVar.f323613f, this.f323626d)) {
                    this.f323627e.f323613f = null;
                }
                String str = this.f323627e.f323609b;
                Log.m105924i(str, "remove render surface :" + this.f323626d);
            } else {
                Log.m105920e(this.f323627e.f323609b, "remove a null surface");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h43.f$c */
    public static final class C108076c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108073f f323629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108076c(C108073f fVar) {
            super(0);
            this.f323629d = fVar;
        }

        public Object invoke() {
            this.f323629d.f323610c = true;
            return C13598b0.f38549a;
        }
    }

    public C108073f(boolean z, int i) {
        this.f323608a = z;
    }

    /* renamed from: c */
    public static /* synthetic */ void m146393c(C108073f fVar, C32226l lVar, C108115u uVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            if ((i & 2) != 0) {
                uVar = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            fVar.mo158463b(lVar, uVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkInit");
    }

    /* renamed from: j */
    public static void m146394j(C108073f fVar, C108091j jVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                jVar = null;
            }
            String str = fVar.f323609b;
            Log.printInfoStack(str, "stopRender, surface:" + jVar, new Object[0]);
            if (C87412m.m108589b(jVar, fVar.f323612e) || C87412m.m108589b(jVar, fVar.f323613f) || jVar == null) {
                fVar.mo158464d(new C108087h(fVar));
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRender");
    }

    /* renamed from: a */
    public final void mo158483a(C108091j jVar, int i) {
        if (jVar != null) {
            String str = this.f323609b;
            Log.printInfoStack(str, "add render surface renderSide " + i + " and :" + jVar, new Object[0]);
            if (i == 0) {
                this.f323612e = jVar;
            } else {
                this.f323613f = jVar;
            }
        } else {
            Log.m105920e(this.f323609b, "add a null surface");
        }
    }

    /* renamed from: b */
    public abstract void mo158463b(C32226l<? super C108073f, C13598b0> lVar, C108115u uVar, boolean z);

    /* renamed from: d */
    public void mo158464d(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
    }

    /* renamed from: e */
    public void mo158465e() {
        Log.m105924i(this.f323609b, "onSurfaceTextureDestroyed");
        if (!this.f323611d.compareAndSet(false, true)) {
            Log.m105920e(this.f323609b, "release already release");
        } else {
            mo158464d(new C108074a(this));
        }
    }

    /* renamed from: f */
    public final void mo158484f(C108091j jVar, int i) {
        String str = this.f323609b;
        Log.printInfoStack(str, "remove render surface :" + jVar, new Object[0]);
        C108075b bVar = new C108075b(jVar, this, i);
        if (this.f323608a) {
            C111130b a = C109247e.vx0().mo163047a(0);
            if (a != null) {
                a.mo162869c(bVar);
                return;
            }
            return;
        }
        C111130b a2 = C109247e.vx0().mo163047a(1);
        if (a2 != null) {
            a2.mo162869c(bVar);
        }
    }

    /* renamed from: g */
    public abstract void mo158466g();

    /* renamed from: h */
    public final void mo158485h(C110194c cVar) {
        C87412m.m108594g(cVar, "texture");
        if (this.f323610c) {
            C108109r0 r0Var = this.f323617j;
            if (r0Var != null) {
                r0Var.f323724C = cVar;
                r0Var.f323723B = cVar.f329652e;
            }
            mo158466g();
        }
    }

    /* renamed from: i */
    public final void mo158486i() {
        Log.printInfoStack(this.f323609b, "startRender", new Object[0]);
        mo158464d(new C108076c(this));
    }

    /* renamed from: k */
    public void mo158467k(Size size) {
        C87412m.m108594g(size, "renderSize");
        this.f323619l = size.getWidth();
        this.f323620m = size.getHeight();
        C108109r0 r0Var = this.f323617j;
        if (r0Var != null) {
            r0Var.mo143263u(size.getWidth(), size.getHeight());
        }
    }
}
