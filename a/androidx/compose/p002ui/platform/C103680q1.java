package androidx.compose.p002ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import com.google.android.gms.common.internal.Constants;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112538d;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103222a1;
import p436a1.C103223b;
import p436a1.C103226c;
import p436a1.C103234g;
import p436a1.C103235g0;
import p436a1.C103241i0;
import p436a1.C103252o0;
import p436a1.C103256p0;
import p436a1.C103262s;
import p436a1.C103265t;
import p436a1.C103266t0;
import p436a1.C103276y;
import p560i2.C108322d;
import p560i2.C33177j;
import p560i2.C33181m;
import p560i2.C33183o;
import p658q1.C110281b0;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.q1 */
public final class C103680q1 implements C110281b0 {

    /* renamed from: s */
    public static final C32227p<C103671o0, Matrix, C13598b0> f306239s = C103681a.f306252d;

    /* renamed from: d */
    public final AndroidComposeView f306240d;

    /* renamed from: e */
    public C32226l<? super C103262s, C13598b0> f306241e;

    /* renamed from: f */
    public C32224a<C13598b0> f306242f;

    /* renamed from: g */
    public boolean f306243g;

    /* renamed from: h */
    public final C103664m1 f306244h;

    /* renamed from: i */
    public boolean f306245i;

    /* renamed from: j */
    public boolean f306246j;

    /* renamed from: n */
    public C103241i0 f306247n;

    /* renamed from: o */
    public final C103632i1<C103671o0> f306248o = new C103632i1<>(f306239s);

    /* renamed from: p */
    public final C103265t f306249p = new C103265t();

    /* renamed from: q */
    public long f306250q;

    /* renamed from: r */
    public final C103671o0 f306251r;

    /* renamed from: androidx.compose.ui.platform.q1$a */
    public static final class C103681a extends C87413o implements C32227p<C103671o0, Matrix, C13598b0> {

        /* renamed from: d */
        public static final C103681a f306252d = new C103681a();

        public C103681a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C103671o0 o0Var = (C103671o0) obj;
            Matrix matrix = (Matrix) obj2;
            C87412m.m108594g(o0Var, "rn");
            C87412m.m108594g(matrix, "matrix");
            o0Var.mo144845v(matrix);
            return C13598b0.f38549a;
        }
    }

    public C103680q1(AndroidComposeView androidComposeView, C32226l<? super C103262s, C13598b0> lVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(androidComposeView, "ownerView");
        C87412m.m108594g(lVar, "drawBlock");
        C87412m.m108594g(aVar, "invalidateParentLayer");
        this.f306240d = androidComposeView;
        this.f306241e = lVar;
        this.f306242f = aVar;
        this.f306244h = new C103664m1(androidComposeView.getDensity());
        int i = C103222a1.f304425c;
        this.f306250q = C103222a1.f304424b;
        C103671o0 o1Var = Build.VERSION.SDK_INT >= 29 ? new C103672o1(androidComposeView) : new C103668n1(androidComposeView);
        o1Var.mo144844u(true);
        this.f306251r = o1Var;
    }

    /* renamed from: a */
    public long mo144747a(long j, boolean z) {
        if (!z) {
            return C103235g0.m136669b(this.f306248o.mo144742b(this.f306251r), j);
        }
        float[] a = this.f306248o.mo144741a(this.f306251r);
        if (a != null) {
            return C103235g0.m136669b(a, j);
        }
        int i = C112539e.f336958e;
        return C112539e.f336956c;
    }

    /* renamed from: b */
    public boolean mo144748b(long j) {
        float c = C112539e.m153738c(j);
        float d = C112539e.m153739d(j);
        if (this.f306251r.mo144849z()) {
            return 0.0f <= c && c < ((float) this.f306251r.getWidth()) && 0.0f <= d && d < ((float) this.f306251r.getHeight());
        }
        if (this.f306251r.mo144843t()) {
            return this.f306244h.mo144808c(j);
        }
        return true;
    }

    /* renamed from: c */
    public void mo144749c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f15, long j, C103266t0 t0Var, boolean z, C103256p0 p0Var, long j2, long j3, C33183o oVar, C108322d dVar) {
        C32224a<C13598b0> aVar;
        long j4 = j;
        C103266t0 t0Var2 = t0Var;
        C87412m.m108594g(t0Var2, "shape");
        C87412m.m108594g(oVar, "layoutDirection");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        this.f306250q = j4;
        boolean z2 = false;
        boolean z3 = this.f306251r.mo144843t() && !(this.f306244h.f306207i ^ true);
        float f16 = f;
        this.f306251r.setScaleX(f);
        float f17 = f2;
        this.f306251r.setScaleY(f2);
        float f18 = f3;
        this.f306251r.setAlpha(f3);
        this.f306251r.mo144834n(f4);
        this.f306251r.mo144817d(f5);
        this.f306251r.mo144838r(f6);
        this.f306251r.mo144836p(C103276y.m136796g(j2));
        this.f306251r.mo144837q(C103276y.m136796g(j3));
        this.f306251r.mo144830j(f9);
        this.f306251r.mo144819f(f7);
        this.f306251r.mo144828h(f8);
        this.f306251r.mo144832l(f15);
        C103671o0 o0Var = this.f306251r;
        int i = C103222a1.f304425c;
        o0Var.mo144818e(Float.intBitsToFloat((int) (j4 >> 32)) * ((float) this.f306251r.getWidth()));
        this.f306251r.mo144820g(C103222a1.m136604a(j) * ((float) this.f306251r.getHeight()));
        this.f306251r.mo144833m(z && t0Var2 != C103252o0.f304457a);
        this.f306251r.mo144815b(z && t0Var2 == C103252o0.f304457a);
        this.f306251r.mo144831k(p0Var);
        boolean d = this.f306244h.mo144809d(t0Var, this.f306251r.getAlpha(), this.f306251r.mo144843t(), this.f306251r.mo144813A(), oVar, dVar);
        this.f306251r.mo144829i(this.f306244h.mo144807b());
        if (this.f306251r.mo144843t() && !(!this.f306244h.f306207i)) {
            z2 = true;
        }
        if (z3 != z2 || (z2 && d)) {
            if (!this.f306243g && !this.f306245i) {
                this.f306240d.invalidate();
                mo144851j(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            C103614c3.f306066a.mo144716a(this.f306240d);
        } else {
            this.f306240d.invalidate();
        }
        if (!this.f306246j && this.f306251r.mo144813A() > 0.0f && (aVar = this.f306242f) != null) {
            aVar.invoke();
        }
        this.f306248o.mo144743c();
    }

    /* renamed from: d */
    public void mo144750d(C32226l<? super C103262s, C13598b0> lVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(lVar, "drawBlock");
        C87412m.m108594g(aVar, "invalidateParentLayer");
        mo144851j(false);
        this.f306245i = false;
        this.f306246j = false;
        int i = C103222a1.f304425c;
        this.f306250q = C103222a1.f304424b;
        this.f306241e = lVar;
        this.f306242f = aVar;
    }

    public void destroy() {
        if (this.f306251r.mo144816c()) {
            this.f306251r.mo144835o();
        }
        this.f306241e = null;
        this.f306242f = null;
        this.f306245i = true;
        mo144851j(false);
        AndroidComposeView androidComposeView = this.f306240d;
        androidComposeView.f305957B = true;
        androidComposeView.mo144614F(this);
    }

    /* renamed from: e */
    public void mo144753e(long j) {
        int left = this.f306251r.getLeft();
        int top = this.f306251r.getTop();
        int i = (int) (j >> 32);
        int a = C33177j.m39962a(j);
        if (left != i || top != a) {
            this.f306251r.mo144847x(i - left);
            this.f306251r.mo144839s(a - top);
            if (Build.VERSION.SDK_INT >= 26) {
                C103614c3.f306066a.mo144716a(this.f306240d);
            } else {
                this.f306240d.invalidate();
            }
            this.f306248o.mo144743c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo144754f() {
        /*
            r4 = this;
            boolean r0 = r4.f306243g
            if (r0 != 0) goto L_0x000c
            androidx.compose.ui.platform.o0 r0 = r4.f306251r
            boolean r0 = r0.mo144816c()
            if (r0 != 0) goto L_0x0032
        L_0x000c:
            r0 = 0
            r4.mo144851j(r0)
            androidx.compose.ui.platform.o0 r0 = r4.f306251r
            boolean r0 = r0.mo144843t()
            if (r0 == 0) goto L_0x0026
            androidx.compose.ui.platform.m1 r0 = r4.f306244h
            boolean r1 = r0.f306207i
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0026
            r0.mo144810e()
            a1.j0 r0 = r0.f306205g
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            fy3.l<? super a1.s, rx3.b0> r1 = r4.f306241e
            if (r1 == 0) goto L_0x0032
            androidx.compose.ui.platform.o0 r2 = r4.f306251r
            a1.t r3 = r4.f306249p
            r2.mo144846w(r3, r0, r1)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C103680q1.mo144754f():void");
    }

    /* renamed from: g */
    public void mo144756g(C103262s sVar) {
        C87412m.m108594g(sVar, "canvas");
        Canvas canvas = C103226c.f304431a;
        Canvas canvas2 = ((C103223b) sVar).f304427a;
        boolean z = false;
        if (canvas2.isHardwareAccelerated()) {
            mo144754f();
            if (this.f306251r.mo144813A() > 0.0f) {
                z = true;
            }
            this.f306246j = z;
            if (z) {
                sVar.mo142959r();
            }
            this.f306251r.mo144814a(canvas2);
            if (this.f306246j) {
                sVar.mo142950i();
                return;
            }
            return;
        }
        float left = (float) this.f306251r.getLeft();
        float top = (float) this.f306251r.getTop();
        float right = (float) this.f306251r.getRight();
        float bottom = (float) this.f306251r.getBottom();
        if (this.f306251r.getAlpha() < 1.0f) {
            C103241i0 i0Var = this.f306247n;
            if (i0Var == null) {
                i0Var = new C103234g();
                this.f306247n = i0Var;
            }
            i0Var.setAlpha(this.f306251r.getAlpha());
            canvas2.saveLayer(left, top, right, bottom, i0Var.mo142992f());
        } else {
            sVar.mo142944c();
        }
        sVar.mo142945d(left, top);
        sVar.mo142954m(this.f306248o.mo144742b(this.f306251r));
        if (this.f306251r.mo144843t() || this.f306251r.mo144849z()) {
            this.f306244h.mo144806a(sVar);
        }
        C32226l<? super C103262s, C13598b0> lVar = this.f306241e;
        if (lVar != null) {
            lVar.invoke(sVar);
        }
        sVar.mo142943b();
        mo144851j(false);
    }

    /* renamed from: h */
    public void mo144762h(C112538d dVar, boolean z) {
        C87412m.m108594g(dVar, "rect");
        if (z) {
            float[] a = this.f306248o.mo144741a(this.f306251r);
            if (a == null) {
                dVar.f336951a = 0.0f;
                dVar.f336952b = 0.0f;
                dVar.f336953c = 0.0f;
                dVar.f336954d = 0.0f;
                return;
            }
            C103235g0.m136670c(a, dVar);
            return;
        }
        C103235g0.m136670c(this.f306248o.mo144742b(this.f306251r), dVar);
    }

    /* renamed from: i */
    public void mo144763i(long j) {
        int i = (int) (j >> 32);
        int b = C33181m.m39966b(j);
        C103671o0 o0Var = this.f306251r;
        long j2 = this.f306250q;
        int i2 = C103222a1.f304425c;
        float f = (float) i;
        o0Var.mo144818e(Float.intBitsToFloat((int) (j2 >> 32)) * f);
        float f2 = (float) b;
        this.f306251r.mo144820g(C103222a1.m136604a(this.f306250q) * f2);
        C103671o0 o0Var2 = this.f306251r;
        if (o0Var2.mo144848y(o0Var2.getLeft(), this.f306251r.getTop(), this.f306251r.getLeft() + i, this.f306251r.getTop() + b)) {
            C103664m1 m1Var = this.f306244h;
            long a = C112546l.m153761a(f, f2);
            if (!C112545k.m153755a(m1Var.f306202d, a)) {
                m1Var.f306202d = a;
                m1Var.f306206h = true;
            }
            this.f306251r.mo144829i(this.f306244h.mo144807b());
            if (!this.f306243g && !this.f306245i) {
                this.f306240d.invalidate();
                mo144851j(true);
            }
            this.f306248o.mo144743c();
        }
    }

    public void invalidate() {
        if (!this.f306243g && !this.f306245i) {
            this.f306240d.invalidate();
            mo144851j(true);
        }
    }

    /* renamed from: j */
    public final void mo144851j(boolean z) {
        if (z != this.f306243g) {
            this.f306243g = z;
            this.f306240d.mo144611C(this, z);
        }
    }
}
