package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95944p;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gv2.C98231f;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.q */
public class C95952q implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C95944p.C95951g f280168a;

    /* renamed from: b */
    public final /* synthetic */ View f280169b;

    /* renamed from: c */
    public final /* synthetic */ View f280170c;

    /* renamed from: d */
    public final /* synthetic */ C95944p.C95950f f280171d;

    /* renamed from: e */
    public final /* synthetic */ View f280172e;

    /* renamed from: f */
    public final /* synthetic */ int f280173f;

    /* renamed from: g */
    public final /* synthetic */ float f280174g;

    /* renamed from: h */
    public final /* synthetic */ float f280175h;

    /* renamed from: i */
    public final /* synthetic */ C95944p f280176i;

    public C95952q(C95944p pVar, C95944p.C95951g gVar, View view, View view2, C95944p.C95950f fVar, View view3, int i, float f, float f2) {
        this.f280176i = pVar;
        this.f280168a = gVar;
        this.f280169b = view;
        this.f280170c = view2;
        this.f280171d = fVar;
        this.f280172e = view3;
        this.f280173f = i;
        this.f280174g = f;
        this.f280175h = f2;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$6");
        this.f280168a.f280162F0.setLayerType(0, (Paint) null);
        View view = this.f280169b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f280170c;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C95944p pVar = this.f280176i;
        C95944p.C95950f fVar = this.f280171d.f280161f;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
        pVar.mo133469D(fVar);
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
        C98231f fVar2 = new C98231f(this.f280172e.getContext(), (float) this.f280173f, 0.0f, this.f280174g, this.f280175h, 150.0f, false);
        fVar2.setDuration(187);
        fVar2.setInterpolator(new DecelerateInterpolator());
        this.f280172e.startAnimation(fVar2);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$6");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$6");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$6");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$6");
        this.f280168a.f280162F0.setLayerType(2, (Paint) null);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$6");
    }
}
