package gr1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.C0966R;
import de1.C7290r;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gr1.p */
public final class C8418p extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ View f27413d;

    public C8418p(View view) {
        this.f27413d = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f27413d;
        int i = view.getId() == C0966R.C0970id.l59 ? 8 : 4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$hideSeekLayout$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$hideSeekLayout$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f27413d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(1.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$hideSeekLayout$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$hideSeekLayout$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
