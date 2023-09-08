package p849e3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: e3.z */
public class C107223z extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C107173b0 f320821d;

    /* renamed from: e */
    public final /* synthetic */ View f320822e;

    public C107223z(C107168a0 a0Var, C107173b0 b0Var, View view) {
        this.f320821d = b0Var;
        this.f320822e = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.f320821d.mo144304c(this.f320822e);
    }

    public void onAnimationEnd(Animator animator) {
        this.f320821d.mo143420a(this.f320822e);
    }

    public void onAnimationStart(Animator animator) {
        this.f320821d.mo143457b(this.f320822e);
    }
}
