package ve1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ve1.e1 */
public final class C14500e1 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<View> f40193d;

    /* renamed from: e */
    public final /* synthetic */ C14512f1 f40194e;

    /* renamed from: f */
    public final /* synthetic */ int f40195f;

    public C14500e1(C8479f0<View> f0Var, C14512f1 f1Var, int i) {
        this.f40193d = f0Var;
        this.f40194e = f1Var;
        this.f40195f = i;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view = (View) this.f40193d.f27484d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String str = this.f40194e.f40233f;
        Log.m105924i(str, "maskView gone " + this.f40195f);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
