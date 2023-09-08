package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$a */
public final /* synthetic */ class MobileRemitNumberInputUI$$a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f163875d;

    public /* synthetic */ MobileRemitNumberInputUI$$a(WeakReference weakReference) {
        this.f163875d = weakReference;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        WeakReference weakReference = this.f163875d;
        int i = MobileRemitNumberInputUI.f203879v;
        int intValue = ((Float) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) weakReference.get();
        if (view != null) {
            int left = (int) ((float) view.getLeft());
            view.layout(left, intValue, view.getWidth() + left, view.getHeight() + intValue);
        }
    }
}
