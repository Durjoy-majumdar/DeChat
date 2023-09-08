package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lu3.C34379c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.r0 */
public class C69851r0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f201539d;

    public C69851r0(SightCaptureUI sightCaptureUI) {
        this.f201539d = sightCaptureUI;
    }

    public void onAnimationEnd(Animator animator) {
        SightCaptureUI sightCaptureUI = this.f201539d;
        C34379c cVar = sightCaptureUI.f313842S0;
        if (cVar == null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C69850j0(sightCaptureUI));
        } else if (cVar.isDone()) {
            SightCaptureUI sightCaptureUI2 = this.f201539d;
            sightCaptureUI2.getClass();
            ((C119157j) C119157j.f356862d).mo183895z(new C69850j0(sightCaptureUI2));
        } else {
            View view = this.f201539d.f313878s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$26", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$26", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f201539d.f313876q.setEnabled(false);
    }
}
