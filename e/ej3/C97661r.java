package ej3;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import com.tencent.map.geolocation.sapp.TencentLocation;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ej3.r */
public final class C97661r extends C45664c {

    /* renamed from: f */
    public final C97667s f286466f;

    /* renamed from: ej3.r$a */
    public static final class C97662a extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public static final C97662a f286467d = new C97662a();

        public C97662a() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Number) obj).floatValue();
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: ej3.r$b */
    public static final class C97663b extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public static final C97663b f286468d = new C97663b();

        public C97663b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Float.valueOf(((Number) obj).floatValue());
        }
    }

    /* renamed from: ej3.r$c */
    public static final class C97664c extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public static final C97664c f286469d = new C97664c();

        public C97664c() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Number) obj).floatValue();
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: ej3.r$d */
    public static final class C97665d extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public static final C97665d f286470d = new C97665d();

        public C97665d() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Float.valueOf(-((Number) obj).floatValue());
        }
    }

    /* renamed from: ej3.r$e */
    public static final class C97666e extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ boolean f286471a;

        /* renamed from: b */
        public final /* synthetic */ float f286472b;

        public C97666e(boolean z, float f) {
            this.f286471a = z;
            this.f286472b = f;
        }

        public void getOutline(View view, Outline outline) {
            int i;
            int i2;
            int i3;
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                if (this.f286471a) {
                    i2 = view.getHeight();
                    i3 = 0;
                    i = 0;
                } else {
                    i3 = view.getHeight();
                    i2 = view.getHeight();
                    i = view.getHeight();
                }
                float f = this.f286472b;
                outline.setRect(0, (int) (((float) 0) + (((float) (i3 - 0)) * f)), view.getWidth(), (int) (((float) i2) + (((float) (i - i2)) * f)));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97661r(C97667s sVar) {
        super(0, 1, (C8480h) null);
        C87412m.m108594g(sVar, TencentLocation.EXTRA_DIRECTION);
        this.f286466f = sVar;
        this.f123473c = C87412m.m108589b(sVar, C97653p.f286458a) ? new C31609o(C97662a.f286467d, C97663b.f286468d, (Interpolator) null, 4, (C8480h) null) : new C31609o(C97664c.f286469d, C97665d.f286470d, (Interpolator) null, 4, (C8480h) null);
    }

    /* renamed from: e */
    public void mo71172e(ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, "animation");
        boolean b = C87412m.m108589b(this.f286466f, C97653p.f286458a);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        View view = this.f123474d;
        if (view != null) {
            view.setOutlineProvider(new C97666e(b, animatedFraction));
        }
    }
}
