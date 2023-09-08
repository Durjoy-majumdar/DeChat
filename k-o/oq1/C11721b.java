package oq1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: oq1.b */
public final class C11721b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ View f34301d;

    /* renamed from: e */
    public final /* synthetic */ int f34302e;

    public C11721b(View view, int i) {
        this.f34301d = view;
        this.f34302e = i;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f34301d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$12", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$12", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105924i("Finder.FinderFeedCommentConvert", "maskView gone " + this.f34302e);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
