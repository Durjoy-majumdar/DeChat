package lq1;

import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: lq1.a0 */
public final class C46890a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ UniCommentFooter f126096d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46890a0(UniCommentFooter uniCommentFooter) {
        super(0);
        this.f126096d = uniCommentFooter;
    }

    public Object invoke() {
        this.f126096d.animate().setInterpolator(new DecelerateInterpolator()).setDuration(220).setListener((Animator.AnimatorListener) null).translationY(0.0f).start();
        return C13598b0.f38549a;
    }
}
