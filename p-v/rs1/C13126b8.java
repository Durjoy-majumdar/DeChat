package rs1;

import android.animation.Animator;
import android.view.View;
import de1.C7290r;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.b8 */
public final class C13126b8 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ View f37359d;

    public C13126b8(View view) {
        this.f37359d = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f37359d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateLikeMigrateUIC$showPrivateLikeMigrateDialog$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateLikeMigrateUIC$showPrivateLikeMigrateDialog$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view2 = this.f37359d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(4);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateLikeMigrateUIC$showPrivateLikeMigrateDialog$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateLikeMigrateUIC$showPrivateLikeMigrateDialog$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
