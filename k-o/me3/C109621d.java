package me3;

import android.view.View;
import android.view.animation.Animation;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: me3.d */
public class C109621d implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C109612c f328192a;

    public C109621d(C109612c cVar) {
        this.f328192a = cVar;
    }

    public void onAnimationEnd(Animation animation) {
        View rubbishView = this.f328192a.f328158a.getRubbishView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(rubbishView, aVar.mo10232b(), "com/tencent/mm/presenter/DrawingPresenter$5", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rubbishView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(rubbishView, "com/tencent/mm/presenter/DrawingPresenter$5", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
