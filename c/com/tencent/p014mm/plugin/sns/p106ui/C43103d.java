package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.d */
public class C43103d implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ View f116650a;

    /* renamed from: b */
    public final /* synthetic */ C95733b f116651b;

    public C43103d(C95733b bVar, View view) {
        this.f116651b = bVar;
        this.f116650a = view;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$3");
        View view = this.f116650a;
        if (view != null) {
            view.clearAnimation();
            View view2 = this.f116650a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper$3", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper$3", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f116651b.mo133177c();
        }
        C95733b.m122540a(this.f116651b, false);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$3");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$3");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$3");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$3");
        C95733b.m122540a(this.f116651b, true);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$3");
    }
}
