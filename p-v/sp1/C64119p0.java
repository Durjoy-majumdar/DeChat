package sp1;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: sp1.p0 */
public final class C64119p0 extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C64107n0 f181792d;

    public C64119p0(C64107n0 n0Var) {
        this.f181792d = n0Var;
    }

    public void onAnimationCancel(PAGView pAGView) {
        View i = this.f181792d.mo88858i();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(i, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$palyBagAnim$1$1", "onAnimationCancel", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(i, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$palyBagAnim$1$1", "onAnimationCancel", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (pAGView != null) {
            C64107n0 n0Var = this.f181792d;
            pAGView.removeListener(this);
            n0Var.mo88859j(pAGView);
        }
    }

    public void onAnimationEnd(PAGView pAGView) {
        View i = this.f181792d.mo88858i();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(i, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$palyBagAnim$1$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(i, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$palyBagAnim$1$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (pAGView != null) {
            C64107n0 n0Var = this.f181792d;
            pAGView.removeListener(this);
            n0Var.mo88859j(pAGView);
        }
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
    }
}
