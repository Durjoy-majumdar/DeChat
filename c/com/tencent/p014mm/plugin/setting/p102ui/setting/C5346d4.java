package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import android.view.animation.Animation;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.d4 */
public class C5346d4 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ UnfamiliarContactDetailUI f20980a;

    public C5346d4(UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f20980a = unfamiliarContactDetailUI;
    }

    public void onAnimationEnd(Animation animation) {
        View view = this.f20980a.f205866i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
