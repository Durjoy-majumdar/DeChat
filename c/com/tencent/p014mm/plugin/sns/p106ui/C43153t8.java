package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.t8 */
public class C43153t8 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ View f116734a;

    /* renamed from: b */
    public final /* synthetic */ C43155u8 f116735b;

    public C43153t8(C43155u8 u8Var, View view) {
        this.f116735b = u8Var;
        this.f116734a = view;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$4");
        View view = this.f116734a;
        if (view != null) {
            view.clearAnimation();
            View view2 = this.f116734a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimelineEmojiInfoHelper$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/TimelineEmojiInfoHelper$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f116735b.mo67375b();
        }
        C43155u8.m46728a(this.f116735b, false);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$4");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$4");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$4");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$4");
        C43155u8.m46728a(this.f116735b, true);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$4");
    }
}
