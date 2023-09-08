package nt2;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gv2.C98231f;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: nt2.n */
public class C100194n implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ View f293565a;

    /* renamed from: b */
    public final /* synthetic */ View f293566b;

    /* renamed from: c */
    public final /* synthetic */ int f293567c;

    /* renamed from: d */
    public final /* synthetic */ int f293568d;

    /* renamed from: e */
    public final /* synthetic */ float f293569e;

    /* renamed from: f */
    public final /* synthetic */ float f293570f;

    /* renamed from: g */
    public final /* synthetic */ C100189m f293571g;

    public C100194n(C100189m mVar, View view, View view2, int i, int i2, float f, float f2) {
        this.f293571g = mVar;
        this.f293565a = view;
        this.f293566b = view2;
        this.f293567c = i;
        this.f293568d = i2;
        this.f293569e = f;
        this.f293570f = f2;
    }

    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$2");
        this.f293571g.f293413f.setLayerType(0, (Paint) null);
        View view = this.f293565a;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$2", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$2", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f293566b;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$2", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$2", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C100189m mVar = this.f293571g;
        int i = this.f293567c;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        mVar.mo139480j(i);
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        C100189m mVar2 = this.f293571g;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        Context context = mVar2.f293546o;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        C98231f fVar = new C98231f(context, (float) this.f293568d, 0.0f, this.f293569e, this.f293570f, 150.0f, false);
        fVar.setDuration(187);
        fVar.setInterpolator(new DecelerateInterpolator());
        this.f293571g.f293413f.startAnimation(fVar);
        C100189m mVar3 = this.f293571g;
        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        mVar3.f293549r = false;
        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        this.f293571g.mo139454g();
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$2");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$2");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$2");
        this.f293571g.f293413f.setLayerType(2, (Paint) null);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$2");
    }
}
