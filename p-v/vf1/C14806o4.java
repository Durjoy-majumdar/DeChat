package vf1;

import android.animation.Animator;
import android.view.View;
import de1.C7290r;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vf1.o4 */
public final class C14806o4 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ View f40794d;

    public C14806o4(View view) {
        this.f40794d = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f40794d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$dismissLayout$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$dismissLayout$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
