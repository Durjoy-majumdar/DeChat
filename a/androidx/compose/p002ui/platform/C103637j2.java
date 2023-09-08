package androidx.compose.p002ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.common.internal.Constants;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p1166z0.C112538d;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103222a1;
import p436a1.C103223b;
import p436a1.C103235g0;
import p436a1.C103252o0;
import p436a1.C103256p0;
import p436a1.C103262s;
import p436a1.C103265t;
import p436a1.C103266t0;
import p436a1.C103276y;
import p436a1.C27726j0;
import p560i2.C108322d;
import p560i2.C33177j;
import p560i2.C33181m;
import p560i2.C33183o;
import p658q1.C110281b0;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.j2 */
public final class C103637j2 extends View implements C110281b0 {

    /* renamed from: s */
    public static final C103640c f306096s = new C103640c((C8480h) null);

    /* renamed from: t */
    public static final C32227p<View, Matrix, C13598b0> f306097t = C103639b.f306115d;

    /* renamed from: u */
    public static final ViewOutlineProvider f306098u = new C103638a();

    /* renamed from: v */
    public static Method f306099v;

    /* renamed from: w */
    public static Field f306100w;

    /* renamed from: x */
    public static boolean f306101x;

    /* renamed from: y */
    public static boolean f306102y;

    /* renamed from: d */
    public final AndroidComposeView f306103d;

    /* renamed from: e */
    public final C103689u0 f306104e;

    /* renamed from: f */
    public C32226l<? super C103262s, C13598b0> f306105f;

    /* renamed from: g */
    public C32224a<C13598b0> f306106g;

    /* renamed from: h */
    public final C103664m1 f306107h;

    /* renamed from: i */
    public boolean f306108i;

    /* renamed from: j */
    public Rect f306109j;

    /* renamed from: n */
    public boolean f306110n;

    /* renamed from: o */
    public boolean f306111o;

    /* renamed from: p */
    public final C103265t f306112p = new C103265t();

    /* renamed from: q */
    public final C103632i1<View> f306113q = new C103632i1<>(f306097t);

    /* renamed from: r */
    public long f306114r;

    /* renamed from: androidx.compose.ui.platform.j2$a */
    public static final class C103638a extends ViewOutlineProvider {
        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            Outline b = ((C103637j2) view).f306107h.mo144807b();
            C87412m.m108591d(b);
            outline.set(b);
        }
    }

    /* renamed from: androidx.compose.ui.platform.j2$b */
    public static final class C103639b extends C87413o implements C32227p<View, Matrix, C13598b0> {

        /* renamed from: d */
        public static final C103639b f306115d = new C103639b();

        public C103639b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            Matrix matrix = (Matrix) obj2;
            C87412m.m108594g(view, "view");
            C87412m.m108594g(matrix, "matrix");
            matrix.set(view.getMatrix());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.j2$c */
    public static final class C103640c {
        public C103640c(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo144769a(View view) {
            Class<String> cls = String.class;
            C87412m.m108594g(view, "view");
            try {
                if (!C103637j2.f306101x) {
                    C103637j2.f306101x = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        C103637j2.f306099v = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        C103637j2.f306100w = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        Object[] objArr = {"updateDisplayListIfDirty", new Class[0]};
                        C103637j2.f306099v = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(View.class, objArr);
                        Object[] objArr2 = {"mRecreateDisplayList"};
                        C103637j2.f306100w = (Field) Class.class.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(View.class, objArr2);
                    }
                    Method method = C103637j2.f306099v;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = C103637j2.f306100w;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = C103637j2.f306100w;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = C103637j2.f306099v;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                C103637j2.f306102y = true;
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.j2$d */
    public static final class C103641d {
        /* renamed from: a */
        public static final long m137836a(View view) {
            C87412m.m108594g(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103637j2(AndroidComposeView androidComposeView, C103689u0 u0Var, C32226l<? super C103262s, C13598b0> lVar, C32224a<C13598b0> aVar) {
        super(androidComposeView.getContext());
        C87412m.m108594g(androidComposeView, "ownerView");
        C87412m.m108594g(u0Var, "container");
        C87412m.m108594g(lVar, "drawBlock");
        C87412m.m108594g(aVar, "invalidateParentLayer");
        this.f306103d = androidComposeView;
        this.f306104e = u0Var;
        this.f306105f = lVar;
        this.f306106g = aVar;
        this.f306107h = new C103664m1(androidComposeView.getDensity());
        int i = C103222a1.f304425c;
        this.f306114r = C103222a1.f304424b;
        setWillNotDraw(false);
        setId(View.generateViewId());
        u0Var.addView(this);
    }

    private final C27726j0 getManualClipPath() {
        if (getClipToOutline()) {
            C103664m1 m1Var = this.f306107h;
            if (!(!m1Var.f306207i)) {
                m1Var.mo144810e();
                return m1Var.f306205g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.f306110n) {
            this.f306110n = z;
            this.f306103d.mo144611C(this, z);
        }
    }

    /* renamed from: a */
    public long mo144747a(long j, boolean z) {
        if (!z) {
            return C103235g0.m136669b(this.f306113q.mo144742b(this), j);
        }
        float[] a = this.f306113q.mo144741a(this);
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
        if (this.f306108i) {
            return 0.0f <= c && c < ((float) getWidth()) && 0.0f <= d && d < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f306107h.mo144808c(j);
        }
        return true;
    }

    /* renamed from: c */
    public void mo144749c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f15, long j, C103266t0 t0Var, boolean z, C103256p0 p0Var, long j2, long j3, C33183o oVar, C108322d dVar) {
        C32224a<C13598b0> aVar;
        C103266t0 t0Var2 = t0Var;
        C87412m.m108594g(t0Var2, "shape");
        C87412m.m108594g(oVar, "layoutDirection");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        this.f306114r = j;
        setScaleX(f);
        float f16 = f2;
        setScaleY(f2);
        float f17 = f3;
        setAlpha(f3);
        float f18 = f4;
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        long j4 = this.f306114r;
        int i = C103222a1.f304425c;
        setPivotX(Float.intBitsToFloat((int) (j4 >> 32)) * ((float) getWidth()));
        setPivotY(C103222a1.m136604a(this.f306114r) * ((float) getHeight()));
        setCameraDistancePx(f15);
        boolean z2 = false;
        this.f306108i = z && t0Var2 == C103252o0.f304457a;
        mo144765j();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && t0Var2 != C103252o0.f304457a);
        boolean d = this.f306107h.mo144809d(t0Var, getAlpha(), getClipToOutline(), getElevation(), oVar, dVar);
        setOutlineProvider(this.f306107h.mo144807b() != null ? f306098u : null);
        if (getManualClipPath() != null) {
            z2 = true;
        }
        if (z3 != z2 || (z2 && d)) {
            invalidate();
        }
        if (!this.f306111o && getElevation() > 0.0f && (aVar = this.f306106g) != null) {
            aVar.invoke();
        }
        this.f306113q.mo144743c();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            C103661l2 l2Var = C103661l2.f306154a;
            l2Var.mo144773a(this, C103276y.m136796g(j2));
            l2Var.mo144774b(this, C103276y.m136796g(j3));
        }
        if (i2 >= 31) {
            C103665m2.f306216a.mo144812a(this, p0Var);
        }
    }

    /* renamed from: d */
    public void mo144750d(C32226l<? super C103262s, C13598b0> lVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(lVar, "drawBlock");
        C87412m.m108594g(aVar, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT >= 23 || f306102y) {
            this.f306104e.addView(this);
        } else {
            setVisibility(0);
        }
        this.f306108i = false;
        this.f306111o = false;
        int i = C103222a1.f304425c;
        this.f306114r = C103222a1.f304424b;
        this.f306105f = lVar;
        this.f306106g = aVar;
    }

    public void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f306103d;
        androidComposeView.f305957B = true;
        this.f306105f = null;
        this.f306106g = null;
        boolean F = androidComposeView.mo144614F(this);
        if (Build.VERSION.SDK_INT >= 23 || f306102y || !F) {
            this.f306104e.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        C103265t tVar = this.f306112p;
        C103223b bVar = tVar.f304485a;
        Canvas canvas2 = bVar.f304427a;
        bVar.getClass();
        bVar.f304427a = canvas;
        C103223b bVar2 = tVar.f304485a;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z = true;
            bVar2.mo142944c();
            this.f306107h.mo144806a(bVar2);
        }
        C32226l<? super C103262s, C13598b0> lVar = this.f306105f;
        if (lVar != null) {
            lVar.invoke(bVar2);
        }
        if (z) {
            bVar2.mo142943b();
        }
        tVar.f304485a.mo142963v(canvas2);
    }

    /* renamed from: e */
    public void mo144753e(long j) {
        int i = C33177j.f90051c;
        int i2 = (int) (j >> 32);
        if (i2 != getLeft()) {
            offsetLeftAndRight(i2 - getLeft());
            this.f306113q.mo144743c();
        }
        int a = C33177j.m39962a(j);
        if (a != getTop()) {
            offsetTopAndBottom(a - getTop());
            this.f306113q.mo144743c();
        }
    }

    /* renamed from: f */
    public void mo144754f() {
        if (this.f306110n && !f306102y) {
            setInvalidated(false);
            f306096s.mo144769a(this);
        }
    }

    public void forceLayout() {
    }

    /* renamed from: g */
    public void mo144756g(C103262s sVar) {
        C87412m.m108594g(sVar, "canvas");
        boolean z = getElevation() > 0.0f;
        this.f306111o = z;
        if (z) {
            sVar.mo142959r();
        }
        this.f306104e.mo144861a(sVar, this, getDrawingTime());
        if (this.f306111o) {
            sVar.mo142950i();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final C103689u0 getContainer() {
        return this.f306104e;
    }

    public long getLayerId() {
        return (long) getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.f306103d;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C103641d.m137836a(this.f306103d);
        }
        return -1;
    }

    /* renamed from: h */
    public void mo144762h(C112538d dVar, boolean z) {
        C87412m.m108594g(dVar, "rect");
        if (z) {
            float[] a = this.f306113q.mo144741a(this);
            if (a != null) {
                C103235g0.m136670c(a, dVar);
                return;
            }
            dVar.f336951a = 0.0f;
            dVar.f336952b = 0.0f;
            dVar.f336953c = 0.0f;
            dVar.f336954d = 0.0f;
            return;
        }
        C103235g0.m136670c(this.f306113q.mo144742b(this), dVar);
    }

    /* renamed from: i */
    public void mo144763i(long j) {
        int i = (int) (j >> 32);
        int b = C33181m.m39966b(j);
        if (i != getWidth() || b != getHeight()) {
            long j2 = this.f306114r;
            int i2 = C103222a1.f304425c;
            float f = (float) i;
            setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * f);
            float f2 = (float) b;
            setPivotY(C103222a1.m136604a(this.f306114r) * f2);
            C103664m1 m1Var = this.f306107h;
            long a = C112546l.m153761a(f, f2);
            if (!C112545k.m153755a(m1Var.f306202d, a)) {
                m1Var.f306202d = a;
                m1Var.f306206h = true;
            }
            setOutlineProvider(this.f306107h.mo144807b() != null ? f306098u : null);
            layout(getLeft(), getTop(), getLeft() + i, getTop() + b);
            mo144765j();
            this.f306113q.mo144743c();
        }
    }

    public void invalidate() {
        if (!this.f306110n) {
            setInvalidated(true);
            super.invalidate();
            this.f306103d.invalidate();
        }
    }

    /* renamed from: j */
    public final void mo144765j() {
        Rect rect;
        if (this.f306108i) {
            Rect rect2 = this.f306109j;
            if (rect2 == null) {
                this.f306109j = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C87412m.m108591d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f306109j;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }
}
