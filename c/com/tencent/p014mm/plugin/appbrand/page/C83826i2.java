package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import android.view.animation.Animation;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.i2 */
public final class C83826i2 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C83790e2 f244696a;

    public C83826i2(C83790e2 e2Var) {
        this.f244696a = e2Var;
    }

    public void onAnimationEnd(Animation animation) {
        View view = this.f244696a.f244639e.f233375g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter$doFlicker$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter$doFlicker$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
