package me3;

import android.view.View;
import android.view.animation.Animation;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import me3.C109612c;

/* renamed from: me3.e */
public class C109622e implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C109612c f328193a;

    public C109622e(C109612c cVar) {
        this.f328193a = cVar;
    }

    public void onAnimationEnd(Animation animation) {
        View rubbishView = this.f328193a.f328158a.getRubbishView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(rubbishView, aVar.mo10232b(), "com/tencent/mm/presenter/DrawingPresenter$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rubbishView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(rubbishView, "com/tencent/mm/presenter/DrawingPresenter$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C109612c.C109620e eVar = this.f328193a.f328172o;
        if (eVar != null) {
            eVar.mo79173c(Boolean.FALSE);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
