package p902gm;

import android.animation.TimeInterpolator;
import android.view.View;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: gm.e */
public final class C75990e {
    /* renamed from: a */
    public static void m91287a(View view) {
        C107207u.m145169j(view, 1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY((float) (view.getMeasuredHeight() / 2));
        view.setPivotX((float) (view.getMeasuredWidth() / 2));
        C107168a0 a = C107207u.m145160a(view);
        View view2 = a.f320755a.get();
        if (view2 != null) {
            view2.animate().setInterpolator((TimeInterpolator) null);
        }
        View view3 = a.f320755a.get();
        if (view3 != null) {
            view3.animate().setStartDelay(0);
        }
    }
}
