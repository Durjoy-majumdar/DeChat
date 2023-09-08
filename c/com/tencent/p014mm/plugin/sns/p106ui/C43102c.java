package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.c */
public class C43102c implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C95733b f116649a;

    public C43102c(C95733b bVar) {
        this.f116649a = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$2");
        C95733b.m122540a(this.f116649a, false);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$2");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$2");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$2");
        C95733b.m122540a(this.f116649a, true);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$2");
    }
}
