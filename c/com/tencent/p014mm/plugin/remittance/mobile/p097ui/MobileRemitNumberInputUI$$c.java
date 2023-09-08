package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.animation.Animator;
import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$c */
public class MobileRemitNumberInputUI$$c implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f20406d;

    /* renamed from: e */
    public final /* synthetic */ int f20407e;

    public MobileRemitNumberInputUI$$c(MobileRemitNumberInputUI mobileRemitNumberInputUI, WeakReference weakReference, int i) {
        this.f20406d = weakReference;
        this.f20407e = i;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view = (View) this.f20406d.get();
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams2.setMargins(layoutParams.leftMargin, this.f20407e, layoutParams.rightMargin, layoutParams.bottomMargin);
            view.setLayoutParams(layoutParams2);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
