package h43;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h43.C108091j;
import l33.C109247e;
import p80.C110194c;
import rx3.C13598b0;
import u33.C111130b;
import w80.C111742d;
import z33.C112595h;

/* renamed from: h43.y0 */
public class C108128y0 extends C108073f {

    /* renamed from: u */
    public static final C108129a f323783u = new C108129a((C8480h) null);

    /* renamed from: r */
    public boolean f323784r;

    /* renamed from: s */
    public C32226l<? super C108073f, C13598b0> f323785s;

    /* renamed from: t */
    public EGLContext f323786t;

    /* renamed from: h43.y0$a */
    public static final class C108129a {
        public C108129a(C8480h hVar) {
        }
    }

    /* renamed from: h43.y0$b */
    public static final class C108130b extends C87413o implements C32226l<C110194c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108128y0 f323787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108130b(C108128y0 y0Var) {
            super(1);
            this.f323787d = y0Var;
        }

        public Object invoke(Object obj) {
            C110194c cVar = (C110194c) obj;
            if (cVar != null) {
                C108109r0 r0Var = this.f323787d.f323617j;
                if (r0Var != null) {
                    r0Var.mo158469C(!cVar.f329653f);
                }
                C108128y0 y0Var = this.f323787d;
                y0Var.getClass();
                y0Var.mo158464d(new C108085g(y0Var, cVar));
                this.f323787d.mo158485h(cVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h43.y0$c */
    public static final class C108131c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108128y0 f323788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108131c(C108128y0 y0Var) {
            super(0);
            this.f323788d = y0Var;
        }

        public Object invoke() {
            C108128y0 y0Var = this.f323788d;
            C111130b a = C109247e.vx0().mo163047a(0);
            y0Var.f323616i = a != null ? a.f332737d : null;
            C108128y0 y0Var2 = this.f323788d;
            C108128y0 y0Var3 = this.f323788d;
            y0Var2.f323617j = new C108070d0(y0Var3.f323619l, y0Var3.f323620m, 0, 0, 0, 2, true, 24, (C8480h) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h43.y0$d */
    public static final class C108132d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108128y0 f323789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108132d(C108128y0 y0Var) {
            super(0);
            this.f323789d = y0Var;
        }

        public Object invoke() {
            Size x;
            C108128y0 y0Var = this.f323789d;
            C108091j jVar = y0Var.f323608a ? y0Var.f323612e : y0Var.f323613f;
            boolean z = C109247e.vx0().f333452l;
            EGLDisplay eGLDisplay = null;
            if (jVar != null) {
                if (!this.f323789d.f323610c) {
                    Log.m105924i("MicroMsg.WindowSurfaceRenderer", "pause rendering now");
                } else if (C87412m.m108589b(jVar.mo158508a(), EGL14.EGL_NO_SURFACE)) {
                    Log.m105920e("MicroMsg.WindowSurfaceRenderer", "render error egl surface:" + jVar);
                } else {
                    if (!C112595h.f337167b || !z) {
                        C108109r0 r0Var = this.f323789d.f323617j;
                        if (r0Var != null) {
                            C108091j.C108092a aVar = jVar.f323687d;
                            r0Var.mo158522s(aVar.f323690a, aVar.f323691b);
                        }
                        C108128y0 y0Var2 = this.f323789d;
                        C108109r0 r0Var2 = y0Var2.f323617j;
                        if (r0Var2 != null) {
                            r0Var2.f332751f = 2;
                        }
                        C32228q<? super Size, ? super Integer, ? super Integer, C13598b0> qVar = y0Var2.f323624q;
                        if (qVar != null) {
                            C13598b0 invoke = qVar.invoke(null, Integer.valueOf(y0Var2.f323608a ^ true ? 1 : 0), 0);
                        }
                    } else {
                        C108109r0 r0Var3 = this.f323789d.f323617j;
                        if (!(r0Var3 == null || (x = r0Var3.mo158476x()) == null)) {
                            C108109r0 r0Var4 = this.f323789d.f323617j;
                            if (r0Var4 != null) {
                                r0Var4.mo158522s(x.getWidth(), x.getHeight());
                            }
                            C32228q<? super Size, ? super Integer, ? super Integer, C13598b0> qVar2 = this.f323789d.f323624q;
                            if (qVar2 != null) {
                                C13598b0 invoke2 = qVar2.invoke(new Size(x.getWidth(), x.getHeight()), Integer.valueOf(this.f323789d.f323608a ^ true ? 1 : 0), 0);
                            }
                            C108109r0 r0Var5 = this.f323789d.f323617j;
                            if (r0Var5 != null) {
                                r0Var5.f332751f = 1;
                            }
                        }
                    }
                    C111742d.C65942b bVar = this.f323789d.f323616i;
                    if ((bVar != null ? bVar.f189591a : null) != null) {
                        jVar.mo158508a();
                        C111742d.C65942b bVar2 = this.f323789d.f323616i;
                        if (!((bVar2 != null ? bVar2.f189593c : null) == null || bVar2 == null)) {
                            EGLDisplay eGLDisplay2 = bVar2.f189591a;
                            EGLSurface a = jVar.mo158508a();
                            EGLSurface a2 = jVar.mo158508a();
                            C111742d.C65942b bVar3 = this.f323789d.f323616i;
                            EGL14.eglMakeCurrent(eGLDisplay2, a, a2, bVar3 != null ? bVar3.f189593c : null);
                            C108109r0 r0Var6 = this.f323789d.f323617j;
                            if (r0Var6 != null) {
                                r0Var6.mo162879m();
                            }
                            C111742d.C111743a aVar2 = C111742d.f334647a;
                            C111742d.C65942b bVar4 = this.f323789d.f323616i;
                            if (bVar4 != null) {
                                eGLDisplay = bVar4.f189591a;
                            }
                            aVar2.mo163474t(eGLDisplay, jVar.mo158508a());
                        }
                    }
                    Log.m105920e("MicroMsg.WindowSurfaceRenderer", "error cause eGLEnvironment null");
                }
            } else if (!z) {
                C108128y0 y0Var3 = this.f323789d;
                C32228q<? super Size, ? super Integer, ? super Integer, C13598b0> qVar3 = y0Var3.f323624q;
                if (qVar3 != null) {
                    C13598b0 invoke3 = qVar3.invoke(null, Integer.valueOf(y0Var3.f323608a ^ true ? 1 : 0), 0);
                }
            } else {
                Log.m105920e("MicroMsg.WindowSurfaceRenderer", "error on render surface null");
            }
            return C13598b0.f38549a;
        }
    }

    public C108128y0(boolean z) {
        super(z, f323783u.hashCode());
    }

    /* renamed from: b */
    public void mo158463b(C32226l<? super C108073f, C13598b0> lVar, C108115u uVar, boolean z) {
        if (uVar != null) {
            C111742d.C65942b bVar = uVar.f323740c;
            EGLContext eGLContext = bVar != null ? bVar.f189593c : null;
            if (eGLContext != null) {
                this.f323786t = eGLContext;
                mo158468l(true);
            }
            if (z) {
                C108130b bVar2 = new C108130b(this);
                if (!uVar.f323750m.contains(bVar2)) {
                    uVar.f323750m.add(bVar2);
                }
            } else {
                this.f323785s = lVar;
            }
            this.f323619l = uVar.f323738a;
            this.f323620m = uVar.f323739b;
            return;
        }
        this.f323785s = lVar;
        mo158468l(false);
    }

    /* renamed from: d */
    public void mo158464d(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        C111130b a = C109247e.vx0().mo163047a(0);
        if (a != null) {
            a.mo162869c(aVar);
        }
    }

    /* renamed from: g */
    public void mo158466g() {
        mo158464d(new C108132d(this));
    }

    /* renamed from: k */
    public void mo158467k(Size size) {
        C87412m.m108594g(size, "renderSize");
        super.mo158467k(size);
        C109247e.vx0().f333456p = new Size(this.f323620m, this.f323619l);
    }

    /* renamed from: l */
    public void mo158468l(boolean z) {
        if (!this.f323784r) {
            Log.printInfoStack("MicroMsg.WindowSurfaceRenderer", "createEGLContext, isUseShareContext:" + z + ", shareGLContext:" + this.f323786t, new Object[0]);
            if (z && this.f323786t != null) {
                mo158464d(new C108131c(this));
                this.f323784r = true;
            }
        }
    }
}
