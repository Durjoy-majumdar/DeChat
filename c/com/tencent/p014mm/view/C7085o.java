package com.tencent.p014mm.view;

import android.animation.ValueAnimator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.view.o */
public class C7085o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f24966d;

    /* renamed from: e */
    public final /* synthetic */ float f24967e;

    /* renamed from: f */
    public final /* synthetic */ float f24968f;

    /* renamed from: g */
    public final /* synthetic */ float f24969g;

    /* renamed from: h */
    public final /* synthetic */ float f24970h;

    /* renamed from: i */
    public final /* synthetic */ float f24971i;

    /* renamed from: j */
    public final /* synthetic */ float f24972j;

    /* renamed from: n */
    public final /* synthetic */ float f24973n;

    /* renamed from: o */
    public final /* synthetic */ float f24974o;

    /* renamed from: p */
    public final /* synthetic */ float f24975p;

    /* renamed from: q */
    public final /* synthetic */ View f24976q;

    /* renamed from: r */
    public final /* synthetic */ float f24977r;

    /* renamed from: s */
    public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f24978s;

    public C7085o(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, View view2, float f15, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f24966d = view;
        this.f24967e = f;
        this.f24968f = f2;
        this.f24969g = f3;
        this.f24970h = f4;
        this.f24971i = f5;
        this.f24972j = f6;
        this.f24973n = f7;
        this.f24974o = f8;
        this.f24975p = f9;
        this.f24976q = view2;
        this.f24977r = f15;
        this.f24978s = animatorUpdateListener;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f24966d.setTranslationX(this.f24967e + ((this.f24968f - this.f24969g) * floatValue));
        this.f24966d.setTranslationY(this.f24970h + ((this.f24971i - this.f24972j) * floatValue));
        View view = this.f24966d;
        float f = this.f24973n;
        view.setScaleX(f + (((this.f24974o * f) - f) * floatValue));
        View view2 = this.f24966d;
        float f2 = this.f24975p;
        view2.setScaleY(f2 + (((this.f24974o * f2) - f2) * floatValue));
        View view3 = this.f24976q;
        float f3 = (1.0f - floatValue) * this.f24977r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f3));
        View view4 = view3;
        C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/view/ViewAnimHelper$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view4, "com/tencent/mm/view/ViewAnimHelper$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f24978s;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }
}
