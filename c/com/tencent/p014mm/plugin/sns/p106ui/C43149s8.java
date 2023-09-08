package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.s8 */
public class C43149s8 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C43155u8 f116730a;

    public C43149s8(C43155u8 u8Var) {
        this.f116730a = u8Var;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$3");
        C43155u8.m46728a(this.f116730a, false);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$3");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$3");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$3");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$3");
        C43155u8.m46728a(this.f116730a, true);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$3");
    }
}
