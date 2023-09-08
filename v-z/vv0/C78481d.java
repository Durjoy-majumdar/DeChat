package vv0;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: vv0.d */
public final class C78481d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f229901d;

    /* renamed from: e */
    public final /* synthetic */ View f229902e;

    /* renamed from: f */
    public final /* synthetic */ float f229903f;

    /* renamed from: g */
    public final /* synthetic */ float f229904g;

    /* renamed from: h */
    public final /* synthetic */ float f229905h;

    /* renamed from: i */
    public final /* synthetic */ float f229906i;

    /* renamed from: j */
    public final /* synthetic */ boolean f229907j;

    /* renamed from: n */
    public final /* synthetic */ float f229908n;

    /* renamed from: o */
    public final /* synthetic */ float f229909o;

    /* renamed from: vv0.d$a */
    public static final class C78482a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ float f229910a;

        /* renamed from: b */
        public final /* synthetic */ float f229911b;

        public C78482a(float f, float f2) {
            this.f229910a = f;
            this.f229911b = f2;
        }

        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            outline.setRoundRect(0, (int) this.f229910a, view.getWidth(), view.getHeight() - ((int) this.f229910a), this.f229911b);
        }
    }

    public C78481d(int i, View view, float f, float f2, float f3, float f4, boolean z, float f5, float f6) {
        this.f229901d = i;
        this.f229902e = view;
        this.f229903f = f;
        this.f229904g = f2;
        this.f229905h = f3;
        this.f229906i = f4;
        this.f229907j = z;
        this.f229908n = f5;
        this.f229909o = f6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C13601g gVar = C15010c.f41136a;
        int i = this.f229901d;
        View view = this.f229902e;
        float f = 1.0f;
        if (i == 1) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            if (animatedFraction >= 0.9f) {
                f = 1.0f - ((animatedFraction - 0.9f) / 0.100000024f);
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(f));
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        View view4 = this.f229902e;
        float f2 = this.f229903f;
        view4.setScaleX(f2 + ((this.f229904g - f2) * animatedFraction));
        View view5 = this.f229902e;
        float f3 = this.f229905h;
        view5.setScaleY(f3 + ((this.f229906i - f3) * animatedFraction));
        if (this.f229907j) {
            float f4 = this.f229908n;
            float max = Math.max((((float) this.f229902e.getHeight()) - (f4 + ((this.f229909o - f4) * animatedFraction))) / 2.0f, 0.0f);
            float intValue = this.f229901d == 1 ? (((float) ((Number) ((C36570n) C15010c.f41136a).getValue()).intValue()) / this.f229903f) * (((float) 1) - animatedFraction) : (((float) ((Number) ((C36570n) C15010c.f41136a).getValue()).intValue()) / this.f229904g) * animatedFraction;
            this.f229902e.setClipToOutline(true);
            this.f229902e.setOutlineProvider(new C78482a(max, intValue));
        }
    }
}
