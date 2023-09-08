package gs1;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import gy3.C87412m;

/* renamed from: gs1.h */
public final class C8449h extends Animation {

    /* renamed from: d */
    public final /* synthetic */ C8437d f27454d;

    /* renamed from: e */
    public final /* synthetic */ int f27455e;

    public C8449h(C8437d dVar, int i) {
        this.f27454d = dVar;
        this.f27455e = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C87412m.m108594g(transformation, "t");
        ViewGroup.LayoutParams layoutParams = this.f27454d.f27438i.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = (int) (((float) this.f27455e) * f);
        this.f27454d.f27438i.setLayoutParams(layoutParams2);
    }
}
