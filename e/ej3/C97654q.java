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

/* renamed from: ej3.q */
public final class C97654q extends C45663b {

    /* renamed from: f */
    public final C97667s f286459f;

    /* renamed from: ej3.q$a */
    public static final class C97655a extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public static final C97655a f286460d = new C97655a();

        public C97655a() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Number) obj).floatValue();
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: ej3.q$b */
    public static final class C97656b extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public static final C97656b f286461d = new C97656b();

        public C97656b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Float.valueOf(((Number) obj).floatValue());
        }
    }

    /* renamed from: ej3.q$c */
    public static final class C97657c extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public static final C97657c f286462d = new C97657c();

        public C97657c() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Number) obj).floatValue();
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: ej3.q$d */
    public static final class C97658d extends C87413o implements C32226l<Float, Float> {

        /* renamed from: d */
        public static final C97658d f286463d = new C97658d();

        public C97658d() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Float.valueOf(-((Number) obj).floatValue());
        }
    }

    /* renamed from: ej3.q$e */
    public static final class C97659e extends ViewOutlineProvider {
        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            outline.setRect(0, 0, 0, 0);
        }
    }

    /* renamed from: ej3.q$f */
    public static final class C97660f extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ boolean f286464a;

        /* renamed from: b */
        public final /* synthetic */ float f286465b;

        public C97660f(boolean z, float f) {
            this.f286464a = z;
            this.f286465b = f;
        }

        public void getOutline(View view, Outline outline) {
            int i;
            int i2;
            int i3;
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                if (this.f286464a) {
                    i = view.getHeight();
                    i3 = 0;
                    i2 = 0;
                } else {
                    i3 = view.getHeight();
                    i2 = view.getHeight();
                    i = view.getHeight();
                }
                float f = this.f286465b;
                outline.setRect(0, (int) (((float) i3) + (((float) (0 - i3)) * f)), view.getWidth(), (int) (((float) i2) + (((float) (i - i2)) * f)));
            }
        }
    }

    public C97654q(C97667s sVar) {
        C87412m.m108594g(sVar, TencentLocation.EXTRA_DIRECTION);
        this.f286459f = sVar;
        this.f123473c = C87412m.m108589b(sVar, C97653p.f286458a) ? new C31609o(C97655a.f286460d, C97656b.f286461d, (Interpolator) null, 4, (C8480h) null) : new C31609o(C97657c.f286462d, C97658d.f286463d, (Interpolator) null, 4, (C8480h) null);
    }

    /* renamed from: b */
    public void mo71164b() {
        super.mo71164b();
        View view = this.f123474d;
        if (view != null) {
            view.setClipToOutline(true);
        }
        View view2 = this.f123474d;
        if (view2 != null) {
            view2.setOutlineProvider(new C97659e());
        }
    }

    /* renamed from: e */
    public void mo71172e(ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, "animation");
        boolean b = C87412m.m108589b(this.f286459f, C97653p.f286458a);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        View view = this.f123474d;
        if (view != null) {
            view.setOutlineProvider(new C97660f(b, animatedFraction));
        }
    }

    /* renamed from: g */
    public boolean mo136913g() {
        View view = this.f123474d;
        return view != null && view.getVisibility() == 0;
    }
}
