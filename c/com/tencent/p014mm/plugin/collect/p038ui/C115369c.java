package com.tencent.p014mm.plugin.collect.p038ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.collect.ui.c */
public class C115369c implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ AnimationSet f345768a;

    /* renamed from: b */
    public final /* synthetic */ CollectMainUI.C115333t f345769b;

    public C115369c(CollectMainUI.C115333t tVar, AnimationSet animationSet) {
        this.f345769b = tVar;
        this.f345768a = animationSet;
    }

    public void onAnimationEnd(Animation animation) {
        this.f345768a.setStartOffset(1700);
        CollectMainUI.this.f345570C.startAnimation(this.f345768a);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        View view = CollectMainUI.this.f345570C;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper$2", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper$2", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
