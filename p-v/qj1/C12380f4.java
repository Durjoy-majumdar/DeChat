package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import ok1.C62042e;
import rx3.C36570n;

/* renamed from: qj1.f4 */
public final class C12380f4 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C12317e4 f35641d;

    public C12380f4(C12317e4 e4Var) {
        this.f35641d = e4Var;
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105920e("FinderLiveBottomTipsLazyPlugin", "hideTips!");
        this.f35641d.f166287d.animate().setListener((Animator.AnimatorListener) null);
        C62042e.f176370a.mo87010H1((TextView) ((C36570n) this.f35641d.f35485s).getValue());
        this.f35641d.f166287d.setAlpha(1.0f);
    }
}
