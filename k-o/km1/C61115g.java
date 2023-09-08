package km1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: km1.g */
public final class C61115g implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C61117j f173989d;

    public C61115g(C61117j jVar) {
        this.f173989d = jVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f173989d.f173993c;
        if (view != null) {
            view.setTag(C0966R.C0970id.haa, "loaded");
        }
        C61117j.m71671a(this.f173989d);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
