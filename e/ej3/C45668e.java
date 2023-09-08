package ej3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import fj3.C20713c;
import gy3.C87412m;

/* renamed from: ej3.e */
public abstract class C45668e {

    /* renamed from: a */
    public C31608f f123471a;

    /* renamed from: b */
    public C45671i f123472b;

    /* renamed from: c */
    public C31609o f123473c;

    /* renamed from: d */
    public View f123474d;

    /* renamed from: a */
    public abstract void mo71163a();

    /* renamed from: b */
    public void mo71164b() {
        C45671i iVar;
        View view = this.f123474d;
        float measuredWidth = view != null ? (float) view.getMeasuredWidth() : 0.0f;
        View view2 = this.f123474d;
        float measuredHeight = view2 != null ? (float) view2.getMeasuredHeight() : 0.0f;
        View view3 = this.f123474d;
        if (view3 != null && (iVar = this.f123472b) != null) {
            C45676n nVar = iVar.f123478d;
            if (C87412m.m108589b(nVar, C45673k.f123480a)) {
                float f = (float) 2;
                view3.setPivotX(measuredWidth / f);
                view3.setPivotY(measuredHeight / f);
            } else if (C87412m.m108589b(nVar, C45672j.f123479a)) {
                view3.setPivotX(measuredWidth / ((float) 2));
                view3.setPivotY(measuredHeight);
            } else if (C87412m.m108589b(nVar, C45674l.f123481a)) {
                view3.setPivotX(measuredWidth / ((float) 2));
                view3.setPivotY(0.0f);
            }
        }
    }

    /* renamed from: c */
    public Interpolator mo71167c() {
        return C20713c.f58572a.mo32435a();
    }

    /* renamed from: d */
    public abstract void mo71165d(ViewPropertyAnimator viewPropertyAnimator);

    /* renamed from: e */
    public void mo71172e(ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, "animation");
    }
}
