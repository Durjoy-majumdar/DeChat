package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.a2 */
public class C43097a2 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C43162z1 f116644a;

    public C43097a2(C43162z1 z1Var) {
        this.f116644a = z1Var;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$2");
        C43162z1.m46734a(this.f116644a, false);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$2");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$2");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$2");
        C43162z1.m46734a(this.f116644a, true);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$2");
    }
}
