package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.p0 */
public class C96108p0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f280699a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f280700b;

    public C96108p0(C96158q0 q0Var, LinearLayout linearLayout, Runnable runnable) {
        this.f280699a = linearLayout;
        this.f280700b = runnable;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
        LinearLayout linearLayout = this.f280699a;
        if (linearLayout != null) {
            linearLayout.setPressed(false);
        }
        Runnable runnable = this.f280700b;
        if (runnable != null) {
            runnable.run();
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$10");
    }
}
