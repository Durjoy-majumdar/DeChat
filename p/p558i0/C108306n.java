package p558i0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import fy3.C32224a;
import gy3.C87412m;
import java.lang.reflect.Method;
import p1165z.C112530o;
import p1166z0.C112539e;
import p1166z0.C112542h;
import p436a1.C103250n0;
import p436a1.C103272w;
import p436a1.C103276y;
import p558i0.C108313v;
import rx3.C13598b0;

/* renamed from: i0.n */
public final class C108306n extends View {

    /* renamed from: i */
    public static final int[] f324303i = {16842919, 16842910};

    /* renamed from: j */
    public static final int[] f324304j = new int[0];

    /* renamed from: d */
    public C108313v f324305d;

    /* renamed from: e */
    public Boolean f324306e;

    /* renamed from: f */
    public Long f324307f;

    /* renamed from: g */
    public Runnable f324308g;

    /* renamed from: h */
    public C32224a<C13598b0> f324309h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108306n(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f324308g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f324307f;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0);
        if (z || longValue >= 5) {
            int[] iArr = z ? f324303i : f324304j;
            C108313v vVar = this.f324305d;
            if (vVar != null) {
                vVar.setState(iArr);
            }
        } else {
            n$$a n__a = new n$$a(this);
            this.f324308g = n__a;
            postDelayed(n__a, 50);
        }
        this.f324307f = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2  reason: not valid java name */
    public static final void m168898setRippleState$lambda2(C108306n nVar) {
        C87412m.m108594g(nVar, "this$0");
        C108313v vVar = nVar.f324305d;
        if (vVar != null) {
            vVar.setState(f324304j);
        }
        nVar.f324308g = null;
    }

    /* renamed from: b */
    public final void mo158765b(C112530o oVar, boolean z, long j, int i, long j2, float f, C32224a<C13598b0> aVar) {
        C112530o oVar2 = oVar;
        boolean z2 = z;
        C32224a<C13598b0> aVar2 = aVar;
        C87412m.m108594g(oVar, "interaction");
        C87412m.m108594g(aVar2, "onInvalidateRipple");
        if (this.f324305d == null || !C87412m.m108589b(Boolean.valueOf(z), this.f324306e)) {
            C108313v vVar = new C108313v(z);
            setBackground(vVar);
            this.f324305d = vVar;
            this.f324306e = Boolean.valueOf(z);
        }
        C108313v vVar2 = this.f324305d;
        C87412m.m108591d(vVar2);
        this.f324309h = aVar2;
        mo158768e(j, i, j2, f);
        if (z2) {
            vVar2.setHotspot(C112539e.m153738c(oVar2.f336942a), C112539e.m153739d(oVar2.f336942a));
        } else {
            vVar2.setHotspot((float) vVar2.getBounds().centerX(), (float) vVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* renamed from: c */
    public final void mo158766c() {
        this.f324309h = null;
        Runnable runnable = this.f324308g;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f324308g;
            C87412m.m108591d(runnable2);
            runnable2.run();
        } else {
            C108313v vVar = this.f324305d;
            if (vVar != null) {
                vVar.setState(f324304j);
            }
        }
        C108313v vVar2 = this.f324305d;
        if (vVar2 != null) {
            vVar2.setVisible(false, false);
            unscheduleDrawable(vVar2);
        }
    }

    /* renamed from: d */
    public final void mo158767d() {
        setRippleState(false);
    }

    /* renamed from: e */
    public final void mo158768e(long j, int i, long j2, float f) {
        int i2 = i;
        C108313v vVar = this.f324305d;
        if (vVar != null) {
            Integer num = vVar.f324327f;
            boolean z = false;
            if (num == null || num.intValue() != i2) {
                vVar.f324327f = Integer.valueOf(i);
                if (Build.VERSION.SDK_INT < 23) {
                    try {
                        if (!C108313v.f324324i) {
                            C108313v.f324324i = true;
                            C108313v.f324323h = RippleDrawable.class.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE});
                        }
                        Method method = C108313v.f324323h;
                        if (method != null) {
                            method.invoke(vVar, new Object[]{Integer.valueOf(i)});
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    C108313v.C108314a.f324329a.mo158777a(vVar, i2);
                }
            }
            float f2 = Build.VERSION.SDK_INT < 28 ? ((float) 2) * f : f;
            long b = C103272w.m136780b(j2, f2 > 1.0f ? 1.0f : f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C103272w wVar = vVar.f324326e;
            if (wVar != null) {
                z = C103272w.m136781c(wVar.f304517a, b);
            }
            if (!z) {
                vVar.f324326e = new C103272w(b);
                vVar.setColor(ColorStateList.valueOf(C103276y.m136796g(b)));
            }
            Rect a = C103250n0.m136707a(C112542h.m153752a(C112539e.f336955b, j));
            setLeft(a.left);
            setTop(a.top);
            setRight(a.right);
            setBottom(a.bottom);
            vVar.setBounds(a);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        C87412m.m108594g(drawable, "who");
        C32224a<C13598b0> aVar = this.f324309h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }
}
